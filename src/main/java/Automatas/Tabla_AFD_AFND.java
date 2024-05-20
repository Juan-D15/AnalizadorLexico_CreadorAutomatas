package Automatas;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author juani
 */
public class Tabla_AFD_AFND extends javax.swing.JPanel {

    private final DefaultTableModel modeloT;

    /**
     Tabla_AFD_AFND
     */
    public Tabla_AFD_AFND() {
        initComponents();

        modeloT = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return true;
            }
        };
        modeloT.setColumnIdentifiers(new Object[]{"ESTADOS"});
        tablaAutomatas.setModel(modeloT);
    }

    public void vaciarTabla() {
        while (modeloT.getRowCount() > 0) {
            modeloT.removeRow(0);
        }
    }

    //verifica si hay comas en la tabla
    public boolean verificar_comasAFD() {
        Pattern pattern = Pattern.compile(",\\s*");
        boolean coincide = false;
        for (int i = 0; i < tablaAutomatas.getRowCount() && !coincide; i++) {
            for (int j = 0; j < tablaAutomatas.getColumnCount() && !coincide; j++) {
                String contenido = (String) tablaAutomatas.getValueAt(i, j);
                Matcher matcher = pattern.matcher(contenido);
                if (matcher.find()) {
                    coincide = true;
                }
            }
        }
        return coincide;
    }

    //Si se selecciona AFD retorna un valor booleano segun el resultado de la funcion verificar_comasAFD()
    public boolean verificarAFD() {
        if (opcAFD.isSelected()) {
            if (verificar_comasAFD()) {
                return true;
            }
        }
        return false;
    }

    // Convierte los terminos ingresados a una lista
    public List<String> convertirSimbolosALista(String texto) {
        String[] partes = texto.split(",\\s*");
        List<String> lista = new ArrayList<>();
        lista.addAll(Arrays.asList(partes));
        return lista;
    }

    //Metodo para que de una lista de los terminos ingresados
    public List<String> simbolos_ingresados() {
        String terminos = txtSimbolos.getText();
        List<String> lista = convertirSimbolosALista(terminos);
        return lista;
    }

    public List<String> convertirEstadosALista(String texto) {
        String[] partes = texto.split(",\\s*");
        List<String> lista = new ArrayList<>();
        lista.addAll(Arrays.asList(partes));
        return lista;
    }

    public List<String> estados_ingresados() {
        String terminos = txtEstados.getText();
        List<String> lista = convertirEstadosALista(terminos);
        return lista;
    }

    public void colocarEstados() {
        Object[] estados = estados_ingresados().toArray();

        for (Object estado : estados) {
            Object[] fila = new Object[]{estado};
            modeloT.addRow(fila);
        }
    }

    public void actualizarTabla() {
        vaciarTabla();
        Object[] simbolos = simbolos_ingresados().toArray();
        ArrayList<Object> columna = new ArrayList();

        columna.add("ESTADOS");
        for (int i = 0; i < simbolos_ingresados().size(); i++) {
            columna.add(simbolos[i]);
        }
        // si se selecciona AFND que se agregue Lambda
        if (opcAFND.isSelected()) {
            System.out.println("AFND seleccionado");
            columna.add("λ");
        }
        modeloT.setColumnIdentifiers(columna.toArray());
        colocarEstados();
    }

    //Condiciones
    public boolean camposVacios() {
        JTextField[] textFields = {txtSimbolos, txtEstados, txtEstadoInicial, txtEstadoFinal};
        boolean campoVacio = false;
        for (JTextField tf : textFields) {
            if (tf.getText().trim().isEmpty()) {
                campoVacio = true;
                break;
            }
        }
        return !campoVacio;
    }

    public boolean seleccionAutomata() {
        return (opcAFD.isSelected() || opcAFND.isSelected());
    }

    //Grafica el automata
    private void graficarAutomata() {
        mxGraph graph = new mxGraph();
        graph.setCellsEditable(false);
        graph.setCellsMovable(false);      // Evita que las celdas sean movibles
        graph.setCellsResizable(false);    // Evita que las celdas sean redimensionables
        graph.setCellsDeletable(false);    // Evita que las celdas sean eliminables
        graph.setCellsDisconnectable(false); // Evita que las aristas sean desconectadas
        graph.setCellsBendable(false);     // Evita que las aristas sean doblables
        graph.setAllowDanglingEdges(false); // Evita que se creen aristas colgantes

        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try {
            // Crear vértices (estados) del autómata
            List<Object> vertices = new ArrayList<>();
            // Los estados finales los almacena en una lista
            List<String> estadosFinales = convertirEstadosALista(txtEstadoFinal.getText());

            for (String estado : estados_ingresados()) {
                String style = "shape=ellipse;fillColor=#FFF700"; // Color amarillo para estados normales

                if (estado.equals(txtEstadoInicial.getText()) && estadosFinales.contains(estado)) {
                    style = "shape=doubleEllipse;fillColor=#FAFAFA"; // Doble círculo para estado inicial y final
                } else if (estado.equals(txtEstadoInicial.getText())) {
                    style = "shape=ellipse;fillColor=#FAFAFA"; // Color estado inicial 
                } else if (estadosFinales.contains(estado)) {
                    style = "shape=doubleEllipse;fillColor=#FAFAFA"; // Doble círculo para el estado final
                }

                Object v = graph.insertVertex(parent, null, estado, 100, 200, 50, 50, style);
                vertices.add(v);
            }

            // Crear aristas (transiciones) del autómata
            Map<String, String> edgeLabels = new HashMap<>(); // Para almacenar las etiquetas de las aristas
            for (int i = 0; i < tablaAutomatas.getRowCount(); i++) {
                for (int j = 1; j < tablaAutomatas.getColumnCount(); j++) {
                    String destinos = (String) tablaAutomatas.getValueAt(i, j);
                    if (destinos != null && !destinos.isEmpty()) {
                        // Dividir los destinos por coma (AFND)
                        String[] destinosArray = destinos.split(",\\s*");
                        for (String destino : destinosArray) {
                            destino = destino.trim(); // Eliminar espacios en blanco
                            String key = i + "-" + estados_ingresados().indexOf(destino);
                            if (edgeLabels.containsKey(key)) {
                                edgeLabels.put(key, edgeLabels.get(key) + ", " + tablaAutomatas.getColumnName(j));
                            } else {
                                edgeLabels.put(key, tablaAutomatas.getColumnName(j));
                            }
                        }
                    }
                }
            }
            String edgeStyle = "strokeColor=#000000"; //Color para las aristas (negro)
            for (String key : edgeLabels.keySet()) {
                String[] indices = key.split("-");
                int origenIndex = Integer.parseInt(indices[0]);
                int destinoIndex = Integer.parseInt(indices[1]);
                graph.insertEdge(parent, null, edgeLabels.get(key),
                        vertices.get(origenIndex), vertices.get(destinoIndex), edgeStyle + ";rounded=1");
            }

        } finally {
            graph.getModel().endUpdate();
        }

        // Mostrar el autómata en un nuevo JFrame
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        JFrame frameAutomata = new JFrame();
        frameAutomata.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameAutomata.add(graphComponent);

        //Dimensiones frame
        frameAutomata.setSize(500, 500);

        // Centrar el JFrame en la pantalla y otras configuraciones
        frameAutomata.setLocationRelativeTo(null);
        frameAutomata.setTitle("Representación Autómata");
        frameAutomata.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icon AFD.png"))); //icono
        frameAutomata.setVisible(true);

        // Aplicar layout
        mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
        layout.execute(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutomatas = new javax.swing.JTable();
        txtSimbolos = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtEstados = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEstadoInicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEstadoFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        opcAFD = new javax.swing.JRadioButton();
        opcAFND = new javax.swing.JRadioButton();
        btnDibujar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAutomatas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaAutomatas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 430, 275));
        add(txtSimbolos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 150, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 150, -1));
        add(txtEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 150, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Símbolos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jLabel2.setText("Estados");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));
        add(txtEstadoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 150, -1));

        jLabel3.setText("Estado Inicial");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        txtEstadoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoFinalActionPerformed(evt);
            }
        });
        add(txtEstadoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 150, -1));

        jLabel4.setText("Estado Final");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, 20));

        buttonGroup1.add(opcAFD);
        opcAFD.setText("AFD");
        add(opcAFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        buttonGroup1.add(opcAFND);
        opcAFND.setText("AFND");
        add(opcAFND, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));

        btnDibujar.setText("Dibujar");
        btnDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujarActionPerformed(evt);
            }
        });
        add(btnDibujar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 150, -1));

        jLabel5.setText("Autómata");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (seleccionAutomata() && camposVacios()) {
            actualizarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado el tipo de automata o\nno ha llenado todos los campos");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtEstadoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoFinalActionPerformed

    private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujarActionPerformed
        if (camposVacios()) {
            // Verificar si el estado inicial contiene comas y/o espacios
            Pattern pattern = Pattern.compile("[,\\s*]"); // Expresión regular para comas y/o espacios
            Matcher matcher = pattern.matcher(txtEstadoInicial.getText());
            if (matcher.find()) {
                JOptionPane.showMessageDialog(null, "Solo puede haber un estado inicial");
                return;
            }

            if (!verificarAFD()) {
                graficarAutomata();
            } else {
                JOptionPane.showMessageDialog(null, "No se aceptan transiciones multiples en un AFD");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha llenado todos los campos");
        }
    }//GEN-LAST:event_btnDibujarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDibujar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opcAFD;
    private javax.swing.JRadioButton opcAFND;
    private javax.swing.JTable tablaAutomatas;
    private javax.swing.JTextField txtEstadoFinal;
    private javax.swing.JTextField txtEstadoInicial;
    private javax.swing.JTextField txtEstados;
    private javax.swing.JTextField txtSimbolos;
    // End of variables declaration//GEN-END:variables
}

package Analizador;

import Interfaz.Menu_Principal;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author juani
 */
public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Analizador Lexico");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icon Analizador.png"))); //icono de la app
        
    }

    private void EstiloJfilechooser(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void CambioJframe(JFrame j) {
        j.setVisible(true);
        this.dispose();
    }

    private void analizarLexico() throws IOException {
        int cont = 1;

        String expr = (String) txtResultado.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena_S:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case Asignacion:
                    resultado += "  <Operador asignación>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                //nuevos
                case Modulo:
                    resultado += "  <Operador modulo>\t" + lexer.lexeme + "\n";
                    break;
                case Punto:
                    resultado += "  <Punto>\t\t" + lexer.lexeme + "\n";
                    break;
                case Coma:
                    resultado += "  <Coma>\t" + lexer.lexeme + "\n";
                    break;
                case Abstract:
                    resultado += "  <Reservada abstract>\t" + lexer.lexeme + "\n";
                    break;
                case Break:
                    resultado += "  <Reservada break>\t" + lexer.lexeme + "\n";
                    break;
                case Case:
                    resultado += "  <Reservada case>\t" + lexer.lexeme + "\n";
                    break;
                case Catch:
                    resultado += "  <Reservada catch>\t" + lexer.lexeme + "\n";
                    break;
                case Class:
                    resultado += "  <Reservada class>\t" + lexer.lexeme + "\n";
                    break;
                case Const:
                    resultado += "  <Reservada const>\t" + lexer.lexeme + "\n";
                    break;
                case Default:
                    resultado += "  <Reservada default>\t" + lexer.lexeme + "\n";
                    break;
                case Extends:
                    resultado += "  <Reservada extends>\t" + lexer.lexeme + "\n";
                    break;
                case Finally:
                    resultado += "  <Reservada finally>\t" + lexer.lexeme + "\n";
                    break;
                case Switch:
                    resultado += "  <Reservada switch>\t" + lexer.lexeme + "\n";
                    break;
                case By_value:
                    resultado += "  <Reservada byvalue>\t" + lexer.lexeme + "\n";
                    break;
                case Cast:
                    resultado += "  <Reservada cast>\t" + lexer.lexeme + "\n";
                    break;
                case Operator:
                    resultado += "  <Reservada operator>\t" + lexer.lexeme + "\n";
                    break;
                case Continue:
                    resultado += "  <Reservada continue>\t" + lexer.lexeme + "\n";
                    break;
                case Final:
                    resultado += "  <Reservada final>\t" + lexer.lexeme + "\n";
                    break;
                case Future:
                    resultado += "  <Reservada future>\t" + lexer.lexeme + "\n";
                    break;
                case Outer:
                    resultado += "  <Reservada outer>\t" + lexer.lexeme + "\n";
                    break;
                case Goto:
                    resultado += "  <Reservada goto>\t" + lexer.lexeme + "\n";
                    break;
                case Implements:
                    resultado += "  <Reservada implements>\t" + lexer.lexeme + "\n";
                    break;
                case Import:
                    resultado += "  <Reservada import>\t" + lexer.lexeme + "\n";
                    break;
                case Interface:
                    resultado += "  <Reservada interface>\t" + lexer.lexeme + "\n";
                    break;
                case Native:
                    resultado += "  <Reservada native>\t" + lexer.lexeme + "\n";
                    break;
                case Generic:
                    resultado += "  <Reservada generic>\t" + lexer.lexeme + "\n";
                    break;
                case Rest:
                    resultado += "  <Reservada rest>\t" + lexer.lexeme + "\n";
                    break;
                case Instanceof:
                    resultado += "  <Reservada instanceof>\t" + lexer.lexeme + "\n";
                    break;
                case New:
                    resultado += "  <Reservada new>\t" + lexer.lexeme + "\n";
                    break;
                case Null:
                    resultado += "  <Reservada null>\t" + lexer.lexeme + "\n";
                    break;
                case Package:
                    resultado += "  <Reservada package>\t" + lexer.lexeme + "\n";
                    break;
                case Private:
                    resultado += "  <Reservada private>\t" + lexer.lexeme + "\n";
                    break;
                case Protected:
                    resultado += "  <Reservada protected>\t" + lexer.lexeme + "\n";
                    break;
                case Public:
                    resultado += "  <Reservada public>\t" + lexer.lexeme + "\n";
                    break;
                case Return:
                    resultado += "  <Reservada return>\t" + lexer.lexeme + "\n";
                    break;
                case Static:
                    resultado += "  <Reservada static>\t" + lexer.lexeme + "\n";
                    break;
                case Super:
                    resultado += "  <Reservada super>\t" + lexer.lexeme + "\n";
                    break;
                case Inner:
                    resultado += "  <Reservada inner>\t" + lexer.lexeme + "\n";
                    break;
                case Var:
                    resultado += "  <Reservada var>\t" + lexer.lexeme + "\n";
                    break;
                case Synchronized:
                    resultado += "  <Reservada synchronized>\t" + lexer.lexeme + "\n";
                    break;
                case This:
                    resultado += "  <Reservada this>\t" + lexer.lexeme + "\n";
                    break;
                case Threadsafe:
                    resultado += "  <Reservada threadsafe>\t" + lexer.lexeme + "\n";
                    break;
                case Throw_s:
                    resultado += "  <Lanzar Excepción>\t" + lexer.lexeme + "\n";
                    break;
                case Transient:
                    resultado += "  <Reservada transient>\t" + lexer.lexeme + "\n";
                    break;
                case Void:
                    resultado += "  <Reservada void>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAnalizador = new javax.swing.JPanel();
        btnArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        btnAnalizarLex = new javax.swing.JButton();
        btnLimpiarLex = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDiccionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAnalizador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelAnalizador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnArchivo.setText("Abrir archivo");
        btnArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });
        panelAnalizador.add(btnArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 139, -1));

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        txtResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtResultado);

        panelAnalizador.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 350, 470));

        txtAnalizarLex.setEditable(false);
        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        panelAnalizador.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 130, 350, 470));

        btnAnalizarLex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalizarLex.setText("Analizar");
        btnAnalizarLex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnalizarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLexActionPerformed(evt);
            }
        });
        panelAnalizador.add(btnAnalizarLex, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        btnLimpiarLex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiarLex.setText("Limpiar");
        btnLimpiarLex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarLexActionPerformed(evt);
            }
        });
        panelAnalizador.add(btnLimpiarLex, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelAnalizador.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 124, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ANALIZADOR");
        panelAnalizador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        btnDiccionario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDiccionario.setText("Apps");
        btnDiccionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiccionarioActionPerformed(evt);
            }
        });
        panelAnalizador.add(btnDiccionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAnalizador, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAnalizador, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        EstiloJfilechooser();
        // Abrir Archivo
        JFileChooser chooser = new JFileChooser();
        //filtro para buscar archivos
        chooser.setFileFilter(new FiltroArchivos(".txt", "Archivo de texto"));
        chooser.setFileFilter(new FiltroArchivos(".java", "Archivo java"));

        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtResultado.setText(ST);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnLimpiarLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarLexActionPerformed
        // TODO add your handling code here:
        txtAnalizarLex.setText(null);
        txtResultado.setText(null);
    }//GEN-LAST:event_btnLimpiarLexActionPerformed

    private void btnAnalizarLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarLexActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarLexActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        EstiloJfilechooser();
        //Guardar analisis
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Guardar");
        chooser.setFileFilter(new FiltroArchivos(".txt", "Archivo de texto"));
        int seleccion = chooser.showSaveDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            File archivo = chooser.getSelectedFile();

            try (FileWriter fw = new FileWriter(archivo+".txt")) {
                fw.write(txtAnalizarLex.getText());
                fw.flush();
                fw.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            JOptionPane.showMessageDialog(null, "El archivo se guardo correctamente", "Guardar archivo",
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/icon check.png"));
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnDiccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiccionarioActionPerformed
        Menu_Principal j2 = new Menu_Principal();
        CambioJframe(j2);
    }//GEN-LAST:event_btnDiccionarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarLex;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnDiccionario;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiarLex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelAnalizador;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}

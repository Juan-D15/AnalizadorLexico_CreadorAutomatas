package Analizador;

/**
 *
 * @author juani
 */
public class InfoAnalisis {
    public static int linea;
    public static String token;
        
        public static void guardarInfoCodigo(int l, String t){
            linea = l;
            token = t;
        }
}

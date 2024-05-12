// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------
package Main;
import BaseDeDatos.ClaseEnlaceBaseDeDatos;

public class Main {
    public static void main(String[] args) throws Exception {

        ClaseEnlaceBaseDeDatos javaPostgreSQLBasic = new ClaseEnlaceBaseDeDatos();
        javaPostgreSQLBasic.MétodoConexiónBaseDeDatosLibre();
        javaPostgreSQLBasic.MétodoConexiónBaseDeDatosCerrada("localhost", "1987", "postgres","postgres", "1987");

        
    
    }
}

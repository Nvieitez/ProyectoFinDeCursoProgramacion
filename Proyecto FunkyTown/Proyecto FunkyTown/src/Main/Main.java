// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir y agilizar el programa.
    package Main;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí importamos las funcionalidades necesarias para el correcto funcionamiento de nuestro programa.
    import BaseDeDatos.ClaseEnlaceBaseDeDatos;

// CLASE MAIN ---------------------------------------------------------------------------------------------------------------------------------------

    // Esta es la clase principal, esta se encarga de iniciar todos los procesos necesarios de nuestro programa.
    public class Main {

// ENUNCIADO ----------------------------------------------------------------------------------------------------------------------------------------

    //

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar las variables y los objetos necesarios para el correcto funcionamiento de nuestro programa.

// INICIO DEL CÓDIGO --------------------------------------------------------------------------------------------------------------------------------

    /** 
     * 
     *  Clase Main
     * 
     *  @author Nicolás Viéitez Domínguez
     *  @author Susana Isabel Santos Mallqui
     * 
     */

// --------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 
     *  Método Main.
     * 
     *  @param args
     *  @throws Exception
     */

    public static void main(String[] args) throws Exception {

        // Para comenzar nuestro programa, primero creamos un objeto de la "ClaseEnlaceBaseDeDatos" para poder usar sus métodos.
        ClaseEnlaceBaseDeDatos javaPostgreSQLBasic = new ClaseEnlaceBaseDeDatos();

        // Ahora llamamos a la base de datos y nos conectamos a ella.
        javaPostgreSQLBasic.MétodoConexiónBaseDeDatosLibre();
        javaPostgreSQLBasic.MétodoConexiónBaseDeDatosCerrada("localhost", "1987", "postgres","postgres", "1987");


    } // Fin de la clase "Main".

} // Fin del programa.

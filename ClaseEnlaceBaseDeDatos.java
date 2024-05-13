// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir y agilizar el programa.
    package BaseDeDatos;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí importamos las funcionalidades necesarias para el correcto funcionamiento de nuestro programa.

    // Primero vamos a importar la funcionalidad "Connection", esta nos va a permitir conectarnos a la base de datos.
    import java.sql.Connection;

    // Ahora vamos a importar la funcionalidad "DriverManager", esta controlará las puertas que creemos a la base de datos.
    import java.sql.DriverManager;
    import java.util.List;

// CLASE ENLACE BASE DE DATOS -----------------------------------------------------------------------------------------------------------------------

    // En esta clase vamos a crear la conexión con la base de datos que utilizará nuestro programa.
    public class ClaseEnlaceBaseDeDatos{

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar las variables y los objetos necesarios para el correcto funcionamiento de nuestro programa.

// INICIO DEL CÓDIGO --------------------------------------------------------------------------------------------------------------------------------

    /** 
     * 
     *  Conexión básica a la base de datos PostgreSQL
     * 
     *  @author Nicolás Viéitez Domínguez
     *  @author Susana Isabel Santos Mallqui
     * 
     */

// --------------------------------------------------------------------------------------------------------------------------------------------------
 
    /**
     * 
     *  Primero creamos un método llamado "MétodoConexiónBaseDeDatosLibre" que se conecte con la base de datos sin necesidad de parámetros.
     * 
     */
    
    public void MétodoConexiónBaseDeDatosLibre() {

        // Dentro del método creamos un "try-catch" que compruebe que la conexión ha sido realizada correctamente.
        try {
            
            // Dentro del "try-catch" vamos a crear otro, este se va a encargar de comprobar si los datos de conexión son correctos.
            try { 

                // Dentro del segundo "try-catch" vamos a registrar el driver de conexión
                Class.forName("org.postgresql.Driver");

            } catch (ClassNotFoundException DriverNoEncontrado) {

                // En caso de que el driver no se pueda registrar, salta el siguiente error.
                System.out.println("Error al registrar el driver de PostgreSQL: " + DriverNoEncontrado);

            } // Fin del segundo "try-catch".

            // Fuera del segundo "try-catch" declaramos una variable "Connection", esta debe de ser nula para darle datos después.
            Connection connection = null;

            // Una vez registrado el driver, se iniciará la conexión de la base de datos utilizando la nueva variable.
            connection = DriverManager.getConnection(

                // Introducimos los datos de acceso a la base de datos.
                "jdbc:postgresql://localhost:1982/postgres", "postgres", "postgres"
                    
            );
    
            // Ahora determinamos si la conexión es válida, esta dará un error si excede el timeout.
            boolean valid = connection.isValid(50000);

            // Creamos un sistema de test para comprobar las conexiones de manera externa
            System.out.println(valid ? "TEST OK" : "TEST FAIL");

        } catch (java.sql.SQLException ErrorDeConexión) {

            // En caso de que todo el sistema anterior falle, salta el primer "try-catch" con el mensaje de error.
            System.out.println("Error: " + ErrorDeConexión);

        } // Fin del primer "try-catch".

    } // Fin del "MétodoConexiónBaseDeDatosLibre".

// --------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 
     *  Ahora vamos a crear un método llamado "MétodoEntradaBaseDeDatosCerrada" que se encargará de conectarse a la base de datos a través de los parámetros que especifiquemos.
     * 
     *  @param Host Anfitrión de la base de datos.
     *  @param Puerto Localización de la base de datos.
     *  @param BaseDeDatos Nombre de la base de datos.
     *  @param Usuario Nombre del usuario que se conecta.
     *  @param Contraseña Contraseña del usuario que se conecta
     * 
     */

    public void MétodoConexiónBaseDeDatosCerrada(String Host, String Puerto, String BaseDeDatos, String Usuario, String Contraseña) {

        // Dentro del método vamos a crear una variable "String" que se encargué de recoger los datos de la base de datos.
        String DatosConexión = "";

        // Dentro del método creamos un "try-catch" que compruebe que la conexión ha sido realizada correctamente.
        try {
  
            // Dentro del "try-catch" vamos a crear otro, este se va a encargar de comprobar si los datos de conexión son correctos.
            try {

                // Dentro del segundo "try-catch" vamos a registrar el driver de conexión
                Class.forName("org.postgresql.Driver");

            
            } catch (ClassNotFoundException DriverNoEncontrado) {

                // En caso de que el driver no se pueda registrar, salta el siguiente error.
                System.out.println("Error al registrar el driver de PostgreSQL: " + DriverNoEncontrado);

            } // Fin del segundo "try-catch".

            // Fuera del segundo "try-catch" declaramos una variable "Connection", esta debe de ser nula para darle datos después.
            Connection connection = null;

            // Aquí vamos a introducir los datos de nuestra conexión.
            DatosConexión = "jdbc:postgresql://" + Host + ":" + Puerto + "/" + BaseDeDatos;
            
            // Ahora vamos a iniciar un "DriverManager" que se encargue de iniciar la conexión con los nuevos datos.
            connection = DriverManager.getConnection(DatosConexión, Usuario, Contraseña);
            
            // Ahora determinamos si la conexión es válida, esta dará un error si excede el timeout.
            boolean valid = connection.isValid(50000);

            // Creamos un sistema de test para comprobar las conexiones de manera externa
            System.out.println(valid ? "TEST OK" : "TEST FAIL");


        } catch (java.sql.SQLException ErrorDeConexión) { 

            System.out.println("Error al conectar con la base de datos de PostgreSQL (" + DatosConexión + "): " + ErrorDeConexión);

        } // Fin del primer "try-catch".

    } // Fin del "MétodoConexiónBaseDeDatosCerrada".
 
    } // Fin de la "ClaseEnlaceBaseDeDatos".
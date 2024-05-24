// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a determinar la localización de nuestra clase, esto nos permitirá dividir el programa y hacerlo más ágil.
    package Modelo.BasesDeDatos;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar todas las funcionalidades necesarias para el correcto funcionamiento de nuestro programa.

    // Primero vamos a importar la funcionalidad "Connection", esta nos permite crear conexiones con la base de datos.
    import java.sql.Connection;
    
    // Ahora importamos la funcionalidad "DriverManager", esta nos permite crear drivers para las url de la base de datos.
    import java.sql.DriverManager;

// CLASE BASE DE DATOS ------------------------------------------------------------------------------------------------------------------------------

    // Esta clase contendrá la conexión con la base de datos.
    public class BaseDeDatos {

        // Para iniciar nuestra base de datos, primero vamos a crear un método que contenga el sistema lógico.
        public static void metodoConexionBaseDeDatos(){

            // Dentro del método primero vamos a crear un try-catch
            try {

                // Dentro del método vamos a crear un try-catch.
                Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música", "postgres", "postgres");

                // Ahora creamos un mensaje para comprobar que la conexión ha sido un éxito.
                System.out.println("La conexión ha sido un éxito");

            } // Fin del try

            catch (java.sql.SQLException ErrorDeConexión) {

                // Dentro del catch creamos un mensaje para comprobar que la conexión se ha creado correctamente.
                System.out.println("La conexión ha fallado, vuelve a intentarlo");

            }; // Fin del catch

        } // Fin del "MétodoConexiónBaseDeDatos".

    } // Fin de la clase "BaseDeDatos".
package Controlador;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.BasesDeDatos.*;

public class Controller {

    // Primero vamos a crear un método que se encargue de buscar las fotos de los
    // discos en la base de datos.
    public static void metodoDatosDiscos1() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"DatosMúsica\"");

            if (resultado.next()) {

                String imagenDisco1 = resultado.getString(2);
                String descripcionDisco1 = resultado.getString(6);

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static void metodoDatosDiscos2() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"DatosMúsica\"");

            if (resultado.next()) {

                String imagenDisco2 = resultado.getString(2);
                String descripcionDisco2 = resultado.getString(6);


            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static void metodoDatosDiscos3() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"DatosMúsica\"");

            if (resultado.next()) {

                String imagenDisco3 = resultado.getString(2);
                String descripcionDisco3 = resultado.getString(6);


            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static void metodoDatosArtistas1() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"DatosMúsica\"");

            if (resultado.next()) {

                String imagenArtista1 = resultado.getString(1);
                String nombreArtista1 = resultado.getString(1);

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static void metodoDatosArtistas2() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"DatosMúsica\"");

            if (resultado.next()) {

                String imagenArtista2 = resultado.getString(1);
                String nombreArtista2 = resultado.getString(1);


            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static void metodoDatosArtistas3() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"DatosMúsica\"");

            if (resultado.next()) {

                String imagenArtista3 = resultado.getString(1);
                String nombreArtista3 = resultado.getString(1);

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static void metodoDatosBusquedaArtista() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"DatosMúsica\"");

            String VariableBusquedaArtista = "";

            if (resultado.next()) {

                String nombreArtista = resultado.getString(3);

                if (nombreArtista.equals(VariableBusquedaArtista)){

                    query = conexionBaseDeDatos.createStatement();

                    resultado = query.executeQuery("");

                    String imagenArtistaBuscado = resultado.getString(1);
                    String nombreArtistaBuscado = resultado.getString(3);
                    String descripcionArtistaBuscado = resultado.getString(7);

                }
            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static void metodoDatosBusquedaDisco() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"DatosMúsica\"");

            String VariableBusquedaDisco = "";

            if (resultado.next()) {

                String nombreDisco = resultado.getString(4);

                if (nombreDisco.equals(VariableBusquedaDisco)){

                    query = conexionBaseDeDatos.createStatement();

                    resultado = query.executeQuery("");

                    String imagenDiscoBuscado = resultado.getString(2);
                    String nombreArtistaDiscoBuscado = resultado.getString(3);
                    String nombreDiscoBuscado = resultado.getString(4);
                    String descripcionDiscoBuscado = resultado.getString(6);
                    String precioDiscoBuscado = resultado.getString(7);

                }
            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static void metodoDatosBusquedaCancion() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"DatosMúsica\"");

            String VariableBusquedaCancion = "";

            if (resultado.next()) {

                String nombreCancion = resultado.getString(5);

                if (nombreCancion.equals(VariableBusquedaCancion)){

                    query = conexionBaseDeDatos.createStatement();

                    resultado = query.executeQuery("");

                    String imagenDiscoCancionBuscada = resultado.getString(2);
                    String nombreArtistaCancionBuscada = resultado.getString(3);
                    String nombreDiscoCancionBuscada = resultado.getString(4);
                    String descripcionDiscoCancionBuscada = resultado.getString(6);
                    String precioDiscoCancionBuscada = resultado.getString(7);

                }
            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static void metodoDatosBusquedaUsuario() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"InicioSesión\"");

            String VariableBusquedaUsuario = "";

            if (resultado.next()) {

                String nombreUsuario = resultado.getString(1);

                if (nombreUsuario.equals(VariableBusquedaUsuario)){

                    query = conexionBaseDeDatos.createStatement();

                    resultado = query.executeQuery("");

                    String UsuarioBuscado = resultado.getString(1);

                    System.out.print("Inicio de sesión correcto");
                }

                else {

                    System.out.print ("Inicio de sesión erroneo");
                }
            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static void metodoDatosBusquedaContraseña() {

        // Dentro del método vamos a crear un try-catch
        try {

            // Dentro del try vamos a hacer la consulta y declarar la url de la imagen.

            // Primero realizamos la comprobación de la base de datos.
            BaseDeDatos.metodoConexionBaseDeDatos();

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Música",
                    "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement();

            ResultSet resultado = query.executeQuery("Select * From public.\"InicioSesión\"");

            String VariableBusquedaContraseña = "";

            if (resultado.next()) {

                String nombreContraseña = resultado.getString(2);

                if (nombreContraseña.equals(VariableBusquedaContraseña)){

                    query = conexionBaseDeDatos.createStatement();

                    resultado = query.executeQuery("");

                    String ContraseñaBuscada = resultado.getString(2);

                    System.out.print("Inicio de sesión correcto");
                }

                else {

                    System.out.print ("Inicio de sesión erroneo");
                }
            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }
    }
}
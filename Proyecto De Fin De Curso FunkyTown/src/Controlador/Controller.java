package Controlador;

import java.sql.*;

import javax.swing.JOptionPane;

import Modelo.BasesDeDatos.*;
import Vista.InicioSesion;
import Vista.ListaArtistas;
import Vista.ListaCanciones;
import Vista.ListaDiscos;
import Modelo.*;

public class Controller {

    static Boolean comprobanteInicioSesion = false;

    // Primero vamos a crear un método que se encargue de buscar las fotos de los discos en la base de datos.
    public static String metodoImagenDiscoDelMomento1() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("SELECT * FROM public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(1);

                DatosDiscos.setImagenDisco1(resultado.getString(4));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getImagenDisco1();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoImagenDiscoDelMomento2() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(2);

                DatosDiscos.setImagenDisco2(resultado.getString(4));
                
            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getImagenDisco2();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoImagenDiscoDelMomento3() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(3);

                DatosDiscos.setImagenDisco3(resultado.getString(4));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getImagenDisco3();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoDescripcionDiscoDelMomento1() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(1);

                DatosDiscos.setDescripcionDisco1(resultado.getString(6));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getDescripcionDisco1();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoDescripcionDiscoDelMomento2() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(2);

                DatosDiscos.setDescripcionDisco2(resultado.getString(6));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getDescripcionDisco2();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoDescripcionDiscoDelMomento3() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(3);

                DatosDiscos.setDescripcionDisco3(resultado.getString(6));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getDescripcionDisco3();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoNombreDiscoDelMomento1() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(1);

                DatosDiscos.setNombreDisco1(resultado.getString(5));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getNombreDisco1();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoNombreDiscoDelMomento2() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(2);

                DatosDiscos.setNombreDisco2(resultado.getString(5));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getNombreDisco2();

}

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoNombreDiscoDelMomento3() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(3);

                DatosDiscos.setNombreDisco3(resultado.getString(5));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getNombreDisco3();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoImagenArtistaDelMomento1() {

        DatosArtistas DatosArtistas = new DatosArtistas();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(1);

                DatosArtistas.setImagenArtista1(resultado.getString(1));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosArtistas.getImagenArtista1();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoImagenArtistaDelMomento2() {

        DatosArtistas DatosArtistas = new DatosArtistas();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(2);

                DatosArtistas.setImagenArtista2(resultado.getString(1));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosArtistas.getImagenArtista2();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoImagenArtistaDelMomento3() {

        DatosArtistas DatosArtistas = new DatosArtistas();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(3);

                DatosArtistas.setImagenArtista3(resultado.getString(1));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosArtistas.getImagenArtista3();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoDescripcionArtistaDelMomento1() {

        DatosArtistas DatosArtistas = new DatosArtistas();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(1);

                DatosArtistas.setDescripcionArtista1(resultado.getString(3));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosArtistas.getDescripcionArtista1();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoDescripcionArtistaDelMomento2() {

        DatosArtistas DatosArtistas = new DatosArtistas();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(2);

                DatosArtistas.setDescripcionArtista2(resultado.getString(3));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosArtistas.getDescripcionArtista2();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoDescripcionArtistaDelMomento3() {

        DatosArtistas DatosArtistas = new DatosArtistas();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(3);

                DatosArtistas.setDescripcionArtista3(resultado.getString(3));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosArtistas.getDescripcionArtista3();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoDescripcionCancionDelMomento1() {

        DatosCanciones DatosCanciones = new DatosCanciones();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(1);

                DatosCanciones.setNombreCancion1(resultado.getString(10));
            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosCanciones.getNombreCancion1();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoDescripcionCancionDelMomento2() {

        DatosCanciones DatosCanciones = new DatosCanciones();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(2);

                DatosCanciones.setNombreCancion2(resultado.getString(10));
            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosCanciones.getNombreCancion2();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoDescripcionCancionDelMomento3() {

        DatosCanciones DatosCanciones = new DatosCanciones();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            Statement query = conexionBaseDeDatos.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultado = query.executeQuery("Select * From public.\"Datos\"");

            if (resultado.next()) {

                resultado.absolute(3);

                DatosCanciones.setNombreCancion3(resultado.getString(10));
            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosCanciones.getNombreCancion3();
    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoImagenBusquedaArtista() {

        DatosArtistas DatosArtistas = new DatosArtistas();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Datos\" where \"NombreArtista\" = ?");

            query.setString(1, ListaArtistas.EnviarArtistaBuscado());

            ResultSet resultado = query.executeQuery();

            if  (resultado.next()){

                DatosArtistas.setImagenArtistaBuscado((resultado.getString(1)));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosArtistas.getImagenArtistaBuscado();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoTextoBusquedaArtista() {

        DatosArtistas DatosArtistas = new DatosArtistas();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Datos\" where \"NombreArtista\" = ?");

            query.setString(1, ListaArtistas.EnviarArtistaBuscado());

            ResultSet resultado = query.executeQuery();

            if  (resultado.next()){

                DatosArtistas.setDescripcionArtistaBuscado((resultado.getString(3)));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosArtistas.getDescripcionArtistaBuscado();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoImagenBusquedaDisco() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Datos\" where \"NombreDisco\" = ?");

            query.setString(1, ListaDiscos.EnviarDiscoBuscado());

            ResultSet resultado = query.executeQuery();

            if  (resultado.next()){

                DatosDiscos.setImagenDiscoBuscado(resultado.getString(4));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getImagenDiscoBuscado();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoTextoBusquedaDisco() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Datos\" where \"NombreDisco\" = ?");

            query.setString(1, ListaDiscos.EnviarDiscoBuscado());

            ResultSet resultado = query.executeQuery();

            if  (resultado.next()){

                DatosDiscos.setDescripcionDiscoBuscado(resultado.getString(6));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getDescripcionDiscoBuscado();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

public static String metodoPrecioBusquedaDisco() {

    DatosDiscos DatosDiscos = new DatosDiscos();

    // Dentro del método vamos a crear un try-catch
    try {

        // Ahora conectamos la base de datos dentro de la clase.
        Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

        PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Datos\" where \"NombreDisco\" = ?");

        query.setString(1, ListaDiscos.EnviarDiscoBuscado());

        ResultSet resultado = query.executeQuery();

        if  (resultado.next()){

            DatosDiscos.setPrecioDiscoBuscado(resultado.getString(7));

        }

    } catch (SQLException ERROR) {

        System.out.println(ERROR);

    }

    return DatosDiscos.getPrecioDiscoBuscado();

}

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoNombreArtistaBusquedaDisco() {

        DatosDiscos DatosDiscos = new DatosDiscos();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Datos\" where \"NombreDisco\" = ?");

            query.setString(1, ListaDiscos.EnviarDiscoBuscado());

            ResultSet resultado = query.executeQuery();

            if  (resultado.next()){

                DatosDiscos.setNombreArtistaDiscoBuscado((resultado.getString(2)));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosDiscos.getNombreArtistaDiscoBuscado();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoImagenBusquedaCancion() {

        DatosCanciones DatosCanciones = new DatosCanciones();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Datos\" where \"Canción1\" = ? or \"Canción2\" = ? or \"Canción3\" = ?" );

            query.setString(1, ListaCanciones.EnviarCancionBuscada());
            query.setString(2, ListaCanciones.EnviarCancionBuscada());
            query.setString(3, ListaCanciones.EnviarCancionBuscada());

            ResultSet resultado = query.executeQuery();

            if  (resultado.next()){

                DatosCanciones.setImagenArtistaCancion(resultado.getString(1));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosCanciones.getImagenArtistaCancion();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoDiscoBusquedaCancion() {

        DatosCanciones DatosCanciones = new DatosCanciones();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Datos\" where \"Canción1\" = ? or \"Canción2\" = ? or \"Canción3\" = ?" );

            query.setString(1, ListaCanciones.EnviarCancionBuscada());
            query.setString(2, ListaCanciones.EnviarCancionBuscada());
            query.setString(3, ListaCanciones.EnviarCancionBuscada());

            ResultSet resultado = query.executeQuery();

            if  (resultado.next()){

                DatosCanciones.setNombreDiscoCancion(resultado.getString(5));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosCanciones.getNombreDiscoCancion();

    }

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static String metodoNombreArtistaBusquedaCancion() {

        DatosCanciones DatosCanciones = new DatosCanciones();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Datos\" where \"Canción1\" = ? or \"Canción2\" = ? or \"Canción3\" = ?" );

            query.setString(1, ListaCanciones.EnviarCancionBuscada());
            query.setString(2, ListaCanciones.EnviarCancionBuscada());
            query.setString(3, ListaCanciones.EnviarCancionBuscada());

            ResultSet resultado = query.executeQuery();

            if  (resultado.next()){

                DatosCanciones.setNombreArtistaCancion(resultado.getString(2));

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return DatosCanciones.getNombreArtistaCancion();

    }
    
// --------------------------------------------------------------------------------------------------------------------------------------------------

public static Boolean metodoInicioUsuario() {

    DatosInicioSesión DatosInicioSesión = new DatosInicioSesión();

    // Dentro del método vamos a crear un try-catch
    try {

        // Ahora conectamos la base de datos dentro de la clase.
        Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

        PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Usuarios\" where \"Usuario\" = ?");

        query.setString(1, InicioSesion.getUsuario());

        ResultSet resultado = query.executeQuery();

        if  (resultado.next()){

            Controlador.Controller.metodoInicioContrasena();

        }

        else {

            JOptionPane.showMessageDialog(null, "El usuario no coincide con ninguna cuenta registrada.");
            comprobanteInicioSesion = false;

        }

    } catch (SQLException ERROR) {

        System.out.println(ERROR);

    }

    return comprobanteInicioSesion;
    
}

// --------------------------------------------------------------------------------------------------------------------------------------------------

    public static Boolean metodoInicioContrasena() {

        DatosInicioSesión DatosInicioSesión = new DatosInicioSesión();

        // Dentro del método vamos a crear un try-catch
        try {

            // Ahora conectamos la base de datos dentro de la clase.
            Connection conexionBaseDeDatos = DriverManager.getConnection("jdbc:postgresql://localhost:1982/Musica", "postgres", "postgres");

            PreparedStatement query = conexionBaseDeDatos.prepareStatement("Select * From public.\"Usuarios\" where \"Contraseña\" = ?");

            query.setString(1, InicioSesion.getContraseña());

            ResultSet resultado = query.executeQuery();

            if  (resultado.next()){

                JOptionPane.showMessageDialog(null, "La cuenta se ha iniciado correctamente.");
                comprobanteInicioSesion = true;
            }

            else {

                JOptionPane.showMessageDialog(null, "La contraseña no coincide con ninguna cuenta registrada.");
                comprobanteInicioSesion = false;

            }

        } catch (SQLException ERROR) {

            System.out.println(ERROR);

        }

        return comprobanteInicioSesion;
        
    }
}
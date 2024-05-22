package Vista;// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a determinar la localización de nuestra clase, esto nos permitirá dividir el programa y hacerlo más ágil.


// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a importar todas las funcionalidades necesarias para el correcto funcionamiento de nuestro programa.

// Primero vamos a importar la funcionalidad "JLayeredPane", esta nos permite ponerle capas a los diferentes paneles.
import javax.swing.JLayeredPane;

// Ahora vamos a importar la funcionalidad "JFrameInicioSesiónInicioSesión", esta nos permite crear ventanas para nuestro entorno gráfico.
import javax.swing.JFrame;

// Importamos la funcionalidad "JLabel", esta nos permite crear etiquetas que muestren diferentes datos.
import javax.swing.JLabel;

// Importamos la funcionalidad "JPanel", esta nos permite crear paneles donde introducir los diferentes componentes.
import javax.swing.JPanel;

// Importamos la funcionalidad "JTextField", esta nos permite crear cuadros de texto donde introducir datos
import javax.swing.JTextField;

// Importamos la funcionalidad "JButton", esta nos permite crear botones que pueda utilizar el usuario.
import javax.swing.JButton;

// Importamos la funcionalidad "ImageIcon", esta nos permite establecer imágenes como iconos para nuestros componentes.
import javax.swing.ImageIcon;

// Importamos la funcionalidad "ColorUIResource", esta nos permite introducir colores a nuestros componentes.
import javax.swing.plaf.ColorUIResource;

// Importamos la funcionalidad "Image", esta nos permite modificar imágenes.
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// CLASE INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------------

// Esta clase contendrá el entorno gráfico relacionado con el inicio de sesión.
public class InicioSesion {

    // Para iniciar nuestro inicio de sesión, primero vamos a crear un método que contenga todos los componentes de nuestro entorno gráfico.
    public static void MetodoInicioSesion(){

        // Dentro del método, primero vamos a declarar todos los componentes necesarios.
        JLayeredPane gestorDeCapas = new JLayeredPane();

        JFrame frameInicioSesion = new JFrame();

        JPanel panelInicioSesion1 = new JPanel();
        JPanel panelInicioSesion2 = new JPanel();

        JLabel labelLogo = new JLabel();
        JLabel labelTexto = new JLabel();
        JLabel labelBusqueda = new JLabel();
        JLabel labelTextoArtista = new JLabel();
        JLabel labelTextoDisco = new JLabel();
        JLabel labelTextoCancion = new JLabel();
        JLabel labelUsuario = new JLabel();
        JLabel labelContrasena = new JLabel();
        JLabel labelNuevaCuenta = new JLabel();
        JLabel labelCrearCuenta = new JLabel();
        JLabel labelBuscarCancion = new JLabel();
        JLabel labelBuscarDisco = new JLabel();
        JLabel labelBuscarArtista = new JLabel();

        JTextField textUsuario = new JTextField();
        JTextField textContrasena = new JTextField();

        JButton botonAcceder = new JButton();

        // Ahora vamos a determinar los ajustes de cada uno de ellos.

// GESTOR DE CAPAS ----------------------------------------------------------------------------------------------------------------------------------

        // Localización
        gestorDeCapas.setBounds(0, 0, 800, 600);

        // Añadimos el gestor de capas al JFrameInicioSesión.
        frameInicioSesion.add(gestorDeCapas);

// FRAME INICIO SESIÓN -----------------------------------------------------------------------------------------------------------------------------

        // Título
        frameInicioSesion.setTitle("FunkyTown INC.");

        // Tamaño
        frameInicioSesion.setSize(800, 600);

        // Localización
        frameInicioSesion.setLocationRelativeTo(null);

        // Layout
        frameInicioSesion.setLayout(null);

        // Edición
        frameInicioSesion.setResizable(false);

// PANEL INICIO SESIÓN 1 ---------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        panelInicioSesion1.setSize(800, 600);

        // Localización
        panelInicioSesion1.setLocation(0, 0);

        // Fondo
        panelInicioSesion1.setBackground(new ColorUIResource(34, 34, 34));

        // Layout
        panelInicioSesion1.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        gestorDeCapas.add(panelInicioSesion1, Integer.valueOf(0));

// PANEL INICIO SESIÓN 2 ---------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        panelInicioSesion2.setSize(200, 800);

        // Localización
        panelInicioSesion2.setLocation(0, 0);

        // Fondo
        panelInicioSesion2.setBackground(new ColorUIResource(41, 41, 41));

        // Layout
        panelInicioSesion2.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        gestorDeCapas.add(panelInicioSesion2, Integer.valueOf(1));

// LOGO INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon logo = new ImageIcon("src/Recursos/Imágenes/TextoLogo.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image logoTemporal = logo.getImage();

        // Editamos la imagen.
        Image nuevoLogo = logoTemporal.getScaledInstance(200, 60, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        logo = new ImageIcon(nuevoLogo);

        // Convertimos el JLabel en el icono.
        labelLogo.setIcon(logo);

        // Localización del Jlabel
        labelLogo.setBounds(0, 0, 200, 60);

        // Incluimos el label en el JPanel.
        panelInicioSesion2.add(labelLogo);

// TEXTO INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon imagenTexto = new ImageIcon("src/Recursos/Imágenes/TextoInicioSesión.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image textoTemporal = imagenTexto.getImage();

        // Editamos la imagen.
        Image nuevaImagenTexto = textoTemporal.getScaledInstance(400, 100, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        imagenTexto = new ImageIcon(nuevaImagenTexto);

        // Convertimos el JLabel en el icono.
        labelTexto.setIcon(imagenTexto);

        // Localización del Jlabel
        labelTexto.setBounds(200, 0, 400, 100);

        // Incluimos el label en el JPanel.
        panelInicioSesion1.add(labelTexto);

// USUARIO INICIO SESIÓN ----------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon imagenUsuario = new ImageIcon("src/Recursos/Imágenes/TextoUsuario.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image usuarioTemporal = imagenUsuario.getImage();

        // Editamos la imagen.
        Image nuevaImagenUsuario = usuarioTemporal.getScaledInstance(140, 50, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        imagenUsuario = new ImageIcon(nuevaImagenUsuario);

        // Convertimos el JLabel en el icono.
        labelUsuario.setIcon(imagenUsuario);

        // Localización del Jlabel
        labelUsuario.setBounds(220, 100, 140, 50);

        // Incluimos el label en el JPanel.
        panelInicioSesion1.add(labelUsuario);

// CONTRASEÑA INICIO SESIÓN -------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon imagenContrasena = new ImageIcon("src/Recursos/Imágenes/TextoContraseña.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image contrasenaTemporal = imagenContrasena.getImage();

        // Editamos la imagen.
        Image nuevaImagenContrasena = contrasenaTemporal.getScaledInstance(180, 50, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        imagenContrasena = new ImageIcon(nuevaImagenContrasena);

        // Convertimos el JLabel en el icono.
        labelContrasena.setIcon(imagenContrasena);

        // Localización del Jlabel
        labelContrasena.setBounds(220, 160, 180, 50);

        // Incluimos el label en el JPanel.
        panelInicioSesion1.add(labelContrasena);

// NUEVA CUENTA INICIO SESIÓN -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon imagenNuevaCuenta = new ImageIcon("src/Recursos/Imágenes/TextoNuevaCuenta.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image nuevaCuentaTemporal = imagenNuevaCuenta.getImage();

        // Editamos la imagen.
        Image NuevaImagenNuevaCuenta = nuevaCuentaTemporal.getScaledInstance(400, 100, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        imagenNuevaCuenta = new ImageIcon(NuevaImagenNuevaCuenta);

        // Convertimos el JLabel en el icono.
        labelNuevaCuenta.setIcon(imagenNuevaCuenta);

        // Localización del Jlabel
        labelNuevaCuenta.setBounds(200, 300, 400, 100);

        // Incluimos el label en el JPanel.
        panelInicioSesion1.add(labelNuevaCuenta);

// CREAR CUENTA INICIO SESIÓN -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon imagenCrearCuenta = new ImageIcon("src/Recursos/Imágenes/TextoCrearCuenta.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image crearCuentaTemporal = imagenCrearCuenta.getImage();

        // Editamos la imagen.
        Image nuevaImagenCrearCuenta = crearCuentaTemporal.getScaledInstance(400, 100, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        imagenCrearCuenta = new ImageIcon(nuevaImagenCrearCuenta);

        // Convertimos el JLabel en el icono.
        labelCrearCuenta.setIcon(imagenCrearCuenta);

        // Localización del Jlabel
        labelCrearCuenta.setBounds(250, 400, 400, 100);

        // Añadimos un MouseListener para hacer que la etiqueta reaccione al darle click.
        labelCrearCuenta.addMouseListener(new MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(MouseEvent AccionBotonAcceder){

                // Aquí se llamará al método "Registro" para que se abra la ventana de registro.
                Registro.metodoRegistro();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        panelInicioSesion1.add(labelCrearCuenta);

// BÚSQUEDA INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon imagenBusqueda = new ImageIcon("src/Recursos/Imágenes/TextoBuscarVinilos.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image imagenBusquedaTemporal = imagenBusqueda.getImage();

        // Editamos la imagen.
        Image nuevaImagenBusqueda = imagenBusquedaTemporal.getScaledInstance(200, 50, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        imagenBusqueda = new ImageIcon(nuevaImagenBusqueda);

        // Convertimos el JLabel en el icono.
        labelBusqueda.setIcon(imagenBusqueda);

        // Localización del Jlabel
        labelBusqueda.setBounds(0, 50, 200, 60);

        // Incluimos el label en el JPanel.
        panelInicioSesion2.add(labelBusqueda);

// TEXTO ARTISTA INICIO SESIÓN ---------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon textoArtista = new ImageIcon("src/Recursos/Imágenes/TextoArtistas.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image textoArtistaTemporal = textoArtista.getImage();

        // Editamos la imagen.
        Image nuevoTextoArtista = textoArtistaTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        textoArtista = new ImageIcon(nuevoTextoArtista);

        // Convertimos el JLabel en el icono.
        labelTextoArtista.setIcon(textoArtista);

        // Localización del Jlabel
        labelTextoArtista.setBounds(155, 130, 40, 100);

        // Incluimos el label en el JPanel.
        panelInicioSesion2.add(labelTextoArtista);

// TEXTO DISCO INICIO SESIÓN -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon textoDisco = new ImageIcon("src/Recursos/Imágenes/TextoDiscos.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image textoDiscoTemporal = textoDisco.getImage();

        // Editamos la imagen.
        Image nuevoTextoDisco =textoDiscoTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        textoDisco = new ImageIcon(nuevoTextoDisco);

        // Convertimos el JLabel en el icono.
        labelTextoDisco.setIcon(textoDisco);

        // Localización del Jlabel
        labelTextoDisco.setBounds(155, 285, 40, 100);

        // Incluimos el label en el JPanel.
        panelInicioSesion2.add(labelTextoDisco);

// TEXTO CANCIÓN INICIO SESIÓN ---------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon textoCancion = new ImageIcon("src/Recursos/Imágenes/TextoCanciones.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image textoCancionTemporal = textoCancion.getImage();

        // Editamos la imagen.
        Image nuevoTextoCancion = textoCancionTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        textoCancion = new ImageIcon(nuevoTextoCancion);

        // Convertimos el JLabel en el icono.
        labelTextoCancion.setIcon(textoCancion);

        // Localización del Jlabel
        labelTextoCancion.setBounds(155, 440, 40, 100);

        // Incluimos el label en el JPanel.
        panelInicioSesion2.add(labelTextoCancion);

// IMAGEN BUSCAR POR ARTISTA --------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon imagenBuscarPorArtista = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorArtista.jpg");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image imagenBuscarPorArtistaTemporal = imagenBuscarPorArtista.getImage();

        // Editamos la imagen.
        Image nuevaImagenBuscarPorArtista = imagenBuscarPorArtistaTemporal.getScaledInstance(140, 140, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        imagenBuscarPorArtista = new ImageIcon(nuevaImagenBuscarPorArtista);

        // Convertimos el JLabel en el icono.
        labelBuscarArtista.setIcon(imagenBuscarPorArtista);

        // Localización del Jlabel
        labelBuscarArtista.setBounds(10, 110, 140, 140);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        labelBuscarArtista.addMouseListener(new MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(MouseEvent AccionLabelBuscarArtista){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                ListaArtistas.metodoListaArtistas();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        panelInicioSesion2.add(labelBuscarArtista);

// IMAGEN BUSCAR POR DISCO --------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon imagenBuscarPorDisco = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorDisco.jpg");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image imagenBuscarPorDiscoTemporal = imagenBuscarPorDisco.getImage();

        // Editamos la imagen.
        Image nuevaImagenBuscarPorDisco = imagenBuscarPorDiscoTemporal.getScaledInstance(140, 140, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        imagenBuscarPorDisco = new ImageIcon(nuevaImagenBuscarPorDisco);

        // Convertimos el JLabel en el icono.
        labelBuscarDisco.setIcon(imagenBuscarPorDisco);

        // Localización del Jlabel
        labelBuscarDisco.setBounds(10, 260, 140, 140);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        labelBuscarDisco.addMouseListener(new MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(MouseEvent AccionLabelBuscarDisco){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                ListaDiscos.metodoListaDiscos();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        panelInicioSesion2.add(labelBuscarDisco);

// IMAGEN BUSCAR POR CANCIÓN ------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon imagenBuscarPorCancion = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorCanción.jpg");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image imagenBuscarPorCancionTemporal = imagenBuscarPorCancion.getImage();

        // Editamos la imagen.
        Image nuevaImagenBuscarPorCancion = imagenBuscarPorCancionTemporal.getScaledInstance(140, 140, Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        imagenBuscarPorCancion = new ImageIcon(nuevaImagenBuscarPorCancion);

        // Convertimos el JLabel en el icono.
        labelBuscarCancion.setIcon(imagenBuscarPorCancion);

        // Localización del Jlabel
        labelBuscarCancion.setBounds(10, 410, 140, 140);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        labelBuscarCancion.addMouseListener(new MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(MouseEvent AccionLabelBuscarCancion){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                ListaCanciones.metodoListaCanciones();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        panelInicioSesion2.add(labelBuscarCancion);

// CAMPO DE TEXTO USUARIO ---------------------------------------------------------------------------------------------------------------------------

        // Título
        textUsuario.setText("      Escribe aquí tu usuario!");

        // Tamaño y localización
        textUsuario.setBounds(420, 110, 290, 40);

        // Fondo
        textUsuario.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        panelInicioSesion1.add(textUsuario);

// CAMPO DE TEXTO CONTRASEÑA ------------------------------------------------------------------------------------------------------------------------

        // Título
        textContrasena.setText("      Escribe aquí tu contraseña!");

        // Tamaño y localización
        textContrasena.setBounds(420, 170, 290, 40);

        // Fondo
        textContrasena.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        panelInicioSesion1.add(textContrasena);

// BOTÓN BUSCAR LISTA DISCOS ------------------------------------------------------------------------------------------------------------------------

        // Título
        botonAcceder.setText("Accede!");

        // Tamaño y localización
        botonAcceder.setBounds(300, 240, 400, 40);

        // Fondo
        botonAcceder.setOpaque(false);

        //Tamaño de fuente
        botonAcceder.setFont(botonAcceder.getFont().deriveFont(25.0f));

        // Añadimos un MouseListener para hacer que el botón reaccione al darle click.
        botonAcceder.addMouseListener(new MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción del botón al darle click.
            public void mouseClicked(MouseEvent AccionBotonAcceder){

                // Aquí se llamará al método "Registro" para que se abra la ventana de registro.


            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el botón al JPanel
        panelInicioSesion1.add(botonAcceder);

// INICIO DEL INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------

        // Determinamos la visibilidad de la ventana y sus componentes
        frameInicioSesion.setVisible(true);

    } // Fin del "MétodoInicioSesión"

} // Fin de la clase "InicioSesión".
// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a determinar la localización de nuestra clase, esto nos permitirá dividir el programa y hacerlo más ágil.
package Vista;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a importar todas las funcionalidades necesarias para el correcto funcionamiento de nuestro programa.

// Primero vamos a importar la funcionalidad "JLayeredPane", esta nos permite ponerle capas a los diferentes paneles.
import javax.swing.JLayeredPane;

// Ahora vamos a importar la funcionalidad "JFrame", esta nos permite crear ventanas para nuestro entorno gráfico.
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

// CLASE LISTA CANCIONES ----------------------------------------------------------------------------------------------------------------------------

// Esta clase contendrá todo el entorno gráfico relacionado con la lista de canciones.
public class ListaCanciones {

    // Para iniciar nuestro inicio de sesión, primero vamos a crear un método que contenga todos los componentes de nuestro entorno gráfico.
    public static void MétodoListaCanciones(){

        // Dentro del método, primero vamos a declarar todos los componentes necesarios.
        JLayeredPane GestorDeCapas = new JLayeredPane();

        JFrame FrameListaCanciones = new JFrame();

        JPanel PanelListaCanciones1 = new JPanel();
        JPanel PanelListaCanciones2 = new JPanel();

        JLabel LabelLogo = new JLabel();
        JLabel LabelBuscarVinilos = new JLabel();
        JLabel LabelTextoArtistas = new JLabel();
        JLabel LabelTextoDiscos = new JLabel();
        JLabel LabelTextoCanciones = new JLabel();
        JLabel LabelBuscarCanciones = new JLabel();
        JLabel LabelBuscarDiscos = new JLabel();
        JLabel LabelBuscarArtistas = new JLabel();
        JLabel LabelBuscarCancionesFavoritas = new JLabel();
        JLabel LabelTextoCancionesDelMomento = new JLabel();
        JLabel LabelCancionesDelMomento1 = new JLabel();
        JLabel LabelCancionesDelMomento2 = new JLabel();
        JLabel LabelCancionesDelMomento3 = new JLabel();

        JTextField TextBuscarCanciones = new JTextField();
        JTextField TextCancionesDelMomento1 = new JTextField();
        JTextField TextCancionesDelMomento2 = new JTextField();
        JTextField TextCancionesDelMomento3 = new JTextField();

        JButton BotónBuscar = new JButton();

        // Ahora vamos a determinar los ajustes de cada uno de ellos.

// GESTOR DE CAPAS ----------------------------------------------------------------------------------------------------------------------------------

        // Localización
        GestorDeCapas.setBounds(0, 0, 800, 600);

        // Añadimos el gestor de capas al JFrame.
        FrameListaCanciones.add(GestorDeCapas);

// FRAME LISTA CANCIONES ----------------------------------------------------------------------------------------------------------------------------

        // Título
        FrameListaCanciones.setTitle("FunkyTown INC.");

        // Tamaño
        FrameListaCanciones.setSize(800, 600);

        // Localización
        FrameListaCanciones.setLocationRelativeTo(null);

        // Layout
        FrameListaCanciones.setLayout(null);

        // Edición
        FrameListaCanciones.setResizable(false);

// PANEL LISTA CANCIONES 1 --------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        PanelListaCanciones1.setSize(800, 600);

        // Localización
        PanelListaCanciones1.setLocation(0, 0);

        // Fondo
        PanelListaCanciones1.setBackground(new ColorUIResource(34, 34, 34));

        // Layout
        PanelListaCanciones1.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        GestorDeCapas.add(PanelListaCanciones1, Integer.valueOf(0));

// PANEL LISTA CANCIONES 2 --------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        PanelListaCanciones2.setSize(200, 800);

        // Localización
        PanelListaCanciones2.setLocation(0, 0);

        // Fondo
        PanelListaCanciones2.setBackground(new ColorUIResource(41, 41, 41));

        // Layout
        PanelListaCanciones2.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        GestorDeCapas.add(PanelListaCanciones2, Integer.valueOf(1));

// TEXTO LOGO ---------------------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenLogo = new ImageIcon("src/Recursos/Imágenes/TextoLogo.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenLogoTemporal = ImagenLogo.getImage();

        // Editamos la imagen.
        Image NuevaImagenLogo = ImagenLogoTemporal.getScaledInstance(200, 60, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenLogo = new ImageIcon(NuevaImagenLogo);

        // Convertimos el JLabel en el icono.
        LabelLogo.setIcon(ImagenLogo);

        // Localización del Jlabel
        LabelLogo.setBounds(0, 0, 200, 60);

        // Incluimos el label en el JPanel.
        PanelListaCanciones2.add(LabelLogo);

// TEXTO BUSCAR VINILOS -----------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBuscarVinilos = new ImageIcon("src/Recursos/Imágenes/TextoBuscarVinilos.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenBuscarVinilosTemporal = ImagenBuscarVinilos.getImage();

        // Editamos la imagen.
        Image NuevaImagenBuscarVinilos = ImagenBuscarVinilosTemporal.getScaledInstance(200, 50, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenBuscarVinilos = new ImageIcon(NuevaImagenBuscarVinilos);

        // Convertimos el JLabel en el icono.
        LabelBuscarVinilos.setIcon(ImagenBuscarVinilos);

        // Localización del Jlabel
        LabelBuscarVinilos.setBounds(0, 50, 200, 60);

        // Incluimos el label en el JPanel.
        PanelListaCanciones2.add(LabelBuscarVinilos);

// TEXTO ARTISTAS -----------------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenArtistas = new ImageIcon("src/Recursos/Imágenes/TextoArtistas.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenArtistasTemporal = ImagenArtistas.getImage();

        // Editamos la imagen.
        Image NuevaImagenArtistas = ImagenArtistasTemporal.getScaledInstance(40, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenArtistas = new ImageIcon(NuevaImagenArtistas);

        // Convertimos el JLabel en el icono.
        LabelTextoArtistas.setIcon(ImagenArtistas);

        // Localización del Jlabel
        LabelTextoArtistas.setBounds(155, 130, 40, 100);

        // Incluimos el label en el JPanel.
        PanelListaCanciones2.add(LabelTextoArtistas);

// TEXTO DISCOS -------------------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenDiscos = new ImageIcon("src/Recursos/Imágenes/TextoDiscos.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenDiscosTemporal = ImagenDiscos.getImage();

        // Editamos la imagen.
        Image NuevaImagenDiscos = ImagenDiscosTemporal.getScaledInstance(40, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenDiscos = new ImageIcon(NuevaImagenDiscos);

        // Convertimos el JLabel en el icono.
        LabelTextoDiscos.setIcon(ImagenDiscos);

        // Localización del Jlabel
        LabelTextoDiscos.setBounds(155, 285, 40, 100);

        // Incluimos el label en el JPanel.
        PanelListaCanciones2.add(LabelTextoDiscos);

// TEXTO CANCIONES ----------------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenCanciones = new ImageIcon("src/Recursos/Imágenes/TextoCanciones.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenCancionesTemporal = ImagenCanciones.getImage();

        // Editamos la imagen.
        Image NuevaImagenCanciones = ImagenCancionesTemporal.getScaledInstance(40, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenCanciones = new ImageIcon(NuevaImagenCanciones);

        // Convertimos el JLabel en el icono.
        LabelTextoCanciones.setIcon(ImagenCanciones);

        // Localización del Jlabel
        LabelTextoCanciones.setBounds(155, 440, 40, 100);

        // Incluimos el label en el JPanel.
        PanelListaCanciones2.add(LabelTextoCanciones);

// IMAGEN BUSCAR POR ARTISTAS -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBuscarPorArtista = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorArtista.jpg");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenBuscarPorArtistaTemporal = ImagenBuscarPorArtista.getImage();

        // Editamos la imagen.
        Image NuevaImagenBuscarPorArtista = ImagenBuscarPorArtistaTemporal.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenBuscarPorArtista = new ImageIcon(NuevaImagenBuscarPorArtista);

        // Convertimos el JLabel en el icono.
        LabelBuscarArtistas.setIcon(ImagenBuscarPorArtista);

        // Localización del Jlabel
        LabelBuscarArtistas.setBounds(10, 110, 140, 140);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        LabelBuscarArtistas.addMouseListener(new java.awt.event.MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(java.awt.event.MouseEvent AcciónLabelBuscarArtista){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                ListaArtistas.MétodoListaArtistas();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        PanelListaCanciones2.add(LabelBuscarArtistas);

// IMAGEN BUSCAR POR DISCOS -------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBuscarPorDiscos = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorDisco.jpg");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenBuscarPorDiscosTemporal = ImagenBuscarPorDiscos.getImage();

        // Editamos la imagen.
        Image NuevaImagenBuscarPorDiscos = ImagenBuscarPorDiscosTemporal.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenBuscarPorDiscos = new ImageIcon(NuevaImagenBuscarPorDiscos);

        // Convertimos el JLabel en el icono.
        LabelBuscarDiscos.setIcon(ImagenBuscarPorDiscos);

        // Localización del Jlabel
        LabelBuscarDiscos.setBounds(10, 260, 140, 140);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        LabelBuscarDiscos.addMouseListener(new java.awt.event.MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(java.awt.event.MouseEvent AcciónLabelBuscarDiscos){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                ListaDiscos.MétodoListaDiscos();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        PanelListaCanciones2.add(LabelBuscarDiscos);

// IMAGEN BUSCAR POR CANCIÓN ------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBuscarPorCanción = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorCanción.jpg");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenBuscarPorCanciónTemporal = ImagenBuscarPorCanción.getImage();

        // Editamos la imagen.
        Image NuevaImagenBuscarPorCanción = ImagenBuscarPorCanciónTemporal.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenBuscarPorCanción = new ImageIcon(NuevaImagenBuscarPorCanción);

        // Convertimos el JLabel en el icono.
        LabelBuscarCanciones.setIcon(ImagenBuscarPorCanción);

        // Localización del Jlabel
        LabelBuscarCanciones.setBounds(10, 410, 140, 140);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        LabelBuscarCanciones.addMouseListener(new java.awt.event.MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(java.awt.event.MouseEvent AcciónLabelBuscarCanciones){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                ListaCanciones.MétodoListaCanciones();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        PanelListaCanciones2.add(LabelBuscarCanciones);

// TEXTO BUSCAR CANCIÓN FAVORITA --------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoBuscarCanciónFavorita = new ImageIcon("src/Recursos/Imágenes/TextoCanciónFavorita.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoBuscarCanciónFavoritaTemporal = TextoBuscarCanciónFavorita.getImage();

        // Editamos la imagen.
        Image NuevoTextoBuscarCanciónFavorita = TextoBuscarCanciónFavoritaTemporal.getScaledInstance(400, 90, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoBuscarCanciónFavorita = new ImageIcon(NuevoTextoBuscarCanciónFavorita);

        // Convertimos el JLabel en el icono.
        LabelBuscarCancionesFavoritas.setIcon(TextoBuscarCanciónFavorita);

        // Localización del Jlabel
        LabelBuscarCancionesFavoritas.setBounds(200, 10, 400, 90);

        // Incluimos el label en el JPanel.
        PanelListaCanciones1.add(LabelBuscarCancionesFavoritas);

// TEXTO CANCIONES DEL MOMENTO ----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoCancionesDelMomento = new ImageIcon("src/Recursos/Imágenes/TextoCancionesDelMomento.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoCancionesDelMomentoTemporal = TextoCancionesDelMomento.getImage();

        // Editamos la imagen.
        Image NuevoTextoCancionesDelMomento = TextoCancionesDelMomentoTemporal.getScaledInstance(400, 90, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoCancionesDelMomento = new ImageIcon(NuevoTextoCancionesDelMomento);

        // Convertimos el JLabel en el icono.
        LabelTextoCancionesDelMomento.setIcon(TextoCancionesDelMomento);

        // Localización del Jlabel
        LabelTextoCancionesDelMomento.setBounds(200, 150, 400, 90);

        // Incluimos el label en el JPanel.
        PanelListaCanciones1.add(LabelTextoCancionesDelMomento);

// CAMPO DE TEXTO LISTA CANCIONES ----------------------------------------------------------------------------------------------------------------------

        // Título
        TextBuscarCanciones.setText("      Escribe aquí la canción que quieras buscar!");

        // Tamaño y localización
        TextBuscarCanciones.setBounds(220, 100, 550, 40);

        // Fondo
        TextBuscarCanciones.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        PanelListaCanciones1.add(TextBuscarCanciones);

// BOTÓN BUSCAR LISTA CANCIONES ------------------------------------------------------------------------------------------------------------------------

        // Título
        BotónBuscar.setText("Buscar!");

        // Tamaño y localización
        BotónBuscar.setBounds(670, 100, 100, 40);

        // Fondo
        BotónBuscar.setOpaque(false);

        // Incluimos el botón al JPanel
        PanelListaCanciones1.add(BotónBuscar);

// IMAGEN CANCIONES DEL MOMENTO 1 -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenCanciónDelMomento1 = new ImageIcon("src/Recursos/PLACEHOLDER (ELIMINAR)/A.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenCanciónDelMomento1Temporal = ImagenCanciónDelMomento1.getImage();

        // Editamos la imagen.
        Image NuevaImagenCanciónDelMomento1 = ImagenCanciónDelMomento1Temporal.getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenCanciónDelMomento1 = new ImageIcon(NuevaImagenCanciónDelMomento1);

        // Convertimos el JLabel en el icono.
        LabelCancionesDelMomento1.setIcon(ImagenCanciónDelMomento1);

        // Localización del Jlabel
        LabelCancionesDelMomento1.setBounds(220, 250, 170, 170);

        // Incluimos el label en el JPanel.
        PanelListaCanciones1.add(LabelCancionesDelMomento1);

// IMAGEN CANCIONES DEL MOMENTO 2 -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenCanciónDelMomento2 = new ImageIcon("src/Recursos/PLACEHOLDER (ELIMINAR)/A.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenCanciónDelMomento2Temporal = ImagenCanciónDelMomento2.getImage();

        // Editamos la imagen.
        Image NuevaImagenCanciónDelMomento2 = ImagenCanciónDelMomento2Temporal.getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenCanciónDelMomento2 = new ImageIcon(NuevaImagenCanciónDelMomento2);

        // Convertimos el JLabel en el icono.
        LabelCancionesDelMomento2.setIcon(ImagenCanciónDelMomento2);

        // Localización del Jlabel
        LabelCancionesDelMomento2.setBounds(410, 250, 170, 170);

        // Incluimos el label en el JPanel.
        PanelListaCanciones1.add(LabelCancionesDelMomento2);

// IMAGEN CANCIONES DEL MOMENTO 3 -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenCanciónDelMomento3 = new ImageIcon("src/Recursos/PLACEHOLDER (ELIMINAR)/A.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenCanciónDelMomento3Temporal = ImagenCanciónDelMomento3.getImage();

        // Editamos la imagen.
        Image NuevaImagenCanciónDelMomento3 = ImagenCanciónDelMomento3Temporal.getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenCanciónDelMomento3 = new ImageIcon(NuevaImagenCanciónDelMomento3);

        // Convertimos el JLabel en el icono.
        LabelCancionesDelMomento3.setIcon(ImagenCanciónDelMomento3);

        // Localización del Jlabel
        LabelCancionesDelMomento3.setBounds(600, 250, 170, 170);

        // Incluimos el label en el JPanel.
        PanelListaCanciones1.add(LabelCancionesDelMomento3);

// CAMPO DE TEXTO CANCIONES DEL MOMENTO 1 -----------------------------------------------------------------------------------------------------------

        // Título
        TextCancionesDelMomento1.setText("Texto Prueba 1");

        // Tamaño y localización
        TextCancionesDelMomento1.setBounds(220, 430, 170, 120);

        // Fondo
        TextCancionesDelMomento1.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        PanelListaCanciones1.add(TextCancionesDelMomento1);

// CAMPO DE TEXTO CANCIONES DEL MOMENTO 2 -----------------------------------------------------------------------------------------------------------

        // Título
        TextCancionesDelMomento2.setText("Texto Prueba 2");

        // Tamaño y localización
        TextCancionesDelMomento2.setBounds(410, 430, 170, 120);

        // Fondo
        TextCancionesDelMomento2.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        PanelListaCanciones1.add(TextCancionesDelMomento2);

// CAMPO DE TEXTO CANCIONES DEL MOMENTO 3 -----------------------------------------------------------------------------------------------------------

        // Título
        TextCancionesDelMomento3.setText("Texto Prueba 3");

        // Tamaño y localización
        TextCancionesDelMomento3.setBounds(600, 430, 170, 120);

        // Fondo
        TextCancionesDelMomento3.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        PanelListaCanciones1.add(TextCancionesDelMomento3);

// INICIO DEL LISTA CANCIONES ------------------------------------------------------------------------------------------------------------------------

        // Determinamos la visibilidad de la ventana y sus componentes
        FrameListaCanciones.setVisible(true);

    } // Fin del "MétodoListaCanciones"

} // Fin de la clase "ListaCanciones".
package Vista;// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a determinar la localización de nuestra clase, esto nos permitirá dividir el programa y hacerlo más ágil.

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

// CLASE LISTA DISCOS ----------------------------------------------------------------------------------------------------------------------------

// Esta clase contendrá todo el entorno gráfico relacionado con la lista de canciones.
public class ListaArtistas {

    // Para iniciar nuestro inicio de sesión, primero vamos a crear un método que contenga todos los componentes de nuestro entorno gráfico.
    public static void MétodoListaArtistas(){

        // Dentro del método, primero vamos a declarar todos los componentes necesarios.
        JLayeredPane GestorDeCapas = new JLayeredPane();

        JFrame FrameListaArtistas = new JFrame();

        JPanel PanelListaArtistas1 = new JPanel();
        JPanel PanelListaArtistas2 = new JPanel();

        JLabel LabelLogo = new JLabel();
        JLabel LabelBuscarVinilos = new JLabel();
        JLabel LabelTextoArtistas = new JLabel();
        JLabel LabelTextoDiscos = new JLabel();
        JLabel LabelTextoCanciones = new JLabel();
        JLabel LabelBuscarArtistas = new JLabel();
        JLabel LabelBuscarCanciones = new JLabel();
        JLabel LabelBuscarDiscos = new JLabel();
        JLabel LabelBuscarArtistasFavoritos = new JLabel();
        JLabel LabelTextoArtistasDelMomento = new JLabel();
        JLabel LabelArtistasDelMomento1 = new JLabel();
        JLabel LabelArtistasDelMomento2 = new JLabel();
        JLabel LabelArtistasDelMomento3 = new JLabel();

        JTextField TextBuscarArtistas = new JTextField();
        JTextField TextArtistasDelMomento1 = new JTextField();
        JTextField TextArtistasDelMomento2 = new JTextField();
        JTextField TextArtistasDelMomento3 = new JTextField();

        JButton BotónBuscar = new JButton();

        // Ahora vamos a determinar los ajustes de cada uno de ellos.

// GESTOR DE CAPAS ----------------------------------------------------------------------------------------------------------------------------------

        // Localización
        GestorDeCapas.setBounds(0, 0, 800, 600);

        // Añadimos el gestor de capas al JFrame.
        FrameListaArtistas.add(GestorDeCapas);

// FRAME LISTA DISCOS ----------------------------------------------------------------------------------------------------------------------------

        // Título
        FrameListaArtistas.setTitle("FunkyTown INC.");

        // Tamaño
        FrameListaArtistas.setSize(800, 600);

        // Localización
        FrameListaArtistas.setLocationRelativeTo(null);

        // Layout
        FrameListaArtistas.setLayout(null);

        // Edición
        FrameListaArtistas.setResizable(false);

// PANEL LISTA DISCOS 1 --------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        PanelListaArtistas1.setSize(800, 600);

        // Localización
        PanelListaArtistas1.setLocation(0, 0);

        // Fondo
        PanelListaArtistas1.setBackground(new ColorUIResource(34, 34, 34));

        // Layout
        PanelListaArtistas1.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        GestorDeCapas.add(PanelListaArtistas1, Integer.valueOf(0));

// PANEL LISTA DISCOS 2 --------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        PanelListaArtistas2.setSize(200, 800);

        // Localización
        PanelListaArtistas2.setLocation(0, 0);

        // Fondo
        PanelListaArtistas2.setBackground(new ColorUIResource(41, 41, 41));

        // Layout
        PanelListaArtistas2.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        GestorDeCapas.add(PanelListaArtistas2, Integer.valueOf(1));

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
        PanelListaArtistas2.add(LabelLogo);

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
        PanelListaArtistas2.add(LabelBuscarVinilos);

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
        PanelListaArtistas2.add(LabelTextoArtistas);

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
        PanelListaArtistas2.add(LabelTextoDiscos);

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
        PanelListaArtistas2.add(LabelTextoCanciones);

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
        PanelListaArtistas2.add(LabelBuscarArtistas);

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
        PanelListaArtistas2.add(LabelBuscarDiscos);

// IMAGEN BUSCAR POR CANCIONES ----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBuscarPorCanciones = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorCanción.jpg");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenBuscarPorCancionesTemporal = ImagenBuscarPorCanciones.getImage();

        // Editamos la imagen.
        Image NuevaImagenBuscarPorCanciones = ImagenBuscarPorCancionesTemporal.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenBuscarPorCanciones = new ImageIcon(NuevaImagenBuscarPorCanciones);

        // Convertimos el JLabel en el icono.
        LabelBuscarCanciones.setIcon(ImagenBuscarPorCanciones);

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
        PanelListaArtistas2.add(LabelBuscarCanciones);

// TEXTO BUSCAR DISCO FAVORITO ----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoBuscarArtistaFavorito = new ImageIcon("src/Recursos/Imágenes/TextoArtistaFavorito.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoBuscarArtistaFavoritoTemporal = TextoBuscarArtistaFavorito.getImage();

        // Editamos la imagen.
        Image NuevoTextoBuscarArtistaFavorito = TextoBuscarArtistaFavoritoTemporal.getScaledInstance(400, 90, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoBuscarArtistaFavorito = new ImageIcon(NuevoTextoBuscarArtistaFavorito);

        // Convertimos el JLabel en el icono.
        LabelBuscarArtistasFavoritos.setIcon(TextoBuscarArtistaFavorito);

        // Localización del Jlabel
        LabelBuscarArtistasFavoritos.setBounds(200, 10, 400, 90);

        // Incluimos el label en el JPanel.
        PanelListaArtistas1.add(LabelBuscarArtistasFavoritos);

// TEXTO DISCOS DEL MOMENTO -------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoArtistasDelMomento = new ImageIcon("src/Recursos/Imágenes/TextoArtistasDelMomento.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoArtistasDelMomentoTemporal = TextoArtistasDelMomento.getImage();

        // Editamos la imagen.
        Image NuevoTextoArtistasDelMomento = TextoArtistasDelMomentoTemporal.getScaledInstance(400, 90, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoArtistasDelMomento = new ImageIcon(NuevoTextoArtistasDelMomento);

        // Convertimos el JLabel en el icono.
        LabelTextoArtistasDelMomento.setIcon(TextoArtistasDelMomento);

        // Localización del Jlabel
        LabelTextoArtistasDelMomento.setBounds(200, 150, 400, 90);

        // Incluimos el label en el JPanel.
        PanelListaArtistas1.add(LabelTextoArtistasDelMomento);

// CAMPO DE TEXTO LISTA DISCOS ----------------------------------------------------------------------------------------------------------------------

        // Título
        TextBuscarArtistas.setText("      Escribe aquí el artista que quieras buscar!");

        // Tamaño y localización
        TextBuscarArtistas.setBounds(220, 100, 550, 40);

        // Fondo
        TextBuscarArtistas.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        PanelListaArtistas1.add(TextBuscarArtistas);

// BOTÓN BUSCAR LISTA DISCOS ------------------------------------------------------------------------------------------------------------------------

        // Título
        BotónBuscar.setText("Buscar!");

        // Tamaño y localización
        BotónBuscar.setBounds(670, 100, 100, 40);

        // Fondo
        BotónBuscar.setOpaque(false);

        // Incluimos el botón al JPanel
        PanelListaArtistas1.add(BotónBuscar);

// IMAGEN DISCOS DEL MOMENTO 1 -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenArtistaDelMomento1 = new ImageIcon("src/Recursos/PLACEHOLDER (ELIMINAR)/A.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenArtistaDelMomento1Temporal = ImagenArtistaDelMomento1.getImage();

        // Editamos la imagen.
        Image NuevaImagenArtistaDelMomento1 = ImagenArtistaDelMomento1Temporal.getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenArtistaDelMomento1 = new ImageIcon(NuevaImagenArtistaDelMomento1);

        // Convertimos el JLabel en el icono.
        LabelArtistasDelMomento1.setIcon(ImagenArtistaDelMomento1);

        // Localización del Jlabel
        LabelArtistasDelMomento1.setBounds(220, 250, 170, 170);

        // Incluimos el label en el JPanel.
        PanelListaArtistas1.add(LabelArtistasDelMomento1);

// IMAGEN DISCOS DEL MOMENTO 2 -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenArtistaDelMomento2 = new ImageIcon("src/Recursos/PLACEHOLDER (ELIMINAR)/A.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenArtistaDelMomento2Temporal = ImagenArtistaDelMomento2.getImage();

        // Editamos la imagen.
        Image NuevaImagenArtistaDelMomento2 = ImagenArtistaDelMomento2Temporal.getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenArtistaDelMomento2 = new ImageIcon(NuevaImagenArtistaDelMomento2);

        // Convertimos el JLabel en el icono.
        LabelArtistasDelMomento2.setIcon(ImagenArtistaDelMomento2);

        // Localización del Jlabel
        LabelArtistasDelMomento2.setBounds(410, 250, 170, 170);

        // Incluimos el label en el JPanel.
        PanelListaArtistas1.add(LabelArtistasDelMomento2);

// IMAGEN DISCOS DEL MOMENTO 3 -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenArtistaDelMomento3 = new ImageIcon("src/Recursos/PLACEHOLDER (ELIMINAR)/A.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenArtistaDelMomento3Temporal = ImagenArtistaDelMomento3.getImage();

        // Editamos la imagen.
        Image NuevaImagenArtistaDelMomento3 = ImagenArtistaDelMomento3Temporal.getScaledInstance(170, 170, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenArtistaDelMomento3 = new ImageIcon(NuevaImagenArtistaDelMomento3);

        // Convertimos el JLabel en el icono.
        LabelArtistasDelMomento3.setIcon(ImagenArtistaDelMomento3);

        // Localización del Jlabel
        LabelArtistasDelMomento3.setBounds(600, 250, 170, 170);

        // Incluimos el label en el JPanel.
        PanelListaArtistas1.add(LabelArtistasDelMomento3);

// CAMPO DE TEXTO DISCOS DEL MOMENTO 1 -----------------------------------------------------------------------------------------------------------

        // Título
        TextArtistasDelMomento1.setText("Texto Prueba 1");

        // Tamaño y localización
        TextArtistasDelMomento1.setBounds(220, 430, 170, 120);

        // Fondo
        TextArtistasDelMomento1.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        PanelListaArtistas1.add(TextArtistasDelMomento1);

// CAMPO DE TEXTO DISCOS DEL MOMENTO 2 -----------------------------------------------------------------------------------------------------------

        // Título
        TextArtistasDelMomento2.setText("Texto Prueba 2");

        // Tamaño y localización
        TextArtistasDelMomento2.setBounds(410, 430, 170, 120);

        // Fondo
        TextArtistasDelMomento2.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        PanelListaArtistas1.add(TextArtistasDelMomento2);

// CAMPO DE TEXTO DISCOS DEL MOMENTO 3 -----------------------------------------------------------------------------------------------------------

        // Título
        TextArtistasDelMomento3.setText("Texto Prueba 3");

        // Tamaño y localización
        TextArtistasDelMomento3.setBounds(600, 430, 170, 120);

        // Fondo
        TextArtistasDelMomento3.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        PanelListaArtistas1.add(TextArtistasDelMomento3);

// INICIO DEL LISTA DISCOS ------------------------------------------------------------------------------------------------------------------------

        // Determinamos la visibilidad de la ventana y sus componentes
        FrameListaArtistas.setVisible(true);

    } // Fin del "MétodoListaArtistas"

} // Fin de la clase "ListaArtistas".
package Vista;// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a determinar la localización de nuestra clase, esto nos permitirá dividir el programa y hacerlo más ágil.¡

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

// Importamos la funcionalidad "ImageIcon", esta nos permite establecer imágenes como iconos para nuestros componentes.
import javax.swing.ImageIcon;

// Importamos la funcionalidad "ColorUIResource", esta nos permite introducir colores a nuestros componentes.
import javax.swing.plaf.ColorUIResource;

// Importamos la funcionalidad "Image", esta nos permite modificar imágenes.
import java.awt.Image;

// CLASE MENÚ PRINCIPAL -----------------------------------------------------------------------------------------------------------------------------

// Esta clase contendrá todo el entorno gráfico relacionado con el menú principal.
public class MenuPrincipal {

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Para iniciar nuestro menú principal, primero vamos a crear un método que contenga todos los componentes de nuestro entorno gráfico.

    /**
     * "MétodoMenúPrincipal" se encarga de crear todo el entorno gráfico del menú principal.
     *
     * @author Nicolás Viéitez Domínguez
     * @author Susana Isabel Santos Mallqui.
     *
     * @since V2.0
     */

    public static void MétodoMenúPrincipal(){

        // Dentro del método, primero vamos a declarar todos los componentes necesarios.
        JLayeredPane GestorDeCapas = new JLayeredPane();

        JFrame FrameMenúPrincipal = new JFrame();

        JPanel PanelMenúPrincipal1 = new JPanel();
        JPanel PanelMenúPrincipal2 = new JPanel();
        JPanel PanelMenúPrincipal3 = new JPanel();

        JLabel LabelLogoMenúPrincipal = new JLabel();
        JLabel LabelBúsquedaMenúPrincipal = new JLabel();
        JLabel LabelTextoArtistaMenúPrincipal = new JLabel();
        JLabel LabelTextoDiscoMenúPrincipal = new JLabel();
        JLabel LabelTextoCanciónMenúPrincipal = new JLabel();
        JLabel LabelFondoMenúPrincipal = new JLabel();
        JLabel LabelTextoMenúPrincipal = new JLabel();
        JLabel LabelBuscarCanción = new JLabel();
        JLabel LabelBuscarDisco = new JLabel();
        JLabel LabelBuscarArtista = new JLabel();
        JLabel LabelTextoIniciarSesión = new JLabel();

        // Ahora vamos a determinar los ajustes de cada uno de ellos.

// GESTOR DE CAPAS ----------------------------------------------------------------------------------------------------------------------------------

        // Localización
        GestorDeCapas.setBounds(0, 0, 800, 600);

        // Añadimos el gestor de capas al JFrame.
        FrameMenúPrincipal.add(GestorDeCapas);

// FRAME MENÚ PRINCIPAL -----------------------------------------------------------------------------------------------------------------------------

        // Título
        FrameMenúPrincipal.setTitle("FunkyTown INC.");

        // Tamaño
        FrameMenúPrincipal.setSize(800, 600);

        // Localización
        FrameMenúPrincipal.setLocationRelativeTo(null);

        // Layout
        FrameMenúPrincipal.setLayout(null);

        // Edición
        FrameMenúPrincipal.setResizable(false);

// PANEL MENÚ PRINCIPAL 1 ---------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        PanelMenúPrincipal1.setSize(800, 600);

        // Localización
        PanelMenúPrincipal1.setLocation(0, 0);

        // Fondo
        PanelMenúPrincipal1.setBackground(new ColorUIResource(34, 34, 34));

        // Layout
        PanelMenúPrincipal1.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        GestorDeCapas.add(PanelMenúPrincipal1, Integer.valueOf(0));

// PANEL MENÚ PRINCIPAL 2 ---------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        PanelMenúPrincipal2.setSize(200, 800);

        // Localización
        PanelMenúPrincipal2.setLocation(0, 0);

        // Fondo
        PanelMenúPrincipal2.setBackground(new ColorUIResource(41, 41, 41));

        // Layout
        PanelMenúPrincipal2.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        GestorDeCapas.add(PanelMenúPrincipal2, Integer.valueOf(1));

// PANEL MENÚ PRINCIPAL 3 ---------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        PanelMenúPrincipal3.setSize(800, 600);

        // Localización
        PanelMenúPrincipal3.setLocation(0, 0);

        // Fondo
        PanelMenúPrincipal3.setOpaque(false);

        // Layout
        PanelMenúPrincipal3.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        GestorDeCapas.add(PanelMenúPrincipal3, Integer.valueOf(2));

// FONDO MENÚ PRINCIPAL -----------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenFondoMenúPrincipal = new ImageIcon("src/Recursos/Imágenes/ImagenFondo.jpg");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenFondoMenúPrincipalTemporal = ImagenFondoMenúPrincipal.getImage();

        // Editamos la imagen.
        Image NuevaImagenFondoMenúPrincipal = ImagenFondoMenúPrincipalTemporal.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenFondoMenúPrincipal = new ImageIcon(NuevaImagenFondoMenúPrincipal);

        // Convertimos el JLabel en el icono.
        LabelFondoMenúPrincipal.setIcon(ImagenFondoMenúPrincipal);

        // Localización del Jlabel
        LabelFondoMenúPrincipal.setBounds(100, 0, 800, 600);

        // Incluimos el label en el JPanel.
        PanelMenúPrincipal1.add(LabelFondoMenúPrincipal);

// TEXTO MENÚ PRINCIPAL -----------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenTextoMenúPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoMenúPrincipal.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenTextoMenúPrincipalTemporal = ImagenTextoMenúPrincipal.getImage();

        // Editamos la imagen.
        Image NuevaImagenTextoMenúPrincipal = ImagenTextoMenúPrincipalTemporal.getScaledInstance(600, 300, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenTextoMenúPrincipal = new ImageIcon(NuevaImagenTextoMenúPrincipal);

        // Convertimos el JLabel en el icono.
        LabelTextoMenúPrincipal.setIcon(ImagenTextoMenúPrincipal);

        // Localización del Jlabel
        LabelTextoMenúPrincipal.setBounds(200, 0, 600, 300);

        // Incluimos el label en el JLayeredPane.
        PanelMenúPrincipal3.add(LabelTextoMenúPrincipal);

// LOGO MENÚ PRINCIPAL ------------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon LogoMenúPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoLogo.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image LogoTemporal = LogoMenúPrincipal.getImage();

        // Editamos la imagen.
        Image NuevoLogoMenúPrincipal = LogoTemporal.getScaledInstance(200, 60, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        LogoMenúPrincipal = new ImageIcon(NuevoLogoMenúPrincipal);

        // Convertimos el JLabel en el icono.
        LabelLogoMenúPrincipal.setIcon(LogoMenúPrincipal);

        // Localización del Jlabel
        LabelLogoMenúPrincipal.setBounds(0, 0, 200, 60);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        LabelLogoMenúPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(java.awt.event.MouseEvent AcciónLabelLogoMenúPrincipal){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                FrameMenúPrincipal.dispose();
                MenuPrincipal.MétodoMenúPrincipal();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        PanelMenúPrincipal2.add(LabelLogoMenúPrincipal);

// BÚSQUEDA MENÚ PRINCIPAL ------------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBúsquedaMenúPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoBuscarVinilos.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenBúsquedaTemporal = ImagenBúsquedaMenúPrincipal.getImage();

        // Editamos la imagen.
        Image NuevaImagenBúsquedaMenúPrincipal = ImagenBúsquedaTemporal.getScaledInstance(200, 50, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenBúsquedaMenúPrincipal = new ImageIcon(NuevaImagenBúsquedaMenúPrincipal);

        // Convertimos el JLabel en el icono.
        LabelBúsquedaMenúPrincipal.setIcon(ImagenBúsquedaMenúPrincipal);

        // Localización del Jlabel
        LabelBúsquedaMenúPrincipal.setBounds(0, 50, 200, 60);

        // Incluimos el label en el JPanel.
        PanelMenúPrincipal2.add(LabelBúsquedaMenúPrincipal);

// TEXTO ARTISTA MENÚ PRINCIPAL ---------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoArtistaMenúPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoArtistas.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoArtistaTemporal = TextoArtistaMenúPrincipal.getImage();

        // Editamos la imagen.
        Image NuevoTextoArtistaMenúPrincipal = TextoArtistaTemporal.getScaledInstance(40, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoArtistaMenúPrincipal = new ImageIcon(NuevoTextoArtistaMenúPrincipal);

        // Convertimos el JLabel en el icono.
        LabelTextoArtistaMenúPrincipal.setIcon(TextoArtistaMenúPrincipal);

        // Localización del Jlabel
        LabelTextoArtistaMenúPrincipal.setBounds(155, 130, 40, 100);

        // Incluimos el label en el JPanel.
        PanelMenúPrincipal2.add(LabelTextoArtistaMenúPrincipal);

// TEXTO DISCO MENÚ PRINCIPAL -----------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoDiscoMenúPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoDiscos.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoDiscoTemporal = TextoDiscoMenúPrincipal.getImage();

        // Editamos la imagen.
        Image NuevoTextoDiscoMenúPrincipal =TextoDiscoTemporal.getScaledInstance(40, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoDiscoMenúPrincipal = new ImageIcon(NuevoTextoDiscoMenúPrincipal);

        // Convertimos el JLabel en el icono.
        LabelTextoDiscoMenúPrincipal.setIcon(TextoDiscoMenúPrincipal);

        // Localización del Jlabel
        LabelTextoDiscoMenúPrincipal.setBounds(155, 285, 40, 100);

        // Incluimos el label en el JPanel.
        PanelMenúPrincipal2.add(LabelTextoDiscoMenúPrincipal);

// TEXTO CANCIÓN MENÚ PRINCIPAL ---------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoCanciónMenúPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoCanciones.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoCanciónTemporal = TextoCanciónMenúPrincipal.getImage();

        // Editamos la imagen.
        Image NuevoTextoCanciónMenúPrincipal = TextoCanciónTemporal.getScaledInstance(40, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoCanciónMenúPrincipal = new ImageIcon(NuevoTextoCanciónMenúPrincipal);

        // Convertimos el JLabel en el icono.
        LabelTextoCanciónMenúPrincipal.setIcon(TextoCanciónMenúPrincipal);

        // Localización del Jlabel
        LabelTextoCanciónMenúPrincipal.setBounds(155, 440, 40, 100);

        // Incluimos el label en el JPanel.
        PanelMenúPrincipal2.add(LabelTextoCanciónMenúPrincipal);

// TEXTO INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoIniciarSesión = new ImageIcon("src/Recursos/Imágenes/TextoIniciarSesión.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoIniciarSesiónTemporal = TextoIniciarSesión.getImage();

        // Editamos la imagen.
        Image NuevoTextoIniciarSesión = TextoIniciarSesiónTemporal.getScaledInstance(150, 50, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoIniciarSesión = new ImageIcon(NuevoTextoIniciarSesión);

        // Convertimos el JLabel en el icono.
        LabelTextoIniciarSesión.setIcon(TextoIniciarSesión);

        // Localización del Jlabel
        LabelTextoIniciarSesión.setBounds(620, 500, 150, 50);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        LabelTextoIniciarSesión.addMouseListener(new java.awt.event.MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(java.awt.event.MouseEvent AcciónLabelTextoIniciarSesión){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                Vista.InicioSesion.MétodoInicioSesión();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        PanelMenúPrincipal3.add(LabelTextoIniciarSesión);

// IMAGEN BUSCAR POR ARTISTA ------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBuscarPorArtista = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorArtista.jpg");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenBuscarPorArtistaTemporal = ImagenBuscarPorArtista.getImage();

        // Editamos la imagen.
        Image NuevaImagenBuscarPorArtista = ImagenBuscarPorArtistaTemporal.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenBuscarPorArtista = new ImageIcon(NuevaImagenBuscarPorArtista);

        // Convertimos el JLabel en el icono.
        LabelBuscarArtista.setIcon(ImagenBuscarPorArtista);

        // Localización del Jlabel
        LabelBuscarArtista.setBounds(10, 110, 140, 140);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        LabelBuscarArtista.addMouseListener(new java.awt.event.MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(java.awt.event.MouseEvent AcciónLabelBuscarArtista){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                ListaArtistas.MétodoListaArtistas();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        PanelMenúPrincipal2.add(LabelBuscarArtista);

// IMAGEN BUSCAR POR DISCO --------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBuscarPorDisco = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorDisco.jpg");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenBuscarPorDiscoTemporal = ImagenBuscarPorDisco.getImage();

        // Editamos la imagen.
        Image NuevaImagenBuscarPorDisco = ImagenBuscarPorDiscoTemporal.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenBuscarPorDisco = new ImageIcon(NuevaImagenBuscarPorDisco);

        // Convertimos el JLabel en el icono.
        LabelBuscarDisco.setIcon(ImagenBuscarPorDisco);

        // Localización del Jlabel
        LabelBuscarDisco.setBounds(10, 260, 140, 140);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        LabelBuscarDisco.addMouseListener(new java.awt.event.MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(java.awt.event.MouseEvent AcciónLabelBuscarDisco){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                ListaDiscos.MétodoListaDiscos();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        PanelMenúPrincipal2.add(LabelBuscarDisco);

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
        LabelBuscarCanción.setIcon(ImagenBuscarPorCanción);

        // Localización del Jlabel
        LabelBuscarCanción.setBounds(10, 410, 140, 140);

        // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
        LabelBuscarCanción.addMouseListener(new java.awt.event.MouseAdapter() {

            // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
            @Override

            // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
            public void mouseClicked(java.awt.event.MouseEvent AcciónLabelBuscarCanción){

                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                ListaCanciones.MétodoListaCanciones();

            } // Fin del método "MouseClicked" .

        }); // Fin del método "MouseListener".

        // Incluimos el label en el JPanel.
        PanelMenúPrincipal2.add(LabelBuscarCanción);

// INICIO DEL MENÚ PRINCIPAL ------------------------------------------------------------------------------------------------------------------------

        // Determinamos la visibilidad de la ventana y sus componentes
        FrameMenúPrincipal.setVisible(true);

    } // Fin del "MétodoMenúPrincipal."

} // Fin de la clase "MenuPrincipal".
// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a determinar la localización de nuestra clase, esto nos permitirá dividir el programa y hacerlo más ágil.
package Vista;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a importar todas las funcionalidades necesarias para el correcto funcionamiento de nuestro programa.
import javax.swing.JLayeredPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.plaf.ColorUIResource;

import Controlador.Controller;
import Modelo.DatosArtistas;
import Modelo.DatosDiscos;
import Modelo.DatosCanciones;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// CLASE LISTA DISCOS -------------------------------------------------------------------------------------------------------------------------------

// Esta clase contendrá el entorno gráfico relacionado con la lista de canciones.
public class ListaDiscos {

        static String DiscoBuscado;

        public static String EnviarDiscoBuscado(){

                return DiscoBuscado;
        };

        // Para iniciar nuestro inicio de sesión, primero vamos a crear un método que contenga todos los componentes de nuestro entorno gráfico.
        public static void metodoListaDiscos() {

                DatosDiscos DatosDiscos = new DatosDiscos();
                Controller Controller = new Controller();

                // Dentro del método, primero vamos a declarar todos los componentes necesarios.
                JLayeredPane GestorDeCapas = new JLayeredPane();

                JFrame FrameListaDiscos = new JFrame();

                JPanel PanelListaDiscos1 = new JPanel();
                JPanel PanelListaDiscos2 = new JPanel();

                JLabel LabelLogo = new JLabel();
                JLabel LabelBuscarVinilos = new JLabel();
                JLabel LabelTextoArtistas = new JLabel();
                JLabel LabelTextoDiscos = new JLabel();
                JLabel LabelTextoCanciones = new JLabel();
                JLabel LabelBuscarDiscos = new JLabel();
                JLabel LabelBuscarCanciones = new JLabel();
                JLabel LabelBuscarArtistas = new JLabel();
                JLabel LabelBuscarDiscosFavoritos = new JLabel();
                JLabel LabelTextoDiscosDelMomento = new JLabel();
                JLabel LabelDiscosDelMomento1 = new JLabel();
                JLabel LabelDiscosDelMomento2 = new JLabel();
                JLabel LabelDiscosDelMomento3 = new JLabel();

                JTextField TextBuscarDiscos = new JTextField();
                JTextArea TextDiscosDelMomento1 = new JTextArea();
                JTextArea TextDiscosDelMomento2 = new JTextArea();
                JTextArea TextDiscosDelMomento3 = new JTextArea();

                JButton BotonBuscar = new JButton();

                // Ahora vamos a determinar los ajustes de cada uno de ellos.

// GESTOR DE CAPAS ----------------------------------------------------------------------------------------------------------------------------------

                // Localización
                GestorDeCapas.setBounds(0, 0, 800, 600);

                // Añadimos el gestor de capas al JFrame.
                FrameListaDiscos.add(GestorDeCapas);

// FRAME LISTA DISCOS -------------------------------------------------------------------------------------------------------------------------------

                // Título
                FrameListaDiscos.setTitle("FunkyTown INC.");

                // Tamaño
                FrameListaDiscos.setSize(800, 600);

                // Localización
                FrameListaDiscos.setLocationRelativeTo(null);

                // Layout
                FrameListaDiscos.setLayout(null);

                // Edición
                FrameListaDiscos.setResizable(false);

// PANEL LISTA DISCOS 1 -----------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                PanelListaDiscos1.setSize(800, 600);

                // Localización
                PanelListaDiscos1.setLocation(0, 0);

                // Fondo
                PanelListaDiscos1.setBackground(new ColorUIResource(34, 34, 34));

                // Layout
                PanelListaDiscos1.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                GestorDeCapas.add(PanelListaDiscos1, Integer.valueOf(0));

// PANEL LISTA DISCOS 2 -----------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                PanelListaDiscos2.setSize(200, 800);

                // Localización
                PanelListaDiscos2.setLocation(0, 0);

                // Fondo
                PanelListaDiscos2.setBackground(new ColorUIResource(41, 41, 41));

                // Layout
                PanelListaDiscos2.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                GestorDeCapas.add(PanelListaDiscos2, Integer.valueOf(1));

// TEXTO LOGO ---------------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenLogo = new ImageIcon("src/Recursos/Imágenes/TextoLogo.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenLogoTemporal = ImagenLogo.getImage();

                // Editamos la imagen.
                Image NuevaImagenLogo = ImagenLogoTemporal.getScaledInstance(200, 60, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenLogo = new ImageIcon(NuevaImagenLogo);

                // Convertimos el JLabel en el icono.
                LabelLogo.setIcon(ImagenLogo);

                // Localización del Jlabel
                LabelLogo.setBounds(0, 0, 200, 60);

                // Incluimos el label en el JPanel.
                PanelListaDiscos2.add(LabelLogo);

// TEXTO BUSCAR VINILOS -----------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenBuscarVinilos = new ImageIcon("src/Recursos/Imágenes/TextoBuscarVinilos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenBuscarVinilosTemporal = ImagenBuscarVinilos.getImage();

                // Editamos la imagen.
                Image NuevaImagenBuscarVinilos = ImagenBuscarVinilosTemporal.getScaledInstance(200, 50, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenBuscarVinilos = new ImageIcon(NuevaImagenBuscarVinilos);

                // Convertimos el JLabel en el icono.
                LabelBuscarVinilos.setIcon(ImagenBuscarVinilos);

                // Localización del Jlabel
                LabelBuscarVinilos.setBounds(0, 50, 200, 60);

                // Incluimos el label en el JPanel.
                PanelListaDiscos2.add(LabelBuscarVinilos);

// TEXTO ARTISTAS -----------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenArtistas = new ImageIcon("src/Recursos/Imágenes/TextoArtistas.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenArtistasTemporal = ImagenArtistas.getImage();

                // Editamos la imagen.
                Image NuevaImagenArtistas = ImagenArtistasTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenArtistas = new ImageIcon(NuevaImagenArtistas);

                // Convertimos el JLabel en el icono.
                LabelTextoArtistas.setIcon(ImagenArtistas);

                // Localización del Jlabel
                LabelTextoArtistas.setBounds(155, 130, 40, 100);

                // Incluimos el label en el JPanel.
                PanelListaDiscos2.add(LabelTextoArtistas);

// TEXTO DISCOS -------------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenDiscos = new ImageIcon("src/Recursos/Imágenes/TextoDiscos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenDiscosTemporal = ImagenDiscos.getImage();

                // Editamos la imagen.
                Image NuevaImagenDiscos = ImagenDiscosTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenDiscos = new ImageIcon(NuevaImagenDiscos);

                // Convertimos el JLabel en el icono.
                LabelTextoDiscos.setIcon(ImagenDiscos);

                // Localización del Jlabel
                LabelTextoDiscos.setBounds(155, 285, 40, 100);

                // Incluimos el label en el JPanel.
                PanelListaDiscos2.add(LabelTextoDiscos);

// TEXTO CANCIONES ----------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenCanciones = new ImageIcon("src/Recursos/Imágenes/TextoCanciones.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenCancionesTemporal = ImagenCanciones.getImage();

                // Editamos la imagen.
                Image NuevaImagenCanciones = ImagenCancionesTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenCanciones = new ImageIcon(NuevaImagenCanciones);

                // Convertimos el JLabel en el icono.
                LabelTextoCanciones.setIcon(ImagenCanciones);

                // Localización del Jlabel
                LabelTextoCanciones.setBounds(155, 440, 40, 100);

                // Incluimos el label en el JPanel.
                PanelListaDiscos2.add(LabelTextoCanciones);

// IMAGEN BUSCAR POR ARTISTAS -----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenBuscarPorArtista = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorArtista.jpg");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenBuscarPorArtistaTemporal = ImagenBuscarPorArtista.getImage();

                // Editamos la imagen.
                Image NuevaImagenBuscarPorArtista = ImagenBuscarPorArtistaTemporal.getScaledInstance(140, 140, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenBuscarPorArtista = new ImageIcon(NuevaImagenBuscarPorArtista);

                // Convertimos el JLabel en el icono.
                LabelBuscarArtistas.setIcon(ImagenBuscarPorArtista);

                // Localización del Jlabel
                LabelBuscarArtistas.setBounds(10, 110, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                LabelBuscarArtistas.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarArtista) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaArtistas.metodoListaArtistas();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                PanelListaDiscos2.add(LabelBuscarArtistas);

// IMAGEN BUSCAR POR DISCOS -------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenBuscarPorDiscos = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorDisco.jpg");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenBuscarPorDiscosTemporal = ImagenBuscarPorDiscos.getImage();

                // Editamos la imagen.
                Image NuevaImagenBuscarPorDiscos = ImagenBuscarPorDiscosTemporal.getScaledInstance(140, 140, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenBuscarPorDiscos = new ImageIcon(NuevaImagenBuscarPorDiscos);

                // Convertimos el JLabel en el icono.
                LabelBuscarDiscos.setIcon(ImagenBuscarPorDiscos);

                // Localización del Jlabel
                LabelBuscarDiscos.setBounds(10, 260, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                LabelBuscarDiscos.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarDiscos) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaDiscos.metodoListaDiscos();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                PanelListaDiscos2.add(LabelBuscarDiscos);

                // IMAGEN BUSCAR POR CANCIONES 

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenBuscarPorCanciones = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorCanción.jpg");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenBuscarPorCancionesTemporal = ImagenBuscarPorCanciones.getImage();

                // Editamos la imagen.
                Image NuevaImagenBuscarPorCanciones = ImagenBuscarPorCancionesTemporal.getScaledInstance(140, 140, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenBuscarPorCanciones = new ImageIcon(NuevaImagenBuscarPorCanciones);

                // Convertimos el JLabel en el icono.
                LabelBuscarCanciones.setIcon(ImagenBuscarPorCanciones);

                // Localización del Jlabel
                LabelBuscarCanciones.setBounds(10, 410, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                LabelBuscarCanciones.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarCanciones) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaCanciones.metodoListaCanciones();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                PanelListaDiscos2.add(LabelBuscarCanciones);

// TEXTO BUSCAR DISCO FAVORITO ----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon TextoBuscarDiscoFavorito = new ImageIcon("src/Recursos/Imágenes/TextoDiscoFavorito.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image TextoBuscarDiscoFavoritoTemporal = TextoBuscarDiscoFavorito.getImage();

                // Editamos la imagen.
                Image NuevoTextoBuscarDiscoFavorito = TextoBuscarDiscoFavoritoTemporal.getScaledInstance(400, 90, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                TextoBuscarDiscoFavorito = new ImageIcon(NuevoTextoBuscarDiscoFavorito);

                // Convertimos el JLabel en el icono.
                LabelBuscarDiscosFavoritos.setIcon(TextoBuscarDiscoFavorito);

                // Localización del Jlabel
                LabelBuscarDiscosFavoritos.setBounds(200, 10, 400, 90);

                // Incluimos el label en el JPanel.
                PanelListaDiscos1.add(LabelBuscarDiscosFavoritos);

// TEXTO DISCOS DEL MOMENTO -------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon TextoDiscosDelMomento = new ImageIcon("src/Recursos/Imágenes/TextoDiscosDelMomento.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image TextoDiscosDelMomentoTemporal = TextoDiscosDelMomento.getImage();

                // Editamos la imagen.
                Image NuevoTextoDiscosDelMomento = TextoDiscosDelMomentoTemporal.getScaledInstance(400, 90, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                TextoDiscosDelMomento = new ImageIcon(NuevoTextoDiscosDelMomento);

                // Convertimos el JLabel en el icono.
                LabelTextoDiscosDelMomento.setIcon(TextoDiscosDelMomento);

                // Localización del Jlabel
                LabelTextoDiscosDelMomento.setBounds(200, 150, 400, 90);

                // Incluimos el label en el JPanel.
                PanelListaDiscos1.add(LabelTextoDiscosDelMomento);

// CAMPO DE TEXTO LISTA DISCOS ----------------------------------------------------------------------------------------------------------------------

                // Título
                TextBuscarDiscos.setText("      Escribe aquí el disco que quieras buscar!");

                // Tamaño y localización
                TextBuscarDiscos.setBounds(220, 100, 450, 40);

                // Fondo
                TextBuscarDiscos.setOpaque(false);

                // Color
                TextBuscarDiscos.setCaretColor(Color.RED);
                TextBuscarDiscos.setForeground(Color.RED);

                // Incluimos el campo de texto al JPanel
                PanelListaDiscos1.add(TextBuscarDiscos);

// BOTÓN BUSCAR LISTA DISCOS ------------------------------------------------------------------------------------------------------------------------

                // Título
                BotonBuscar.setText("Buscar!");


                // Tamaño y localización
                BotonBuscar.setBounds(670, 100, 100, 40);

                // Fondo
                BotonBuscar.setOpaque(false);

                BotonBuscar.addActionListener(new ActionListener(){

                        @Override
                        public void actionPerformed(ActionEvent AcciónBotónBuscar){
                                
                                DiscoBuscado = TextBuscarDiscos.getText();
                                Controlador.Controller.metodoImagenBusquedaDisco();
                                VentanaBusquedaDiscos.metodoVentanaBusqueda();

                        } // Fin del ActionPerformed.

                }); // Fin del ActionListener. 

                // Incluimos el botón al JPanel
                PanelListaDiscos1.add(BotonBuscar);

// IMAGEN DISCOS DEL MOMENTO 1 ----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenDiscoDelMomento1 = new ImageIcon(Controlador.Controller.metodoImagenDiscoDelMomento1());

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenDiscoDelMomento1Temporal = ImagenDiscoDelMomento1.getImage();

                // Editamos la imagen.
                Image NuevaImagenDiscoDelMomento1 = ImagenDiscoDelMomento1Temporal.getScaledInstance(170, 170, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenDiscoDelMomento1 = new ImageIcon(NuevaImagenDiscoDelMomento1);

                // Convertimos el JLabel en el icono.
                LabelDiscosDelMomento1.setIcon(ImagenDiscoDelMomento1);

                // Localización del Jlabel
                LabelDiscosDelMomento1.setBounds(220, 250, 170, 170);

                // Incluimos el label en el JPanel.
                PanelListaDiscos1.add(LabelDiscosDelMomento1);

// IMAGEN DISCOS DEL MOMENTO 2 ----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenDiscoDelMomento2 = new ImageIcon(Controlador.Controller.metodoImagenDiscoDelMomento2());

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenDiscoDelMomento2Temporal = ImagenDiscoDelMomento2.getImage();

                // Editamos la imagen.
                Image NuevaImagenDiscoDelMomento2 = ImagenDiscoDelMomento2Temporal.getScaledInstance(170, 170, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenDiscoDelMomento2 = new ImageIcon(NuevaImagenDiscoDelMomento2);

                // Convertimos el JLabel en el icono.
                LabelDiscosDelMomento2.setIcon(ImagenDiscoDelMomento2);

                // Localización del Jlabel
                LabelDiscosDelMomento2.setBounds(410, 250, 170, 170);

                // Incluimos el label en el JPanel.
                PanelListaDiscos1.add(LabelDiscosDelMomento2);

// IMAGEN DISCOS DEL MOMENTO 3 ----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon ImagenDiscoDelMomento3 = new ImageIcon(Controlador.Controller.metodoImagenDiscoDelMomento3());

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image ImagenDiscoDelMomento3Temporal = ImagenDiscoDelMomento3.getImage();

                // Editamos la imagen.
                Image NuevaImagenDiscoDelMomento3 = ImagenDiscoDelMomento3Temporal.getScaledInstance(170, 170, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                ImagenDiscoDelMomento3 = new ImageIcon(NuevaImagenDiscoDelMomento3);

                // Convertimos el JLabel en el icono.
                LabelDiscosDelMomento3.setIcon(ImagenDiscoDelMomento3);

                // Localización del Jlabel
                LabelDiscosDelMomento3.setBounds(600, 250, 170, 170);

                // Incluimos el label en el JPanel.
                PanelListaDiscos1.add(LabelDiscosDelMomento3);

// CAMPO DE TEXTO DISCOS DEL MOMENTO 1 --------------------------------------------------------------------------------------------------------------

                // Título
                TextDiscosDelMomento1.setText(Controlador.Controller.metodoDescripcionDiscoDelMomento1());

                // Tamaño y localización
                TextDiscosDelMomento1.setBounds(220, 430, 170, 120);

                // Fondo
                TextDiscosDelMomento1.setOpaque(false);

                // Final
                TextDiscosDelMomento1.setLineWrap(true);
                TextDiscosDelMomento1.setWrapStyleWord(true);

                // Color
                TextDiscosDelMomento1.setCaretColor(Color.RED);
                TextDiscosDelMomento1.setForeground(Color.RED);

                // Incluimos el campo de texto al JPanel
                PanelListaDiscos1.add(TextDiscosDelMomento1);

// CAMPO DE TEXTO DISCOS DEL MOMENTO 2 --------------------------------------------------------------------------------------------------------------

                // Título
                TextDiscosDelMomento2.setText(Controlador.Controller.metodoDescripcionDiscoDelMomento2());

                // Tamaño y localización
                TextDiscosDelMomento2.setBounds(410, 430, 170, 120);

                // Fondo
                TextDiscosDelMomento2.setOpaque(false);

                // Final
                TextDiscosDelMomento2.setLineWrap(true);
                TextDiscosDelMomento2.setWrapStyleWord(true);

                // Color
                TextDiscosDelMomento2.setCaretColor(Color.RED);
                TextDiscosDelMomento2.setForeground(Color.RED);

                // Incluimos el campo de texto al JPanel
                PanelListaDiscos1.add(TextDiscosDelMomento2);

// CAMPO DE TEXTO DISCOS DEL MOMENTO 3 --------------------------------------------------------------------------------------------------------------

                // Título
                TextDiscosDelMomento3.setText(Controlador.Controller.metodoDescripcionDiscoDelMomento3());

                // Tamaño y localización
                TextDiscosDelMomento3.setBounds(600, 430, 170, 120);

                // Fondo
                TextDiscosDelMomento3.setOpaque(false);

                // Final
                TextDiscosDelMomento3.setLineWrap(true);
                TextDiscosDelMomento3.setWrapStyleWord(true);

                // Color
                TextDiscosDelMomento3.setCaretColor(Color.RED);
                TextDiscosDelMomento3.setForeground(Color.RED);

                // Incluimos el campo de texto al JPanel
                PanelListaDiscos1.add(TextDiscosDelMomento3);

// INICIO DEL LISTA DISCOS --------------------------------------------------------------------------------------------------------------------------

                // Determinamos la visibilidad de la ventana y sus componentes
                FrameListaDiscos.setVisible(true);

        } // Fin del "MétodoListaDiscos"

} // Fin de la clase "ListaDiscos".
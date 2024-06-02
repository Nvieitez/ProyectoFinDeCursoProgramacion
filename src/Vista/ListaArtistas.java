// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a determinar la localización de nuestra clase, esto nos permitirá dividir el programa y hacerlo más ágil.
package Vista;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a importar todas las funcionalidades necesarias para el correcto funcionamiento de nuestro programa.
import javax.swing.JLayeredPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.plaf.ColorUIResource;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// CLASE LISTA ARTISTAS -------------------------------------------------------------------------------------------------------------------------------

// Esta clase contendrá el entorno gráfico relacionado con la lista de canciones.
public class ListaArtistas {

        static String artistaBuscado;

        public static String EnviarArtistaBuscado(){

                return artistaBuscado;
        }

        // Para iniciar nuestro inicio de sesión, primero vamos a crear un método que contenga todos los componentes de nuestro entorno gráfico.
        public static void metodoListaArtistas() {

                // Dentro del método, primero vamos a declarar todos los componentes necesarios.
                JLayeredPane gestorDeCapas = new JLayeredPane();

                JFrame frameListaArtistas = new JFrame();

                JPanel panelListaArtistas1 = new JPanel();
                JPanel panelListaArtistas2 = new JPanel();

                JLabel labelLogo = new JLabel();
                JLabel labelBuscarVinilos = new JLabel();
                JLabel labelTextoArtistas = new JLabel();
                JLabel labelTextoDiscos = new JLabel();
                JLabel labelTextoCanciones = new JLabel();
                JLabel labelBuscarArtistas = new JLabel();
                JLabel labelBuscarCanciones = new JLabel();
                JLabel labelBuscarDiscos = new JLabel();
                JLabel labelBuscarArtistasFavoritos = new JLabel();
                JLabel labelTextoArtistasDelMomento = new JLabel();
                JLabel labelArtistasDelMomento1 = new JLabel();
                JLabel labelArtistasDelMomento2 = new JLabel();
                JLabel labelArtistasDelMomento3 = new JLabel();

                JTextField textBuscarArtistas = new JTextField();
                JTextArea textArtistasDelMomento1 = new JTextArea();
                JTextArea textArtistasDelMomento2 = new JTextArea();
                JTextArea textArtistasDelMomento3 = new JTextArea();

                JButton botonBuscar = new JButton();

                // Ahora vamos a determinar los ajustes de cada uno de ellos.

// GESTOR DE CAPAS ----------------------------------------------------------------------------------------------------------------------------------

                // Localización
                gestorDeCapas.setBounds(0, 0, 800, 600);

                // Añadimos el gestor de capas al JFrame.
                frameListaArtistas.add(gestorDeCapas);

// FRAME LISTA ARTISTAS -------------------------------------------------------------------------------------------------------------------------------

                // Título
                frameListaArtistas.setTitle("FunkyTown INC.");

                // Tamaño
                frameListaArtistas.setSize(800, 600);

                // Localización
                frameListaArtistas.setLocationRelativeTo(null);

                // Layout
                frameListaArtistas.setLayout(null);

                // Edición
                frameListaArtistas.setResizable(false);

// PANEL LISTA ARTISTAS 1 -----------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelListaArtistas1.setSize(800, 600);

                // Localización
                panelListaArtistas1.setLocation(0, 0);

                // Fondo
                panelListaArtistas1.setBackground(new ColorUIResource(34, 34, 34));

                // Layout
                panelListaArtistas1.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelListaArtistas1, Integer.valueOf(0));

// PANEL LISTA ARTISTAS 2 -----------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelListaArtistas2.setSize(200, 800);

                // Localización
                panelListaArtistas2.setLocation(0, 0);

                // Fondo
                panelListaArtistas2.setBackground(new ColorUIResource(41, 41, 41));

                // Layout
                panelListaArtistas2.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelListaArtistas2, Integer.valueOf(1));

// TEXTO LOGO ---------------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenLogo = new ImageIcon("src/Recursos/Imágenes/TextoLogo.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenLogoTemporal = imagenLogo.getImage();

                // Editamos la imagen.
                Image nuevaImagenLogo = imagenLogoTemporal.getScaledInstance(200, 60, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenLogo = new ImageIcon(nuevaImagenLogo);

                // Convertimos el JLabel en el icono.
                labelLogo.setIcon(imagenLogo);

                // Localización del Jlabel
                labelLogo.setBounds(0, 0, 200, 60);

                // Incluimos el label en el JPanel.
                panelListaArtistas2.add(labelLogo);

// TEXTO BUSCAR VINILOS -----------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenBuscarVinilos = new ImageIcon("src/Recursos/Imágenes/TextoBuscarVinilos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenBuscarVinilosTemporal = imagenBuscarVinilos.getImage();

                // Editamos la imagen.
                Image nuevaImagenBuscarVinilos = imagenBuscarVinilosTemporal.getScaledInstance(200, 50, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenBuscarVinilos = new ImageIcon(nuevaImagenBuscarVinilos);

                // Convertimos el JLabel en el icono.
                labelBuscarVinilos.setIcon(imagenBuscarVinilos);

                // Localización del Jlabel
                labelBuscarVinilos.setBounds(0, 50, 200, 60);

                // Incluimos el label en el JPanel.
                panelListaArtistas2.add(labelBuscarVinilos);

// TEXTO ARTISTAS -----------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenArtistas = new ImageIcon("src/Recursos/Imágenes/TextoArtistas.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenArtistasTemporal = imagenArtistas.getImage();

                // Editamos la imagen.
                Image nuevaImagenArtistas = imagenArtistasTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenArtistas = new ImageIcon(nuevaImagenArtistas);

                // Convertimos el JLabel en el icono.
                labelTextoArtistas.setIcon(imagenArtistas);

                // Localización del Jlabel
                labelTextoArtistas.setBounds(155, 130, 40, 100);

                // Incluimos el label en el JPanel.
                panelListaArtistas2.add(labelTextoArtistas);

// TEXTO ARTISTAS -------------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenDiscos = new ImageIcon("src/Recursos/Imágenes/TextoDiscos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenDiscosTemporal = imagenDiscos.getImage();

                // Editamos la imagen.
                Image nuevaImagenDiscos = imagenDiscosTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenDiscos = new ImageIcon(nuevaImagenDiscos);

                // Convertimos el JLabel en el icono.
                labelTextoDiscos.setIcon(imagenDiscos);

                // Localización del Jlabel
                labelTextoDiscos.setBounds(155, 285, 40, 100);

                // Incluimos el label en el JPanel.
                panelListaArtistas2.add(labelTextoDiscos);

// TEXTO CANCIONES ----------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenCanciones = new ImageIcon("src/Recursos/Imágenes/TextoCanciones.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenCancionesTemporal = imagenCanciones.getImage();

                // Editamos la imagen.
                Image nuevaImagenCanciones = imagenCancionesTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenCanciones = new ImageIcon(nuevaImagenCanciones);

                // Convertimos el JLabel en el icono.
                labelTextoCanciones.setIcon(imagenCanciones);

                // Localización del Jlabel
                labelTextoCanciones.setBounds(155, 440, 40, 100);

                // Incluimos el label en el JPanel.
                panelListaArtistas2.add(labelTextoCanciones);

// IMAGEN BUSCAR POR ARTISTAS -----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenBuscarPorArtista = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorArtista.jpg");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenBuscarPorArtistaTemporal = imagenBuscarPorArtista.getImage();

                // Editamos la imagen.
                Image nuevaImagenBuscarPorArtista = imagenBuscarPorArtistaTemporal.getScaledInstance(140, 140,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenBuscarPorArtista = new ImageIcon(nuevaImagenBuscarPorArtista);

                // Convertimos el JLabel en el icono.
                labelBuscarArtistas.setIcon(imagenBuscarPorArtista);

                // Localización del Jlabel
                labelBuscarArtistas.setBounds(10, 110, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelBuscarArtistas.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarArtista) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaArtistas.metodoListaArtistas();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelListaArtistas2.add(labelBuscarArtistas);

// IMAGEN BUSCAR POR ARTISTAS -------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenBuscarPorDiscos = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorDisco.jpg");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenBuscarPorDiscosTemporal = imagenBuscarPorDiscos.getImage();

                // Editamos la imagen.
                Image nuevaImagenBuscarPorDiscos = imagenBuscarPorDiscosTemporal.getScaledInstance(140, 140, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenBuscarPorDiscos = new ImageIcon(nuevaImagenBuscarPorDiscos);

                // Convertimos el JLabel en el icono.
                labelBuscarDiscos.setIcon(imagenBuscarPorDiscos);

                // Localización del Jlabel
                labelBuscarDiscos.setBounds(10, 260, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelBuscarDiscos.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarDiscos) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaDiscos.metodoListaDiscos();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelListaArtistas2.add(labelBuscarDiscos);

// IMAGEN BUSCAR POR CANCIONES ----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenBuscarPorCanciones = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorCanción.jpg");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenBuscarPorCancionesTemporal = imagenBuscarPorCanciones.getImage();

                // Editamos la imagen.
                Image nuevaImagenBuscarPorCanciones = imagenBuscarPorCancionesTemporal.getScaledInstance(140, 140, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenBuscarPorCanciones = new ImageIcon(nuevaImagenBuscarPorCanciones);

                // Convertimos el JLabel en el icono.
                labelBuscarCanciones.setIcon(imagenBuscarPorCanciones);

                // Localización del Jlabel
                labelBuscarCanciones.setBounds(10, 410, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelBuscarCanciones.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarCanciones) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaCanciones.metodoListaCanciones();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelListaArtistas2.add(labelBuscarCanciones);

// TEXTO BUSCAR DISCO FAVORITO ----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoBuscarArtistaFavorito = new ImageIcon("src/Recursos/Imágenes/TextoArtistaFavorito.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoBuscarArtistaFavoritoTemporal = textoBuscarArtistaFavorito.getImage();

                // Editamos la imagen.
                Image nuevoTextoBuscarArtistaFavorito = textoBuscarArtistaFavoritoTemporal.getScaledInstance(400, 90, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoBuscarArtistaFavorito = new ImageIcon(nuevoTextoBuscarArtistaFavorito);

                // Convertimos el JLabel en el icono.
                labelBuscarArtistasFavoritos.setIcon(textoBuscarArtistaFavorito);

                // Localización del Jlabel
                labelBuscarArtistasFavoritos.setBounds(200, 10, 400, 90);

                // Incluimos el label en el JPanel.
                panelListaArtistas1.add(labelBuscarArtistasFavoritos);

// TEXTO ARTISTAS DEL MOMENTO -------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoArtistasDelMomento = new ImageIcon("src/Recursos/Imágenes/TextoArtistasDelMomento.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoArtistasDelMomentoTemporal = textoArtistasDelMomento.getImage();

                // Editamos la imagen.
                Image nuevoTextoArtistasDelMomento = textoArtistasDelMomentoTemporal.getScaledInstance(400, 90, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoArtistasDelMomento = new ImageIcon(nuevoTextoArtistasDelMomento);

                // Convertimos el JLabel en el icono.
                labelTextoArtistasDelMomento.setIcon(textoArtistasDelMomento);

                // Localización del Jlabel
                labelTextoArtistasDelMomento.setBounds(200, 150, 400, 90);

                // Incluimos el label en el JPanel.
                panelListaArtistas1.add(labelTextoArtistasDelMomento);

// CAMPO DE TEXTO LISTA ARTISTAS ----------------------------------------------------------------------------------------------------------------------

                // Título
                textBuscarArtistas.setText("      Escribe aquí el artista que quieras buscar!");

                // Tamaño y localización
                textBuscarArtistas.setBounds(220, 100, 450, 40);

                // Fondo
                textBuscarArtistas.setOpaque(false);

                // Color
                textBuscarArtistas.setCaretColor(Color.RED);
                textBuscarArtistas.setForeground(Color.RED);

                // Incluimos el campo de texto al JPanel
                panelListaArtistas1.add(textBuscarArtistas);

// BOTÓN BUSCAR LISTA ARTISTAS ------------------------------------------------------------------------------------------------------------------------

                // Título
                botonBuscar.setText("Buscar!");

                // Tamaño y localización
                botonBuscar.setBounds(670, 100, 100, 40);

                // Fondo
                botonBuscar.setOpaque(false);

                botonBuscar.addActionListener(new ActionListener(){

                        @Override
                        public void actionPerformed(ActionEvent AcciónBotónBuscar){
                                
                                artistaBuscado = textBuscarArtistas.getText();
                                Controlador.Controller.metodoImagenBusquedaArtista();
                                VentanaBusquedaArtistas.metodoVentanaBusqueda();;

                        } // Fin del ActionPerformed.

                }); // Fin del ActionListener. 

                // Incluimos el botón al JPanel
                panelListaArtistas1.add(botonBuscar);

// IMAGEN ARTISTAS DEL MOMENTO 1 ----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenArtistaDelMomento1 = new ImageIcon(Controlador.Controller.metodoImagenArtistaDelMomento1());

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenArtistaDelMomento1Temporal = imagenArtistaDelMomento1.getImage();

                // Editamos la imagen.
                Image nuevaImagenArtistaDelMomento1 = imagenArtistaDelMomento1Temporal.getScaledInstance(170, 170, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenArtistaDelMomento1 = new ImageIcon(nuevaImagenArtistaDelMomento1);

                // Convertimos el JLabel en el icono.
                labelArtistasDelMomento1.setIcon(imagenArtistaDelMomento1);

                // Localización del Jlabel
                labelArtistasDelMomento1.setBounds(220, 250, 170, 170);

                // Incluimos el label en el JPanel.
                panelListaArtistas1.add(labelArtistasDelMomento1);

// IMAGEN ARTISTAS DEL MOMENTO 2 ----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenArtistaDelMomento2 = new ImageIcon(Controlador.Controller.metodoImagenArtistaDelMomento2());

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenArtistaDelMomento2Temporal = imagenArtistaDelMomento2.getImage();

                // Editamos la imagen.
                Image nuevaImagenArtistaDelMomento2 = imagenArtistaDelMomento2Temporal.getScaledInstance(170, 170, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenArtistaDelMomento2 = new ImageIcon(nuevaImagenArtistaDelMomento2);

                // Convertimos el JLabel en el icono.
                labelArtistasDelMomento2.setIcon(imagenArtistaDelMomento2);

                // Localización del Jlabel
                labelArtistasDelMomento2.setBounds(410, 250, 170, 170);

                // Incluimos el label en el JPanel.
                panelListaArtistas1.add(labelArtistasDelMomento2);

// IMAGEN ARTISTAS DEL MOMENTO 3 ----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenArtistaDelMomento3 = new ImageIcon(Controlador.Controller.metodoImagenArtistaDelMomento3());

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenArtistaDelMomento3Temporal = imagenArtistaDelMomento3.getImage();

                // Editamos la imagen.
                Image nuevaImagenArtistaDelMomento3 = imagenArtistaDelMomento3Temporal.getScaledInstance(170, 170, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenArtistaDelMomento3 = new ImageIcon(nuevaImagenArtistaDelMomento3);

                // Convertimos el JLabel en el icono.
                labelArtistasDelMomento3.setIcon(imagenArtistaDelMomento3);

                // Localización del Jlabel
                labelArtistasDelMomento3.setBounds(600, 250, 170, 170);

                // Incluimos el label en el JPanel.
                panelListaArtistas1.add(labelArtistasDelMomento3);

// CAMPO DE TEXTO ARTISTAS DEL MOMENTO 1 --------------------------------------------------------------------------------------------------------------

                // Título
                textArtistasDelMomento1.setText(Controlador.Controller.metodoDescripcionArtistaDelMomento1());

                // Tamaño y localización
                textArtistasDelMomento1.setBounds(220, 430, 170, 120);

                // Fondo
                textArtistasDelMomento1.setOpaque(false);

                // Final
                textArtistasDelMomento1.setLineWrap(true);
                textArtistasDelMomento1.setWrapStyleWord(true);

                // Color
                textArtistasDelMomento1.setCaretColor(Color.RED);
                textArtistasDelMomento1.setForeground(Color.RED);

                // Incluimos el campo de texto al JPanel
                panelListaArtistas1.add(textArtistasDelMomento1);

// CAMPO DE TEXTO ARTISTAS DEL MOMENTO 2 --------------------------------------------------------------------------------------------------------------

                // Título
                textArtistasDelMomento2.setText(Controlador.Controller.metodoDescripcionArtistaDelMomento2());

                // Tamaño y localización
                textArtistasDelMomento2.setBounds(410, 430, 170, 120);

                // Fondo
                textArtistasDelMomento2.setOpaque(false);

                // Final
                textArtistasDelMomento2.setLineWrap(true);
                textArtistasDelMomento2.setWrapStyleWord(true);

                // Color
                textArtistasDelMomento2.setCaretColor(Color.RED);
                textArtistasDelMomento2.setForeground(Color.RED);

                // Incluimos el campo de texto al JPanel
                panelListaArtistas1.add(textArtistasDelMomento2);

// CAMPO DE TEXTO ARTISTAS DEL MOMENTO 3 --------------------------------------------------------------------------------------------------------------

                // Título
                textArtistasDelMomento3.setText(Controlador.Controller.metodoDescripcionArtistaDelMomento3());

                // Tamaño y localización
                textArtistasDelMomento3.setBounds(600, 430, 170, 120);

                // Fondo
                textArtistasDelMomento3.setOpaque(false);

                // Final
                textArtistasDelMomento3.setLineWrap(true);
                textArtistasDelMomento3.setWrapStyleWord(true);

                // Color
                textArtistasDelMomento3.setCaretColor(Color.RED);
                textArtistasDelMomento3.setForeground(Color.RED);

                // Incluimos el campo de texto al JPanel
                panelListaArtistas1.add(textArtistasDelMomento3);

// INICIO DEL LISTA ARTISTAS --------------------------------------------------------------------------------------------------------------------------

                // Determinamos la visibilidad de la ventana y sus componentes
                frameListaArtistas.setVisible(true);

        } // Fin del "MétodoListaArtistas"

} // Fin de la clase "ListaArtistas".
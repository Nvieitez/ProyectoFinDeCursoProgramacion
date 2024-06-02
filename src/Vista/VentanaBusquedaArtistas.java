package Vista;

 // IMPORTS -----------------------------------------------------------------------------------------------------------------------------------------

// Aquí vamos a importar todas las funcionalidades necesarias para el correcto funcionamiento de nuestro programa.
import javax.swing.JLayeredPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.plaf.ColorUIResource;

import Modelo.DatosDiscos;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// CLASE VENTANA BÚSQUEDA ---------------------------------------------------------------------------------------------------------------------------

// Esta clase contendrá el entorno gráfico relacionado con el menú principal.
public class VentanaBusquedaArtistas {

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

        // Para iniciar nuestro menú principal, primero vamos a crear un método que contenga todos los componentes de nuestro entorno gráfico.
        public static void metodoVentanaBusqueda() {

                // Dentro del método, primero vamos a declarar todos los componentes necesarios.
                JLayeredPane gestorDeCapas = new JLayeredPane();

                JFrame frameVentanaBusqueda = new JFrame();

                JPanel panelVentanaBusqueda1 = new JPanel();
                JPanel panelVentanaBusqueda2 = new JPanel();
                JPanel panelVentanaBusqueda3 = new JPanel();

                JLabel labelLogoVentanaBusqueda = new JLabel();
                JLabel labelBusquedaVentanaBusqueda = new JLabel();
                JLabel labelTextoArtistaVentanaBusqueda = new JLabel();
                JLabel labelTextoDiscoVentanaBusqueda = new JLabel();
                JLabel labelTextoCancionVentanaBusqueda = new JLabel();
                JLabel labelImagenVentanaBusqueda = new JLabel();
                JLabel labelBuscarCancion = new JLabel();
                JLabel labelBuscarDisco = new JLabel();
                JLabel labelBuscarArtista = new JLabel();
                JLabel labelTextoAñadirAlCarrito = new JLabel();

                JTextArea textVentanaBusqueda = new JTextArea();

                // Ahora vamos a determinar los ajustes de cada uno de ellos.

// GESTOR DE CAPAS ----------------------------------------------------------------------------------------------------------------------------------

                // Localización
                gestorDeCapas.setBounds(0, 0, 800, 600);

                // Añadimos el gestor de capas al JFrame.
                frameVentanaBusqueda.add(gestorDeCapas);

// FRAME MENÚ PRINCIPAL -----------------------------------------------------------------------------------------------------------------------------

                // Título
                frameVentanaBusqueda.setTitle("FunkyTown INC.");

                // Tamaño
                frameVentanaBusqueda.setSize(800, 600);

                // Localización
                frameVentanaBusqueda.setLocationRelativeTo(null);

                // Layout
                frameVentanaBusqueda.setLayout(null);

                // Edición
                frameVentanaBusqueda.setResizable(false);

// PANEL MENÚ PRINCIPAL 1 ---------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelVentanaBusqueda1.setSize(800, 600);

                // Localización
                panelVentanaBusqueda1.setLocation(0, 0);

                // Fondo
                panelVentanaBusqueda1.setBackground(new ColorUIResource(34, 34, 34));

                // Layout
                panelVentanaBusqueda1.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelVentanaBusqueda1, Integer.valueOf(0));

// PANEL MENÚ PRINCIPAL 2 ---------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelVentanaBusqueda2.setSize(200, 800);

                // Localización
                panelVentanaBusqueda2.setLocation(0, 0);

                // Fondo
                panelVentanaBusqueda2.setBackground(new ColorUIResource(41, 41, 41));

                // Layout
                panelVentanaBusqueda2.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelVentanaBusqueda2, Integer.valueOf(1));

// PANEL MENÚ PRINCIPAL 3 ---------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelVentanaBusqueda3.setSize(800, 600);

                // Localización
                panelVentanaBusqueda3.setLocation(0, 0);

                // Fondo
                panelVentanaBusqueda3.setOpaque(false);

                // Layout
                panelVentanaBusqueda3.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelVentanaBusqueda3, Integer.valueOf(2));

// LOGO MENÚ PRINCIPAL ------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon logoVentanaBusqueda = new ImageIcon("src/Recursos/Imágenes/TextoLogo.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image logoTemporal = logoVentanaBusqueda.getImage();

                // Editamos la imagen.
                Image nuevoLogoVentanaBusqueda = logoTemporal.getScaledInstance(200, 60, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                logoVentanaBusqueda = new ImageIcon(nuevoLogoVentanaBusqueda);

                // Convertimos el JLabel en el icono.
                labelLogoVentanaBusqueda.setIcon(logoVentanaBusqueda);

                // Localización del Jlabel
                labelLogoVentanaBusqueda.setBounds(0, 0, 200, 60);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelLogoVentanaBusqueda.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelLogoVentanaBusqueda) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                frameVentanaBusqueda.dispose();
                                VentanaBusquedaDiscos.metodoVentanaBusqueda();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelVentanaBusqueda2.add(labelLogoVentanaBusqueda);

// BÚSQUEDA MENÚ PRINCIPAL --------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenBusquedaVentanaBusqueda = new ImageIcon("src/Recursos/Imágenes/TextoBuscarVinilos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenBusquedaTemporal = imagenBusquedaVentanaBusqueda.getImage();

                // Editamos la imagen.
                Image nuevaImagenBusquedaVentanaBusqueda = imagenBusquedaTemporal.getScaledInstance(200, 50, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenBusquedaVentanaBusqueda = new ImageIcon(nuevaImagenBusquedaVentanaBusqueda);

                // Convertimos el JLabel en el icono.
                labelBusquedaVentanaBusqueda.setIcon(imagenBusquedaVentanaBusqueda);

                // Localización del Jlabel
                labelBusquedaVentanaBusqueda.setBounds(0, 50, 200, 60);

                // Incluimos el label en el JPanel.
                panelVentanaBusqueda2.add(labelBusquedaVentanaBusqueda);

// TEXTO ARTISTA MENÚ PRINCIPAL ---------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoArtistaVentanaBusqueda = new ImageIcon("src/Recursos/Imágenes/TextoArtistas.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoArtistaTemporal = textoArtistaVentanaBusqueda.getImage();

                // Editamos la imagen.
                Image nuevoTextoArtistaVentanaBusqueda = textoArtistaTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoArtistaVentanaBusqueda = new ImageIcon(nuevoTextoArtistaVentanaBusqueda);

                // Convertimos el JLabel en el icono.
                labelTextoArtistaVentanaBusqueda.setIcon(textoArtistaVentanaBusqueda);

                // Localización del Jlabel
                labelTextoArtistaVentanaBusqueda.setBounds(155, 130, 40, 100);

                // Incluimos el label en el JPanel.
                panelVentanaBusqueda2.add(labelTextoArtistaVentanaBusqueda);

// TEXTO DISCO MENÚ PRINCIPAL -----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoDiscoVentanaBusqueda = new ImageIcon("src/Recursos/Imágenes/TextoDiscos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoDiscoTemporal = textoDiscoVentanaBusqueda.getImage();

                // Editamos la imagen.
                Image nuevoTextoDiscoVentanaBusqueda = textoDiscoTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoDiscoVentanaBusqueda = new ImageIcon(nuevoTextoDiscoVentanaBusqueda);

                // Convertimos el JLabel en el icono.
                labelTextoDiscoVentanaBusqueda.setIcon(textoDiscoVentanaBusqueda);

                // Localización del Jlabel
                labelTextoDiscoVentanaBusqueda.setBounds(155, 285, 40, 100);

                // Incluimos el label en el JPanel.
                panelVentanaBusqueda2.add(labelTextoDiscoVentanaBusqueda);

// TEXTO CANCIÓN MENÚ PRINCIPAL ---------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoCancionVentanaBusqueda = new ImageIcon("src/Recursos/Imágenes/TextoCanciones.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoCancionTemporal = textoCancionVentanaBusqueda.getImage();

                // Editamos la imagen.
                Image nuevoTextoCancionVentanaBusqueda = textoCancionTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoCancionVentanaBusqueda = new ImageIcon(nuevoTextoCancionVentanaBusqueda);

                // Convertimos el JLabel en el icono.
                labelTextoCancionVentanaBusqueda.setIcon(textoCancionVentanaBusqueda);

                // Localización del Jlabel
                labelTextoCancionVentanaBusqueda.setBounds(155, 440, 40, 100);

                // Incluimos el label en el JPanel.
                panelVentanaBusqueda2.add(labelTextoCancionVentanaBusqueda);

// IMAGEN BUSCAR POR ARTISTA ------------------------------------------------------------------------------------------------------------------------

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
                        public void mouseClicked(MouseEvent AccionLabelBuscarArtista) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaArtistas.metodoListaArtistas();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelVentanaBusqueda2.add(labelBuscarArtista);

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
                        public void mouseClicked(MouseEvent AccionLabelBuscarDisco) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaDiscos.metodoListaDiscos();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelVentanaBusqueda2.add(labelBuscarDisco);

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
                        public void mouseClicked(MouseEvent AccionLabelBuscarCancion) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaCanciones.metodoListaCanciones();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelVentanaBusqueda2.add(labelBuscarCancion);

// IMAGEN VENTANA BÚSQUEDA --------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenVentanaBusqueda = new ImageIcon(Controlador.Controller.metodoImagenBusquedaArtista());

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenVentanaBusquedaTemporal = imagenVentanaBusqueda.getImage();

                // Editamos la imagen.
                Image NuevaimagenVentanaBusqueda = imagenVentanaBusquedaTemporal.getScaledInstance(250, 250, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenVentanaBusqueda = new ImageIcon(NuevaimagenVentanaBusqueda);

                // Convertimos el JLabel en el icono.
                labelImagenVentanaBusqueda.setIcon(imagenVentanaBusqueda);

                // Localización del Jlabel
                labelImagenVentanaBusqueda.setBounds(210, 10, 250, 250);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelImagenVentanaBusqueda.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelImagenVentanaBusqueda) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaCanciones.metodoListaCanciones();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelVentanaBusqueda1.add(labelImagenVentanaBusqueda);

// TEXTO VENTANA BÚSQUEDA ---------------------------------------------------------------------------------------------------------------------------

                // Título
                if (Controlador.Controller.metodoImagenBusquedaArtista() == "src/Recursos/Imágenes/PlaceHolder.png"){
                        
                        textVentanaBusqueda.setText("No se ha encontrado ninguna coincidencia, por favor, vuelva a intentarlo");

                }
                else {

                textVentanaBusqueda.setText(Controlador.Controller.metodoTextoBusquedaArtista());

                }
                // Tamaño y localización
                textVentanaBusqueda.setBounds(470, 10, 305, 250);

                // Final
                textVentanaBusqueda.setLineWrap(true);
                textVentanaBusqueda.setWrapStyleWord(true);
                
                // Editable
                textVentanaBusqueda.setEditable(false);


                // Incluimos el campo de texto al JPanel
                panelVentanaBusqueda1.add(textVentanaBusqueda);

// TEXTO COMPRA EL VINILO ---------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon TextoAñadeCarrito = new ImageIcon("src/Recursos/Imágenes/TextoCompraSusVinilos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image TextoAñadeCarritoTemporal = TextoAñadeCarrito.getImage();

                // Editamos la imagen.
                Image nuevoTextoAñadeCarrito = TextoAñadeCarritoTemporal.getScaledInstance(400, 200, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                TextoAñadeCarrito = new ImageIcon(nuevoTextoAñadeCarrito);

                // Convertimos el JLabel en el icono.
                labelTextoAñadirAlCarrito.setIcon(TextoAñadeCarrito);

                // Localización del Jlabel
                labelTextoAñadirAlCarrito.setBounds(280, 300, 400, 200);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelTextoAñadirAlCarrito.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelTextoAñadirAlCarrito) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaDiscos.metodoListaDiscos();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelVentanaBusqueda1.add(labelTextoAñadirAlCarrito);

// INICIO DEL MENÚ PRINCIPAL ------------------------------------------------------------------------------------------------------------------------

                // Determinamos la visibilidad de la ventana y sus componentes
                frameVentanaBusqueda.setVisible(true);

        } // Fin del "MétodoMenúPrincipal."

}

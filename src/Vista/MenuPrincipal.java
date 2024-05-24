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

// Importamos la funcionalidad "ImageIcon", esta nos permite establecer imágenes como iconos para nuestros componentes.
import javax.swing.ImageIcon;

// Importamos la funcionalidad "ColorUIResource", esta nos permite introducir colores a nuestros componentes.
import javax.swing.plaf.ColorUIResource;

// Importamos la funcionalidad "Image", esta nos permite modificar imágenes.
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// CLASE MENÚ PRINCIPAL -----------------------------------------------------------------------------------------------------------------------------

// Esta clase contendrá el entorno gráfico relacionado con el menú principal.
public class MenuPrincipal {

        // COMIENZO DEL CÓDIGO
        // ------------------------------------------------------------------------------------------------------------------------------

        // Para iniciar nuestro menú principal, primero vamos a crear un método que
        // contenga todos los componentes de nuestro entorno gráfico.

        /**
         * "MétodoMenúPrincipal" se encarga de crear el entorno gráfico del menú
         * principal.
         *
         * @author Nicolás Viéitez Domínguez
         * @author Susana Isabel Santos Mallqui.
         *
         * @since V2.0
         */

        public static void metodoMenuPrincipal() {

                // Dentro del método, primero vamos a declarar todos los componentes necesarios.
                JLayeredPane gestorDeCapas = new JLayeredPane();

                JFrame frameMenuPrincipal = new JFrame();

                JPanel panelMenuPrincipal1 = new JPanel();
                JPanel panelMenuPrincipal2 = new JPanel();
                JPanel panelMenuPrincipal3 = new JPanel();

                JLabel labelLogoMenuPrincipal = new JLabel();
                JLabel labelBusquedaMenuPrincipal = new JLabel();
                JLabel labelTextoArtistaMenuPrincipal = new JLabel();
                JLabel labelTextoDiscoMenuPrincipal = new JLabel();
                JLabel labelTextoCancionMenuPrincipal = new JLabel();
                JLabel labelFondoMenuPrincipal = new JLabel();
                JLabel labelTextoMenuPrincipal = new JLabel();
                JLabel labelBuscarCancion = new JLabel();
                JLabel labelBuscarDisco = new JLabel();
                JLabel labelBuscarArtista = new JLabel();
                JLabel labelTextoIniciarSesion = new JLabel();

                // Ahora vamos a determinar los ajustes de cada uno de ellos.

                // GESTOR DE CAPAS
                // ----------------------------------------------------------------------------------------------------------------------------------

                // Localización
                gestorDeCapas.setBounds(0, 0, 800, 600);

                // Añadimos el gestor de capas al JFrame.
                frameMenuPrincipal.add(gestorDeCapas);

                // FRAME MENÚ PRINCIPAL
                // -----------------------------------------------------------------------------------------------------------------------------

                // Título
                frameMenuPrincipal.setTitle("FunkyTown INC.");

                // Tamaño
                frameMenuPrincipal.setSize(800, 600);

                // Localización
                frameMenuPrincipal.setLocationRelativeTo(null);

                // Layout
                frameMenuPrincipal.setLayout(null);

                // Edición
                frameMenuPrincipal.setResizable(false);

                // PANEL MENÚ PRINCIPAL 1
                // ---------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelMenuPrincipal1.setSize(800, 600);

                // Localización
                panelMenuPrincipal1.setLocation(0, 0);

                // Fondo
                panelMenuPrincipal1.setBackground(new ColorUIResource(34, 34, 34));

                // Layout
                panelMenuPrincipal1.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelMenuPrincipal1, Integer.valueOf(0));

                // PANEL MENÚ PRINCIPAL 2
                // ---------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelMenuPrincipal2.setSize(200, 800);

                // Localización
                panelMenuPrincipal2.setLocation(0, 0);

                // Fondo
                panelMenuPrincipal2.setBackground(new ColorUIResource(41, 41, 41));

                // Layout
                panelMenuPrincipal2.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelMenuPrincipal2, Integer.valueOf(1));

                // PANEL MENÚ PRINCIPAL 3
                // ---------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelMenuPrincipal3.setSize(800, 600);

                // Localización
                panelMenuPrincipal3.setLocation(0, 0);

                // Fondo
                panelMenuPrincipal3.setOpaque(false);

                // Layout
                panelMenuPrincipal3.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelMenuPrincipal3, Integer.valueOf(2));

                // FONDO MENÚ PRINCIPAL
                // -----------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenFondoMenuPrincipal = new ImageIcon("src/Recursos/Imágenes/ImagenFondo.jpg");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenFondoMenuPrincipalTemporal = imagenFondoMenuPrincipal.getImage();

                // Editamos la imagen.
                Image nuevaImagenFondoMenuPrincipal = imagenFondoMenuPrincipalTemporal.getScaledInstance(800, 600,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenFondoMenuPrincipal = new ImageIcon(nuevaImagenFondoMenuPrincipal);

                // Convertimos el JLabel en el icono.
                labelFondoMenuPrincipal.setIcon(imagenFondoMenuPrincipal);

                // Localización del Jlabel
                labelFondoMenuPrincipal.setBounds(100, 0, 800, 600);

                // Incluimos el label en el JPanel.
                panelMenuPrincipal1.add(labelFondoMenuPrincipal);

                // TEXTO MENÚ PRINCIPAL
                // -----------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenTextoMenuPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoMenúPrincipal.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenTextoMenuPrincipalTemporal = imagenTextoMenuPrincipal.getImage();

                // Editamos la imagen.
                Image nuevaImagenTextoMenuPrincipal = imagenTextoMenuPrincipalTemporal.getScaledInstance(600, 300,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenTextoMenuPrincipal = new ImageIcon(nuevaImagenTextoMenuPrincipal);

                // Convertimos el JLabel en el icono.
                labelTextoMenuPrincipal.setIcon(imagenTextoMenuPrincipal);

                // Localización del Jlabel
                labelTextoMenuPrincipal.setBounds(200, 0, 600, 300);

                // Incluimos el label en el JLayeredPane.
                panelMenuPrincipal3.add(labelTextoMenuPrincipal);

                // LOGO MENÚ PRINCIPAL
                // ------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon logoMenuPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoLogo.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image logoTemporal = logoMenuPrincipal.getImage();

                // Editamos la imagen.
                Image nuevoLogoMenuPrincipal = logoTemporal.getScaledInstance(200, 60, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                logoMenuPrincipal = new ImageIcon(nuevoLogoMenuPrincipal);

                // Convertimos el JLabel en el icono.
                labelLogoMenuPrincipal.setIcon(logoMenuPrincipal);

                // Localización del Jlabel
                labelLogoMenuPrincipal.setBounds(0, 0, 200, 60);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelLogoMenuPrincipal.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un
                        // nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la
                        // imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelLogoMenuPrincipal) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                frameMenuPrincipal.dispose();
                                MenuPrincipal.metodoMenuPrincipal();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelMenuPrincipal2.add(labelLogoMenuPrincipal);

                // BÚSQUEDA MENÚ PRINCIPAL
                // ------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenBusquedaMenuPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoBuscarVinilos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenBusquedaTemporal = imagenBusquedaMenuPrincipal.getImage();

                // Editamos la imagen.
                Image nuevaImagenBusquedaMenuPrincipal = imagenBusquedaTemporal.getScaledInstance(200, 50,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenBusquedaMenuPrincipal = new ImageIcon(nuevaImagenBusquedaMenuPrincipal);

                // Convertimos el JLabel en el icono.
                labelBusquedaMenuPrincipal.setIcon(imagenBusquedaMenuPrincipal);

                // Localización del Jlabel
                labelBusquedaMenuPrincipal.setBounds(0, 50, 200, 60);

                // Incluimos el label en el JPanel.
                panelMenuPrincipal2.add(labelBusquedaMenuPrincipal);

                // TEXTO ARTISTA MENÚ PRINCIPAL
                // ---------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoArtistaMenuPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoArtistas.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoArtistaTemporal = textoArtistaMenuPrincipal.getImage();

                // Editamos la imagen.
                Image nuevoTextoArtistaMenuPrincipal = textoArtistaTemporal.getScaledInstance(40, 100,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoArtistaMenuPrincipal = new ImageIcon(nuevoTextoArtistaMenuPrincipal);

                // Convertimos el JLabel en el icono.
                labelTextoArtistaMenuPrincipal.setIcon(textoArtistaMenuPrincipal);

                // Localización del Jlabel
                labelTextoArtistaMenuPrincipal.setBounds(155, 130, 40, 100);

                // Incluimos el label en el JPanel.
                panelMenuPrincipal2.add(labelTextoArtistaMenuPrincipal);

                // TEXTO DISCO MENÚ PRINCIPAL
                // -----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoDiscoMenuPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoDiscos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoDiscoTemporal = textoDiscoMenuPrincipal.getImage();

                // Editamos la imagen.
                Image nuevoTextoDiscoMenuPrincipal = textoDiscoTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoDiscoMenuPrincipal = new ImageIcon(nuevoTextoDiscoMenuPrincipal);

                // Convertimos el JLabel en el icono.
                labelTextoDiscoMenuPrincipal.setIcon(textoDiscoMenuPrincipal);

                // Localización del Jlabel
                labelTextoDiscoMenuPrincipal.setBounds(155, 285, 40, 100);

                // Incluimos el label en el JPanel.
                panelMenuPrincipal2.add(labelTextoDiscoMenuPrincipal);

                // TEXTO CANCIÓN MENÚ PRINCIPAL
                // ---------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoCancionMenuPrincipal = new ImageIcon("src/Recursos/Imágenes/TextoCanciones.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoCancionTemporal = textoCancionMenuPrincipal.getImage();

                // Editamos la imagen.
                Image nuevoTextoCancionMenuPrincipal = textoCancionTemporal.getScaledInstance(40, 100,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoCancionMenuPrincipal = new ImageIcon(nuevoTextoCancionMenuPrincipal);

                // Convertimos el JLabel en el icono.
                labelTextoCancionMenuPrincipal.setIcon(textoCancionMenuPrincipal);

                // Localización del Jlabel
                labelTextoCancionMenuPrincipal.setBounds(155, 440, 40, 100);

                // Incluimos el label en el JPanel.
                panelMenuPrincipal2.add(labelTextoCancionMenuPrincipal);

                // TEXTO INICIO SESIÓN
                // ------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoIniciarSesion = new ImageIcon("src/Recursos/Imágenes/TextoIniciarSesión.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoIniciarSesionTemporal = textoIniciarSesion.getImage();

                // Editamos la imagen.
                Image nuevoTextoIniciarSesion = textoIniciarSesionTemporal.getScaledInstance(150, 50,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoIniciarSesion = new ImageIcon(nuevoTextoIniciarSesion);

                // Convertimos el JLabel en el icono.
                labelTextoIniciarSesion.setIcon(textoIniciarSesion);

                // Localización del Jlabel
                labelTextoIniciarSesion.setBounds(620, 500, 150, 50);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelTextoIniciarSesion.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un
                        // nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la
                        // imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelTextoIniciarSesion) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                InicioSesion.MetodoInicioSesion();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelMenuPrincipal3.add(labelTextoIniciarSesion);

                // IMAGEN BUSCAR POR ARTISTA
                // ------------------------------------------------------------------------------------------------------------------------

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
                labelBuscarArtista.setIcon(imagenBuscarPorArtista);

                // Localización del Jlabel
                labelBuscarArtista.setBounds(10, 110, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelBuscarArtista.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un
                        // nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la
                        // imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarArtista) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaArtistas.metodoListaArtistas();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelMenuPrincipal2.add(labelBuscarArtista);

                // IMAGEN BUSCAR POR DISCO
                // --------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenBuscarPorDisco = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorDisco.jpg");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenBuscarPorDiscoTemporal = imagenBuscarPorDisco.getImage();

                // Editamos la imagen.
                Image nuevaImagenBuscarPorDisco = imagenBuscarPorDiscoTemporal.getScaledInstance(140, 140,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenBuscarPorDisco = new ImageIcon(nuevaImagenBuscarPorDisco);

                // Convertimos el JLabel en el icono.
                labelBuscarDisco.setIcon(imagenBuscarPorDisco);

                // Localización del Jlabel
                labelBuscarDisco.setBounds(10, 260, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelBuscarDisco.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un
                        // nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la
                        // imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarDisco) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaDiscos.metodoListaDiscos();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelMenuPrincipal2.add(labelBuscarDisco);

                // IMAGEN BUSCAR POR CANCIÓN
                // ------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenBuscarPorCancion = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorCanción.jpg");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenBuscarPorCancionTemporal = imagenBuscarPorCancion.getImage();

                // Editamos la imagen.
                Image nuevaImagenBuscarPorCancion = imagenBuscarPorCancionTemporal.getScaledInstance(140, 140,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenBuscarPorCancion = new ImageIcon(nuevaImagenBuscarPorCancion);

                // Convertimos el JLabel en el icono.
                labelBuscarCancion.setIcon(imagenBuscarPorCancion);

                // Localización del Jlabel
                labelBuscarCancion.setBounds(10, 410, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelBuscarCancion.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un
                        // nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la
                        // imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarCancion) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaCanciones.metodoListaCanciones();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelMenuPrincipal2.add(labelBuscarCancion);

                // INICIO DEL MENÚ PRINCIPAL
                // ------------------------------------------------------------------------------------------------------------------------

                // Determinamos la visibilidad de la ventana y sus componentes
                frameMenuPrincipal.setVisible(true);

        } // Fin del "MétodoMenúPrincipal."

} // Fin de la clase "MenuPrincipal".
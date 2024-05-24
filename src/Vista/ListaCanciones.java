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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// CLASE LISTA CANCIONES ----------------------------------------------------------------------------------------------------------------------------

// Esta clase contendrá el entorno gráfico relacionado con la lista de canciones.
public class ListaCanciones {

        // Para iniciar nuestro inicio de sesión, primero vamos a crear un método que
        // contenga todos los componentes de nuestro entorno gráfico.
        public static void metodoListaCanciones() {

                // Dentro del método, primero vamos a declarar todos los componentes necesarios.
                JLayeredPane gestorDeCapas = new JLayeredPane();

                JFrame frameListaCanciones = new JFrame();

                JPanel panelListaCanciones1 = new JPanel();
                JPanel panelListaCanciones2 = new JPanel();

                JLabel labelLogo = new JLabel();
                JLabel labelBuscarVinilos = new JLabel();
                JLabel labelTextoArtistas = new JLabel();
                JLabel labelTextoDiscos = new JLabel();
                JLabel labelTextoCanciones = new JLabel();
                JLabel labelBuscarCanciones = new JLabel();
                JLabel labelBuscarDiscos = new JLabel();
                JLabel labelBuscarArtistas = new JLabel();
                JLabel labelBuscarCancionesFavoritas = new JLabel();
                JLabel labelTextoCancionesDelMomento = new JLabel();
                JLabel labelCancionesDelMomento1 = new JLabel();
                JLabel labelCancionesDelMomento2 = new JLabel();
                JLabel labelCancionesDelMomento3 = new JLabel();

                JTextField textBuscarCanciones = new JTextField();
                JTextField textCancionesDelMomento1 = new JTextField();
                JTextField textCancionesDelMomento2 = new JTextField();
                JTextField textCancionesDelMomento3 = new JTextField();

                JButton BotonBuscar = new JButton();

                // Ahora vamos a determinar los ajustes de cada uno de ellos.

                // GESTOR DE CAPAS
                // ----------------------------------------------------------------------------------------------------------------------------------

                // Localización
                gestorDeCapas.setBounds(0, 0, 800, 600);

                // Añadimos el gestor de capas al JFrame.
                frameListaCanciones.add(gestorDeCapas);

                // FRAME LISTA CANCIONES
                // ----------------------------------------------------------------------------------------------------------------------------

                // Título
                frameListaCanciones.setTitle("FunkyTown INC.");

                // Tamaño
                frameListaCanciones.setSize(800, 600);

                // Localización
                frameListaCanciones.setLocationRelativeTo(null);

                // Layout
                frameListaCanciones.setLayout(null);

                // Edición
                frameListaCanciones.setResizable(false);

                // PANEL LISTA CANCIONES 1
                // --------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelListaCanciones1.setSize(800, 600);

                // Localización
                panelListaCanciones1.setLocation(0, 0);

                // Fondo
                panelListaCanciones1.setBackground(new ColorUIResource(34, 34, 34));

                // Layout
                panelListaCanciones1.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelListaCanciones1, Integer.valueOf(0));

                // PANEL LISTA CANCIONES 2
                // --------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelListaCanciones2.setSize(200, 800);

                // Localización
                panelListaCanciones2.setLocation(0, 0);

                // Fondo
                panelListaCanciones2.setBackground(new ColorUIResource(41, 41, 41));

                // Layout
                panelListaCanciones2.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelListaCanciones2, Integer.valueOf(1));

                // TEXTO LOGO
                // ---------------------------------------------------------------------------------------------------------------------------------------

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
                panelListaCanciones2.add(labelLogo);

                // TEXTO BUSCAR VINILOS
                // -----------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenBuscarVinilos = new ImageIcon("src/Recursos/Imágenes/TextoBuscarVinilos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenBuscarVinilosTemporal = imagenBuscarVinilos.getImage();

                // Editamos la imagen.
                Image nuevaImagenBuscarVinilos = imagenBuscarVinilosTemporal.getScaledInstance(200, 50,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenBuscarVinilos = new ImageIcon(nuevaImagenBuscarVinilos);

                // Convertimos el JLabel en el icono.
                labelBuscarVinilos.setIcon(imagenBuscarVinilos);

                // Localización del Jlabel
                labelBuscarVinilos.setBounds(0, 50, 200, 60);

                // Incluimos el label en el JPanel.
                panelListaCanciones2.add(labelBuscarVinilos);

                // TEXTO ARTISTAS
                // -----------------------------------------------------------------------------------------------------------------------------------

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
                panelListaCanciones2.add(labelTextoArtistas);

                // TEXTO DISCOS
                // -------------------------------------------------------------------------------------------------------------------------------------

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
                panelListaCanciones2.add(labelTextoDiscos);

                // TEXTO CANCIONES
                // ----------------------------------------------------------------------------------------------------------------------------------

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
                panelListaCanciones2.add(labelTextoCanciones);

                // IMAGEN BUSCAR POR ARTISTAS
                // -----------------------------------------------------------------------------------------------------------------------

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
                panelListaCanciones2.add(labelBuscarArtistas);

                // IMAGEN BUSCAR POR DISCOS
                // -------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenBuscarPorDiscos = new ImageIcon("src/Recursos/Imágenes/ImagenBuscarPorDisco.jpg");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenBuscarPorDiscosTemporal = imagenBuscarPorDiscos.getImage();

                // Editamos la imagen.
                Image nuevaImagenBuscarPorDiscos = imagenBuscarPorDiscosTemporal.getScaledInstance(140, 140,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenBuscarPorDiscos = new ImageIcon(nuevaImagenBuscarPorDiscos);

                // Convertimos el JLabel en el icono.
                labelBuscarDiscos.setIcon(imagenBuscarPorDiscos);

                // Localización del Jlabel
                labelBuscarDiscos.setBounds(10, 260, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelBuscarDiscos.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un
                        // nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la
                        // imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarDiscos) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaDiscos.metodoListaDiscos();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelListaCanciones2.add(labelBuscarDiscos);

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
                labelBuscarCanciones.setIcon(imagenBuscarPorCancion);

                // Localización del Jlabel
                labelBuscarCanciones.setBounds(10, 410, 140, 140);

                // Añadimos un MouseListener para hacer que la imagen reaccione al darle click.
                labelBuscarCanciones.addMouseListener(new MouseAdapter() {

                        // Dentro del MouseListener vamos a utilizar un override para implementar un
                        // nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la
                        // imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarCanciones) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaCanciones.metodoListaCanciones();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelListaCanciones2.add(labelBuscarCanciones);

                // TEXTO BUSCAR CANCIÓN FAVORITA
                // --------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoBuscarCancionFavorita = new ImageIcon("src/Recursos/Imágenes/TextoCanciónFavorita.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoBuscarCancionFavoritaTemporal = textoBuscarCancionFavorita.getImage();

                // Editamos la imagen.
                Image nuevoTextoBuscarCancionFavorita = textoBuscarCancionFavoritaTemporal.getScaledInstance(400, 90,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoBuscarCancionFavorita = new ImageIcon(nuevoTextoBuscarCancionFavorita);

                // Convertimos el JLabel en el icono.
                labelBuscarCancionesFavoritas.setIcon(textoBuscarCancionFavorita);

                // Localización del Jlabel
                labelBuscarCancionesFavoritas.setBounds(200, 10, 400, 90);

                // Incluimos el label en el JPanel.
                panelListaCanciones1.add(labelBuscarCancionesFavoritas);

                // TEXTO CANCIONES DEL MOMENTO
                // ----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoCancionesDelMomento = new ImageIcon(
                                "src/Recursos/Imágenes/TextoCancionesDelMomento.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoCancionesDelMomentoTemporal = textoCancionesDelMomento.getImage();

                // Editamos la imagen.
                Image nuevoTextoCancionesDelMomento = textoCancionesDelMomentoTemporal.getScaledInstance(400, 90,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoCancionesDelMomento = new ImageIcon(nuevoTextoCancionesDelMomento);

                // Convertimos el JLabel en el icono.
                labelTextoCancionesDelMomento.setIcon(textoCancionesDelMomento);

                // Localización del Jlabel
                labelTextoCancionesDelMomento.setBounds(200, 150, 400, 90);

                // Incluimos el label en el JPanel.
                panelListaCanciones1.add(labelTextoCancionesDelMomento);

                // CAMPO DE TEXTO LISTA CANCIONES
                // ----------------------------------------------------------------------------------------------------------------------

                // Título
                textBuscarCanciones.setText("      Escribe aquí la canción que quieras buscar!");

                // Tamaño y localización
                textBuscarCanciones.setBounds(220, 100, 550, 40);

                // Fondo
                textBuscarCanciones.setOpaque(false);

                // Incluimos el campo de texto al JPanel
                panelListaCanciones1.add(textBuscarCanciones);

                // BOTÓN BUSCAR LISTA CANCIONES
                // ------------------------------------------------------------------------------------------------------------------------

                // Título
                BotonBuscar.setText("Buscar!");

                // Tamaño y localización
                BotonBuscar.setBounds(670, 100, 100, 40);

                // Fondo
                BotonBuscar.setOpaque(false);

                // Incluimos el botón al JPanel
                panelListaCanciones1.add(BotonBuscar);

                // IMAGEN CANCIONES DEL MOMENTO 1
                // -----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenCancionDelMomento1 = new ImageIcon("src/Recursos/PLACEHOLDER (ELIMINAR)/A.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenCancionDelMomento1Temporal = imagenCancionDelMomento1.getImage();

                // Editamos la imagen.
                Image nuevaImagenCancionDelMomento1 = imagenCancionDelMomento1Temporal.getScaledInstance(170, 170,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenCancionDelMomento1 = new ImageIcon(nuevaImagenCancionDelMomento1);

                // Convertimos el JLabel en el icono.
                labelCancionesDelMomento1.setIcon(imagenCancionDelMomento1);

                // Localización del Jlabel
                labelCancionesDelMomento1.setBounds(220, 250, 170, 170);

                // Incluimos el label en el JPanel.
                panelListaCanciones1.add(labelCancionesDelMomento1);

                // IMAGEN CANCIONES DEL MOMENTO 2
                // -----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenCancionDelMomento2 = new ImageIcon("src/Recursos/PLACEHOLDER (ELIMINAR)/A.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenCancionDelMomento2Temporal = imagenCancionDelMomento2.getImage();

                // Editamos la imagen.
                Image nuevaImagenCancionDelMomento2 = imagenCancionDelMomento2Temporal.getScaledInstance(170, 170,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenCancionDelMomento2 = new ImageIcon(nuevaImagenCancionDelMomento2);

                // Convertimos el JLabel en el icono.
                labelCancionesDelMomento2.setIcon(imagenCancionDelMomento2);

                // Localización del Jlabel
                labelCancionesDelMomento2.setBounds(410, 250, 170, 170);

                // Incluimos el label en el JPanel.
                panelListaCanciones1.add(labelCancionesDelMomento2);

                // IMAGEN CANCIONES DEL MOMENTO 3
                // -----------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenCancionDelMomento3 = new ImageIcon("src/Recursos/PLACEHOLDER (ELIMINAR)/A.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenCancionDelMomento3Temporal = imagenCancionDelMomento3.getImage();

                // Editamos la imagen.
                Image nuevaImagenCancionDelMomento3 = imagenCancionDelMomento3Temporal.getScaledInstance(170, 170,
                                Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenCancionDelMomento3 = new ImageIcon(nuevaImagenCancionDelMomento3);

                // Convertimos el JLabel en el icono.
                labelCancionesDelMomento3.setIcon(imagenCancionDelMomento3);

                // Localización del Jlabel
                labelCancionesDelMomento3.setBounds(600, 250, 170, 170);

                // Incluimos el label en el JPanel.
                panelListaCanciones1.add(labelCancionesDelMomento3);

                // CAMPO DE TEXTO CANCIONES DEL MOMENTO 1
                // -----------------------------------------------------------------------------------------------------------

                // Título
                textCancionesDelMomento1.setText("Texto Prueba 1");

                // Tamaño y localización
                textCancionesDelMomento1.setBounds(220, 430, 170, 120);

                // Fondo
                textCancionesDelMomento1.setOpaque(false);

                // Incluimos el campo de texto al JPanel
                panelListaCanciones1.add(textCancionesDelMomento1);

                // CAMPO DE TEXTO CANCIONES DEL MOMENTO 2
                // -----------------------------------------------------------------------------------------------------------

                // Título
                textCancionesDelMomento2.setText("Texto Prueba 2");

                // Tamaño y localización
                textCancionesDelMomento2.setBounds(410, 430, 170, 120);

                // Fondo
                textCancionesDelMomento2.setOpaque(false);

                // Incluimos el campo de texto al JPanel
                panelListaCanciones1.add(textCancionesDelMomento2);

                // CAMPO DE TEXTO CANCIONES DEL MOMENTO 3
                // -----------------------------------------------------------------------------------------------------------

                // Título
                textCancionesDelMomento3.setText("Texto Prueba 3");

                // Tamaño y localización
                textCancionesDelMomento3.setBounds(600, 430, 170, 120);

                // Fondo
                textCancionesDelMomento3.setOpaque(false);

                // Incluimos el campo de texto al JPanel
                panelListaCanciones1.add(textCancionesDelMomento3);

                // INICIO DEL LISTA CANCIONES
                // ------------------------------------------------------------------------------------------------------------------------

                // Determinamos la visibilidad de la ventana y sus componentes
                frameListaCanciones.setVisible(true);

        } // Fin del "MétodoListaCanciones"

} // Fin de la clase "ListaCanciones".
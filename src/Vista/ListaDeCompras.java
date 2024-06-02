package Vista;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListaDeCompras extends JFrame {

        // Primero vamos a crear un método que contenga todos los componentes de nuestro entorno gráfico.
        public static void metodoListaDeCompras() {

                // Dentro del método, primero vamos a declarar todos los componentes necesarios.
                JLayeredPane gestorDeCapas = new JLayeredPane();

                JFrame frameListaDeCompras = new JFrame();

                JPanel panelListaDeCompras1 = new JPanel();
                JPanel panelListaDeCompras2 = new JPanel();

                JLabel labelLogo = new JLabel();
                JLabel labelBusqueda = new JLabel();
                JLabel labelTextoArtista = new JLabel();
                JLabel labelTextoDisco = new JLabel();
                JLabel labelTextoCancion = new JLabel();
                JLabel labelBuscarCancion = new JLabel();
                JLabel labelBuscarDisco = new JLabel();
                JLabel labelBuscarArtista = new JLabel();
                JLabel labelCondicion = new JLabel();
                JLabel labelTextoListaDeCompra = new JLabel();

                JTable tablaCompras = new JTable();

                JButton botonEliminar = new JButton();
                JButton botonTotal = new JButton();
                JButton botonComprar = new JButton();

// GESTOR DE CAPAS ----------------------------------------------------------------------------------------------------------------------------------

                // Localización
                gestorDeCapas.setBounds(0, 0, 800, 600);

                // Añadimos el gestor de capas al JFrameInicioSesión.
                frameListaDeCompras.add(gestorDeCapas);

// FRAME LISTA DE COMPRA ----------------------------------------------------------------------------------------------------------------------------

                // Título
                frameListaDeCompras.setTitle("FunkyTown INC.");

                // Tamaño
                frameListaDeCompras.setSize(800, 600);

                // Localización
                frameListaDeCompras.setLocationRelativeTo(null);

                // Layout
                frameListaDeCompras.setLayout(null);

                // Edición
                frameListaDeCompras.setResizable(false);

// PANEL LISTA DE COMPRA 1 --------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelListaDeCompras1.setSize(800, 600);

                // Localización
                panelListaDeCompras1.setLocation(0, 0);

                // Fondo
                panelListaDeCompras1.setBackground(new ColorUIResource(34, 34, 34));

                // Layout
                panelListaDeCompras1.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelListaDeCompras1, Integer.valueOf(0));

// PANEL LISTA DE COMPRA 2 --------------------------------------------------------------------------------------------------------------------------

                // Tamaño
                panelListaDeCompras2.setSize(200, 800);

                // Localización
                panelListaDeCompras2.setLocation(0, 0);

                // Fondo
                panelListaDeCompras2.setBackground(new ColorUIResource(41, 41, 41));

                // Layout
                panelListaDeCompras2.setLayout(null);

                // Añadimos el panel al JLayeredPane.
                gestorDeCapas.add(panelListaDeCompras2, Integer.valueOf(1));

// LOGO ---------------------------------------------------------------------------------------------------------------------------------------------

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
                panelListaDeCompras2.add(labelLogo);

// TEXTO BUSCAR VINILOS -----------------------------------------------------------------------------------------------------------------------------

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
                panelListaDeCompras2.add(labelBusqueda);

// TEXTO ARTISTA ------------------------------------------------------------------------------------------------------------------------------------

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
                panelListaDeCompras2.add(labelTextoArtista);

// TEXTO DISCO --------------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon textoDisco = new ImageIcon("src/Recursos/Imágenes/TextoDiscos.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image textoDiscoTemporal = textoDisco.getImage();

                // Editamos la imagen.
                Image nuevoTextoDisco = textoDiscoTemporal.getScaledInstance(40, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                textoDisco = new ImageIcon(nuevoTextoDisco);

                // Convertimos el JLabel en el icono.
                labelTextoDisco.setIcon(textoDisco);

                // Localización del Jlabel
                labelTextoDisco.setBounds(155, 285, 40, 100);

                // Incluimos el label en el JPanel.
                panelListaDeCompras2.add(labelTextoDisco);

// TEXTO CANCIÓN ------------------------------------------------------------------------------------------------------------------------------------

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
                panelListaDeCompras2.add(labelTextoCancion);

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
                panelListaDeCompras2.add(labelBuscarArtista);

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
                panelListaDeCompras2.add(labelBuscarDisco);

// IMAGEN BUSCAR POR CANCIÓN ------------------------------------------------------------------------------------------------------------------------

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

                        // Dentro del MouseListener vamos a utilizar un override para implementar un nuevo método.
                        @Override

                        // Ahora implementamos el método MouseClicked, este determinará la acción de la imagen al darle click.
                        public void mouseClicked(MouseEvent AccionLabelBuscarCancion) {

                                // Dentro del mouseClicked vamos a determinar que debe de hacer la imagen.
                                ListaCanciones.metodoListaCanciones();

                        } // Fin del método "MouseClicked" .

                }); // Fin del método "MouseListener".

                // Incluimos el label en el JPanel.
                panelListaDeCompras2.add(labelBuscarCancion);

// TEXTO LISTA COMPRA -------------------------------------------------------------------------------------------------------------------------------

                // Primero declaramos la imagen que vayamos a importar.
                ImageIcon imagenListaDeCompra = new ImageIcon("src/Recursos/Imágenes/TextoListaDeCompra.png");

                // Ahora la incluimos en una variable temporal para poder modificarla.
                Image imagenListaDeCompraTemporal = imagenListaDeCompra.getImage();

                // Editamos la imagen.
                Image nuevaImagenListaDeCompra = imagenListaDeCompraTemporal.getScaledInstance(300, 100, Image.SCALE_SMOOTH);

                // Ahora convertimos la nueva imagen de vuelta en un icono.
                imagenListaDeCompra = new ImageIcon(nuevaImagenListaDeCompra);

                // Convertimos el JLabel en el icono.
                labelTextoListaDeCompra.setIcon(imagenListaDeCompra);

                // Localización del Jlabel
                labelTextoListaDeCompra.setBounds(220, 10, 300, 100);

                // Incluimos el label en el JPanel.
                panelListaDeCompras1.add(labelTextoListaDeCompra);

// TABLA DE COMPRAS ---------------------------------------------------------------------------------------------------------------------------------

                // Creamos un array para introducir datos en la tabla
                tablaCompras.setModel(new DefaultTableModel(
                                new Object[][] {
                                                { Controlador.Controller.metodoNombreArtistaBusquedaDisco(), ListaDiscos.EnviarDiscoBuscado(), Controlador.Controller.metodoPrecioBusquedaDisco()},
                                                { "N-A", "N-A", "N-A"},
                                                { "N-A", "N-A", "N-A"}
                                },
                                new String[] { "Artista", "Album", "Precio" }));

                // Creamos la tabla transparente
                tablaCompras.setOpaque(false);
                ((DefaultTableCellRenderer) tablaCompras.getDefaultRenderer(Object.class)).setOpaque(false);

                // Le damos color a las letras
                tablaCompras.setForeground(new Color(255, 255, 255));

                // Le damos tamaño a las filas
                tablaCompras.setRowHeight(55);

                // Añadimos la tabla al Frame
                panelListaDeCompras1.add(tablaCompras);

                // Creamos un scroll para poder movernos dentro de la tabla
                JScrollPane scroll = new JScrollPane(tablaCompras);

                // Le ponemos las filas transparentes
                scroll.setOpaque(false);
                scroll.getViewport().setOpaque(false);

                // Localización
                scroll.setBounds(220, 100, 540, 310);

                // Añadimos el scroll al panel
                panelListaDeCompras1.add(scroll);

// BOTÓN ELIMINAR -----------------------------------------------------------------------------------------------------------------------------------


                botonEliminar.setText("Quitar");
                botonEliminar.setBounds(250, 440, 120, 35);
                botonEliminar.setBackground(new Color(192, 57, 43));
                botonEliminar.setForeground(new Color(246, 236, 201));
                botonEliminar.setFocusPainted(false);
                botonEliminar.setFont(new Font("Arial", Font.BOLD, 22));
                botonEliminar.setBorder(null);
                panelListaDeCompras1.add(botonEliminar);

// BOTÓN TOTAL --------------------------------------------------------------------------------------------------------------------------------------

                botonTotal.setText("Total");
                botonTotal.setBounds(430, 440, 120, 35);
                botonTotal.setBackground(new Color(192, 57, 43));
                botonTotal.setForeground(new Color(246, 236, 201));
                botonTotal.setFocusPainted(false);
                botonTotal.setFont(new Font("Arial", Font.BOLD, 22));
                botonTotal.setBorder(null);
                panelListaDeCompras1.add(botonTotal);

// BOTÓN COMPRAR ------------------------------------------------------------------------------------------------------------------------------------


                botonComprar.setText("Comprar");
                botonComprar.setBounds(600, 440, 120, 35);
                botonComprar.setBackground(new Color(192, 57, 43));
                botonComprar.setForeground(new Color(246, 236, 201));
                botonComprar.setFocusPainted(false);
                botonComprar.setFont(new Font("Arial", Font.BOLD, 22));
                botonComprar.setBorder(null);
                panelListaDeCompras1.add(botonComprar);

// ETIQUETA DE CONDICIÓN ----------------------------------------------------------------------------------------------------------------------------


                labelCondicion.setText("*Debes iniciar sesión para comprar");
                labelCondicion.setBounds(350, 500, 300, 40);
                labelCondicion.setFont(new Font("Arial", Font.BOLD, 15));
                panelListaDeCompras1.add(labelCondicion);

// INICIO DEL LISTA CANCIONES -----------------------------------------------------------------------------------------------------------------------

                // Determinamos la visibilidad de la ventana y sus componentes
                frameListaDeCompras.setVisible(true);
        }

}

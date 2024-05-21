// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a determinar la localización de nuestra clase, esto nos permitirá dividir el programa y hacerlo más ágil.
    package Main.java.com.ProyectoFinDeCurso.Vista;

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

// CLASE INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------------

    // Esta clase contendrá todo el entorno gráfico relacionado con el inicio de sesión.
    public class InicioSesion {

        // Para iniciar nuestro inicio de sesión, primero vamos a crear un método que contenga todos los componentes de nuestro entorno gráfico.
        public static void MétodoInicioSesión(){

        // Dentro del método, primero vamos a declarar todos los componentes necesarios.
        JLayeredPane GestorDeCapas = new JLayeredPane();

        JFrame FrameInicioSesión = new JFrame();

        JPanel PanelInicioSesión1 = new JPanel();
        JPanel PanelInicioSesión2 = new JPanel();

        JLabel LabelLogo = new JLabel();
        JLabel LabelTexto = new JLabel();
        JLabel LabelBúsqueda = new JLabel();
        JLabel LabelTextoArtista = new JLabel();
        JLabel LabelTextoDisco = new JLabel();
        JLabel LabelTextoCanción = new JLabel();
        JLabel LabelUsuario = new JLabel();
        JLabel LabelContraseña = new JLabel();
        JLabel LabelNuevaCuenta = new JLabel();
        JLabel LabelCrearCuenta = new JLabel();
        JLabel LabelBuscarCanción = new JLabel();
        JLabel LabelBuscarDisco = new JLabel();
        JLabel LabelBuscarArtista = new JLabel();

        JTextField TextUsuario = new JTextField();
        JTextField TextContraseña = new JTextField();

        JButton BotónAcceder = new JButton();

        // Ahora vamos a determinar los ajustes de cada uno de ellos.

// GESTOR DE CAPAS ----------------------------------------------------------------------------------------------------------------------------------

        // Localización
        GestorDeCapas.setBounds(0, 0, 800, 600);

        // Añadimos el gestor de capas al JFrameInicioSesión.
        FrameInicioSesión.add(GestorDeCapas);

// FRAME INICIO SESIÓN -----------------------------------------------------------------------------------------------------------------------------

        // Título
        FrameInicioSesión.setTitle("FunkyTown INC.");

        // Tamaño
        FrameInicioSesión.setSize(800, 600);

        // Localización
        FrameInicioSesión.setLocationRelativeTo(null);

        // Layout
        FrameInicioSesión.setLayout(null);

        // Edición
        FrameInicioSesión.setResizable(false);

// PANEL INICIO SESIÓN 1 ---------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        PanelInicioSesión1.setSize(800, 600);

        // Localización
        PanelInicioSesión1.setLocation(0, 0);

        // Fondo
        PanelInicioSesión1.setBackground(new ColorUIResource(34, 34, 34));

        // Layout
        PanelInicioSesión1.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        GestorDeCapas.add(PanelInicioSesión1, Integer.valueOf(0));

// PANEL INICIO SESIÓN 2 ---------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        PanelInicioSesión2.setSize(200, 800);

        // Localización
        PanelInicioSesión2.setLocation(0, 0);

        // Fondo
        PanelInicioSesión2.setBackground(new ColorUIResource(41, 41, 41));

        // Layout
        PanelInicioSesión2.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        GestorDeCapas.add(PanelInicioSesión2, Integer.valueOf(1));

// LOGO INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------------
        
        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon Logo = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/TextoLogo.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image LogoTemporal = Logo.getImage(); 

        // Editamos la imagen.
        Image NuevoLogo = LogoTemporal.getScaledInstance(200, 60, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        Logo = new ImageIcon(NuevoLogo);

        // Convertimos el JLabel en el icono.
        LabelLogo.setIcon(Logo);

        // Localización del Jlabel
        LabelLogo.setBounds(0, 0, 200, 60);
        
        // Incluimos el label en el JPanel.
        PanelInicioSesión2.add(LabelLogo);

// TEXTO INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------------
        
        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenTexto = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/TextoInicioSesión.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoTemporal = ImagenTexto.getImage(); 

        // Editamos la imagen.
        Image NuevaImagenTexto = TextoTemporal.getScaledInstance(400, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenTexto = new ImageIcon(NuevaImagenTexto);

        // Convertimos el JLabel en el icono.
        LabelTexto.setIcon(ImagenTexto);

        // Localización del Jlabel
        LabelTexto.setBounds(200, 0, 400, 100);
        
        // Incluimos el label en el JPanel.
        PanelInicioSesión1.add(LabelTexto);

// USUARIO INICIO SESIÓN ----------------------------------------------------------------------------------------------------------------------------
        
        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenUsuario = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/TextoUsuario.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image UsuarioTemporal = ImagenUsuario.getImage(); 

        // Editamos la imagen.
        Image NuevaImagenUsuario = UsuarioTemporal.getScaledInstance(140, 50, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenUsuario = new ImageIcon(NuevaImagenUsuario);

        // Convertimos el JLabel en el icono.
        LabelUsuario.setIcon(ImagenUsuario);

        // Localización del Jlabel
        LabelUsuario.setBounds(220, 100, 140, 50);
        
        // Incluimos el label en el JPanel.
        PanelInicioSesión1.add(LabelUsuario);

// CONTRASEÑA INICIO SESIÓN -------------------------------------------------------------------------------------------------------------------------
        
        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenContraseña = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/TextoContraseña.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ContraseñaTemporal = ImagenContraseña.getImage(); 

        // Editamos la imagen.
        Image NuevaImagenContraseña = ContraseñaTemporal.getScaledInstance(180, 50, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenContraseña = new ImageIcon(NuevaImagenContraseña);

        // Convertimos el JLabel en el icono.
        LabelContraseña.setIcon(ImagenContraseña);

        // Localización del Jlabel
        LabelContraseña.setBounds(220, 160, 180, 50);
        
        // Incluimos el label en el JPanel.
        PanelInicioSesión1.add(LabelContraseña);

// NUEVA CUENTA INICIO SESIÓN -----------------------------------------------------------------------------------------------------------------------
        
        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenNuevaCuenta = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/TextoNuevaCuenta.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image NuevaCuentaTemporal = ImagenNuevaCuenta.getImage(); 

        // Editamos la imagen.
        Image NuevaImagenNuevaCuenta = NuevaCuentaTemporal.getScaledInstance(400, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenNuevaCuenta = new ImageIcon(NuevaImagenNuevaCuenta);

        // Convertimos el JLabel en el icono.
        LabelNuevaCuenta.setIcon(ImagenNuevaCuenta);

        // Localización del Jlabel
        LabelNuevaCuenta.setBounds(200, 300, 400, 100);
        
        // Incluimos el label en el JPanel.
        PanelInicioSesión1.add(LabelNuevaCuenta);

// CREAR CUENTA INICIO SESIÓN -----------------------------------------------------------------------------------------------------------------------
        
        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenCrearCuenta = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/TextoCrearCuenta.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image CrearCuentaTemporal = ImagenCrearCuenta.getImage(); 

        // Editamos la imagen.
        Image NuevaImagenCrearCuenta = CrearCuentaTemporal.getScaledInstance(400, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenCrearCuenta = new ImageIcon(NuevaImagenCrearCuenta);

        // Convertimos el JLabel en el icono.
        LabelCrearCuenta.setIcon(ImagenCrearCuenta);

        // Localización del Jlabel
        LabelCrearCuenta.setBounds(250, 400, 400, 100);
        
        // Incluimos el label en el JPanel.
        PanelInicioSesión1.add(LabelCrearCuenta);

// BÚSQUEDA INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------------
        
        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBúsqueda = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/TextoBuscarVinilos.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image ImagenBúsquedaTemporal = ImagenBúsqueda.getImage(); 

        // Editamos la imagen.
        Image NuevaImagenBúsqueda = ImagenBúsquedaTemporal.getScaledInstance(200, 50, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        ImagenBúsqueda = new ImageIcon(NuevaImagenBúsqueda);

        // Convertimos el JLabel en el icono.
        LabelBúsqueda.setIcon(ImagenBúsqueda);

        // Localización del Jlabel
        LabelBúsqueda.setBounds(0, 50, 200, 60);
        
        // Incluimos el label en el JPanel.
        PanelInicioSesión2.add(LabelBúsqueda);

// TEXTO ARTISTA INICIO SESIÓN ---------------------------------------------------------------------------------------------------------------------
        
        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoArtista = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/TextoArtistas.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoArtistaTemporal = TextoArtista.getImage(); 

        // Editamos la imagen.
        Image NuevoTextoArtista = TextoArtistaTemporal.getScaledInstance(40, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoArtista = new ImageIcon(NuevoTextoArtista);

        // Convertimos el JLabel en el icono.
        LabelTextoArtista.setIcon(TextoArtista);

        // Localización del Jlabel
        LabelTextoArtista.setBounds(155, 130, 40, 100);
        
        // Incluimos el label en el JPanel.
        PanelInicioSesión2.add(LabelTextoArtista);

// TEXTO DISCO INICIO SESIÓN -----------------------------------------------------------------------------------------------------------------------
        
        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoDisco = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/TextoDiscos.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoDiscoTemporal = TextoDisco.getImage(); 

        // Editamos la imagen.
        Image NuevoTextoDisco =TextoDiscoTemporal.getScaledInstance(40, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoDisco = new ImageIcon(NuevoTextoDisco);

        // Convertimos el JLabel en el icono.
        LabelTextoDisco.setIcon(TextoDisco);

        // Localización del Jlabel
        LabelTextoDisco.setBounds(155, 285, 40, 100);
        
        // Incluimos el label en el JPanel.
        PanelInicioSesión2.add(LabelTextoDisco);

// TEXTO CANCIÓN INICIO SESIÓN ---------------------------------------------------------------------------------------------------------------------
        
        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon TextoCanción = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/TextoCanciones.png");

        // Ahora la incluimos en una variable temporal para poder modificarla.
        Image TextoCanciónTemporal = TextoCanción.getImage(); 

        // Editamos la imagen.
        Image NuevoTextoCanción = TextoCanciónTemporal.getScaledInstance(40, 100, java.awt.Image.SCALE_SMOOTH);

        // Ahora convertimos la nueva imagen de vuelta en un icono.
        TextoCanción = new ImageIcon(NuevoTextoCanción);

        // Convertimos el JLabel en el icono.
        LabelTextoCanción.setIcon(TextoCanción);

        // Localización del Jlabel
        LabelTextoCanción.setBounds(155, 440, 40, 100);
        
        // Incluimos el label en el JPanel.
        PanelInicioSesión2.add(LabelTextoCanción);

// IMAGEN BUSCAR POR ARTISTA --------------------------------------------------------------------------------------------------------------------------    

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBuscarPorArtista = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/ImagenBuscarPorArtista.jpg");

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
        PanelInicioSesión2.add(LabelBuscarArtista);

// IMAGEN BUSCAR POR DISCO --------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBuscarPorDisco = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/ImagenBuscarPorDisco.jpg");

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
        PanelInicioSesión2.add(LabelBuscarDisco);

// IMAGEN BUSCAR POR CANCIÓN ------------------------------------------------------------------------------------------------------------------------

        // Primero declaramos la imagen que vayamos a importar.
        ImageIcon ImagenBuscarPorCanción = new ImageIcon("ProyectoFinDeCursoProgramacion-Nicolás/src/Recursos/Imágenes/ImagenBuscarPorCanción.jpg");

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
        PanelInicioSesión2.add(LabelBuscarCanción);

// CAMPO DE TEXTO USUARIO ---------------------------------------------------------------------------------------------------------------------------

        // Título
        TextUsuario.setText("      Escribe aquí tu usuario!");

        // Tamaño y localización
        TextUsuario.setBounds(370, 110, 390, 40);

        // Fondo
        TextUsuario.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        PanelInicioSesión1.add(TextUsuario);

// CAMPO DE TEXTO CONTRASEÑA ------------------------------------------------------------------------------------------------------------------------

        // Título
        TextContraseña.setText("      Escribe aquí tu contraseña!");

        // Tamaño y localización
        TextContraseña.setBounds(410, 170, 350, 40);

        // Fondo
        TextContraseña.setOpaque(false);

        // Incluimos el campo de texto al JPanel
        PanelInicioSesión1.add(TextContraseña);

// BOTÓN BUSCAR LISTA DISCOS ------------------------------------------------------------------------------------------------------------------------

        // Título
        BotónAcceder.setText("Accede!");

        // Tamaño y localización
        BotónAcceder.setBounds(220, 240, 540, 40);

        // Fondo 
        BotónAcceder.setOpaque(false);

        // Incluimos el botón al JPanel
        PanelInicioSesión1.add(BotónAcceder);

// INICIO DEL INICIO SESIÓN ------------------------------------------------------------------------------------------------------------------------

        // Determinamos la visibilidad de la ventana y sus componentes
        FrameInicioSesión.setVisible(true);

        } // Fin del "MétodoInicioSesión"

    } // Fin de la clase "InicioSesión".
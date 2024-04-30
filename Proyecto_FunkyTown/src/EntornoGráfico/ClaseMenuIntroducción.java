// PAQUETE ====================================================================================================================================================
    
    // Aquí determinaremos la localización de nuestra clase, esto nos permitirá dividir nuestro programa y hacerlo más ágil.
    package EntornoGráfico;

// IMPORTS ====================================================================================================================================================

    // Aquí podremos importar diferentes funcionalidades para el correcto funcionamiento de nuestro programa.

    // Primero vamos a importar la funcionalidad "JFrame", esta nos va a permitir crear entornos gráficos que el usuario pueda utilizar.
    import javax.swing.JFrame;

    // Ahora vamos a importar la funcionalidad "JLabel", esta permite mostrar información al usuario.
    import javax.swing.JLabel;

    // Importamos la funcionalidad "JTextArea", esta nos permite introducir texto para mostrar al usuario.
    import javax.swing.JTextArea;

    // Importamos la funcionalidad "JButton", esta nos permite crear botones con diferentes funciones que el usuario puede realizar.
    import javax.swing.JButton;

    // Importamos la funcionalidad "ActionListener", esta nos permite hacer que los componentes del entorno gráfico respondan a las acciones del usuario.
    import java.awt.event.ActionListener;

    // Importamos lo funcionalidad "ActionEvent", esta nos permite determinar la reacción de los componentes del entorno gráfico al usuario.
    import java.awt.event.ActionEvent;

    // Importamos la funcionalidad "Color", esta permite añadir colores a los diferentes componentes del entorno gráfico.
    import java.awt.Color;

    // Importamos la funcionalidad "BufferedImage", esta nos permite introducir imágenes dentro de nuestro ordenador al programa.
    import java.awt.image.BufferedImage;

    // Importamos la funcionalidad "File", esta nos permite añadir archivos a nuestro programa.
    import java.io.File;

    // Importamos la funcionalidad "IOException", esta nos permite manejar las imágenes de nuestro programa.
    import java.io.IOException;

    // Importamos la funcionalidad "ImageIO", esta nos permite incluir imágenes a nuestro programa.
    import javax.imageio.ImageIO;

    // Importamos la funcionalidad "ImagenIcon", esta nos permite incluir imágenes a nuestro programa como un icono para un componente del entrono gráfico.
    import javax.swing.ImageIcon;

// CLASE MENÚ INTRODUCCIÓN ====================================================================================================================================

    // Aquí vamos a crear el entorno gráfico del menú de introducción.
    public class ClaseMenuIntroducción {

// DECLARACIONES ==============================================================================================================================================

    // Aquí declararemos variables o objetos que permitirán el correcto funcionamiento del programa.

// INICIO DEL CÓDIGO ==========================================================================================================================================

    // Para iniciar el entorno gráfico, primero debemos crear una método.
    public static void MétodoMenúIntroducción() throws IOException{

// MENÚ INTRODUCCIÓN ==========================================================================================================================================

        // Dentro del método vamos a crear un "JFrame", este va a funcionar como contenedor de todos los componentes del entorno gráfico.
        JFrame MenúIntroducción = new JFrame();

            // Ahora vamos a determinar las diferentes características que tendrá nuestro "JFrame";
            
            // Título de la ventana.
            MenúIntroducción.setTitle("FunkyTown Inc.");

            // Tamaño de la ventana.
            MenúIntroducción.setSize(700, 360);

            // Color del fondo.
            MenúIntroducción.getContentPane().setBackground(Color.BLACK);

            // Visibilidad de la ventana.
            MenúIntroducción.setVisible(true);

            // Layout general.
            MenúIntroducción.setLayout(null);

// IMAGEN MENU INTRODUCCIÓN ===================================================================================================================================

        // Ahora vamos a introducir la imagen que va a acompañar al texto de introducción.

        // Primero vamos a declarar una "BufferedImage" que será la imagen a añadir.
        BufferedImage ImagenMenúIntroducción = ImageIO.read(new File("src/Imágenes/ImagenMenúIntroducción.jpg"));

        // Ahora vamos a crear un "JLabel" que contendrá la imagen y la mostrará en el programa.
        JLabel LabelImagenMenúIntroducción = new JLabel(new ImageIcon(ImagenMenúIntroducción));

            // Vamos a determinar las diferentes características de la imagen.

            // Tamaño de la imagen.
            LabelImagenMenúIntroducción.setSize(300, 300);

            // Posición de la imagen.
            LabelImagenMenúIntroducción.setLocation(10, 10);

            // Visibilidad de la imagen.
            LabelImagenMenúIntroducción.setVisible(true);

        // Añadimos la imagen al "JFrame".
        MenúIntroducción.add(LabelImagenMenúIntroducción);

// TEXTO MENÚ INTRODUCCIÓN ====================================================================================================================================

        // Vamos a crear un area de texto donde se introducirá el texto de introducción al usuario.

        // Primero vamos a declarar el area de texto.
        JTextArea TextoMenúIntroducción = new JTextArea();

            // Ahora vamos a determinar las diferentes características del area de texto

            // Tamaño del area.
            TextoMenúIntroducción.setSize(360, 300);

            // Posición del area.
            TextoMenúIntroducción.setLocation(320, 10);

            // Texto.
            TextoMenúIntroducción.append("""
                
                Bienvenido a FunkyTown Inc. (¡Donde el Funk tiene un hogar!)

                Aquí podrás comprar todo tipo de vinilos de los más famosos
                artistas de todos los tiempos, desde el pop de Michael Jackson
                hasta el metal de MegaDeth.

                Tenemos los mejores precios de todo el universo conocido, para 
                que todos puedan seguir disfrutando del sonido de las generaciones
                pasadas y sintonizar con frecuencias no conocidas antes.

                Piérdete en el sonido de los hermosos años 20, el swing de los 50,
                el funk de los 80, y el disco de los 90, todo listo y preparado para 
                tí.

                Disfruta!
                """);

            TextoMenúIntroducción.setForeground(Color.RED);

            // Color del fondo.
            TextoMenúIntroducción.setBackground(Color.BLACK);

            // Color del cursor.
            TextoMenúIntroducción.setCaretColor(Color.RED);

            // Visibilidad del texto.
            TextoMenúIntroducción.setVisible(true);

        // Añadimos el texto al "JFrame".
        MenúIntroducción.add(TextoMenúIntroducción);

// BOTÓN MENU INTRODUCCIÓN ====================================================================================================================================

        // Vamos a crear un botón para que el usuario pueda saltar a la siguiente pantalla.

        // Primero vamos a declarar el botón dentro del método.
        JButton BotónMenúIntroducción = new JButton();

            // Ahora vamos a determinar las diferentes características del botón.

            // Tamaño del botón.
            BotónMenúIntroducción.setSize(300, 300);

            // Posición del botón.
            BotónMenúIntroducción.setLocation(350, 100);

            // Texto del botón
            BotónMenúIntroducción.setText("Comencemos!");

            // Color del botón.

            // Visibilidad del botón.
            BotónMenúIntroducción.setVisible(true);

        // Añadimos el botón al "JFrame".
        MenúIntroducción.add(BotónMenúIntroducción);
            
    } // Fin del "MétodoMenúIntroducción"

} 

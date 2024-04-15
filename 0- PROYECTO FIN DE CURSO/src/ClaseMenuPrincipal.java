// IMPORTS ====================================================================================================================================================

    // Primero vamos a importar la librería "Swing", esta nos permite mostrar información por pantalla.
    import javax.swing.*;

    // Ahora importamos la librería "AWT", esta nos permite crear entornos gráficos para nuestro programa.
    import java.awt.*;

    // Dentro de la librería "AWT" vamos a importar la funcionalidad "Event", esta le permite al entorno gráfico responder a las acciones del usuario.
    import java.awt.event.*;


// CLASE MENÚ PRINCIPAL =======================================================================================================================================

    // Esta clase se va a encargar de la funcionalidad y el entorno gráfico del menú principal.

    // Esta clase al manejar un entorno gráfico debe extenderse de la super clase "JFrame" para poder mostrarse al usuario correctamente.
    public class ClaseMenuPrincipal extends JFrame{

    // DECLARACIONES ==========================================================================================================================================

        // Entorno Gráfico:

            // Botones:

                // Este botón se encargará de mostrar las opciones de búsqueda para mostrar la lista de músicos/grupos.
                private JButton BotónVerLista;

                // Este botón se encargará de mostrar las opciones para añadir datos a las diferentes categorías que incluye el programa.
                private JButton BotónAñadirDatos;

                // Este botón se encargará de mostrar las opciones para eliminar datos de las diferentes categorías que incluye el programa.
                private JButton BotónEliminarDatos;

    // COMIENZO DEL CÓDIGO ====================================================================================================================================

        // CONSTRUCTOR MENU PRINCIPAL =========================================================================================================================

            // Primero vamos a crear un constructor que recogerá el entorno gráfico de nuestro programa.
            public ClaseMenuPrincipal(){

                // Dentro del constructor vamos a usar "Super" para poner un título a la ventana que generará nuestro programa al iniciarse.
                super ("Título Proyecto");

                // También vamos a crear un layout para que se muestre todo correctamente y nos permita editar el entorno gráfico.
                setLayout(new FlowLayout());

                // Ahora vamos a implementar los botones del menú y la funcionalidad de cada uno.

            // BOTÓN VER LISTA ================================================================================================================================

                // Primero vamos a introducir el botón al entorno gráfico.
                JButton BotónVerLista = new JButton("Ver la lista de músicos");

                // Una vez introducido el botón, vamos a añadir un "Action Listener" para que responda al usuario.
                BotónVerLista.addActionListener(new ActionListener() {
                    
                    // Dentro del "Action Listener" vamos a declarar un "Action Performed" que le dirá al programa que acción debe de hacer al responder.
                    public void actionPerformed(ActionEvent EventoVerLista){

                        // Aquí vamos a crear la respuesta que dará el botón.
                        // TODO

                    };// Fin del ActionPerformed.
                });// Fin del ActionListener.

                // Una vez finalizado el ActionListener vamos a incluir el botón en el layout para que se muestre en el entorno gráfico.
                add(BotónVerLista);

            // BOTÓN AÑADIR DATOS =============================================================================================================================

                // Primero vamos a introducir el botón al entorno gráfico.
                JButton BotónAñadirDatos = new JButton("Añadir datos");

                // Una vez introducido el botón, vamos a añadir un "Action Listener" para que responda al usuario.
                BotónAñadirDatos.addActionListener(new ActionListener() {
                    
                    // Dentro del "Action Listener" vamos a declarar un "Action Performed" que le dirá al programa que acción debe de hacer al responder.
                    public void actionPerformed(ActionEvent EventoAñadirDatos){

                        // Aquí vamos a crear la respuesta que dará el botón.
                        // TODO

                    };// Fin del ActionPerformed.
                });// Fin del ActionListener.

                // Una vez finalizado el ActionListener vamos a incluir el botón en el layout para que se muestre en el entorno gráfico.
                add(BotónAñadirDatos);

            // BOTÓN ELIMINAR DATOS ===========================================================================================================================

                // Primero vamos a introducir el botón al entorno gráfico.
                JButton BotónEliminarDatos = new JButton("Eliminar Datos");

                // Una vez introducido el botón, vamos a añadir un "Action Listener" para que responda al usuario.
                BotónEliminarDatos.addActionListener(new ActionListener() {
                    
                    // Dentro del "Action Listener" vamos a declarar un "Action Performed" que le dirá al programa que acción debe de hacer al responder.
                    public void actionPerformed(ActionEvent EventoEliminarDatos){

                        // Aquí vamos a crear la respuesta que dará el botón.
                        // TODO

                    };// Fin del ActionPerformed.
                });// Fin del ActionListener.

                // Una vez finalizado el ActionListener vamos a incluir el botón en el layout para que se muestre en el entorno gráfico.
                add(BotónEliminarDatos);

            // VISTA DEL ENTORNO GRÁFICO ======================================================================================================================

                // Aquí vamos a declarar las opciones de visionado de la ventana del programa.

                // Primero vamos a declarar que la ventana sea visible.
                setVisible(true);

                // Aquí declaramos el tamaño inicial de la ventana.
                setBounds(10,20,200,150);

                // Ahora hacemos que el programa termine cuando se cierre la ventana.
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        } // Fin del constructor.
    } // Fin de la clase.

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

    // COMIENZO DEL CÓDIGO ====================================================================================================================================

        // CONSTRUCTOR MENU PRINCIPAL =========================================================================================================================

            // Primero vamos a crear un constructor que recogerá el entorno gráfico de nuestro programa.
            public ClaseMenuPrincipal(){
            // VISTA DEL ENTORNO GRÁFICO ======================================================================================================================

                // Aquí vamos a declarar las opciones de visionado de la ventana del programa.

                // Dentro del constructor vamos a usar "Super" para poner un título a la ventana que generará nuestro programa al iniciarse.
                super ("Título Proyecto");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLocationRelativeTo(null);
                setResizable(false);

                //Creamos un panel para añadir los botones
                JPanel panel = new JPanel();
                panel.setLayout(null);
                panel.setBackground(new Color(163,67,67));
                add(panel);

                // Ahora vamos a implementar los botones del menú y la funcionalidad de cada uno.

            // BOTÓN VER LISTA ================================================================================================================================

                // Primero vamos a introducir el botón al entorno gráfico.
                JButton botonVerLista = new JButton("Ver la lista de músicos");
                botonVerLista.setBounds(70,50,200,35);
                botonVerLista.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
                botonVerLista.setForeground(Color.WHITE);
                botonVerLista.setBackground(new Color(49,54,63));

                // Una vez introducido el botón, vamos a añadir un "Action Listener" para que responda al usuario.
                botonVerLista.addActionListener(new ActionListener() {                    
                    // Dentro del "Action Listener" vamos a declarar un "Action Performed" que le dirá al programa que acción debe de hacer al responder.
                    public void actionPerformed(ActionEvent EventoVerLista){

                        // Aquí vamos a crear la respuesta que dará el botón.
                        // TODO

                    };// Fin del ActionPerformed.
                });// Fin del ActionListener.

                // Una vez finalizado el ActionListener vamos a incluir el botón en el layout para que se muestre en el entorno gráfico.
                panel.add(botonVerLista);

            // BOTÓN AÑADIR DATOS =============================================================================================================================

                // Primero vamos a introducir el botón al entorno gráfico.
                //Boton para añadir datos a la biblioteca
                JButton botonAnadirDatos = new JButton("Añadir datos");
                botonAnadirDatos.setBounds(70,100,200,35);
                botonAnadirDatos.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
                botonAnadirDatos.setForeground(Color.WHITE);
                botonAnadirDatos.setBackground(new Color(49,54,63));
                
                // Una vez introducido el botón, vamos a añadir un "Action Listener" para que responda al usuario.
                botonAnadirDatos.addActionListener(new ActionListener() {                    
                    // Dentro del "Action Listener" vamos a declarar un "Action Performed" que le dirá al programa que acción debe de hacer al responder.
                    public void actionPerformed(ActionEvent EventoAnadirDatos){

                        // Aquí vamos a crear la respuesta que dará el botón.
                        // TODO

                    };// Fin del ActionPerformed.
                });// Fin del ActionListener.

                // Una vez finalizado el ActionListener vamos a incluir el botón en el layout para que se muestre en el entorno gráfico.
                panel.add(botonAnadirDatos)

            // BOTÓN ELIMINAR DATOS ===========================================================================================================================

                // Primero vamos a introducir el botón al entorno gráfico.
                //Botón para eliminar datos de la biblioteca
                JButton botonEliminarDatos = new JButton("Eliminar Datos");
                botonEliminarDatos.setBounds(70,150,200,35);
                botonEliminarDatos.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
                botonEliminarDatos.setForeground(Color.WHITE);
                botonEliminarDatos.setBackground(new Color(49,54,63));

                // Una vez introducido el botón, vamos a añadir un "Action Listener" para que responda al usuario.
                botonEliminarDatos.addActionListener(new ActionListener() {                    
                    // Dentro del "Action Listener" vamos a declarar un "Action Performed" que le dirá al programa que acción debe de hacer al responder.
                    public void actionPerformed(ActionEvent EventoEliminarDatos){

                        // Aquí vamos a crear la respuesta que dará el botón.
                        // TODO

                    };// Fin del ActionPerformed.
                });// Fin del ActionListener.

                // Una vez finalizado el ActionListener vamos a incluir el botón en el layout para que se muestre en el entorno gráfico.
                panel.add(botonEliminarDatos);


        } // Fin del constructor.
    } // Fin de la clase.

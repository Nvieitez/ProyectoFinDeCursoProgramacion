package Vista;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Esta clase contendrá el entorno gráfico relacionado con registro de usuario nuevo.
public class Registro extends JFrame {

    // Primero vamos a crear un método que contenga todos los componentes de nuestro entorno gráfico.
    public static void metodoRegistro(){

        // Dentro del método, primero vamos a declarar todos los componentes necesarios.
        JLayeredPane gestorDeCapas = new JLayeredPane();

        JFrame frameRegistro = new JFrame();

        JPanel panelRegistro = new JPanel();

        JLabel labelNombres = new JLabel();
        JLabel labelApellidos = new JLabel();
        JLabel labelUsuario = new JLabel();
        JLabel labelContrasena = new JLabel();
        JLabel labelCorreo = new JLabel();
        JLabel labelEdad = new JLabel();
        JLabel labelDireccion = new JLabel();
        JLabel labelCodigoPostal = new JLabel();
        JLabel labelProvincia = new JLabel();
        JLabel labelNumeroTarjeta = new JLabel();
        JLabel labelFechaCaducidad = new JLabel();
        JLabel labelCcv = new JLabel();

        JTextField textNombres = new JTextField();
        JTextField textApellidos = new JTextField();
        JTextField textUsuario = new JTextField();
        JTextField textContrasena = new JTextField();
        JTextField textCorreo = new JTextField();
        JTextField textEdad = new JTextField();
        JTextField textDireccion = new JTextField();
        JTextField textCodigoPostal= new JTextField();
        JTextField textProvincia = new JTextField();
        JTextField textNumeroTarjeta = new JTextField();
        JTextField textFechaCaducidad = new JTextField();
        JTextField textCcv = new JTextField();

        JSeparator sptNombre = new JSeparator();
        JSeparator sptApellido = new JSeparator();
        JSeparator sptUsuario = new JSeparator();
        JSeparator sptContrasena = new JSeparator();
        JSeparator sptCorreo = new JSeparator();
        JSeparator sptEdad = new JSeparator();
        JSeparator sptDireccion = new JSeparator();
        JSeparator sptCodigoPostal = new JSeparator();
        JSeparator sptProvincia = new JSeparator();
        JSeparator sptNumeroTarjeta = new JSeparator();
        JSeparator sptFechaCaducidad = new JSeparator();
        JSeparator sptCVV = new JSeparator();

        JButton botonRegistrarse = new JButton();
        JButton botonAtras = new JButton();

//GESTOR DE CAPAS ----------------------------------------------------------------------------------------------------------------------------------

        // Localización
        gestorDeCapas.setBounds(0, 0, 800, 600);

        // Añadimos el gestor de capas al JFrameInicioSesión.
        frameRegistro.add(gestorDeCapas);

// FRAME REGISTRO -----------------------------------------------------------------------------------------------------------------------------

        // Título
        frameRegistro.setTitle("FunkyTown INC.");

        // Tamaño
        frameRegistro.setSize(800, 600);

        // Localización
        frameRegistro.setLocationRelativeTo(null);

        // Layout
        frameRegistro.setLayout(null);

        // Edición
        frameRegistro.setResizable(false);

// PANEL REGISTRO 1 ---------------------------------------------------------------------------------------------------------------------------

        // Tamaño
        panelRegistro.setSize(800, 600);

        // Localización
        panelRegistro.setLocation(0, 0);

        // Fondo
        panelRegistro.setBackground(new ColorUIResource(34, 34, 34));

        // Layout
        panelRegistro.setLayout(null);

        // Añadimos el panel al JLayeredPane.
        gestorDeCapas.add(panelRegistro, Integer.valueOf(0));

// REGISTRO DE DATOS -----------------------------------------------------------------------------------------------------------------------------

        //Etiqueta de nombre
        labelNombres.setText("Nombre:");
        labelNombres.setBounds(80, 50, 100, 20);
        labelNombres.setFont(new Font("Arial", Font.BOLD, 15));
        labelNombres.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelNombres);

        //Campo de texto de nombre
        textNombres.setBackground(new ColorUIResource(34, 34, 34));
        textNombres.setBounds(180, 50, 180, 15);
        textNombres.setFont(new Font("Arial", Font.PLAIN, 15));
        textNombres.setForeground(new Color(198, 198, 198));
        textNombres.setBorder(null);
        panelRegistro.add(textNombres);

        //Separador donde se escribira el nombre
        sptNombre.setBounds(180, 70, 180, 5);
        sptNombre.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptNombre);



        //Etiqueta de apellido
        labelApellidos.setText( "Apellido:");
        labelApellidos.setBounds(80, 100, 100, 20);
        labelApellidos.setFont(new Font("Arial", Font.BOLD, 15));
        labelApellidos.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelApellidos);

        //Campo de texto de apellido
        textApellidos.setBackground(new ColorUIResource(34, 34, 34));
        textApellidos.setBounds(180, 100, 180, 15);
        textApellidos.setFont(new Font("Arial", Font.PLAIN, 15));
        textApellidos.setForeground(new Color(198, 198, 198));
        textApellidos.setBorder(null);
        panelRegistro.add(textApellidos);

        //Separador donde se escribira el apellido
        sptApellido.setBounds(180, 120, 180, 5);
        sptApellido.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptApellido);



        //Etiqueta de usuario
        labelUsuario.setText("Usuario:");
        labelUsuario.setBounds(80, 150, 100, 20);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 15));
        labelUsuario.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelUsuario);

        //Campo de texto de usuario
        textUsuario.setBackground(new ColorUIResource(34, 34, 34));
        textUsuario.setBounds(180, 150, 180, 15);
        textUsuario.setFont(new Font("Arial", Font.PLAIN, 15));
        textUsuario.setForeground(new Color(198, 198, 198));
        textUsuario.setBorder(null);
        panelRegistro.add(textUsuario);

        //Separador donde se escribira el usuario
        sptUsuario.setBounds(180, 170, 180, 5);
        sptUsuario.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptUsuario);



        //Etiqueta de contraseña
        labelContrasena.setText("Contraseña:");
        labelContrasena.setBounds(80, 200, 100, 20);
        labelContrasena.setFont(new Font("Arial", Font.BOLD, 14));
        labelContrasena.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelContrasena);

        //Campo de texto de contraseña
        textContrasena.setBackground(new ColorUIResource(34, 34, 34));
        textContrasena.setBounds(180, 200, 180, 20);
        textContrasena.setFont(new Font("Arial", Font.PLAIN, 15));
        textContrasena.setForeground(new Color(198, 198, 198));
        textContrasena.setBorder(null);
        panelRegistro.add(textContrasena);

        //Separador donde se escribira la contraseña
        sptContrasena.setBounds(180, 220, 180, 5);
        sptContrasena.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptContrasena);



        //Etiqueta de correo
        labelCorreo.setText("Email:");
        labelCorreo.setBounds(80, 250, 100, 20);
        labelCorreo.setFont(new Font("Arial", Font.BOLD, 15));
        labelCorreo.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelCorreo);

        //Campo de texto de correo
        textCorreo.setBackground(new ColorUIResource(34, 34, 34));
        textCorreo.setBounds(180, 250, 180, 15);
        textCorreo.setFont(new Font("Arial", Font.PLAIN, 15));
        textCorreo.setForeground(new Color(198, 198, 198));
        textCorreo.setBorder(null);
        panelRegistro.add(textCorreo);

        //Separador donde se escribira el correo
        sptCorreo.setBounds(180, 270, 180, 5);
        sptCorreo.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptCorreo);



        //Etiqueta de fecha de nacimiento
        labelEdad.setText("Edad:");
        labelEdad.setBounds(80, 300, 200, 20);
        labelEdad.setFont(new Font("Arial", Font.BOLD, 15));
        labelEdad.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelEdad);

        //Campo de texto de fecha de nacimiento
        textEdad.setBackground(new ColorUIResource(34, 34, 34));
        textEdad.setBounds(180, 300, 100, 15);
        textEdad.setFont(new Font("Arial", Font.PLAIN, 15));
        textEdad.setForeground(new Color(198, 198, 198));
        textEdad.setBorder(null);
        panelRegistro.add(textEdad);

        //Separador donde se escribira la fecha de nacimiento
        sptEdad.setBounds(180, 320, 180, 5);
        sptEdad.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptEdad);



        //Etiqueta de direccion
        labelDireccion.setText("Direccion:");
        labelDireccion.setBounds(440, 50, 100, 20);
        labelDireccion.setFont(new Font("Arial", Font.BOLD, 15));
        labelDireccion.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelDireccion);

        //Campo de texto de direccion
        textDireccion.setBackground(new ColorUIResource(34, 34, 34));
        textDireccion.setBounds(540, 50, 180, 15);
        textDireccion.setFont(new Font("Arial", Font.PLAIN, 15));
        textDireccion.setForeground(new Color(198, 198, 198));
        textDireccion.setBorder(null);
        panelRegistro.add(textDireccion);

        //Separador donde se escribira la direccion
        sptDireccion.setBounds(540, 70, 180, 5);
        sptDireccion.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptDireccion);




        //Etiqueta provincia
        labelProvincia.setText("Provincia:");
        labelProvincia.setBounds(440, 100, 100, 20);
        labelProvincia.setFont(new Font("Arial", Font.BOLD, 15));
        labelProvincia.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelProvincia);

        //Campo de texto de provincia
        textProvincia.setBackground(new ColorUIResource(34, 34, 34));
        textProvincia.setBounds(540, 100, 180, 15);
        textProvincia.setFont(new Font("Arial", Font.PLAIN, 15));
        textProvincia.setForeground(new Color(198, 198, 198));
        textProvincia.setBorder(null);
        panelRegistro.add(textProvincia);

        //Separador donde se escribira la provincia
        sptProvincia.setBounds(540, 120, 180, 5);
        sptProvincia.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptProvincia);




        //Etiqueta codigo postal
        labelCodigoPostal.setText("Codigo Postal:");
        labelCodigoPostal.setBounds(440, 150, 180, 20);
        labelCodigoPostal.setFont(new Font("Arial", Font.BOLD, 15));
        labelCodigoPostal.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelCodigoPostal);

        //Campo de texto de codigo postal
        textCodigoPostal.setBackground(new ColorUIResource(34, 34, 34));
        textCodigoPostal.setBounds(570, 150, 150, 15);
        textCodigoPostal.setFont(new Font("Arial", Font.PLAIN, 15));
        textCodigoPostal.setForeground(new Color(198, 198, 198));
        textCodigoPostal.setBorder(null);
        panelRegistro.add(textCodigoPostal);

        //Separador donde se escribira el codigo postal
        sptCodigoPostal.setBounds(570, 170, 150, 5);
        sptCodigoPostal.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptCodigoPostal);




        //Etiqueta de número de tarjeta
        labelNumeroTarjeta.setText("Nº Tarjeta:");
        labelNumeroTarjeta.setBounds(440, 200, 100, 20);
        labelNumeroTarjeta.setFont(new Font("Arial", Font.BOLD, 15));
        labelNumeroTarjeta.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelNumeroTarjeta);

        //Campo de texto de numero de tarjeta
        textNumeroTarjeta.setBackground(new ColorUIResource(34, 34, 34));
        textNumeroTarjeta.setBounds(540, 200, 180, 15);
        textNumeroTarjeta.setFont(new Font("Arial", Font.PLAIN, 15));
        textNumeroTarjeta.setForeground(new Color(198, 198, 198));
        textNumeroTarjeta.setBorder(null);
        panelRegistro.add(textNumeroTarjeta);

        //Separador donde se escribira el numero de tarjeta
        sptNumeroTarjeta.setBounds(540, 220, 180, 5);
        sptNumeroTarjeta.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptNumeroTarjeta);




        //Etiqueta de fecha de caducidad de tarjeta
        labelFechaCaducidad.setText("MM/DD:");
        labelFechaCaducidad.setBounds(440, 250, 100, 20);
        labelFechaCaducidad.setFont(new Font("Arial", Font.BOLD, 15));
        labelFechaCaducidad.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelFechaCaducidad);

        //Campo de texto de fecha de caducidad de tarjeta
        textFechaCaducidad.setBackground(new ColorUIResource(34, 34, 34));
        textFechaCaducidad.setBounds(540, 250, 180, 15);
        textFechaCaducidad.setFont(new Font("Arial", Font.PLAIN, 15));
        textFechaCaducidad.setForeground(new Color(198, 198, 198));
        textFechaCaducidad.setBorder(null);
        panelRegistro.add(textFechaCaducidad);

        //Separador donde se escribira la fecha de caducidad de tarjeta
        sptFechaCaducidad.setBounds(540, 270, 180, 5);
        sptFechaCaducidad.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptFechaCaducidad);




        //Etiqueta de CVV
        labelCcv.setText("CVV:");
        labelCcv.setBounds(440, 300, 100, 20);
        labelCcv.setFont(new Font("Arial", Font.BOLD, 15));
        labelCcv.setForeground(new Color(246, 236, 201));
        panelRegistro.add(labelCcv);

        //Campo de texto de CVV
        textCcv.setBackground(new ColorUIResource(34, 34, 34));
        textCcv.setBounds(540, 300, 180, 15);
        textCcv.setFont(new Font("Arial", Font.PLAIN, 15));
        textCcv.setForeground(new Color(198, 198, 198));
        textCcv.setBorder(null);
        panelRegistro.add(textCcv);

        //Separador donde se escribira el CVV
        sptCVV.setBounds(540, 320, 180, 5);
        sptCVV.setBackground(new Color(246, 236, 201));
        panelRegistro.add(sptCVV);

// BOTÓN ATRÁS -------------------------------------------------------------------------------------------------------------------------------

        //Boton de registro
        botonAtras.setText("Atrás");
        botonAtras.setBounds(220, 400, 150, 40);
        botonAtras.setBackground(new Color(192, 57, 43));
        botonAtras.setForeground(new Color(253, 255, 241));
        botonAtras.setFocusPainted(false);
        botonAtras.setFont(new Font("Arial", Font.BOLD, 24));
        botonAtras.setBorder(null);
        panelRegistro.add(botonAtras);

// BOTÓN REGISTRO ----------------------------------------------------------------------------------------------------------------------------

        //Boton de registro
        botonRegistrarse.setText("Enviar datos");
        botonRegistrarse.setBounds(420, 400, 160, 40);
        botonRegistrarse.setBackground(new Color(192, 57, 43));
        botonRegistrarse.setForeground(new Color(253, 255, 241));
        botonRegistrarse.setFocusPainted(false);
        botonRegistrarse.setFont(new Font("Arial", Font.BOLD, 24));
        botonRegistrarse.setBorder(null);
        panelRegistro.add(botonRegistrarse);

// BOTÓN DE CONDICIÓN ------------------------------------------------------------------------------------------------------------------------

        //Condicion de uso
        JRadioButton condicion = new JRadioButton("Acepto terminos y condiciones.");
        condicion.setBounds(330, 500, 250, 20);
        condicion.setFont(new Font("Arial", Font.BOLD, 10));
        condicion.setForeground(new Color(124, 124, 122));
        condicion.setBackground(new Color(34, 34, 34));
        panelRegistro.add(condicion);

// INICIO DE REGISTRO ------------------------------------------------------------------------------------------------------------------------

        // Determinamos la visibilidad de la ventana y sus componentes
        frameRegistro.setVisible(true);
    }

}

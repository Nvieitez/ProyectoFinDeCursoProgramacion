package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro extends JFrame {

    public VentanaRegistro(){
        setSize(850,600);
        setResizable(false);
        setLocationRelativeTo(null);
        setUndecorated(true);
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        //Panel superior de minimizar y cerrar
        JPanel panelSup = new JPanel();
        panelSup.setLayout(null);
        panelSup.setBounds(0,0,850,40);
        panelSup.setBackground(new Color(10, 10, 10));
        add(panelSup);

        //Boton de cerrar
        JButton botonCerrar = new JButton("X");
        botonCerrar.setBounds(800,0,40,40);
        botonCerrar.setBackground(new Color(10, 10, 10));
        botonCerrar.setForeground(new Color(192, 57, 43));
        botonCerrar.setFocusPainted(false);
        botonCerrar.setFont(new Font("Arial", Font.BOLD, 20));
        botonCerrar.setBorder(null);
        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dialog = JOptionPane.YES_NO_OPTION;
                int result = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?","Salir",dialog);
                if(result==0){
                    dispose();
                }
            }
        });
        panelSup.add(botonCerrar);

        //Boton de minimizar
        JButton botonMinimizar = new JButton("-");
        botonMinimizar.setBounds(760,0,40,40);
        botonMinimizar.setBackground(new Color(10, 10, 10));
        botonMinimizar.setForeground(new Color(192, 57, 43));
        botonMinimizar.setFocusPainted(false);
        botonMinimizar.setFont(new Font("Arial", Font.BOLD, 20));
        botonMinimizar.setBorder(null);
        botonMinimizar.addActionListener(e -> setExtendedState(ICONIFIED));
        panelSup.add(botonMinimizar);

        //Etiqueta de imagen de icono
        JLabel icon = new JLabel();
        icon.setBounds(10,0,32,32);
        setImagenLabel(icon, "src/Imagenes/disco.png");
        panelSup.add(icon);

        //Panel total de registro
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(200,40,850,560);
        panel.setBackground(new Color(15, 15, 15));
        add(panel);

        //Etiqueta titulo
        JLabel titulo = new JLabel("Rellena tus datos");
        titulo.setBounds(330, 40, 250, 40);
        titulo.setFont(new Font("Arial", Font.BOLD, 25));
        titulo.setForeground(new Color(191, 24, 24));
        panel.add(titulo);

        //Etiqueta de nombre
        JLabel etqNombre = new JLabel("Nombre:");
        etqNombre.setBounds(100, 100, 100, 20);
        etqNombre.setFont(new Font("Arial", Font.BOLD, 15));
        etqNombre.setForeground(new Color(246, 236, 201));
        panel.add(etqNombre);

        //Campo de texto de nombre
        JTextField campoNombre = new JTextField();
        campoNombre.setBackground(new Color(15, 15, 15));
        campoNombre.setBounds(200, 100, 180, 15);
        campoNombre.setFont(new Font("Arial", Font.PLAIN, 15));
        campoNombre.setForeground(new Color(198, 198, 198));
        campoNombre.setBorder(null);
        panel.add(campoNombre);

        //Separador donde se escribira el nombre
        JSeparator sptNombre = new JSeparator();
        sptNombre.setBounds(200, 120, 180, 5);
        sptNombre.setBackground(new Color(246, 236, 201));
        panel.add(sptNombre);

        //Etiqueta de apellido
        JLabel etqApellido = new JLabel("Apellido:");
        etqApellido.setBounds(100, 150, 100, 20);
        etqApellido.setFont(new Font("Arial", Font.BOLD, 15));
        etqApellido.setForeground(new Color(246, 236, 201));
        panel.add(etqApellido);

        //Campo de texto de apellido
        JTextField campoApellido = new JTextField();
        campoApellido.setBackground(new Color(15, 15, 15));
        campoApellido.setBounds(200, 150, 180, 15);
        campoApellido.setFont(new Font("Arial", Font.PLAIN, 15));
        campoApellido.setForeground(new Color(198, 198, 198));
        campoApellido.setBorder(null);
        panel.add(campoApellido);

        //Separador donde se escribira el apellido
        JSeparator sptApellido = new JSeparator();
        sptApellido.setBounds(200, 170, 180, 5);
        sptApellido.setBackground(new Color(246, 236, 201));
        panel.add(sptApellido);

        //Etiqueta de usuario
        JLabel etqUsuario = new JLabel("Usuario:");
        etqUsuario.setBounds(100, 200, 100, 20);
        etqUsuario.setFont(new Font("Arial", Font.BOLD, 15));
        etqUsuario.setForeground(new Color(246, 236, 201));
        panel.add(etqUsuario);

        //Campo de texto de usuario
        JTextField campoUsuario = new JTextField();
        campoUsuario.setBackground(new Color(15, 15, 15));
        campoUsuario.setBounds(200, 200, 180, 15);
        campoUsuario.setFont(new Font("Arial", Font.PLAIN, 15));
        campoUsuario.setForeground(new Color(198, 198, 198));
        campoUsuario.setBorder(null);
        panel.add(campoUsuario);

        //Separador donde se escribira el usuario
        JSeparator sptUsuario = new JSeparator();
        sptUsuario.setBounds(200, 220, 180, 5);
        sptUsuario.setBackground(new Color(246, 236, 201));
        panel.add(sptUsuario);

        //Etiqueta de contraseña
        JLabel etqContrasena = new JLabel("Contraseña:");
        etqContrasena.setBounds(100, 250, 100, 20);
        etqContrasena.setFont(new Font("Arial", Font.BOLD, 14));
        etqContrasena.setForeground(new Color(246, 236, 201));
        panel.add(etqContrasena);

        //Campo de texto de contraseña
        JTextField campoContrasena = new JTextField();
        campoContrasena.setBackground(new Color(15, 15, 15));
        campoContrasena.setBounds(200, 250, 180, 20);
        campoContrasena.setFont(new Font("Arial", Font.PLAIN, 15));
        campoContrasena.setForeground(new Color(198, 198, 198));
        campoContrasena.setBorder(null);
        panel.add(campoContrasena);

        //Separador donde se escribira la contraseña
        JSeparator sptContrasena = new JSeparator();
        sptContrasena.setBounds(200, 270, 180, 5);
        sptContrasena.setBackground(new Color(246, 236, 201));
        panel.add(sptContrasena);

        //Etiqueta de correo
        JLabel etqCorreo = new JLabel("Email:");
        etqCorreo.setBounds(100, 300, 100, 20);
        etqCorreo.setFont(new Font("Arial", Font.BOLD, 15));
        etqCorreo.setForeground(new Color(246, 236, 201));
        panel.add(etqCorreo);

        //Campo de texto de correo
        JTextField campoCorreo = new JTextField();
        campoCorreo.setBackground(new Color(15, 15, 15));
        campoCorreo.setBounds(200, 300, 180, 15);
        campoCorreo.setFont(new Font("Arial", Font.PLAIN, 15));
        campoCorreo.setForeground(new Color(198, 198, 198));
        campoCorreo.setBorder(null);
        panel.add(campoCorreo);

        //Separador donde se escribira el correo
        JSeparator sptCorreo = new JSeparator();
        sptCorreo.setBounds(200, 320, 180, 5);
        sptCorreo.setBackground(new Color(246, 236, 201));
        panel.add(sptCorreo);

        //Etiqueta de fecha de nacimiento
        JLabel etqFechaNacimiento = new JLabel("Fecha de Nacimiento:");
        etqFechaNacimiento.setBounds(100, 350, 200, 20);
        etqFechaNacimiento.setFont(new Font("Arial", Font.BOLD, 15));
        etqFechaNacimiento.setForeground(new Color(246, 236, 201));
        panel.add(etqFechaNacimiento);

        //Campo de texto de fecha de nacimiento
        JTextField campoFechaNacimiento = new JTextField();
        campoFechaNacimiento.setBackground(new Color(15, 15, 15));
        campoFechaNacimiento.setBounds(280, 350, 100, 15);
        campoFechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 15));
        campoFechaNacimiento.setForeground(new Color(198, 198, 198));
        campoFechaNacimiento.setBorder(null);
        panel.add(campoFechaNacimiento);

        //Separador donde se escribira la fecha de nacimiento
        JSeparator sptFechaNacimiento = new JSeparator();
        sptFechaNacimiento.setBounds(280, 370, 100, 5);
        sptFechaNacimiento.setBackground(new Color(246, 236, 201));
        panel.add(sptFechaNacimiento);

        //Etiqueta de direccion
        JLabel etqDireccion = new JLabel("Direccion:");
        etqDireccion.setBounds(480, 100, 100, 20);
        etqDireccion.setFont(new Font("Arial", Font.BOLD, 15));
        etqDireccion.setForeground(new Color(246, 236, 201));
        panel.add(etqDireccion);

        //Campo de texto de direccion
        JTextField campoDireccion = new JTextField();
        campoDireccion.setBackground(new Color(15, 15, 15));
        campoDireccion.setBounds(580, 100, 180, 15);
        campoDireccion.setFont(new Font("Arial", Font.PLAIN, 15));
        campoDireccion.setForeground(new Color(198, 198, 198));
        campoDireccion.setBorder(null);
        panel.add(campoDireccion);

        //Separador donde se escribira la direccion
        JSeparator sptDireccion = new JSeparator();
        sptDireccion.setBounds(580, 120, 180, 5);
        sptDireccion.setBackground(new Color(246, 236, 201));
        panel.add(sptDireccion);

        //Etiqueta provincia
        JLabel etqProvincia = new JLabel("Provincia:");
        etqProvincia.setBounds(480, 150, 100, 20);
        etqProvincia.setFont(new Font("Arial", Font.BOLD, 15));
        etqProvincia.setForeground(new Color(246, 236, 201));
        panel.add(etqProvincia);

        //Campo de texto de provincia
        JTextField campoProvincia = new JTextField();
        campoProvincia.setBackground(new Color(15, 15, 15));
        campoProvincia.setBounds(580, 150, 180, 15);
        campoProvincia.setFont(new Font("Arial", Font.PLAIN, 15));
        campoProvincia.setForeground(new Color(198, 198, 198));
        campoProvincia.setBorder(null);
        panel.add(campoProvincia);

        //Separador donde se escribira la provincia
        JSeparator sptProvincia = new JSeparator();
        sptProvincia.setBounds(580, 170, 180, 5);
        sptProvincia.setBackground(new Color(246, 236, 201));
        panel.add(sptProvincia);

        //Etiqueta codigo postal
        JLabel etqCodigoPostal = new JLabel("Codigo Postal:");
        etqCodigoPostal.setBounds(480, 200, 180, 20);
        etqCodigoPostal.setFont(new Font("Arial", Font.BOLD, 15));
        etqCodigoPostal.setForeground(new Color(246, 236, 201));
        panel.add(etqCodigoPostal);

        //Campo de texto de codigo postal
        JTextField campoCodigoPostal = new JTextField();
        campoCodigoPostal.setBackground(new Color(15, 15, 15));
        campoCodigoPostal.setBounds(610, 200, 150, 15);
        campoCodigoPostal.setFont(new Font("Arial", Font.PLAIN, 15));
        campoCodigoPostal.setForeground(new Color(198, 198, 198));
        campoCodigoPostal.setBorder(null);
        panel.add(campoCodigoPostal);

        //Separador donde se escribira el codigo postal
        JSeparator sptCodigoPostal = new JSeparator();
        sptCodigoPostal.setBounds(610, 220, 150, 5);
        sptCodigoPostal.setBackground(new Color(246, 236, 201));
        panel.add(sptCodigoPostal);

        //Etiqueta de número de tarjeta
        JLabel etqNumeroTarjeta = new JLabel("Nº Tarjeta:");
        etqNumeroTarjeta.setBounds(480, 250, 100, 20);
        etqNumeroTarjeta.setFont(new Font("Arial", Font.BOLD, 15));
        etqNumeroTarjeta.setForeground(new Color(246, 236, 201));
        panel.add(etqNumeroTarjeta);

        //Campo de texto de numero de tarjeta
        JTextField campoNumeroTarjeta = new JTextField();
        campoNumeroTarjeta.setBackground(new Color(15, 15, 15));
        campoNumeroTarjeta.setBounds(580, 250, 180, 15);
        campoNumeroTarjeta.setFont(new Font("Arial", Font.PLAIN, 15));
        campoNumeroTarjeta.setForeground(new Color(198, 198, 198));
        campoNumeroTarjeta.setBorder(null);
        panel.add(campoNumeroTarjeta);

        //Separador donde se escribira el numero de tarjeta
        JSeparator sptNumeroTarjeta = new JSeparator();
        sptNumeroTarjeta.setBounds(580, 270, 180, 5);
        sptNumeroTarjeta.setBackground(new Color(246, 236, 201));
        panel.add(sptNumeroTarjeta);

        //Etiqueta de fecha de caducidad de tarjeta
        JLabel etqFechaCaducidad = new JLabel("MM/DD:");
        etqFechaCaducidad.setBounds(480, 300, 100, 20);
        etqFechaCaducidad.setFont(new Font("Arial", Font.BOLD, 15));
        etqFechaCaducidad.setForeground(new Color(246, 236, 201));
        panel.add(etqFechaCaducidad);

        //Campo de texto de fecha de caducidad de tarjeta
        JTextField campoFechaCaducidad = new JTextField();
        campoFechaCaducidad.setBackground(new Color(15, 15, 15));
        campoFechaCaducidad.setBounds(580, 300, 180, 15);
        campoFechaCaducidad.setFont(new Font("Arial", Font.PLAIN, 15));
        campoFechaCaducidad.setForeground(new Color(198, 198, 198));
        campoFechaCaducidad.setBorder(null);
        panel.add(campoFechaCaducidad);

        //Separador donde se escribira la fecha de caducidad de tarjeta
        JSeparator sptFechaCaducidad = new JSeparator();
        sptFechaCaducidad.setBounds(580, 320, 180, 5);
        sptFechaCaducidad.setBackground(new Color(246, 236, 201));
        panel.add(sptFechaCaducidad);

        //Etiqueta de CVV
        JLabel etqCVV = new JLabel("CVV:");
        etqCVV.setBounds(480, 350, 100, 20);
        etqCVV.setFont(new Font("Arial", Font.BOLD, 15));
        etqCVV.setForeground(new Color(246, 236, 201));
        panel.add(etqCVV);

        //Campo de texto de CVV
        JTextField campoCVV = new JTextField();
        campoCVV.setBackground(new Color(15, 15, 15));
        campoCVV.setBounds(580, 350, 180, 15);
        campoCVV.setFont(new Font("Arial", Font.PLAIN, 15));
        campoCVV.setForeground(new Color(198, 198, 198));
        campoCVV.setBorder(null);
        panel.add(campoCVV);

        //Separador donde se escribira el CVV
        JSeparator sptCVV = new JSeparator();
        sptCVV.setBounds(580, 370, 180, 5);
        sptCVV.setBackground(new Color(246, 236, 201));
        panel.add(sptCVV);

        //Boton de registro
        JButton botonRegistro = new JButton("Enviar datos");
        botonRegistro.setBounds(340, 450, 160, 30);
        botonRegistro.setBackground(new Color(192, 57, 43));
        botonRegistro.setForeground(new Color(253, 255, 241));
        botonRegistro.setFocusPainted(false);
        botonRegistro.setFont(new Font("Arial", Font.BOLD, 20));
        botonRegistro.setBorder(null);
        panel.add(botonRegistro);

        //Condicion de uso
        JRadioButton condicion = new JRadioButton("Acepto terminos y condiciones.");
        condicion.setBounds(330, 500, 250, 20);
        condicion.setFont(new Font("Arial", Font.BOLD, 10));
        condicion.setForeground(new Color(124, 124, 122));
        condicion.setBackground(new Color(15, 15, 15));
        panel.add(condicion);

    }

    public void setImagenLabel(JLabel label, String ruta){
        ImageIcon icono = new ImageIcon(ruta);
        label.setIcon(new ImageIcon(icono.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH)));
        label.setIcon(icono);
        this.repaint();
    }

}

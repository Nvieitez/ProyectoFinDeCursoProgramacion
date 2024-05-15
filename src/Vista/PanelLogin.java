package Vista;

import javax.swing.*;
import java.awt.*;

public class PanelLogin extends JPanel {
    public PanelLogin(){
        setLayout(null);
        setVisible(true);
        setBounds(200,90,650,520);
        setBackground(new Color(15, 15, 15));
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        //Etiqueta de usuario
        JLabel usuario = new JLabel("Usuario");
        usuario.setBounds(80, 100, 150, 40);
        usuario.setFont(new Font("Arial", Font.BOLD, 20));
        usuario.setForeground(new Color(246, 236, 201));
        add(usuario);

        //Campo de texto de usuario
        JTextField campoUsuario = new JTextField();
        campoUsuario.setBackground(new Color(15, 15, 15));
        campoUsuario.setBounds(130, 150, 200, 30);
        campoUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
        campoUsuario.setForeground(new Color(198, 198, 198));
        campoUsuario.setBorder(null);
        add(campoUsuario);

        //Separador donde se escribira el usuario
        JSeparator sptUsuario = new JSeparator();
        sptUsuario.setBounds(130, 190, 200, 10);
        sptUsuario.setBackground(new Color(246, 236, 201));
        add(sptUsuario);

        //Etiqueta de contraseña
        JLabel contrasena = new JLabel("Contraseña");
        contrasena.setBounds(80, 210, 150, 40);
        contrasena.setFont(new Font("Arial", Font.BOLD, 20));
        contrasena.setForeground(new Color(246, 236, 201));
        add(contrasena);

        //Campo de texto de contraseña
        JPasswordField campoContrasena = new JPasswordField();
        campoContrasena.setBackground(new Color(15, 15, 15));
        campoContrasena.setBounds(130, 260, 200, 30);
        campoContrasena.setFont(new Font("Arial", Font.PLAIN, 20));
        campoContrasena.setForeground(new Color(198, 198, 198));
        campoContrasena.setBorder(null);
        add(campoContrasena);

        //Separador donde se escribira la contraseña
        JSeparator sptContrasena = new JSeparator();
        sptContrasena.setBounds(130, 290, 200, 10);
        sptContrasena.setBackground(new Color(246, 236, 201));
        add(sptContrasena);

        //Boton de login
        JButton botonLogin = new JButton("Entrar");
        botonLogin.setBounds(70, 350, 100, 30);
        botonLogin.setBackground(new Color(192, 57, 43));
        botonLogin.setForeground(new Color(253, 255, 241));
        botonLogin.setFocusPainted(false);
        botonLogin.setFont(new Font("Arial", Font.BOLD, 20));
        botonLogin.setBorder(null);
        add(botonLogin);

        //Boton de Registro
        JButton botonRegistro = new JButton("Registrate");
        botonRegistro.setBounds(210,350,120,30);
        botonRegistro.setBackground(new Color(192, 57, 43));
        botonRegistro.setForeground(new Color(253, 255, 241));
        botonRegistro.setFocusPainted(false);
        botonRegistro.setFont(new Font("Arial", Font.BOLD, 20));
        botonRegistro.setBorder(null);
        add(botonRegistro);
        botonRegistro.addActionListener(e -> {
            VentanaRegistro panelRegistro = new VentanaRegistro();
            panelRegistro.setVisible(true);
        });

        //Etiqueta de Advertencia
        JLabel advertencia = new JLabel("* Debes registrarte primero para comprar en la app");
        advertencia.setBounds(70, 400, 400, 40);
        advertencia.setFont(new Font("Arial", Font.BOLD, 10));
        add(advertencia);

        //Etiqueta de imagen
        JLabel imagen = new JLabel();
        imagen.setBounds(390,20,293,520);
        setImagenLabel(imagen, "src/Imagenes/imagenLogin_1.png");
        add(imagen);

        //Etiqueta de imagen de icono user
        JLabel iconUser = new JLabel();
        iconUser.setBounds(80,150,32,32);
        setImagenLabel(iconUser, "src/Imagenes/avatar.png");
        add(iconUser);

        //Etiqueta de imagen de icono candado
        JLabel iconCandado = new JLabel();
        iconCandado.setBounds(80,260,32,32);
        setImagenLabel(iconCandado, "src/Imagenes/candado.png");
        add(iconCandado);
    }

    public void setImagenLabel(JLabel label, String ruta){
        ImageIcon icono = new ImageIcon(ruta);
        label.setIcon(new ImageIcon(icono.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH)));
        label.setIcon(icono);
        this.repaint();
    }
}

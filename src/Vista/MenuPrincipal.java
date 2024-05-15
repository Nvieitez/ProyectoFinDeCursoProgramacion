
package Vista;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Susana Santos, Nicolas Veitez
 */
public class MenuPrincipal extends JFrame {
    private JPanel panelTotal;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public MenuPrincipal(){
        setSize(850,600);
        setTitle("Menu Principal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(true);
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        //Panel total
        panelTotal = new JPanel();
        panelTotal.setLayout(null);
        panelTotal.setBounds(0,0,850,600);
        panelTotal.setBackground(new Color(5, 5, 5));

        //Panel1 es el panel superior donde se cierra y minimiza la ventana
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0,0,850,40);
        panel1.setBackground(new Color(10, 10, 10));

        //Panel4 es el segundo panel superior con botones inicio de sesión y lista de compra
        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBackground(new Color(15, 15, 15));
        panel4.setBounds(200,38,850,50);

        //Panel2 es el panel izquierdo donde se encuentran los botones de las opciones
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0,40,198,560);
        panel2.setBackground(new Color(15, 15, 15));

        //Panel3 es el panel derecho donde se encuentran los paneles con contenido de las opciones
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(200,90,650,520);
        panel3.setBackground(new Color(15, 15, 15));

        //Separador de paneles vertical
        JSeparator sprVertical = new JSeparator();
        sprVertical.setOrientation(SwingConstants.VERTICAL);
        sprVertical.setBounds(200,40,5,560);
        sprVertical.setBackground(new Color(39, 38, 38));
        panel2.add(sprVertical);

        //Separador de paneles horizontal
        JSeparator sprHorizontal = new JSeparator();
        sprHorizontal.setOrientation(SwingConstants.HORIZONTAL);
        sprHorizontal.setBounds(200,80,850,5);
        sprHorizontal.setBackground(new Color(39, 38, 38));
        panel4.add(sprHorizontal);

        //Etiqueta de imagen de icono
        JLabel icon = new JLabel();
        icon.setBounds(10,0,32,32);
        setImagenLabel(icon, "src/Imagenes/disco.png");

        //Etiqueta de imagen de logo
        JLabel logo = new JLabel();
        logo.setBounds(2,0,196,200);
        setImagenLabel(logo, "src/Imagenes/vinilLogo1_1.png");

        //Etiqueta imgen de canasta
        JLabel imgCanasta = new JLabel();
        imgCanasta.setBounds(600,5,32,32);
        setImagenLabel(imgCanasta,"src/Imagenes/verificar.png");
        //panel4.add(imgCanasta);

        //Boton de cerrar
        JButton botonCerrar = new JButton("X");
        botonCerrar.setBounds(800,0,40,40);
        botonCerrar.setBackground(new Color(10, 10, 10));
        botonCerrar.setForeground(new Color(192, 57, 43));
        botonCerrar.setFocusPainted(false);
        botonCerrar.setFont(new Font("Arial", Font.BOLD, 20));
        botonCerrar.setBorder(null);
        botonCerrar.addActionListener(e -> System.exit(0));

        //Boton de minimizar
        JButton botonMinimizar = new JButton("-");
        botonMinimizar.setBounds(760,0,40,40);
        botonMinimizar.setBackground(new Color(10, 10, 10));
        botonMinimizar.setForeground(new Color(192, 57, 43));
        botonMinimizar.setFocusPainted(false);
        botonMinimizar.setFont(new Font("Arial", Font.BOLD, 20));
        botonMinimizar.setBorder(null);
        botonMinimizar.addActionListener(e -> setExtendedState(ICONIFIED));

        //Boton de Inicio De Sesion
        JButton botonInicioSesion = new JButton("Inicia Sesion");
        botonInicioSesion.setBounds(50,5,280,35);
        botonInicioSesion.setBackground(new Color(15, 15, 15));
        botonInicioSesion.setForeground(new Color(192, 57, 43));
        botonInicioSesion.setFocusPainted(false);
        botonInicioSesion.setFont(new Font("Arial", Font.BOLD, 20));
        botonInicioSesion.setBorder(null);
        botonInicioSesion.addActionListener(e -> {
            PanelLogin panelLogin = new PanelLogin();
            panel3.removeAll();
            panelTotal.add(panelLogin);
            panelLogin.repaint();
        });

        //Boton de Canasta
        JButton botonCanasta = new JButton("Lista de Compras");
        botonCanasta.setBounds(350,5,250,35);
        botonCanasta.setBackground(new Color(15, 15, 15));
        botonCanasta.setForeground(new Color(192, 57, 43));
        botonCanasta.setFocusPainted(false);
        botonCanasta.setFont(new Font("Arial", Font.BOLD, 20));
        botonCanasta.setBorder(null);
        botonCanasta.addActionListener(e -> {
            PanelListaDeCompras panelListaDeCompras = new PanelListaDeCompras();
            panel3.removeAll();
            panelTotal.add(panelListaDeCompras);
            panelListaDeCompras.repaint();
        });

        //Boton de Bienvenida
        JButton botonInicio = new JButton("Inicio");
        botonInicio.setBounds(2,280,196,40);
        botonInicio.setBackground(new Color(15, 15, 15));
        botonInicio.setForeground(new Color(192, 57, 43));
        botonInicio.setFocusPainted(false);
        botonInicio.setFont(new Font("Arial", Font.BOLD, 20));
        botonInicio.setBorder(null);
        botonInicio.addActionListener(e -> {
            MenuPrincipal menuPrincipal = new MenuPrincipal();

            if(menuPrincipal.panel3 != panelTotal.add(panel3)){
                panel3.removeAll();
            } else{
                menuPrincipal.panel3.repaint();
            }
        });

        //Boton de Musicos
        JButton botonMusicos = new JButton("Artistas");
        botonMusicos.setBounds(2,330,196,40);
        botonMusicos.setBackground(new Color(15, 15, 15));
        botonMusicos.setForeground(new Color(192, 57, 43));
        botonMusicos.setFocusPainted(false);
        botonMusicos.setFont(new Font("Arial", Font.BOLD, 20));
        botonMusicos.setBorder(null);
        botonMusicos.addActionListener(e -> {
            PanelMusicos interprete = new PanelMusicos();
            panel3.removeAll();
            panelTotal.add(interprete);
            interprete.repaint();
        });

        //Boton de Albumes
        JButton botonAlbumes = new JButton("Albumnes");
        botonAlbumes.setBounds(2,380,196,40);
        botonAlbumes.setBackground(new Color(15, 15, 15));
        botonAlbumes.setForeground(new Color(192, 57, 43));
        botonAlbumes.setFocusPainted(false);
        botonAlbumes.setFont(new Font("Arial", Font.BOLD, 20));
        botonAlbumes.setBorder(null);
        botonAlbumes.addActionListener(e -> {
            PanelAlbumnes panelAlbumnes = new PanelAlbumnes();
            panel3.removeAll();
            panelTotal.add(panelAlbumnes);
            panelAlbumnes.repaint();
        });

        //Boton de Canciones
        JButton botonCanciones = new JButton("Canciones");
        botonCanciones.setBounds(2,430,196,40);
        botonCanciones.setBackground(new Color(15, 15, 15));
        botonCanciones.setForeground(new Color(192, 57, 43));
        botonCanciones.setFocusPainted(false);
        botonCanciones.setFont(new Font("Arial", Font.BOLD, 20));
        botonCanciones.setBorder(null);
        botonCanciones.addActionListener(e -> {
            PanelCanciones panelCanciones = new PanelCanciones();
            panel3.removeAll();
            panelTotal.add(panelCanciones);
            panelCanciones.repaint();
        });

        //Texto Titulo
        JLabel titulo = new JLabel("¡ Bienvenido a FunkyTown Inc. !");
        titulo.setBounds(100,50,500,30);
        titulo.setForeground(new Color(230, 222, 188));
        titulo.setFont(new Font("Roboto Medium", Font.BOLD, 28));
        panel3.add(titulo);

        //Texto subtitulo
        JLabel subtitulo = new JLabel("Donde el Funk tiene un hogar");
        subtitulo.setBounds(140,100,400,30);
        subtitulo.setForeground(new Color(225, 121, 55));
        subtitulo.setFont(new Font("Roboto Medium", Font.BOLD, 22));
        panel3.add(subtitulo);

        //Texto de introducción
        JTextArea texto = new JTextArea();
        texto.setBounds(100,180,420,250);
        texto.setText("    Aquí podrás comprar todo tipo de vinilos de los más famosos \n" +
                "   artistas de todos los tiempos, desde el pop de Michael Jackson\n" +
                "  \t hasta el metal de MegaDeth. \n" +
                "\n" +
                "    Tenemos los mejores precios de todo el universo conocido,\n" +
                "   para que todos puedan seguir disfrutando del sonido de las \n" +
                "       generaciones pasadas y sintonizar con frecuencias no \n" +
                "  \t                conocidas antes.\n" +
                "\n" +
                "   Piérdete en el sonido de los hermosos años 20, el swing de los\n" +
                "       50, el funk de los 80, y el disco de los 90, todo listo y \n" +
                "   \t              preparado para tí.\n" +
                "\n" +
                "  \t                    ¡Disfruta!");
        texto.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        texto.setEnabled(false);
        texto.setBackground(new Color(15, 15, 15));
        texto.setForeground(new Color(230, 222, 188));
        panel3.add(texto);

        panel1.add(botonCerrar);
        panel1.add(botonMinimizar);
        panel1.add(icon);
        panel2.add(logo);
        panel2.add(botonInicio);
        panel2.add(botonMusicos);
        panel2.add(botonAlbumes);
        panel2.add(botonCanciones);
        panel4.add(botonInicioSesion);
        panel4.add(botonCanasta);
        panelTotal.add(panel1);
        panelTotal.add(panel2);
        panelTotal.add(panel3);
        panelTotal.add(panel4);
        add(panelTotal);
    }

    public void setImagenLabel(JLabel label, String ruta){
        ImageIcon icono = new ImageIcon(ruta);
        label.setIcon(new ImageIcon(icono.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH)));
        label.setIcon(icono);
        this.repaint();
    }
}

package Vista;

import javax.swing.*;
import java.awt.*;

public class PanelAlbumnes extends JPanel {

    public PanelAlbumnes(){
        setLayout(null);
        setBounds(200,90,650,520);
        setBackground(new java.awt.Color(15, 15, 15));
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        //Buscador de Album por nombre
        JTextField buscadorDisco = new JTextField("Escribe el disco de tu artista favorito...");
        buscadorDisco.setBounds(110, 20, 400, 35);
        buscadorDisco.setFont(new Font("Arial", Font.ITALIC, 15));
        buscadorDisco.setForeground(new Color(113, 111, 111));
        buscadorDisco.setBackground(new Color(25, 25, 25));
        buscadorDisco.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        add(buscadorDisco);

        //Botón de buscar
        JButton buscar = new JButton();
        buscar.setBounds(520, 20, 32, 32);
        buscar.setBackground(new Color(15, 15, 15));
        buscar.setBorder(null);
        setImagenBoton(buscar, "src/Imagenes/lupa.png");
        add(buscar);

        //Etiquetas con función de botones sobre los músicos
        //Album de Michael Jackson
        JLabel thriller = new JLabel();
        thriller.setBounds(40, 100, 150, 150);
        setImagenLabel(thriller, "src/Imagenes/thrillerMJ.png");
        thriller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Thriller");
            }
        });
        add(thriller);

        //Queen
        JLabel queen = new JLabel();
        queen.setBounds(240, 150, 150, 150);
        setImagenLabel(queen, "src/Imagenes/anato" +
                ".png");
        queen.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        queen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("queen");
            }
        });
        add(queen);

        //Ed Sheeran
        JLabel ed = new JLabel();
        ed.setBounds(440, 200, 150, 150);
        setImagenLabel(ed, "src/Imagenes/Divide.png");
        ed.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        ed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Ed Sheeran");
            }
        });
        add(ed);


        //Text de los datos de los albumnes
        JTextArea txtThriller = new JTextArea("           Thriller"+ "\n             1982 ");
        txtThriller.setBounds(40, 280, 150, 50);
        txtThriller.setFont(new Font("Arial", Font.BOLD, 14));
        txtThriller.setForeground(new Color(246, 236, 201));
        txtThriller.setBackground(new Color(15, 15, 15));
        txtThriller.setEnabled(false);
        add(txtThriller);

        JTextArea txtANatO = new JTextArea("A night at the opera"+"\n              1975");
        txtANatO.setBounds(250, 330, 250, 50);
        txtANatO.setFont(new Font("Arial", Font.BOLD, 14));
        txtANatO.setForeground(new Color(246, 236, 201));
        txtANatO.setEnabled(false);
        txtANatO.setBackground(new Color(15, 15, 15));
        add(txtANatO);

        JTextArea txtDivide = new JTextArea("Divide"+"\n  2017");
        txtDivide.setBounds(490, 380, 50, 50);
        txtDivide.setFont(new Font("Arial", Font.BOLD, 14));
        txtDivide.setForeground(new Color(246, 236, 201));
        txtDivide.setEnabled(false);
        txtDivide.setBackground(new Color(15, 15, 15));
        add(txtDivide);

    }

    public void setImagenLabel(JLabel label, String ruta){
        ImageIcon icono = new ImageIcon(ruta);
        label.setIcon(new ImageIcon(icono.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH)));
        label.setIcon(icono);
        this.repaint();
    }

    public void setImagenBoton(JButton boton, String ruta){
        ImageIcon icono = new ImageIcon(ruta);
        boton.setIcon(new ImageIcon(icono.getImage().getScaledInstance(boton.getWidth(),boton.getHeight(),Image.SCALE_SMOOTH)));
        boton.setIcon(icono);
        this.repaint();
    }

}

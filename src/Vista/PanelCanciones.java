package Vista;

import javax.swing.*;
import java.awt.*;

public class PanelCanciones extends JPanel {

    public PanelCanciones(){
        setLayout(null);
        setVisible(true);
        setBounds(200,90,650,520);
        setBackground(new Color(15, 15, 15));
        iniciarComponentes();
    }

    public void iniciarComponentes(){

            //Buscador de canciones por nombre
            JTextField buscador = new JTextField("Escribe tu canción favorita...");
            buscador.setBounds(110, 20, 400, 35);
            buscador.setFont(new Font("Arial", Font.ITALIC, 15));
            buscador.setForeground(new Color(113, 111, 111));
            buscador.setBackground(new Color(25, 25, 25));
            buscador.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            add(buscador);

            //Botón de buscar
            JButton buscar = new JButton();
            buscar.setBounds(520, 20, 32, 32);
            buscar.setBackground(new Color(15, 15, 15));
            buscar.setBorder(null);
            setImagenBoton(buscar, "src/Imagenes/lupa.png");
            add(buscar);


            //Etiquetas con función de botones sobre las canciones

            //Album de Michael Jackson
            JLabel etqThriller = new JLabel();
            etqThriller.setBounds(40, 120, 150, 150);
            setImagenLabel(etqThriller, "src/Imagenes/thrillerMJ.png");
            etqThriller.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    System.out.println("Thriller");
                }
            });
            add(etqThriller);

            //Queen
            JLabel queen = new JLabel();
            queen.setBounds(240, 120, 150, 150);
            setImagenLabel(queen, "src/Imagenes/anato.png");
            queen.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            queen.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    System.out.println("queen");
                }
            });
            add(queen);

            //Ed Sheeran
            JLabel ed = new JLabel();
            ed.setBounds(440, 120, 150, 150);
            setImagenLabel(ed, "src/Imagenes/Divide.png");
            ed.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            ed.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    System.out.println("Ed Sheeran");
                }
            });
            add(ed);


            //Botones play
            JButton play1 = new JButton();
            play1.setBounds(100, 300, 32, 32);
            play1.setBackground(new Color(15, 15, 15));
            play1.setBorder(null);
            setImagenBoton(play1, "src/Imagenes/tocar.png");
            add(play1);

            JButton play2 = new JButton();
            play2.setBounds(300, 300, 32, 32);
            play2.setBackground(new Color(15, 15, 15));
            play2.setBorder(null);
            setImagenBoton(play2, "src/Imagenes/tocar.png");
            add(play2);

            JButton play3 = new JButton();
            play3.setBounds(500, 300, 32, 32);
            play3.setBackground(new Color(15, 15, 15));
            play3.setBorder(null);
            setImagenBoton(play3, "src/Imagenes/tocar.png");
            add(play3);


            //Canciones del disco Thriller de Michael Jackson
            JLabel mjBj = new JLabel("Billie Jean", SwingConstants.CENTER);
            mjBj.setBounds(40, 350, 150, 30);
            mjBj.setForeground(new Color(230, 222, 188));
            mjBj.setFont(new Font("Arial", Font.BOLD, 15));
            add(mjBj);

            JLabel qBR = new JLabel("Bohemia Rapshody", SwingConstants.CENTER);
            qBR.setBounds(240, 350, 150, 30);
            qBR.setForeground(new Color(230, 222, 188));
            qBR.setFont(new Font("Arial", Font.BOLD, 15));
            add(qBR);

            JLabel edPerfect = new JLabel("Perfect", SwingConstants.CENTER);
            edPerfect.setBounds(440, 350, 150, 30);
            edPerfect.setForeground(new Color(230, 222, 188));
            edPerfect.setFont(new Font("Arial", Font.BOLD, 15));
            add(edPerfect);

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

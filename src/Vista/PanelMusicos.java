package Vista;

import javax.swing.*;
import java.awt.*;

public class PanelMusicos extends JPanel {

    public PanelMusicos(){
        setLayout(null);
        setVisible(true);
        setBounds(200,90,650,520);
        setBackground(new Color(15, 15, 15));
        iniciarComponentes();
    }

    public void iniciarComponentes(){

        //Buscador de músicos por nombre
        JTextField buscador = new JTextField("Escribe el nombre de tu artista favorito...");
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

        //Etiquetas con función de botones sobre los músicos
        //Michael Jackson
        JLabel mj = new JLabel();
        mj.setBounds(10, 100, 200, 200);
        setImagenLabel(mj, "src/Imagenes/mj_200x200.png");
        mj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Michael Jackson");
            }
        });
        add(mj);

        //Queen
        JLabel queen = new JLabel();
        queen.setBounds(225, 150, 200, 200);
        setImagenLabel(queen, "src/Imagenes/queen.png");
        queen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("queen");
            }
        });
        add(queen);

        //Ed Sheeran
        JLabel ed = new JLabel();
        ed.setBounds(440, 200, 200, 200);
        setImagenLabel(ed, "src/Imagenes/ed.png");
        ed.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        ed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Ed Sheeran");
            }
        });
        add(ed);


        //Etiqueta de los nombres de los músicos
        JLabel musico1 = new JLabel("Michael Jackson");
        musico1.setBounds(60, 330, 150, 20);
        musico1.setFont(new Font("Arial", Font.BOLD, 14));
        musico1.setForeground(new Color(246, 236, 201));
        add(musico1);

        JLabel musico2 = new JLabel("Queen");
        musico2.setBounds(305, 380, 150, 20);
        musico2.setFont(new Font("Arial", Font.BOLD, 14));
        musico2.setForeground(new Color(246, 236, 201));
        add(musico2);

        JLabel musico3 = new JLabel("Ed Sheeran");
        musico3.setBounds(500, 430, 150, 20);
        musico3.setFont(new Font("Arial", Font.BOLD, 14));
        musico3.setForeground(new Color(246, 236, 201));
        add(musico3);

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

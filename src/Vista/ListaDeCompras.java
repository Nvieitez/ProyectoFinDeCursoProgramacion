package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ListaDeCompras extends JPanel {
    public ListaDeCompras(){
        setLayout(null);
        setBounds(200,90,650,520);
        setBackground(new java.awt.Color(15, 15, 15));
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        //Etiqueta titulo
        JLabel titulo = new JLabel("Tu lista de Compras");
        titulo.setBounds(50, 30, 250, 40);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(new Color(246, 236, 201));
        add(titulo);

        //Boton de eliminar
        JButton eliminar = new JButton("Quitar");
        eliminar.setBounds(500, 100, 100, 40);
        eliminar.setBackground(new Color(98, 58, 151));
        eliminar.setForeground(new Color(246, 236, 201));
        eliminar.setFocusPainted(false);
        eliminar.setFont(new Font("Arial", Font.BOLD, 15));
        eliminar.setBorder(null);
        add(eliminar);

        //Boton de total
        JButton total = new JButton("Total");
        total.setBounds(500, 170, 100, 40);
        total.setBackground(new Color(98, 58, 151));
        total.setForeground(new Color(246, 236, 201));
        total.setFocusPainted(false);
        total.setFont(new Font("Arial", Font.BOLD, 15));
        total.setBorder(null);
        add(total);

        //Boton de comprar
        JButton comprar = new JButton("Comprar");
        comprar.setBounds(500, 240, 100, 40);
        comprar.setBackground(new Color(98, 58, 151));
        comprar.setForeground(new Color(246, 236, 201));
        comprar.setFocusPainted(false);
        comprar.setFont(new Font("Arial", Font.BOLD, 15));
        comprar.setBorder(null);
        add(comprar);

        //Etiqueta de imagen
        JLabel imagen = new JLabel();
        imagen.setBounds(480, 320, 128, 128);
        setImagenLabel(imagen, "src/Imagenes/imgCompraVinilo.png");
        add(imagen);

        //Tabla de lista de compras
        JTable tablaCompras = new JTable();
        tablaCompras.setBounds(50, 100, 400, 250);
        tablaCompras.setBackground(new Color(78, 175, 179));
        tablaCompras.setForeground(new Color(232, 232, 232));
        tablaCompras.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        tablaCompras.setModel(new DefaultTableModel(
                new Object[][]{
                        {"Michael Jackson", "Thriller","55.00"},
                        {"Queen","A night at the opera","48.90"},
                        {"Ed Sheeran", "Divide","32.90"}
                },
                new String[]{"Artista","Album", "Precio"}
        ));
        tablaCompras.setFont(new Font("Arial", Font.PLAIN, 14));
        tablaCompras.setColumnSelectionAllowed(true);
        tablaCompras.setRowSelectionAllowed(true);
        tablaCompras.getTableHeader().setReorderingAllowed(false);
        add(tablaCompras);

        JScrollPane scroll = new JScrollPane(tablaCompras);
        scroll.setBounds(50, 100, 400, 250);
        add(scroll);

        //Etiqueta de condición
        JLabel condicion = new JLabel("*Debes iniciar sesión para comprar");
        condicion.setBounds(50, 380, 300, 40);
        condicion.setFont(new Font("Arial", Font.BOLD, 15));
        add(condicion);

    }

    public void setImagenLabel(JLabel label, String ruta){
        ImageIcon icono = new ImageIcon(ruta);
        label.setIcon(new ImageIcon(icono.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH)));
        label.setIcon(icono);
        this.repaint();
    }
}

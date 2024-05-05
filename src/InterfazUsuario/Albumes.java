/*
 * 
 *
 */
package InterfazUsuario;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class Albumes extends javax.swing.JFrame {

    /**
     * Creates new form Albumes
     */
    public Albumes() {
        initComponents();
        setLocationRelativeTo(null);
        setImageLabel(lblIcon, "src/Imagenes/disco.png");
        setImageLabel(etqAlb2, "src/Imagenes/albMJ2.jpg");
        setImageLabel(etqAlb1, "src/Imagenes/alb1MJ1.jpg");
        setImageLabel(etqAlb3, "src/Imagenes/albMJ3.jpg");
        setImageLabel(etqAlb4, "src/Imagenes/albMJ4.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etxMiniz = new javax.swing.JLabel();
        etqExit = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        etqAlb1 = new javax.swing.JLabel();
        etqAlb2 = new javax.swing.JLabel();
        etqAlb3 = new javax.swing.JLabel();
        txtREcibido = new javax.swing.JTextArea();
        btnAgregar1 = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        etqAlb4 = new javax.swing.JLabel();
        btnAgregar4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 15, 15));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 15, 15));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etxMiniz.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        etxMiniz.setForeground(new java.awt.Color(255, 0, 51));
        etxMiniz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etxMiniz.setText("-");
        etxMiniz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etxMiniz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etxMinizMouseClicked(evt);
            }
        });
        jPanel2.add(etxMiniz, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 50, 40));

        etqExit.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        etqExit.setForeground(new java.awt.Color(255, 0, 51));
        etqExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqExit.setText("X");
        etqExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etqExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqExitMouseClicked(evt);
            }
        });
        jPanel2.add(etqExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 50, 40));

        lblIcon.setText("Icon");
        jPanel2.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        etqAlb1.setText("Album 1");
        etqAlb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etqAlb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqAlb1MouseClicked(evt);
            }
        });
        jPanel1.add(etqAlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 150));

        etqAlb2.setText("Album 2");
        etqAlb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(etqAlb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 150, 150));

        etqAlb3.setText("Album 3");
        etqAlb3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(etqAlb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 150, 150));

        txtREcibido.setEditable(false);
        txtREcibido.setBackground(new java.awt.Color(15, 15, 15));
        txtREcibido.setColumns(20);
        txtREcibido.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        txtREcibido.setForeground(new java.awt.Color(254, 246, 223));
        txtREcibido.setRows(5);
        txtREcibido.setText("     MICHAEL JACKSON");
        txtREcibido.setBorder(null);
        jPanel1.add(txtREcibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 280, 40));

        btnAgregar1.setText("Agregar");
        jPanel1.add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 80, -1));

        btnAgregar2.setText("Agregar");
        jPanel1.add(btnAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 80, -1));

        btnAgregar3.setText("Agregar");
        jPanel1.add(btnAgregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 80, 20));

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 246, 223));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Colección de albumnes");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 260, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 370, 60));

        etqAlb4.setText("Album 3");
        etqAlb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(etqAlb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 150, 150));

        btnAgregar4.setText("Agregar");
        jPanel1.add(btnAgregar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 80, -1));

        jLabel1.setText("1982");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel2.setText("1987");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel3.setText("1991");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        jLabel4.setText("1995");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setImageLabel(JLabel label, String ruta){
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        label.setIcon(icon);
        this.repaint();
    }
    
    private void etxMinizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etxMinizMouseClicked
        // Agregamos la funcionalidad de la etiqueta
        this.setState(MenuPrincipal.ICONIFIED);
    }//GEN-LAST:event_etxMinizMouseClicked

    private void etqExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqExitMouseClicked
        // Agregamos la funcionalidad de la etiqueta
            this.dispose();
        
    }//GEN-LAST:event_etqExitMouseClicked

    private void etqAlb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqAlb1MouseClicked
        // Agregamos la funcionalidad al boton:
        Canciones alb1 = new Canciones();
        alb1.setVisible(true);
    }//GEN-LAST:event_etqAlb1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnAgregar4;
    private javax.swing.JLabel etqAlb1;
    private javax.swing.JLabel etqAlb2;
    private javax.swing.JLabel etqAlb3;
    private javax.swing.JLabel etqAlb4;
    private javax.swing.JLabel etqExit;
    private javax.swing.JLabel etxMiniz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JTextArea txtREcibido;
    // End of variables declaration//GEN-END:variables
}

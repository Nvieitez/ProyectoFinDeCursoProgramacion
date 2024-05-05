/*
 * 
 *
 */
package InterfazUsuario;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class Canciones extends javax.swing.JFrame {

    /**
     * Creates new form Canciones
     */
    public Canciones() {
        initComponents();
        setLocationRelativeTo(null);
        
        setImageLabel(lblIcon, "src/Imagenes/disco.png");
        setImageLabel(etqPhotoAlbum, "src/Imagenes/alb1MJ.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etxMiniz = new javax.swing.JLabel();
        etqExit = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        etqPhotoAlbum = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        playIcon1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        playIcon6 = new javax.swing.JLabel();
        playIcon7 = new javax.swing.JLabel();
        playIcon8 = new javax.swing.JLabel();
        playIcon9 = new javax.swing.JLabel();
        playIcon10 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        playIcon11 = new javax.swing.JLabel();

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

        lblIcon.setText("icon");
        jPanel2.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        etqPhotoAlbum.setText("img Album");
        etqPhotoAlbum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(etqPhotoAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 260, 260));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 246, 223));
        jLabel3.setText("Thriller");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 160, 30));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 246, 223));
        jLabel4.setText("THRILLER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 246, 223));
        jLabel5.setText("P.Y.T. (Pretty Young Thing)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 230, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 246, 223));
        jLabel6.setText("Billie Jean");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 160, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 246, 223));
        jLabel7.setText("Beat it");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 160, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 246, 223));
        jLabel8.setText("Human nature");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 160, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 246, 223));
        jLabel9.setText("Wanna be startin' somethin'");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 240, 30));

        jButton1.setText("Comprar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 150, 30));

        jButton2.setText("Menu Principal");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 140, 30));

        playIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playIcon1.setText("playIcon");
        playIcon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(playIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 60, 30));

        jButton3.setText("Atrás");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 160, 30));

        playIcon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playIcon6.setText("playIcon");
        playIcon6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(playIcon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 60, 30));

        playIcon7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playIcon7.setText("playIcon");
        playIcon7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(playIcon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 60, 30));

        playIcon8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playIcon8.setText("playIcon");
        playIcon8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(playIcon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 60, 30));

        playIcon9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playIcon9.setText("playIcon");
        playIcon9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(playIcon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 60, 30));

        playIcon10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playIcon10.setText("playIcon");
        playIcon10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(playIcon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 60, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 246, 223));
        jLabel10.setText("The girl is mine");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 160, 30));

        playIcon11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playIcon11.setText("playIcon");
        playIcon11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(playIcon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 60, 30));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // Agregamos la funcionalidad al boton:
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Agregamos la funcionalidad al boton:
        Canasta cn = new Canasta();
        cn.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // Agregamos la funcionalidad al boton:
        Albumes album = new Albumes();
        album.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqExit;
    private javax.swing.JLabel etqPhotoAlbum;
    private javax.swing.JLabel etxMiniz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel playIcon1;
    private javax.swing.JLabel playIcon10;
    private javax.swing.JLabel playIcon11;
    private javax.swing.JLabel playIcon6;
    private javax.swing.JLabel playIcon7;
    private javax.swing.JLabel playIcon8;
    private javax.swing.JLabel playIcon9;
    // End of variables declaration//GEN-END:variables
}

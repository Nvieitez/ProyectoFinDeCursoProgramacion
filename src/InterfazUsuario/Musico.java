
package InterfazUsuario;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



public final class Musico extends javax.swing.JFrame {

    /**
     * Creates new form Musico
     */
    
    public Musico() {
        initComponents();
        setLocationRelativeTo(null);
        
        setImageLabel(imgm1, "src/Imagenes/EdSheeran1.jpg");
        setImageLabel(imgm2, "src/Imagenes/MJ.jpg");
        setImageLabel(imgm3, "src/Imagenes/fob.jpg");
        setImageLabel(lblIcon, "src/Imagenes/disco.png");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etxMiniz = new javax.swing.JLabel();
        etqExit = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        imgm1 = new javax.swing.JLabel();
        imgm2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imgm3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 15, 15));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 15, 15));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        etqExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
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

        imgm1.setText("musico1");
        imgm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imgm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 260, 220));

        imgm2.setLabelFor(lblIcon);
        imgm2.setText("musico3");
        imgm2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imgm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 250, 220));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Menú Principal");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 160, 40));

        imgm3.setLabelFor(lblIcon);
        imgm3.setText("musico2");
        imgm3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imgm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 250, 220));

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 246, 223));
        jLabel1.setText("Los mejores interpretes");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 260, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 360, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setImageLabel(JLabel label, String ruta){
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(
                label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        label.setIcon(icon);
        this.repaint();
    }
    
    private void etqExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqExitMouseClicked
        // Agregamos la funcionalidad de la etiqueta
        this.dispose();

    }//GEN-LAST:event_etqExitMouseClicked

    private void etxMinizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etxMinizMouseClicked
        // Agregamos la funcionalidad de la etiqueta
        this.setState(MenuPrincipal.ICONIFIED);
    }//GEN-LAST:event_etxMinizMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Agregamos la funcionalidad al boton:
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqExit;
    private javax.swing.JLabel etxMiniz;
    private javax.swing.JLabel imgm1;
    private javax.swing.JLabel imgm2;
    private javax.swing.JLabel imgm3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIcon;
    // End of variables declaration//GEN-END:variables
}



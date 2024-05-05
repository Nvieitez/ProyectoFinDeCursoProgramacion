/*
 * 
 * 
 */
package InterfazUsuario;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        
        setImageLabel(lblIcon, "src/Imagenes/disco.png");
        setImageLabel(etqTarjeta, "src/Imagenes/tarjeta.png");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        apellidoTxt = new javax.swing.JTextField();
        usuarioTxt = new javax.swing.JTextField();
        nombreTxt = new javax.swing.JTextField();
        psswdTxt = new javax.swing.JTextField();
        direccionTxt = new javax.swing.JTextField();
        cpTxt = new javax.swing.JTextField();
        ciudadTxt = new javax.swing.JTextField();
        provinciaTxt = new javax.swing.JTextField();
        tarjetaTxt = new javax.swing.JTextField();
        cvvTxt = new javax.swing.JTextField();
        mdTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        etxMiniz = new javax.swing.JLabel();
        etqExit = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        etqTarjeta = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de datos");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistro.setBackground(new java.awt.Color(15, 15, 15));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre :");
        panelRegistro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 111, 85, 24));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido :");
        panelRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 153, 71, 25));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario :");
        panelRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 196, -1, 29));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña :");
        panelRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 230, 90, 40));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección :");
        panelRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 107, 72, 28));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Codigo Postal :");
        panelRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 153, 105, 25));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ciudad :");
        panelRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 196, 69, 25));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Provincia :");
        panelRegistro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 239, -1, 24));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nº Tarjeta :");
        panelRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 80, 26));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CVV :");
        panelRegistro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 45, 26));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MM/DD :");
        panelRegistro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, 25));

        jSeparator2.setBackground(new java.awt.Color(254, 246, 223));
        jSeparator2.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 226, 10));

        apellidoTxt.setBackground(new java.awt.Color(15, 15, 15));
        apellidoTxt.setForeground(new java.awt.Color(204, 204, 204));
        apellidoTxt.setBorder(null);
        apellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });
        panelRegistro.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 227, -1));

        usuarioTxt.setBackground(new java.awt.Color(15, 15, 15));
        usuarioTxt.setForeground(new java.awt.Color(204, 204, 204));
        usuarioTxt.setBorder(null);
        usuarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTxtActionPerformed(evt);
            }
        });
        panelRegistro.add(usuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 227, -1));

        nombreTxt.setBackground(new java.awt.Color(15, 15, 15));
        nombreTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombreTxt.setBorder(null);
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        panelRegistro.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 226, 20));

        psswdTxt.setBackground(new java.awt.Color(15, 15, 15));
        psswdTxt.setForeground(new java.awt.Color(204, 204, 204));
        psswdTxt.setBorder(null);
        panelRegistro.add(psswdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 220, 20));

        direccionTxt.setBackground(new java.awt.Color(15, 15, 15));
        direccionTxt.setForeground(new java.awt.Color(204, 204, 204));
        direccionTxt.setBorder(null);
        panelRegistro.add(direccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 110, 226, -1));

        cpTxt.setBackground(new java.awt.Color(15, 15, 15));
        cpTxt.setForeground(new java.awt.Color(204, 204, 204));
        cpTxt.setBorder(null);
        panelRegistro.add(cpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 154, 227, -1));

        ciudadTxt.setBackground(new java.awt.Color(15, 15, 15));
        ciudadTxt.setForeground(new java.awt.Color(204, 204, 204));
        ciudadTxt.setBorder(null);
        panelRegistro.add(ciudadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 223, -1));

        provinciaTxt.setBackground(new java.awt.Color(15, 15, 15));
        provinciaTxt.setForeground(new java.awt.Color(204, 204, 204));
        provinciaTxt.setBorder(null);
        panelRegistro.add(provinciaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 240, 227, -1));

        tarjetaTxt.setBackground(new java.awt.Color(15, 15, 15));
        tarjetaTxt.setForeground(new java.awt.Color(204, 204, 204));
        tarjetaTxt.setBorder(null);
        panelRegistro.add(tarjetaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 240, 20));

        cvvTxt.setBackground(new java.awt.Color(15, 15, 15));
        cvvTxt.setForeground(new java.awt.Color(204, 204, 204));
        cvvTxt.setBorder(null);
        panelRegistro.add(cvvTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 240, -1));

        mdTxt.setBackground(new java.awt.Color(15, 15, 15));
        mdTxt.setForeground(new java.awt.Color(204, 204, 204));
        mdTxt.setBorder(null);
        panelRegistro.add(mdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 240, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("REGISTRO DE USUARIO");
        panelRegistro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jLabel13.setText("MÉTODO DE PAGO");
        panelRegistro.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));
        panelRegistro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 303, 771, 10));

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 100, 40));

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistro.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 102, 40));

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

        lblIcon.setText("icon");
        jPanel2.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        panelRegistro.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        jSeparator3.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 227, 9));

        jSeparator4.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 230, 10));

        jSeparator5.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 230, 10));

        jSeparator6.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 230, -1));

        jSeparator7.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 230, -1));

        jSeparator9.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 230, 10));

        jSeparator10.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 230, -1));

        jSeparator8.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 240, -1));

        jSeparator11.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 240, -1));

        jSeparator12.setForeground(new java.awt.Color(254, 246, 223));
        panelRegistro.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 240, -1));

        etqTarjeta.setText("img de tarjeta");
        panelRegistro.add(etqTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 64, 64));

        jRadioButton1.setBackground(new java.awt.Color(15, 15, 15));
        jRadioButton1.setText("Acepto terminos y condiciones");
        panelRegistro.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 200, -1));

        getContentPane().add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setImageLabel(JLabel label, String ruta){
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        label.setIcon(icon);
        this.repaint();
    }
    
    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void etxMinizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etxMinizMouseClicked
        // Agregamos la funcionalidad de la etiqueta
        this.setState(MenuPrincipal.ICONIFIED);
    }//GEN-LAST:event_etxMinizMouseClicked

    private void etqExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqExitMouseClicked
        // Agregamos la funcionalidad de la etiqueta
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?","Salir",dialog);
        if(result==0){
            this.dispose();
        }
    }//GEN-LAST:event_etqExitMouseClicked

    private void apellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtActionPerformed

    private void usuarioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTxtActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JTextField ciudadTxt;
    private javax.swing.JTextField cpTxt;
    private javax.swing.JTextField cvvTxt;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JLabel etqExit;
    private javax.swing.JLabel etqTarjeta;
    private javax.swing.JLabel etxMiniz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JTextField mdTxt;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTextField provinciaTxt;
    private javax.swing.JTextField psswdTxt;
    private javax.swing.JTextField tarjetaTxt;
    private javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
}

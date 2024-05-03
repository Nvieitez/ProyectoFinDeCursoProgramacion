/*
 *
 */
package InterfazUsuario;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        etqUsuario = new javax.swing.JLabel();
        etqContrasenia = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnRegistarse = new javax.swing.JButton();
        etqCondicional = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        userIcon = new javax.swing.JLabel();
        psswdIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etqMiniz = new javax.swing.JLabel();
        etqExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicia Sesión");
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setBackground(new java.awt.Color(0, 0, 0));
        txtTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 49, 49));
        txtTitulo.setText("INICIA SESIÓN");
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 178, 60));

        etqUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etqUsuario.setText("Usuario");
        jPanel1.add(etqUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        etqContrasenia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        etqContrasenia.setText("Contraseña");
        jPanel1.add(etqContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        btnEntrar.setBackground(new java.awt.Color(0, 74, 173));
        btnEntrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(254, 246, 223));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 81, -1));

        btnRegistarse.setBackground(new java.awt.Color(0, 74, 173));
        btnRegistarse.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegistarse.setForeground(new java.awt.Color(254, 246, 223));
        btnRegistarse.setText("Registrarse");
        btnRegistarse.setBorderPainted(false);
        btnRegistarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        etqCondicional.setForeground(new java.awt.Color(102, 102, 102));
        etqCondicional.setText("* Si eres nuevo, debes registrarte para realizar tu compra.");
        jPanel1.add(etqCondicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgUser22.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 250, 430));

        txtContrasenia.setBackground(new java.awt.Color(0, 0, 0));
        txtContrasenia.setForeground(java.awt.Color.gray);
        txtContrasenia.setText("**********");
        txtContrasenia.setBorder(null);
        txtContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseniaMousePressed(evt);
            }
        });
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 270, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 330, 10));

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        txtUsuario.setForeground(java.awt.Color.gray);
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 280, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 330, 10));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user icon .png"))); // NOI18N
        userIcon.setText("jLabel2");
        jPanel1.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, 60));

        psswdIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/psswd icon1.png"))); // NOI18N
        psswdIcon.setText("jLabel2");
        jPanel1.add(psswdIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqMiniz.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        etqMiniz.setForeground(new java.awt.Color(255, 0, 0));
        etqMiniz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMiniz.setText("-");
        etqMiniz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etqMiniz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqMinizMouseClicked(evt);
            }
        });
        jPanel2.add(etqMiniz, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 40));

        etqExit.setBackground(new java.awt.Color(0, 0, 0));
        etqExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqExit.setForeground(new java.awt.Color(255, 0, 0));
        etqExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqExit.setText("X");
        etqExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etqExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqExitMouseClicked(evt);
            }
        });
        jPanel2.add(etqExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 652, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // 
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // 
        
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        // TODO add your handling code here:
        if(txtUsuario.getText().equals("Ingrese su nombre de usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.white);
        }
        if(String.valueOf(txtContrasenia.getPassword()).isEmpty()){
            txtContrasenia.setText("**********");
            txtContrasenia.setForeground(Color.gray);  
        }
        
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseniaMousePressed
        // TODO add your handling code here:
        if(String.valueOf(txtContrasenia.getPassword()).equals("**********")){
            txtContrasenia.setText("");
            txtContrasenia.setForeground(Color.white);
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_txtContraseniaMousePressed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Intento de ingreso con los datos:\nUsuario: "+txtUsuario.getText()+"\nContraseña: "+String.valueOf(txtContrasenia.getPassword()),"LOGIN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnRegistarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarseActionPerformed
        // Agregamos funcionalidad al botón 
        Registro registro = new Registro();
        registro.setVisible(true);
    }//GEN-LAST:event_btnRegistarseActionPerformed

    private void etqMinizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqMinizMouseClicked
        // Agregamos la funcionalidad de la etiqueta
        this.setState(MenuPrincipal.ICONIFIED);
    }//GEN-LAST:event_etqMinizMouseClicked

    private void etqExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqExitMouseClicked
        // Agregamos la funcionalidad de la etiqueta
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir de la salir?","Salir",dialog);
        if(result==0){
            System.exit(0);
        }
    }//GEN-LAST:event_etqExitMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistarse;
    private javax.swing.JLabel etqCondicional;
    private javax.swing.JLabel etqContrasenia;
    private javax.swing.JLabel etqExit;
    private javax.swing.JLabel etqMiniz;
    private javax.swing.JLabel etqUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel psswdIcon;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}

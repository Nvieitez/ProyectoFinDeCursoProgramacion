/*
 *
 */
package InterfazUsuario;

import javax.swing.JOptionPane;

/**
 *
 * @author Susana Santos, Nicolas Vieitez
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        etxMiniz = new javax.swing.JLabel();
        etqExit = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etqLogo = new javax.swing.JLabel();
        txtIntroductorio = new javax.swing.JTextArea();
        etqSubtitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnInicioSesión = new javax.swing.JButton();
        btnMusico = new javax.swing.JButton();
        btnAlbum = new javax.swing.JButton();
        btnCanciones = new javax.swing.JButton();
        btnCanasta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funky Town Inc.");
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        contenido.setBackground(new java.awt.Color(15, 15, 15));
        contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqTitulo.setFont(new java.awt.Font("Harlow Solid Italic", 1, 28)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("¡ Bienvenido a FunkyTown Inc. !");
        contenido.add(etqTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 420, 35));

        etqLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_FTInc.jpg"))); // NOI18N
        etqLogo.setText("imgLogo");
        contenido.add(etqLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 346, 360));

        txtIntroductorio.setEditable(false);
        txtIntroductorio.setBackground(new java.awt.Color(15, 15, 15));
        txtIntroductorio.setColumns(20);
        txtIntroductorio.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtIntroductorio.setForeground(new java.awt.Color(254, 246, 223));
        txtIntroductorio.setRows(5);
        txtIntroductorio.setText("\n   Aquí podrás comprar todo tipo de vinilos de los más famosos \n   artistas de todos los tiempos, desde el pop de Michael Jackson\n   hasta el metal de MegaDeth. \n\n   Tenemos los mejores precios de todo el universo conocido,\n   para que todos puedan seguir disfrutando del sonido de las \n   generaciones pasadas y sintonizar con frecuencias no \n   conocidas antes.\n\n   Piérdete en el sonido de los hermosos años 20, el swing de los\n   50, el funk de los 80, y el disco de los 90, todo listo y \n   preparado para tí.\n\n   ¡Disfruta!");
        txtIntroductorio.setAutoscrolls(false);
        txtIntroductorio.setBorder(null);
        txtIntroductorio.setCaretColor(new java.awt.Color(102, 102, 102));
        txtIntroductorio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtIntroductorio.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtIntroductorio.setSelectionColor(new java.awt.Color(0, 0, 0));
        contenido.add(txtIntroductorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, 260));

        etqSubtitulo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etqSubtitulo.setForeground(new java.awt.Color(255, 102, 102));
        etqSubtitulo.setText("Donde el Funk tiene un hogar");
        contenido.add(etqSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 226, 32));

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 840, 430));

        jPanel1.setBackground(new java.awt.Color(15, 15, 15));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicioSesión.setBackground(new java.awt.Color(0, 102, 153));
        btnInicioSesión.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnInicioSesión.setForeground(new java.awt.Color(243, 227, 227));
        btnInicioSesión.setText("Inicio Sesión");
        btnInicioSesión.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInicioSesión.setBorderPainted(false);
        btnInicioSesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicioSesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioSesiónMouseClicked(evt);
            }
        });
        btnInicioSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesiónActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicioSesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 40));

        btnMusico.setBackground(new java.awt.Color(0, 102, 153));
        btnMusico.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnMusico.setForeground(new java.awt.Color(243, 227, 227));
        btnMusico.setText("Músico");
        btnMusico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMusico.setBorderPainted(false);
        btnMusico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMusico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMusicoMouseClicked(evt);
            }
        });
        btnMusico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMusico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 130, 40));

        btnAlbum.setBackground(new java.awt.Color(0, 102, 153));
        btnAlbum.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnAlbum.setForeground(new java.awt.Color(243, 227, 227));
        btnAlbum.setText("Albúm");
        btnAlbum.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlbum.setBorderPainted(false);
        btnAlbum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlbumActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 140, 40));

        btnCanciones.setBackground(new java.awt.Color(0, 102, 153));
        btnCanciones.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCanciones.setForeground(new java.awt.Color(243, 227, 227));
        btnCanciones.setText("Canciones");
        btnCanciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCanciones.setBorderPainted(false);
        btnCanciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 140, 40));

        btnCanasta.setBackground(new java.awt.Color(0, 102, 153));
        btnCanasta.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCanasta.setForeground(new java.awt.Color(243, 227, 227));
        btnCanasta.setText("Ver Canasta");
        btnCanasta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCanasta.setBorderPainted(false);
        btnCanasta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCanasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanastaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCanasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 140, 40));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 820, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 840, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesiónActionPerformed
        // Agregamos la funcionalidad del botón
        
    }//GEN-LAST:event_btnInicioSesiónActionPerformed

    private void btnMusicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicoActionPerformed
        
    }//GEN-LAST:event_btnMusicoActionPerformed

    private void btnAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlbumActionPerformed
        // Agregamos la funcionalidad del botón 
        Albumes albumnes = new Albumes();
        albumnes.setVisible(true);
    }//GEN-LAST:event_btnAlbumActionPerformed

    private void btnCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancionesActionPerformed
        // Agregamos la funcionalidad del botón 
        Canciones canc = new Canciones();
        canc.setVisible(true);
        canc.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancionesActionPerformed

    private void btnCanastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanastaActionPerformed
        // Agregamos la funcionalidad del botón 
        Canasta canasta = new Canasta();
        canasta.setVisible(true);
        canasta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCanastaActionPerformed

    private void etxMinizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etxMinizMouseClicked
        // Agregamos la funcionalidad de la etiqueta
        this.setState(MenuPrincipal.ICONIFIED);
    }//GEN-LAST:event_etxMinizMouseClicked

    private void etqExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqExitMouseClicked
        // Agregamos la funcionalidad de la etiqueta
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir de la App?","Salir",dialog);
        if(result==0){
            System.exit(0);
        }
    }//GEN-LAST:event_etqExitMouseClicked

    private void btnInicioSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioSesiónMouseClicked
        // Agregamos la funcionalidad del botón
        
            Login login = new Login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnInicioSesiónMouseClicked

    private void btnMusicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusicoMouseClicked
        // Agregamos la funcionalidad del botón 
       
            Musico musico = new Musico();
            musico.setVisible(true);
            musico.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMusicoMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlbum;
    private javax.swing.JButton btnCanasta;
    private javax.swing.JButton btnCanciones;
    private javax.swing.JButton btnInicioSesión;
    private javax.swing.JButton btnMusico;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel etqExit;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel etqSubtitulo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etxMiniz;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txtIntroductorio;
    // End of variables declaration//GEN-END:variables
}

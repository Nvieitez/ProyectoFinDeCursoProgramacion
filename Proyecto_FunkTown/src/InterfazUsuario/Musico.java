/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazUsuario;

/**
 *
 * @author susibel
 */
public class Musico extends javax.swing.JPanel {

    /**
     * Creates new form Musico
     */
    public Musico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        musico1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 260, 320));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("  \n   Edward Christopher Sheeran,  conocido como\n   Ed Sheeran,  es un cantautor y músico británico.\n");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 330, 160));

        musico1.setFont(new java.awt.Font("Comic Mono", 1, 36)); // NOI18N
        musico1.setForeground(new java.awt.Color(255, 255, 255));
        musico1.setText("Ed Sheeran");
        add(musico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 40));

        jButton1.setText("ver Album");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel musico1;
    // End of variables declaration//GEN-END:variables
}

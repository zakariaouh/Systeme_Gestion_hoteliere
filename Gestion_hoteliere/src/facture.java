
import java.awt.print.PrinterException;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * facture.java
 *
 * Created on 18 déc. 2011, 17:16:43
 */
/**
 *
 * @author GHAZALI
 */
public class facture extends javax.swing.JFrame {

    /** Creates new form facture */
    public facture() {
        initComponents();
        this.setLocation(300,0);
       
        
        
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        date_res = new javax.swing.JLabel();
        mnt_ttc = new javax.swing.JLabel();
        date_dep = new javax.swing.JLabel();
        Promotion = new javax.swing.JLabel();
        suppliment = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 740));
        getContentPane().setLayout(null);

        jButton1.setText("Imprimer facture");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(213, 653, 120, 30);

        date_res.setFont(new java.awt.Font("Footlight MT Light", 0, 26));
        date_res.setForeground(new java.awt.Color(0, 0, 153));
        date_res.setText("date_res");
        getContentPane().add(date_res);
        date_res.setBounds(190, 300, 120, 30);

        mnt_ttc.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        mnt_ttc.setForeground(new java.awt.Color(0, 0, 153));
        mnt_ttc.setText("mnt_ttc");
        getContentPane().add(mnt_ttc);
        mnt_ttc.setBounds(190, 550, 160, 50);

        date_dep.setFont(new java.awt.Font("Footlight MT Light", 0, 26));
        date_dep.setForeground(new java.awt.Color(0, 0, 153));
        date_dep.setText("date_dep");
        getContentPane().add(date_dep);
        date_dep.setBounds(360, 300, 150, 24);

        Promotion.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        Promotion.setForeground(new java.awt.Color(0, 0, 153));
        Promotion.setText("Promotion");
        getContentPane().add(Promotion);
        Promotion.setBounds(200, 400, 200, 30);

        suppliment.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        suppliment.setForeground(new java.awt.Color(0, 0, 102));
        suppliment.setText("suppliment");
        getContentPane().add(suppliment);
        suppliment.setBounds(200, 470, 280, 30);

        nom.setFont(new java.awt.Font("Footlight MT Light", 0, 28));
        nom.setForeground(new java.awt.Color(0, 0, 153));
        nom.setText("nom");
        getContentPane().add(nom);
        nom.setBounds(260, 190, 260, 57);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/affiche.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        try {
////            jTextArea1.print();
//        } catch (PrinterException ex) {
//            Logger.getLogger(facture.class.getName()).log(Level.SEVERE, null, ex);
//        }
}//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new facture().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Promotion;
    public javax.swing.JLabel date_dep;
    public javax.swing.JLabel date_res;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel mnt_ttc;
    public javax.swing.JLabel nom;
    public javax.swing.JLabel suppliment;
    // End of variables declaration//GEN-END:variables
}
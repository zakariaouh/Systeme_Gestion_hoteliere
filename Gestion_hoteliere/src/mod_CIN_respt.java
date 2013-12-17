/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * mod_CIN_respt.java
 *
 * Created on 18 déc. 2011, 18:02:31
 */
/**
 *
 * @author GHAZALI
 */
public class mod_CIN_respt extends javax.swing.JFrame {

    /** Creates new form mod_CIN_respt */
    public mod_CIN_respt() {
        initComponents();
        this.setLocation(500, 200);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Valider = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();
        cin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(535, 370));
        getContentPane().setLayout(null);

        Valider.setFont(new java.awt.Font("Footlight MT Light", 0, 18));
        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        getContentPane().add(Valider);
        Valider.setBounds(100, 250, 110, 40);

        Annuler.setFont(new java.awt.Font("Footlight MT Light", 0, 18));
        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        getContentPane().add(Annuler);
        Annuler.setBounds(280, 250, 110, 40);

        cin.setFont(new java.awt.Font("Footlight MT Light", 0, 14));
        cin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cinKeyReleased(evt);
            }
        });
        getContentPane().add(cin);
        cin.setBounds(170, 160, 166, 30);

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Entrez le cin de client ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 70, 250, 27);

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CIN  :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 160, 68, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panda-cloud-interface[1].jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 520, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
REQUETE_SQL.connexionbase();
    
     ModifierclientJF md=new ModifierclientJF();
     if(REQUETE_SQL.test_cin_Client(cin.getText())==false){
    table_info v=REQUETE_SQL.info_client(cin.getText());

    md.cin.setText(v.cin);   
    md.Adresse.setText(v.adresse);
    md.Email.setText(v.email);
    md.Nom.setText(v.nom);
    md.Prenom.setText(v.prenom);
    md.Email.setText(v.email);
    md.ID_Client.setText(v.id_client);
    md.telephone.setText(v.tele);
    
    md.setVisible(true);
     this.setVisible(false);
     }
     else{
         javax.swing.JOptionPane.showMessageDialog(null,"le  CIN n'éxiste pas"); 
     
    
    }
}//GEN-LAST:event_ValiderActionPerformed

private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
this.setVisible(false);
}//GEN-LAST:event_AnnulerActionPerformed

private void cinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinKeyReleased
String v=cin.getText();
if(v.length()>8){cin.setText(v.substring(0,8));
}
if (v.contains(";")||v.contains(".")||v.contains(",")||v.contains("'")||v.contains("(")||v.contains(":")||v.contains("-")||v.contains("'")||v.contains("_")||v.contains("+")||v.contains(" "))
   cin.setText(v.substring(0,v.length()-1));
}//GEN-LAST:event_cinKeyReleased

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
            java.util.logging.Logger.getLogger(mod_CIN_respt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mod_CIN_respt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mod_CIN_respt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mod_CIN_respt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new mod_CIN_respt().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JButton Valider;
    private javax.swing.JTextField cin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

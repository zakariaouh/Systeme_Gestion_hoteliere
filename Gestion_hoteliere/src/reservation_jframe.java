
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * reservation_jframe.java
 *
 * Created on 18 déc. 2011, 14:15:47
 */
/**
 *
 * @author GHAZALI
 */
public class reservation_jframe extends javax.swing.JFrame {

    static int conttttt = 0;
static String g_id_reservation=null;
    /** Creates new form reservation_jframe */
    public reservation_jframe() {
        initComponents();
        this.setLocation(300, 100);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cat_chambre = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        ch_disp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        date_depart = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        nbr_cham = new javax.swing.JTextField();
        date_arrivee = new javax.swing.JTextField();
        Annuler = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 0, 18));
        jLabel7.setText("Nombre de chambre disponible :");

        cat_chambre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cat_chambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat_chambreActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 0, 18));
        jLabel8.setText("Categorie de chambre :");

        ch_disp.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 0, 18));
        jLabel9.setText("Date d'arrivée :");

        jLabel10.setFont(new java.awt.Font("Footlight MT Light", 0, 18));
        jLabel10.setText("Date de Départ :");

        date_depart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                date_departKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 0, 18));
        jLabel11.setText("Reservation :");

        jButton1.setFont(new java.awt.Font("Footlight MT Light", 0, 18));
        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Footlight MT Light", 0, 18));
        jLabel12.setText("Nombre de chambre desire :");

        nbr_cham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nbr_chamKeyReleased(evt);
            }
        });

        date_arrivee.setEnabled(false);

        Annuler.setFont(new java.awt.Font("Footlight MT Light", 0, 18));
        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(433, 433, 433))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ch_disp, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cat_chambre, 0, 249, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_arrivee, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbr_cham, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(date_depart, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cat_chambre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch_disp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nbr_cham, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_arrivee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_depart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   String catego = cat_chambre.getSelectedItem().toString();
        String nbr_ch = nbr_cham.getText();
        String cinn = ClientJFrame.cin_g;
        String dta = date_arrivee.getText();
        String dtdep = date_depart.getText();
        String id_cl=null;
        Integer a =0,b=0;
        try {     
          
        a = Integer.parseInt(nbr_ch);
        b=Integer.parseInt(ch_disp.getText());
         } catch (Exception e) {
   
    }
        if(a!=0 && a<=b && a!=null){
    Object[] options = {"Oui", "Non", "Annuler!"};
    int n = javax.swing.JOptionPane.showOptionDialog(this, "Voulez vous faire une " + "autre reservation?", "Que voulez vous faire ?", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    if (n == 0) {
     
        
         id_cl = REQUETE_SQL.Id_Client(cinn);
        ArrayList<String> id_cat_libre = REQUETE_SQL.chambres_libre(catego);
        if (a <= id_cat_libre.size()) {
            REQUETE_SQL.reservation(id_cl, catego, nbr_ch, dta, dtdep);
          
            for (int k = 0; k < a; k++) {
                REQUETE_SQL.reserver_chambre(id_cat_libre.get(k));

                ArrayList<tabe_reservation> tous = REQUETE_SQL.info_Reservation(id_cl);
                System.out.println(tous.get(tous.size() - 1).id_reservation + "" + id_cat_libre.get(k));
                REQUETE_SQL.relation_chambre_reservation(tous.get(tous.size() - 1).id_reservation, id_cat_libre.get(k));
            }

        }

        nbr_cham.setText("");
        date_depart.setText("");
    }
    if (n == 1) {


         id_cl = REQUETE_SQL.Id_Client(cinn);
        ArrayList<String> id_cat_libre = REQUETE_SQL.chambres_libre(catego);
        if (a <= id_cat_libre.size()) {
            REQUETE_SQL.reservation(id_cl, catego, nbr_ch, dta, dtdep);
            for (int k = 0; k < a; k++) {
                REQUETE_SQL.reserver_chambre(id_cat_libre.get(k));

                ArrayList<tabe_reservation> tous = REQUETE_SQL.info_Reservation(id_cl);
                REQUETE_SQL.relation_chambre_reservation(tous.get(tous.size() - 1).id_reservation, id_cat_libre.get(k));
            }

        }
        supplementJF f = new supplementJF();
        f.setVisible(true);
        this.setVisible(false);
    }
    if (n == 2) {
    }
        }else
            javax.swing.JOptionPane.showMessageDialog(null,"Le nombre de chambre choisie '"+a+"' \nest plus grand que le nombre de chambre libre'"+b+"'"); 
  g_id_reservation= REQUETE_SQL.id_reservation(id_cl, catego, nbr_ch, dta, dtdep);
           System.out.println("g_id_reservation = "+g_id_reservation);
        
}//GEN-LAST:event_jButton1ActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    REQUETE_SQL.connexionbase();
    ArrayList<String> a = REQUETE_SQL.tous_categorie();
    cat_chambre.removeAllItems();

    for (int j = 0; j < a.size(); j++) {
        cat_chambre.addItem(a.get(j));
    }

        Date maDate = new Date(); 
java.sql.Date sDate = new java.sql.Date(System.currentTimeMillis());

sDate = new java.sql.Date(maDate.getTime());
        int d=sDate.getDay()+18;
        int m =sDate.getMonth();
String an=sDate.toString().substring(0,4);
date_arrivee.setText(d+"\\"+m+"\\"+an); 
}//GEN-LAST:event_formWindowOpened

private void cat_chambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat_chambreActionPerformed

    if (conttttt > 1) {
        ArrayList<String> id_cat_libre = REQUETE_SQL.chambres_libre(cat_chambre.getSelectedItem().toString());

        ch_disp.setText("" + id_cat_libre.size());
        if(id_cat_libre.size()==0){
            jButton1.setEnabled(false);
    }else
            jButton1.setEnabled(true);
    }
    
    conttttt = conttttt + 1;
}//GEN-LAST:event_cat_chambreActionPerformed

private void nbr_chamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nbr_chamKeyReleased
  String nbr_ch = nbr_cham.getText(); 
  try{
  Integer a = Integer.parseInt(nbr_ch);
  }catch(Exception e){
  nbr_cham.setText("");
  }
    // TODO add your handling code here:
}//GEN-LAST:event_nbr_chamKeyReleased

private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
this.setVisible(false);
}//GEN-LAST:event_AnnulerActionPerformed

private void date_departKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date_departKeyReleased
String ch=date_depart.getText();
if(ch.length()==2){
ch=ch+"\\";
        }
if(ch.length()==5){
ch=ch+"\\";
        }
if(ch.length()>10){
ch=ch.substring(0,10);}
date_depart.setText(ch);
  
}//GEN-LAST:event_date_departKeyReleased

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
            java.util.logging.Logger.getLogger(reservation_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservation_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservation_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservation_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new reservation_jframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JComboBox cat_chambre;
    private javax.swing.JTextField ch_disp;
    private javax.swing.JTextField date_arrivee;
    private javax.swing.JTextField date_depart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nbr_cham;
    // End of variables declaration//GEN-END:variables
}

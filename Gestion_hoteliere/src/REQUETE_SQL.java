
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class REQUETE_SQL {

    private static Connection connexion = null;
    private static Statement st;
    private static ResultSet rs = null;

    public static void connexionbase() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/mabase?user=root&amppasword=");
            st = connexion.createStatement();

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null,"Erreur\nbase de donnees non demarrer"); 
            System.out.println(e);
        }

    }
 

    // --------------------------------------------------------------------------------------------------------------------------------------------  
    //-------    Statement                                    la manipulation du donnees de client                                              ------------  
    // --------------------------------------------------------------------------------------------------------------------------------------------  
    public static boolean ajouter_client(String v_cin, String V_nom, String v_prenom, String v_adr, String v_tele, String v_email) {

        if (test_cin_Client(v_cin) == false) {
            return false;

        } else {
            try {

                String requete = "insert into client (cin, nom, prenom, adresse, telephone, email) values('" + v_cin + "','" + V_nom + "','" + v_prenom + "','" + v_adr + "','" + v_tele + "','" + v_email + "')";
                st.executeUpdate(requete);
            } catch (SQLException ex) {
                Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
    }

    public static boolean modifier_client(String v_cin1, String v_cin2, String V_nom, String v_prenom, String v_adr, String v_tele, String v_email) {

        if (v_cin1.equals(v_cin2)) {
            try {


                if (V_nom != null) {
                    st.executeUpdate("Update client set nom='" + V_nom + "' where cin='" + v_cin1 + "'");

                }
                if (v_prenom != null) {
                    st.executeUpdate("Update client set prenom='" + v_prenom + "' where cin='" + v_cin1 + "'");

                }
                if (v_adr != null) {
                    st.executeUpdate("Update client set adresse='" + v_adr + "' where cin='" + v_cin1 + "'");

                }
                if (V_nom != null) {
                    st.executeUpdate("Update client set telephone='" + v_tele + "' where cin='" + v_cin1 + "'");

                }
                if (v_email != null) {

                    st.executeUpdate("Update client set email='" + v_email + "' where cin='" + v_cin1 + "'");

                }
            } catch (Exception e) {
            }
            if (v_cin2 != null) {
                try {
                    st.executeUpdate("Update client set cin='" + v_cin2 + "' where cin='" + v_cin1 + "'");
                } catch (SQLException ex) {
                }

            }
            return true;
        } else {

            if (test_cin_Client(v_cin2) == true) {

                try {


                    if (V_nom != null) {
                        st.executeUpdate("Update client set nom='" + V_nom + "' where cin='" + v_cin1 + "'");

                    }
                    if (v_prenom != null) {
                        st.executeUpdate("Update client set prenom='" + v_prenom + "' where cin='" + v_cin1 + "'");

                    }
                    if (v_adr != null) {
                        st.executeUpdate("Update client set adresse='" + v_adr + "' where cin='" + v_cin1 + "'");

                    }
                    if (V_nom != null) {
                        st.executeUpdate("Update client set telephone='" + v_tele + "' where cin='" + v_cin1 + "'");

                    }
                    if (v_email != null) {

                        st.executeUpdate("Update client set email='" + v_email + "' where cin='" + v_cin1 + "'");

                    }
                } catch (Exception e) {
                }
                if (v_cin2 != null) {
                    try {
                        st.executeUpdate("Update client set cin='" + v_cin2 + "' where cin='" + v_cin1 + "'");
                    } catch (SQLException ex) {
                    }

                }
                return true;
            } else {
                return false;
            }
        }
    }

    public static void supprimer_client(String v_cin) {
        annuler_reservation(Id_Client(v_cin), "");
//        String requete = "Delete from client where cin='" + v_cin + "'";

//        try {
//            st.executeUpdate(requete);
//        } catch (SQLException ex) {
//            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
       public static void supprimer_client_manjdar(String v_cin) {
        annuler_reservation(Id_Client(v_cin), "");
        String requete = "Delete from client where cin='" + v_cin + "'";

        try {
            st.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static table_info info_client(String v_cin) {
        table_info v = null;
        try {

            rs = st.executeQuery("select cin, nom, prenom, adresse, telephone, email ,id_client from client where cin='" + v_cin + "'");
            while (rs.next()) {
                v = new table_info(rs.getString("cin"), rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"), rs.getString("telephone"), rs.getString("email"), rs.getString("id_client"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

    public static String Id_Client(String v_cin) {
        String v = null;
        try {

            rs = st.executeQuery("select id_client from client where cin='" + v_cin + "'");
            while (rs.next()) {
                v = rs.getString("id_client");

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
    public static String id_client_suppl(String id_reservation){
    
    String v = null;
        try {

            rs = st.executeQuery("select distinct(id_client) from reservation where id_reservation='" + id_reservation + "'");
            while (rs.next()) {
                v = rs.getString("id_client");

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

    public static String CIN_Client(String v_id_client) {
        String v = null;
        try {

            rs = st.executeQuery("select cin from client where id_client='" + v_id_client + "'");
            while (rs.next()) {
                v = rs.getString("cin");

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

    public static String Id_Dernier_Client() {
        String v = null;
        try {
            rs = st.executeQuery("select max(id_client) as 'cls' from client");
            while (rs.next()) {
                v = rs.getString("cls");
            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

    public static boolean test_cin_Client(String v_cin) {
        String v = "";
        try {
            rs = st.executeQuery("select count(cin) as 'cls' from client where cin='" + v_cin + "'");
            while (rs.next()) {
                v = rs.getString("cls");

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (v.equals("0")) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<table_info> info_client() {
        ArrayList<table_info> info = new ArrayList<table_info>();

        try {
            rs = st.executeQuery("select cin, nom, prenom, adresse, telephone, email, id_client from client");
            while (rs.next()) {
                table_info v = new table_info(rs.getString("cin"), rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"), rs.getString("telephone"), rs.getString("email"), rs.getString("id_client"));
                info.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    }

    // --------------------------------------------------------------------------------------------------------------------------------------------  
    //-------                                        la manipulation du donnees de RESERVATION                                              ------------  
    // --------------------------------------------------------------------------------------------------------------------------------------------  
    public static void reservation(String v_id_client, String V_categorie_chambre, String v_nbr_chambre, String v_date_arrivee, String v_date_depart) {
        try {

            String requete = "insert into reservation (id_client, categorie, nbr_chambre, date_arrivee, date_depart) values('" + v_id_client + "','" + V_categorie_chambre + "','" + v_nbr_chambre + "','" + v_date_arrivee + "','" + v_date_depart + "')";
            st.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void annuler_reservation(String v_id_client, String v_id_RESERVATION) {
        String requete = null;
        //supp toute les reservation d'un client
        if ((!v_id_client.equals("")) && v_id_RESERVATION.equals("")) {

            ArrayList<tabe_reservation> a = info_Reservation(v_id_client);

            for (int i = 0; i < a.size(); i++) {
                tabe_reservation H = a.get(i);
                liberer_chambre(H.id_reservation);
                liberer_suppliment(H.id_reservation);
                
            }
            requete = "Delete from reservation where id_client='" + v_id_client + "'";
            try {
                st.executeUpdate(requete);
            } catch (SQLException ex) {
                Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //supp une seul reservation  d'un client
        if (v_id_client.equals("") && (!v_id_RESERVATION.equals(""))) {
            liberer_chambre(v_id_RESERVATION);
            liberer_suppliment(v_id_RESERVATION);
            requete = "Delete from reservation where id_reservation='" + v_id_RESERVATION + "'";
            try {
                st.executeUpdate(requete);
            } catch (SQLException ex) {
                Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }



    }

    public static void modifier_Reservation(String v_id, String v_nbr_personne, String V_categorie_chambre, String v_nbr_chambre, String v_date_reservation, String v_date_depart, String v_cin) {

        try {


            if (v_nbr_personne != null) {
                st.executeUpdate("Update reservation set nbr_personne='" + v_nbr_personne + "' where id_reservation ='" + v_id + "'");

            }
            if (V_categorie_chambre != null) {
                st.executeUpdate("Update reservation set categorie_chambre='" + V_categorie_chambre + "' where id_reservation ='" + v_id + "'");

            }
            if (v_nbr_chambre != null) {
                st.executeUpdate("Update reservation set nbr_chambre='" + v_nbr_chambre + "' where id_reservation ='" + v_id + "'");

            }
            if (v_date_reservation != null) {
                st.executeUpdate("Update reservation set date_reservation='" + v_date_reservation + "' where id_reservation ='" + v_id + "'");

            }
            if (v_date_depart != null) {

                st.executeUpdate("Update reservation set date_depart='" + v_date_depart + "' where id_reservation ='" + v_id + "'");

            }
            if (v_cin != null) {

                st.executeUpdate("Update reservation set cin='" + v_cin + "' where id_reservation ='" + v_id + "'");

            }
        } catch (Exception e) {
        }


    }

    public static ArrayList<tabe_reservation> info_Reservation(String v_id_client) {
        ArrayList<tabe_reservation> info = new ArrayList<tabe_reservation>();

        try {
            rs = st.executeQuery("select id_reservation, categorie , nbr_chambre,date_arrivee,date_depart, id_client from reservation where id_client='" + v_id_client + "'");
            while (rs.next()) {
                tabe_reservation v = new tabe_reservation(rs.getString("id_reservation"), rs.getString("categorie"), rs.getString("nbr_chambre"), rs.getString("date_arrivee"), rs.getString("date_depart"), rs.getString("id_client"));
                info.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    }
   public static tabe_reservation info_Reservation_id(String v_id_reservation) {
       tabe_reservation v =null;

        try {
            rs = st.executeQuery("select id_reservation, categorie , nbr_chambre,date_arrivee,date_depart, id_client from reservation where id_reservation='" + v_id_reservation + "'");
            while (rs.next()) {
                v = new tabe_reservation(rs.getString("id_reservation"), rs.getString("categorie"), rs.getString("nbr_chambre"), rs.getString("date_arrivee"), rs.getString("date_depart"), rs.getString("id_client"));
              

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
    public static ArrayList<tabe_reservation> info_Reservation() {
        ArrayList<tabe_reservation> info = new ArrayList<tabe_reservation>();

        try {
          rs = st.executeQuery("select id_reservation, categorie , nbr_chambre,date_arrivee,date_depart, id_client from reservation");
              while (rs.next()) {
                tabe_reservation v = new tabe_reservation(rs.getString("id_reservation"), rs.getString("categorie"), rs.getString("nbr_chambre"), rs.getString("date_arrivee"), rs.getString("date_depart"), rs.getString("id_client"));
                info.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    }
public static String id_reservation(String v_id_client,  String V_categorie_chambre, String v_nbr_chambre, String v_date_reservation, String v_date_depart)
{
   String v=null;
        try {
            rs = st.executeQuery("select id_reservation from reservation where  categorie='"+V_categorie_chambre+"' and nbr_chambre='"+v_nbr_chambre+"' and date_arrivee='"+v_date_reservation+"' and date_depart='"+v_date_depart+"' and id_client='" + v_id_client + "'");
            while (rs.next()) {
                 v = rs.getString("id_reservation");
               

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
       
return v;}
        // --------------------------------------------------------------------------------------------------------------------------------------------  
    //-------                                        la manipulation du donnees de RESERVATION                                              ------------  
    // --------------------------------------------------------------------------------------------------------------------------------------------  
    public static ArrayList<String> ID_chambreS(String v_id_reservation) {
        ArrayList<String> H=new ArrayList<String>();
        String requete = null, v = null;
        requete = "select id_chambre from res_cham where id_reservation='" + v_id_reservation + "'";

        try {
            rs = st.executeQuery(requete);
            while (rs.next()) {
                v = rs.getString("id_chambre");
H.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }


        return H;
    }

    public static void liberer_chambre(String v_id_reservation) {
       ArrayList<String> v_id_chambre = ID_chambreS(v_id_reservation);
        String requete1 = null, requete2 = null;
        //supp toute les reservation d'un client
        for (int i=0;i<v_id_chambre.size();i++){
        requete1 = "delete from res_cham where id_reservation='" + v_id_reservation + "' and id_chambre='" + v_id_chambre.get(i) + "'";
        requete2 = "UPDATE chambre set disponibilite=1 where id_chambre='" + v_id_chambre.get(i) + "'";
        
        
         try {
            st.executeUpdate(requete1);
            st.executeUpdate(requete2);
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        }
       


    }

    public static void reserver_chambre(String v_id_chambre) {
        String requete = null;
        requete = "UPDATE chambre set disponibilite =0 where disponibilite=1 and id_chambre='" + v_id_chambre + "'";
        try {
            st.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public static void relation_chambre_reservation(String v_id_reservation, String v_id_chambre) {
        try {

            String requete = "insert into res_cham (id_reservation, id_chambre) values('" + v_id_reservation + "','" + v_id_chambre + "')";
            st.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<String> chambres_libre() {
        ArrayList<String> h = new ArrayList<String>();
        try {
            rs = st.executeQuery("select id_chambre from chambre where disponibilite>0");
            while (rs.next()) {
                String v = rs.getString("id_chambre");
                h.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h;
    }

    public static ArrayList<String> chambres_libre(String v_categorie) {
        ArrayList<String> h = new ArrayList<String>();

        try {
            rs = st.executeQuery("select id_chambre from chambre where disponibilite>0 and id_categorie=(select id_categorie from categorie  where description ='" + v_categorie + "')");
            while (rs.next()) {
                String v = rs.getString("id_chambre");
                h.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return h;
    }

    public static String trif_chambre(String v_id_tarif) {
        String h = null;
        try {
            rs = st.executeQuery("select montant from tarif where id_tarif ='" + v_id_tarif + "'");
            while (rs.next()) {
                h = rs.getString("montant");


            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return h;
    }
    public static String tarif_une_seul_chambre(String v_id_chambre){
        String v_id_tarif = null,montant=null;
        try {
            rs = st.executeQuery("select id_tarif from chambre where id_chambre ='" + v_id_chambre + "'");
            while (rs.next()) {
                v_id_tarif =rs.getString("id_tarif");


            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        montant=tarif_une_seul_chambre(v_id_tarif);

        return montant;
   }
    public static ArrayList<String> montant_reservation(String v_id_reservation){
        ArrayList<String> a=ID_chambreS(v_id_reservation),h=null;
        
        for(int i=0;i<a.size();i++)
            h.add(tarif_une_seul_chambre(a.get(i)));
        
        return h;}
    public static void affiche_organiser(String v_id_reservation){
//       walo hna tlaft brit n2afficher la categorie des chambre reserver les id_chambre reservers et le tarif des chambr et aussi les suppliment lli ta3taw lhad lr client et aussi les promotion
        
//  il faut ajouter une fonction pour afficter des promotion donc remplire la table promo_cat
    }
  public static boolean relation_promo_cat(String v_id_promotion,String v_id_categorie) {

  
            try {

                String requete = "insert into promo-cat (id_promotion, id_categorie) values('" + v_id_promotion + "','" + v_id_categorie+"')";
                st.executeUpdate(requete);
            } catch (SQLException ex) {
                Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        
    } 
    
    // --------------------------------------------------------------------------------------------------------------------------------------------  
    //-------                                       dakchi mkhallat                                         ------------  
    // --------------------------------------------------------------------------------------------------------------------------------------------  
public static ArrayList<String> reservation_suplement(String v_id_reservation){
    ArrayList<String> h=new ArrayList<String>();
String requet="select id_supplement from res_sup where id_reservation='"+v_id_reservation+"'";
try {
            rs = st.executeQuery(requet);
            while (rs.next()) {
                String v = rs.getString("id_supplement");
                h.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
return h;}
public static ArrayList<String> supplement(String v_id_supplement){
    ArrayList<String> h=new ArrayList<String>();
String requet="select description from supplement where id_supplement='"+v_id_supplement+"'";
try {
            rs = st.executeQuery(requet);
            while (rs.next()) {
                String v = rs.getString("description");
                h.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
return h;}
public static ArrayList<String> supplement(){
    ArrayList<String> h=new ArrayList<String>();
String requet="select description from supplement";
try {
            rs = st.executeQuery(requet);
            while (rs.next()) {
                String v = rs.getString("description");
                h.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
return h;}
public static ArrayList<String> categorie_promotion(String v_id_categorie){
    ArrayList<String> h=new ArrayList<String>();
String requet="select id_promotion from promo-cat where id_categorie='"+v_id_categorie+"'";
try {
            rs = st.executeQuery(requet);
            while (rs.next()) {
                String v = rs.getString("id_supplement");
                h.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
return h;}
public static ArrayList<String> promotion(String v_id_promotion){
    ArrayList<String> h=new ArrayList<String>();
String requet="select description from supplement where id_promotion='"+v_id_promotion+"'";
try {
            rs = st.executeQuery(requet);
            while (rs.next()) {
                String v = rs.getString("description");
                h.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
return h;}
public static boolean relation_rep_sup(String v_id_reservation,String v_id_supplement) {

  
            try {

                String requete = "insert into res_sup (id_reservation, id_supplement) values('" + v_id_reservation + "','" + v_id_supplement+"')";
                st.executeUpdate(requete);
            } catch (SQLException ex) {
                Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        
    }
public static String id_suppliment(String v_description){
String h=null;
String requet="select id_supplement from supplement where description='"+v_description+"'";
try {
            rs = st.executeQuery(requet);
            while (rs.next()) {
                h = rs.getString("id_supplement");
               

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
return h;
}
   public static void liberer_suppliment(String v_id_reservation) {
       
        String requete1 = null;
       
        requete1 = "delete from res_sup where id_reservation ='" + v_id_reservation;
       try {
            st.executeUpdate(requete1);
      
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // --------------------------------------------------------------------------------------------------------------------------------------------  
    //-------                                       autentification                                          ------------  
    // --------------------------------------------------------------------------------------------------------------------------------------------  

    public static boolean authentification(String v_login, String v_password) {
        boolean t = false;


        String l = "", p = "";

        try {
            rs = st.executeQuery("select login, password from authentification where login='" + v_login + "'");
            while (rs.next()) {
                l = rs.getString("login");
                p = rs.getString("password");

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (l.equals(v_login) && p.equals(v_password)) {
            t = true;
        }

        return t;
    }

    public static String mot_de_passe_oublier(String v_login, String v_reponse, String v_question) {
        String fl = "";
        try {
            rs = st.executeQuery("select password from authentification where login ='" + v_login + "' and reponse='" + v_reponse + "' and id_question =(select id_question from question_secrete where question ='" + v_question + "')");
            while (rs.next()) {
                fl = rs.getString("password");


            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fl;
    }

    public static boolean ajouter_login_password(String v_login, String v_password, String v_question, String v_reponse) {
        try {

            String requete = "insert into authentification (login, password, id_question, reponse) values('" + v_login + "','" + v_password + "',(select id_question from question_secrete where question ='" + v_question + "'),'" + v_reponse + "')";
            st.executeUpdate(requete);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static boolean supprimer_adm(String v_log) {

        String requete = "Delete from authentification where login='" + v_log + "'";

        try {
            st.executeUpdate(requete);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static ArrayList<String> tous_question_secret() {
        ArrayList<String> h = new ArrayList<String>();

        try {
            rs = st.executeQuery("select question from question_secrete");
            while (rs.next()) {
                String v = rs.getString("question");
                h.add(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return h;
    }

    public static info_admin admin_info(String mps, String login) {
        info_admin a = null;

        try {
            rs = st.executeQuery("select login, password, id_question, reponse from authentification where password='" + mps + "' and login='" + login + "'");
            while (rs.next()) {
                a = new info_admin(rs.getString("login"), rs.getString("password"), rs.getString("id_question"), rs.getString("reponse"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = st.executeQuery("select question from question_secrete where id_question='" + a.qst + "'");
            while (rs.next()) {
                a.qst = rs.getString("question");

            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public static void vider(){
       String  requete3 = "delete from res_sup";
       String requete1 = "delete from res_cham";
    String  requete2 = "UPDATE chambre set disponibilite=1 ";
      String  requete4 = "delete from reservation ";
        
        
         try {
            st.executeUpdate(requete1);
            st.executeUpdate(requete2);
            st.executeUpdate(requete3);
            st.executeUpdate(requete4);
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
public static ArrayList<String> tous_categorie(){
    String h=null;
    ArrayList<String> a= new ArrayList<String>();
String requete="select description from categorie";
try {
            rs = st.executeQuery(requete);
            while (rs.next()) {
               h = rs.getString("description");
a.add(h);
            }
        } catch (SQLException ex) {
            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
}
    public static void main(String arg[]) {
        connexionbase();

   
//
//String requete1 = "delete from res_cham";
//    String    requete2 = "UPDATE chambre set disponibilite=1 ";
//        
//        
//         try {
//            st.executeUpdate(requete1);
//            st.executeUpdate(requete2);
//        } catch (SQLException ex) {
//            Logger.getLogger(REQUETE_SQL.class.getName()).log(Level.SEVERE, null, ex);
//        }



        /* try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connexion=DriverManager.getConnection("jdbc:mysql://localhost/mabase?user=root&amppasword=");
        Statement st = connexion.createStatement();
        st.executeUpdate("insert into client (cin, nom, prenom, adresse, telephone) values('AA456','nomm','prenomm','rabat vinci','0666213456')");
        st.executeUpdate("Update client set nom='newnom' where cin='AA456'");
        ResultSet rs= st.executeQuery("select cin, nom, prenom, adresse, telephone from client");  
        
        while (rs.next()) {
        System.out.println(rs.getString("CIN")+" "+rs.getString("nom")+" "+rs.getString("prenom")+" "+rs.getString("adresse")+" "+rs.getString("telephone"));
        
        } 
        
        
        } catch (Exception e) {
        System.out.println(e);
        }
        
        
        
         */


    }
}

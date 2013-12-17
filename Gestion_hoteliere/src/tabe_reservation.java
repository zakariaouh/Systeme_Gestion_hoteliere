
public class tabe_reservation {
    public String id_reservation =null;
   
    public String categorie_chambre =null;
    public String  nbr_chambre=null;
    public String  date_reservation=null;
    public String date_depart =null;
    public String cin =null;

    public tabe_reservation(String id_reservation, String categorie_chambre, String nbr_chambre, String date_reservation, String date_depart,String cin) {
    this.id_reservation =id_reservation;
 
    this.categorie_chambre =categorie_chambre;
    this.nbr_chambre=nbr_chambre;
    this.date_reservation=date_reservation;
    this.date_depart =date_depart;
    this.cin =cin;
    }
    
    
}
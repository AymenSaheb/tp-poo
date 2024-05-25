package Controller;

import Model.Hotel;

public class Demande {
    Hotel hotel;
    public Client client;
    public int nbr_lit_souhaitee;
    public boolean vip;
    public Date date_debut;
    public Date date_fin;

    /*Sejour
    -
    -
    -
    -
    -
    -
     */
      // Ajouter sejour
    public Demande(Hotel hotel,Client client,int nbr_lit_souhaitee,boolean vip,Date date_debut,Date date_fin) {
        this.hotel=hotel;
        this.client=client;
        this.nbr_lit_souhaitee=nbr_lit_souhaitee;
        this.vip=vip;
        this.date_debut=date_debut;
        this.date_fin=date_fin;
        this.hotel.demandes.add(this);
    }









}

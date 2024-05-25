package Controller;

import Model.Hotel;

import java.util.Map;

public class Administrateur extends Utilisateur{

    public Hotel hotel;

    /*
    public void Accepter_Demande(Demande demande)
    {
         int tmp=Verifier_Disponibilite(demande);
        //A MODIFIER
        if (tmp!=-1) {
                this.hotel.chambres.get(tmp).chambres_reservees.put(demande.date_debut,demande.date_fin);
                this.hotel.demandes.remove(demande);
            }
        }


     */


    public int Verifier_Disponibilite(Demande demande)
    {
        //A MODIFIER

        Date date_debut= demande.date_debut;
        Date date_fin= demande.date_fin;


        for (Chambre chambre: this.hotel.chambres) {
            chambre.trier_arraylist();
            if (chambre.nombre_lits==demande.nbr_lit_souhaitee && chambre.vip==demande.vip)
            {
                if (chambre.chambres_reservees.isEmpty()){
                    return chambre.numero;
                }
                for (chambres_reservees entry : chambre.chambres_reservees){
                    Date entryStartDate = entry.date_debut;
                    Date entryEndDate = entry.date_fin;

                    if((date_debut.isBetween(entryStartDate, entryEndDate) || date_fin.isBetween(entryStartDate, entryEndDate))&& chambre.numero ==this.hotel.chambres.size() ) {
                        return -1;
                    }
                    if((date_debut.estAvant(entryStartDate) && date_fin.estApres(entryEndDate))&& chambre.numero ==this.hotel.chambres.size()) {
                        return -1;
                    }

                    if(date_fin.estAvant(entryStartDate)) {
                        return chambre.numero ;
                    }
                }

            }
        }
        return -1;
    }

    public void Decliner_Demande()
    {
        //A MODIFIER
        System.out.println("refuser");
    }











    public void Creer_Chambre( int nombre_lits, boolean vip)
    {
        Chambre chambre=new Chambre(this.hotel,nombre_lits,vip);
        chambre.numero=this.hotel.chambres.size()+1;
        this.hotel.chambres.add(chambre); //ajouter la chambre a la base de donnees de l'hotel

    }
    public void Modifier_Chambre(int numero_chambre,int nombre_lits,boolean vip)
    {
      this.hotel.chambres.get(numero_chambre-1).nombre_lits=nombre_lits;

      this.hotel.chambres.get(numero_chambre-1).vip=vip;

    }

    //Overloaading
    public void Modifier_Chambre(int numero_chambre,int nombre_lits)
    {
        this.hotel.chambres.get(numero_chambre-1).nombre_lits=nombre_lits;
    }

    public void Modifier_Chambre(int numero_chambre,boolean vip)
    {
        this.hotel.chambres.get(numero_chambre-1).vip=vip;
    }



    public void Supprimer_Chambre(int numero_chambre)
    {
        this.hotel.chambres.remove(numero_chambre-1);
        for (Chambre chambre:this.hotel.chambres) {
            chambre.numero=this.hotel.chambres.indexOf(chambre)+1;
        }
    }
}

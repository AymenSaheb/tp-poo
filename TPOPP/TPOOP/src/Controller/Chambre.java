package Controller;

import Model.Hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Chambre {

    Hotel hotel;  //Hotel dont la chambre appartient
    public int numero;  //Numero de la chambre
    public int nombre_lits; // Nombres de lits disponibles dans la chambre
    public boolean vip;  // indique est ce que la chambre est vip ou non
    public boolean reservee;  //indique si la chambre est reservee ou non

     public HashMap<Date,Date> chambres_reserveess=new HashMap<>();
     public ArrayList<chambres_reservees> chambres_reservees=new ArrayList<>();



    public  void trier_arraylist() {

        Collections.sort(chambres_reservees, new Comparator<chambres_reservees>() {
            @Override
            public int compare(chambres_reservees cr1, chambres_reservees cr2) {
                // Comparaison des années
                int compareYears = Integer.compare(cr1.date_debut.annee, cr2.date_debut.annee);
                if (compareYears != 0) {
                    return compareYears;
                }

                // Comparaison des mois
                int compareMonths = Integer.compare(cr1.date_debut.mois, cr2.date_debut.mois);
                if (compareMonths != 0) {
                    return compareMonths;
                }

                // Comparaison des jours
                return Integer.compare(cr1.date_debut.mois, cr2.date_debut.mois);
            }
        });
    }



    public Chambre(Hotel hotel,int nombre_lits,boolean vip)
    {
        this.hotel=hotel;
        this.reservee=false;  //apres la creation de la chambre,c'est logique qu'elle soit disponible
        this.nombre_lits=nombre_lits;
        this.vip=vip;

    }



}

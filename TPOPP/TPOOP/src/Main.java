import Controller.*;
import Model.Hotel;
import View.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

          Hotel hotell=new Hotel();
          Administrateur administrateur=new Administrateur();
          administrateur.hotel=hotell;
       inter classeIntermediaire=new inter(hotell,administrateur);
       /* Hotel hotell=new Hotel();
        Administrateur administrateur=new Administrateur();
        administrateur.hotel=hotell;
        hotell.administrateur=administrateur;

        */
        inter.administrateur.Creer_Chambre(3,true);
        inter.administrateur.Creer_Chambre(4,true);
        inter.administrateur.Creer_Chambre(1,false);
        inter.administrateur.Creer_Chambre(2,true);
        inter.administrateur.Modifier_Chambre(1,false);

       // hotell.administrateur.Supprimer_Chambre(1);


        //System.out.println(hotell.chambres.size());
        //System.out.println(hotell.chambres.get(0).nombre_lits);

        Date date1=new Date(1,1,2024);
        Date date2=new Date(1,2,2024);
        Date date3=new Date(2,2,2024);
        Date date4=new Date(2,3,2024);
        Date date5=new Date(1,4,2024);
        Date date6=new Date(1,5,2024);

        Date date7=new Date(1,7,2024);
        Date date8=new Date(3,7,2024);

        //System.out.println(date1.estAvant(date2));

     //   ClasseIntermediaire.hotel.chambres.get(0).chambres_reservees.add(new chambres_reservees(date1,date2));
       // ClasseIntermediaire.hotel.chambres.get(0).chambres_reservees.add(new chambres_reservees(date3,date4));
        //ClasseIntermediaire.hotel.chambres.get(0).chambres_reservees.add(new chambres_reservees(date5,date6));

    // System.out.println(ClasseIntermediaire.hotel.chambres.get(0).chambres_reservees.get(2).date_debut.jour);
  //   System.out.println(ClasseIntermediaire.hotel.chambres.get(0).chambres_reservees.get(2).date_fin.mois);

//        Client client1=new Client();
  //      Client client2=new Client();



    //    client1.Demander_Reservation(ClasseIntermediaire.hotel,3,true,date7,date8);

        //client2.Demander_Reservation(ClasseIntermediaire.hotel,2,true,date5,date6);

       //System.out.println();


      //  System.out.println(hotell.demandes.get(0).date_fin.annee);
     //  System.out.println(administrateur.Verifier_Disponibilite(ClasseIntermediaire.hotel.demandes.get(0)));
        //System.out.println(hotell.chambres.get(0).numero);

       // System.out.println(date7.isBetween(date1,date2));
       // System.out.println(hotell.chambres.get(0).chambres_reservees.get(date3).jour);
        //System.out.println(hotell.chambres.get(0).vip);




        Client client=new Client();
        client.nom="ahmed";
        client.password="ahmed";
        inter.hotel.clients.add(client);
       //InterfaceDemandeReservation interfaceDemandeReservation=new InterfaceDemandeReservation();
        auth interfaceAuthentification=new auth();
     //  InterfaceAdministrateur interfaceAdministrateur=new InterfaceAdministrateur();
        //Client client=new Client();
       // InterfaceClient interfaceClient=new InterfaceClient(client);
      //InterfaceAdministrateur interfaceAdministrateur=new InterfaceAdministrateur();
    // InterfaceCreerChambre interfaceCreerChambre=new InterfaceCreerChambre();
      //  InterfaceSupprimerChambre interfaceSupprimerChambre=new InterfaceSupprimerChambre();
     //InterfaceDemandesValides interfaceDemandesValides=new InterfaceDemandesValides();
     //InterfaceDemandesNonValides interfaceDemandesNonValides=new InterfaceDemandesNonValides(1);





           // InterfaceAuthentification interfaceAuthentification=new InterfaceAuthentification();






    }
}
package View;

import Controller.Administrateur;
import Model.Hotel;

public class inter {
   public static Hotel hotel;
   public static int i=0;
   public static Administrateur administrateur;
    public inter(Hotel hotel,Administrateur administrateur) {
        this.hotel = hotel;
        inter.administrateur=administrateur;
    }

    public inter(Administrateur administrateur) {

    }
}

package Controller;

public class chambres_reservees {

    public chambres_reservees(Date date_debut , Date date_fin) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

     public Date date_debut;
    public Date date_fin;
    @Override
    public String toString() {
        return "date de but est "+ date_debut +" et date fin est "+ date_fin ;
    }


}

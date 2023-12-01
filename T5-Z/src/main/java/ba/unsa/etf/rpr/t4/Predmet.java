package ba.unsa.etf.rpr.t4;

import java.util.ArrayList;

public class Predmet implements Predstavljanje{

    private String naziv;

    private String opis;
    private ArrayList<Ocjena> ocjene;


    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public void setOpis(String opis){
        this.opis = opis;
    }

    public String getNaziv(){
        return naziv;
    }

    public String getOpis(){
        return opis;
    }

    public String predstavi(){
        return "Naziv predmeta: " + naziv + " Opis predmeta: " + opis;
    }

}

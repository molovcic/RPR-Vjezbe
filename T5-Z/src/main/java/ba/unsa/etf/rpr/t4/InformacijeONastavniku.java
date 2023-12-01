package ba.unsa.etf.rpr.t4;

import java.util.ArrayList;

public class InformacijeONastavniku extends LicneInformacije implements Predstavljanje{

    private String titula;

    private ArrayList<Ocjena> ocjene;

    public void setTitula(String titula){
        this.titula = titula;
    }

    public String getTitula(){
        return titula;
    }

    public String predstavi(){
        return this.predstavi() + " Titula: " + titula;
    }

}

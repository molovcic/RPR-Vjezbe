package ba.unsa.etf.rpr.t4;

import java.util.ArrayList;

public class KolekcijaPoruka {

    ArrayList<String> poruke;

    public KolekcijaPoruka(ArrayList<LicneInformacije> objekti){
        for(LicneInformacije x : objekti){
            poruke.add(x.predstavi());
        }
    }

    public ArrayList<String> getPoruke(){
        return poruke;
    }
}
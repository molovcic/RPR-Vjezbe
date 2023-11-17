package ba.unsa.etf.rpr.t4;

import java.util.*;
import java.io.*;
import org.json.simple.JSONObject;

public class LaptopDaoJSONFile implements LaptopDao{

    File fileJson;
    ArrayList<Laptop> laptopi;

    LaptopDaoJSONFile(File file){
        fileJson = file;
        laptopi = new ArrayList<>();
    }

    public Laptop getLaptop(String procesor){
        for(Laptop l : laptopi){
            if(l.getProcesor().equals(procesor)){
                return l;
            }
        }
        return null;
    }

    public void napuniListu(ArrayList<Laptop> laptopi){
        this.laptopi = laptopi;
    }

    public void dodajLaptopUListu(Laptop laptop){
        laptopi.add(laptop);
    }

    public ArrayList<Laptop> vratiPodatkeIzDatoteke(){

    }

}

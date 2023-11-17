package ba.unsa.etf.rpr.t4;

import java.io.*;
import java.util.ArrayList;

public abstract class LaptopDaoSerializableFile implements LaptopDao, Serializable {

    private File serFile;
    private ArrayList<Laptop> laptopi;

    LaptopDaoSerializableFile(File file){
        this.serFile = file;
        laptopi = new ArrayList<Laptop>();
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop){
        laptopi.add(laptop);
    }

    @Override
    public Laptop getLaptop(String procesor){
        for(Laptop l : laptopi){
            if(l.getProcesor().equals(procesor)) return l;
        }
        return null;
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop){
        try{
            ArrayList<Laptop> laptopi = vratiPodatkeIzDatoteteke();
            laptopi.add(laptop);
            FileOutputStream file = new FileOutputStream(serFile);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(laptopi);
            out.close();
            file.close();
            System.out.println("Uspjesna serijalizacija");
        }
        catch(IOException ex){
            System.out.println("Neuspjesna serijalizacija!");
        }
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi){
        this.laptopi = laptopi;
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteteke(){
        try{
            FileInputStream file = new FileInputStream(serFile);
            ObjectInputStream in = new ObjectInputStream(file);

            ArrayList<Laptop> laptopiread = (ArrayList<Laptop>)in.readObject();
            this.laptopi = laptopiread;
            return laptopiread;
        }
        catch(IOException | ClassNotFoundException ex){
            System.out.println("Neuspjesna deserijalizacija");
            return null;
        }
    }

}

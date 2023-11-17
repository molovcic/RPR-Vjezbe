package ba.unsa.etf.rpr.t4;

public class Laptop {
    private String brend;
    private String model;
    private double cijena;
    private int ram;
    private int hdd;
    private int ssd;
    private String procesor;
    private String grafickaKartica;
    private double velicinaEkrana;


    Laptop(){
        this.brend = null;
        this.model = null;
        this.cijena = 0;
        this.ram = 0;
        this.hdd = 0;
        this.ssd = 0;
        this.procesor = null;
        this.grafickaKartica = null;
        this.velicinaEkrana = 0;
    }

    Laptop(String brend, String model, double cijena, int ram, int hdd, int ssd,
           String procesor, String grafickaKartica, double velicinaEkrana){
        this.brend = brend;
        this.model = model;
        this.cijena = cijena;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
        this.procesor = procesor;
        this.grafickaKartica = grafickaKartica;
        this.velicinaEkrana = velicinaEkrana;
    }

    public void setBrend(String brend){
        this.brend = brend;
    }
    public String getBrend(String brend){
        return this.brend;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }

    public void setCijena(double cijena){
        this.cijena = cijena;
    }
    public double getCijena(){
        return this.cijena;
    }

    public void setRam(int ram){
        this.ram = ram;
    }
    public int getRam(){
        return this.ram;
    }

    public void setHdd(int hdd){
        this.hdd = hdd;
    }
    public int getHdd(){
        return this.hdd;
    }

    public void setSsd(int ssd){
        this.ssd = ssd;
    }
    public int getSsd(){
        return this.ssd;
    }

    public void setProcesor(String procesor){
        this.procesor = procesor;
    }
    public String getProcesor(){
        return this.procesor;
    }

    public void setGrafickaKartica(String grafickaKartica){
        this.grafickaKartica = grafickaKartica;
    }
    public String getGrafickaKartica(){
        return this.grafickaKartica;
    }

    public void setVelicinaEkrana(double velicinaEkrana){
        this.velicinaEkrana = velicinaEkrana;
    }
    public double getVelicinaEkrana(){
        return this.velicinaEkrana;
    }

}
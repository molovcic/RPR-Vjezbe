package ba.unsa.etf.rpr.t4;
public class LicneInformacije implements Predstavljanje{

    private String ime;
    private String prezime;

    public void setIme(String ime){
        this.ime = ime;
    }

    public void setPrezime(String prezime){
        this.prezime = prezime;
    }

    public String getIme(){
        return ime;
    }

    public String getPrezime(){
        return prezime;
    }

    public String predstavi(){
        return "Ime: " + ime + " " + prezime;
    }

}

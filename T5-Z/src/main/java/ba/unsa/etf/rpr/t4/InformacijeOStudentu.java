package ba.unsa.etf.rpr.t4;

public class InformacijeOStudentu extends LicneInformacije implements Predstavljanje, MozeOcijeniti{

    private String godinaStudija;
    private String brojIndexa;

    public void setGodinaStudija(String godinaStudija){
        this.godinaStudija = godinaStudija;
    }

    public void setBrojIndexa(String brojIndexa){
        this.brojIndexa = brojIndexa;
    }

    public String getGodinaStudija(){
        return godinaStudija;
    }

    public String getBrojIndexa(){
        return brojIndexa;
    }

    public String predstavi(){
        return super.predstavi() + " Godina studija: " + godinaStudija + " Broj indexa: " + brojIndexa;
    }

    public Ocjena ocjena(int x){
        Ocjena ocjena = new Ocjena();
        ocjena.setOcjena(x);
        return ocjena;
    }

    public void ocijeniPredmet(int x){

    }

}

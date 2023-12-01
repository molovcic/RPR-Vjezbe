package ba.unsa.etf.rpr.t4;

public class Ocjena {

    private LicneInformacije osoba;
    private int ocjena;

    public void setOcjena(int ocjena){
        if(ocjena> 0 || ocjena <= 10) {
            this.ocjena = ocjena;
        }
    }
}

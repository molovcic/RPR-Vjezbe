package ba.unsa.etf.rpr.t3.z1;

public enum Grad {
    SARAJEVO("033"),
    TUZLA("035"),
    ZENICA("032"),
    MOSTAR("036"),
    TRAVNIK("030"),
    ORASJE("031"),
    LIVNO("034"),
    BIHAC("037"),
    GORAZDE("038"),
    BRCKO("049"),
    SIROKI_BRIJEG("039"),
    MRKONJIC_GRAD("050"),
    BANJA_LUKA("051"),
    PRIJEDOR("052"),
    DOBOJ("053"),
    SAMAC("054"),
    BIJELJINA("055"),
    ZVORNIK("056"),
    PALE("057"),
    FOCA("058"),
    TREBINJE("059");


    private String pozivniBroj;

    Grad(String pozivniBroj){ this.pozivniBroj = pozivniBroj; }

    String getPozivniBroj(){ return pozivniBroj; }

    public static Grad izPozivnog(String pozivni){
        for(Grad g : Grad.values()){
            if(g.getPozivniBroj() == pozivni){
                return g;
            }
        }
        return null;
    }

};

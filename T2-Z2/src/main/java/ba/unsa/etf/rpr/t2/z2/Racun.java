package ba.unsa.etf.rpr.t2.z2;

import java.lang.Math;

class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean prekoracenjeRacuna;
    private double stanjeRacuna;

    public Racun(Long brojRacuna, Osoba osoba){
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = osoba;
    }

    private boolean provjeriOdobrenjePrekoracnja(double prekoracnje){
        if(prekoracenjeRacuna) return true;
        return false;
    };

    public boolean izvrsiUplatu(double uplata){
        stanjeRacuna += uplata;
        return true;
    }

    public boolean izvrsiIsplatu(double isplata){
        if(stanjeRacuna - isplata < 0 && !prekoracenjeRacuna ) return false;
        stanjeRacuna -= isplata;
        return true;
    }

    void odobriPrekoracenje(double prekoracenje){
        prekoracenjeRacuna = true;
    }

}

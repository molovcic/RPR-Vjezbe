package ba.unsa.etf.rpr.t2.z2;

class Korisnik extends Osoba{

    private Racun racun;
    Korisnik(String ime, String prezime){
        super(ime, prezime);
    }
    void dodajRacun(Racun dodaj){
        this.racun = dodaj;
    }
}

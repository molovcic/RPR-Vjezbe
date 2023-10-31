package ba.unsa.etf.rpr.t2.z2;
import java.util.List;

class Banka {
    protected Long brojRacuna;

    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;

    public Banka(){}
    public Uposlenik kreirajNovogUposlenika(String ime, String prezime) {
        Uposlenik novi = new Uposlenik(ime, prezime);
        uposlenici.add(novi);
        return novi;
    }
    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik novi = new Korisnik(ime, prezime);
        korisnici.add(novi);
        return novi;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik korisnik){
        return new Racun(brojRacuna, korisnik);
    }

}

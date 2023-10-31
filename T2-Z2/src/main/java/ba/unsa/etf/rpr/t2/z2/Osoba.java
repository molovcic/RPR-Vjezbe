package ba.unsa.etf.rpr.t2.z2;

class Osoba {
    private String ime;
    private String prezime;

    public Osoba(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }

    public String toString(){
        return (this.ime + this.prezime);
    }

}
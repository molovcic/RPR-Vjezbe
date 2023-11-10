package ba.unsa.etf.rpr.t3.z1;

import java.util.*;
public class Imenik {

    private Map<String, TelefonskiBroj> brojevi;

    public Imenik(){
        this.brojevi = new HashMap<String, TelefonskiBroj>();
    }

    public void dodaj(String ime, TelefonskiBroj broj){
        this.brojevi.put(ime, broj);
    }

    public void setBrojevi(Map<String, TelefonskiBroj> brojevi){
        this.brojevi = brojevi;
    }

    public String dajBroj(String ime){
        TelefonskiBroj broj = this.brojevi.get(ime);
        if(broj != null){
            return broj.ispisi();
        }
        return null;
    }

    String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> entry : this.brojevi.entrySet()){
            if(entry.getValue().ispisi().equals(broj.ispisi())){
                return entry.getKey();
            }
        }
        return null;
    }

    public String naSlovo(char s){
        StringBuilder builder = new StringBuilder();
        int counter = 1;
        for(Map.Entry<String, TelefonskiBroj> entry : this.brojevi.entrySet()){
            if(entry.getKey().startsWith(String.valueOf(s))){
                builder.append(counter)
                        .append(". ")
                        .append(entry.getKey())
                        .append(" - ")
                        .append(entry.getValue().ispisi())
                        .append(System.lineSeparator());
                counter++;
            }
        }
        return builder.toString();
    }

    public Set<String> izGrada(Grad g){
        Set<String> result = new TreeSet<String>();
        for(Map.Entry<String, TelefonskiBroj> entry : this.brojevi.entrySet()){
            if(jelIzGrada(entry.getValue(), g)){
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> result = new TreeSet<TelefonskiBroj>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj o1, TelefonskiBroj o2) {
                return o1.ispisi().compareTo(o2.ispisi());
            }
        });

        for(Map.Entry<String, TelefonskiBroj> entry : this.brojevi.entrySet()){
            if(jelIzGrada(entry.getValue(), g)){
                result.add(entry.getValue());
            }
        }
        return result;
    }

    private boolean jelIzGrada(TelefonskiBroj broj, Grad grad){
        if(broj instanceof FiksniBroj){
            return grad.equals(((FiksniBroj) broj).getGrad());
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        int counter = 1;
        for(Map.Entry<String, TelefonskiBroj> entry : this.brojevi.entrySet()){
            builder.append(counter)
                    .append(". ")
                    .append(entry.getKey())
                    .append(" - ")
                    .append(entry.getValue().ispisi())
                    .append(System.lineSeparator());
            counter++;
        }
        return builder.toString();
    }

}

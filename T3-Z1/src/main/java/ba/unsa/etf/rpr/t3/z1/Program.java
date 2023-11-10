package ba.unsa.etf.rpr.t3.z1;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static Scanner scanner = new Scanner(System.in);
    public static Imenik imenik = new Imenik();

    public void main(String[] args) {
        while (true) {
            System.out.println("Unesite komandu [dodaj, dajBroj, dajIme, naSlovo, izGrada, izGradaBrojevi, imenik, izlaz]");
            String command = scanner.nextLine();
            switch(command){
                case "dodaj":
                    dodajBroj();
                    break;

                case "dajBroj":
                    dajBroj();
                    break;

                case "dajIme":
                    dajIme();
                    break;

                case "naSlovo":
                    naSlovo();
                    break;

                case "izGrada":
                    izGrada();
                    break;

                case "izGradaBrojevi":
                    izGradaBrojevi();
                    break;

                case "imenik":
                    ispisiImenik();
                    break;

                case "izlaz":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pogresna komanda");
            }
        }
    }

    private static TelefonskiBroj unesiBrojTelefona(){
        System.out.println("Unesite tip broja (fiksni, mobilni, medunarodni): ");
        String tip = scanner.nextLine();
        switch(tip){
            case "fiksni":
                System.out.println("Unesite pozivni:");
                String pozivni = scanner.nextLine();
                System.out.println("Unesite broj:");
                String broj = scanner.nextLine();
                return new FiksniBroj(Grad.izPozivnog(pozivni), broj);

            case "mobilni":
                System.out.println("Unesite mrezu:");
                int mreza = scanner.nextInt();
                System.out.println("Unesite broj:");
                String mobilniBroj = scanner.nextLine();
                return new MobilniBroj(mreza, mobilniBroj);

            case "medunarodni":
                System.out.println("Unesite kod drzave: ");
                String kodDrzave = scanner.nextLine();
                System.out.println("Unesite broj: ");
                String brojMedunarodni = scanner.nextLine();
                return new MedunarodniBroj(kodDrzave, brojMedunarodni);
        }
        return null;
    }

    private static void dodajBroj(){
        System.out.println("Unesite ime: ");
        String name = scanner.nextLine();
        TelefonskiBroj broj = unesiBrojTelefona();
        imenik.dodaj(name, broj);
    }

    private static void dajBroj(){
        System.out.println("Unesite ime: ");
        String name = scanner.nextLine();
        String broj = imenik.dajBroj(name);
        System.out.println(broj);
    }

    private static void dajIme(){
        TelefonskiBroj broj = unesiBrojTelefona();
        String ime = imenik.dajIme(broj);
        System.out.println(ime);
    }

    public static void izGradaBrojevi(){
        System.out.println("Unesite ime grada: ");
        String grad = scanner.nextLine();
        Grad g = Grad.valueOf(grad);
        Set<TelefonskiBroj> result = imenik.izGradaBrojevi(g);
        for(TelefonskiBroj broj : result){
            System.out.println(broj.ispisi());
        }
    }

    public static void izGrada(){
        System.out.println("Unesite ime grada: ");
        String grad = scanner.nextLine();
        Grad g = Grad.valueOf(grad);
        Set<String> result = imenik.izGrada(g);
        for(String osoba : result){
            System.out.println(osoba);
        }
    }

    private static void naSlovo(){
        System.out.println("Unesite prvo slovo imena: ");
        String slovo = scanner.nextLine();
        String result = imenik.naSlovo(slovo.toCharArray()[0]);
        System.out.println(result);
    }

    public static void ispisiImenik(){
        System.out.println(imenik.toString());
    }

}

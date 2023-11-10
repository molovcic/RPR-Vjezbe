package ba.unsa.etf.rpr.t3.z1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class ImenikTest {

    private static Imenik imenik = new Imenik();

    @BeforeAll
    public static void setup(){
        imenik.dodaj("Mirza", new MobilniBroj(62, "521 412"));
        imenik.dodaj("Zlatan", new FiksniBroj(Grad.SARAJEVO, "832 835"));
        imenik.dodaj("Adna", new MedunarodniBroj("+384", "753 145"));
        imenik.dodaj("Edin", new MobilniBroj(61, "463 234"));
    }


    @Test
    public void dajBroj(){
        String broj = imenik.dajBroj("Mirza");
        assertEquals(broj, "062/521 412");
    }

    @Test
    public void dajBroj2(){
        String broj = imenik.dajBroj("Adna");
        assertEquals(broj, "+384 753 145");
    }

    

}

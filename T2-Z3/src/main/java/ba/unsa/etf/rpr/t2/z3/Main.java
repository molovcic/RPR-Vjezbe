package ba.unsa.etf.rpr.t2.z3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> lista = new ArrayList<Double>();

        while(true){
            System.out.println("Unesite broj (stop za kraj): ");
            String line = scanner.nextLine();
            if("stop".equalsIgnoreCase(line)){
                break;
            }
            try{
                Double number = Double.parseDouble(line);
                lista.add(number);
            }
            catch(Exception e){
                System.out.println("Uneseni string nije broj");
                continue;
            }
        }

        System.out.println("Min: " + Funkcije.min(lista));
        System.out.println("Max: " + Funkcije.max(lista));
        System.out.println("Mean: " + Funkcije.mean(lista));
        System.out.println("StDev: " + Funkcije.stDev(lista));
    }
}
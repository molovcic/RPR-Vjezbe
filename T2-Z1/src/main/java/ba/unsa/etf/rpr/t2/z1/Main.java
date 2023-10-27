package ba.unsa.etf.rpr.t2.z1;;

import java.lang.Math;
import java.util.Scanner;


class Racunanje{
    public double x;


    public Racunanje(double x){
        this.x = x;
    }

    public double Sinus(){
        return Math.sin(this.x);
    }

    public double Faktorijel(){
        int result = 1;
        for(int i = 1; i < this.x; i++){
            result *= i;
        }
        return result;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Racunanje x = new Racunanje(5);
        System.out.println("Faktorijel: " + x.Faktorijel());
        System.out.println("Sinus: " + x.Sinus());
    }
}
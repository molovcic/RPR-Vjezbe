package ba.unsa.etf.rpr.t1.z2;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class SumaCifara {
    public static void main(String[] args) {
        System.out.println("Unesite n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
    public static int sumaCifara(int n){
        int s = 0;
        while(n != 0){
            s += (n % 10);
            n /= 10;
        }
        return s;
    }
}
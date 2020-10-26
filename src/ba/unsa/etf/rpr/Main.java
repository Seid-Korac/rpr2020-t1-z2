package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static Integer sumaCifara(int n) {
        int sum = 0;
        while (n != 0) {
                sum += n%10;
                n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n = input.nextInt();

        if (n <= 0) {
            System.out.println("Broj mora biti veci ili jednak 1");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0) {
                System.out.println(i + " ");
            }
        }
    }
}

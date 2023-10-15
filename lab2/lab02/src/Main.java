import java.math.BigInteger;
import java.util.Scanner;

// progresie geometrica 1 + 2 + 4 + ... + pow(2, 63)
// formula 2^64 - 1

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Da un numar ");
        int nr = scanner.nextInt();

        BigInteger rez = new BigInteger("1");
        BigInteger unu = new BigInteger("1");
        BigInteger doi = new BigInteger("2");
        BigInteger sum = new BigInteger("2");

        rez = doi.pow(nr-1);
        sum = sum.pow(nr);
        sum = sum.subtract(unu);

        System.out.println("Pe casuta " + nr + " sunt " + rez + " boabe de grau");
        System.out.println("In total sunt " + sum + " boabe de grau");
    }
}

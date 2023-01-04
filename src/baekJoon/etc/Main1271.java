package baekJoon.etc;
import java.math.BigInteger;
import java.util.Scanner;

public class Main1271 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        BigInteger m = s.nextBigInteger();
        BigInteger n = s.nextBigInteger();

        System.out.println(m.divide(n));
        System.out.println(m.remainder(n));
    }
}

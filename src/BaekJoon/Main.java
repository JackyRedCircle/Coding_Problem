package BaekJoon;
// [1003]
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tNum = s.nextInt();

        int[] numArr = new int[tNum];

        for (int i = 0; i < tNum; i++) {
            numArr[i] = s.nextInt();
        }

        for (int i = 0; i < tNum; i++) {
            Calculation c = new Calculation();

            c.fibonacci(numArr[i]);
            System.out.println(c.c0+" "+c.c1);
        }
    }
}

class Calculation {

    int c0 = 0;
    int c1 = 0;

    int fibonacci(int n) {
        if (n == 0) {
            c0++;
            return 0;
        } else if (n == 1) {
            c1++;
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

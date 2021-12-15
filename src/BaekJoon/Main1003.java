package BaekJoon;
import java.util.Scanner;
// [1003]
public class Main1003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tNum = s.nextInt();

        int[] numArr = new int[tNum];

        for (int i = 0; i < tNum; i++) {
            numArr[i] = s.nextInt();
        }

        for (int i = 0; i < tNum; i++) {
            if (numArr[i] == 0) {
                System.out.println("1 0");
            }
            else {
                System.out.println(Calculation.fibonacciFunction(numArr[i]-1)+" "+Calculation.fibonacciFunction(numArr[i]));
            }
        }
    }
}
//메모라이제이션 사용
class Calculation {
    static int[] fiboArr = new int[41];

    static int fibonacciFunction(int num) {
        fiboArr[1] = 1;

        if (num == 0) {
            return fiboArr[0];
        }

        else if (num == 1) {
            return fiboArr[1];
        }

        else if (fiboArr[num] != 0) {
            return fiboArr[num];
        }
        else {
            return fibonacciFunction(num - 1) + fibonacciFunction(num -2);
        }
    }
}
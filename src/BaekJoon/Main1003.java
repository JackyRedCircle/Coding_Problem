package BaekJoon;
// [1003]
import java.util.Scanner;

public class Main1003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tNum = s.nextInt();

        int[] numArr = new int[tNum];

        for (int i = 0; i < tNum; i++) {
            numArr[i] = s.nextInt();
        }

        for (int i = 0; i < tNum; i++) {
            int fir = 1;
            int sec = 1;

            if (numArr[i] == 0) {
                System.out.println("1 0");
            }
            else if (numArr[i] == 1) {
                System.out.println("0 1");
            }
            else if (numArr[i] == 2) {
                System.out.println("1 2");
            }
            else {
                for (int j = 3; j <= numArr[i]; j++) {
                    int tmp = fir;
                    fir += sec;
                    sec = tmp;
                }
                System.out.println(sec+ " " + fir);
            }
        }
    }
}

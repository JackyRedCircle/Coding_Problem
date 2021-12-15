package BaekJoon.Use_the_if;
import java.util.Scanner;

public class Main2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String ans = s.nextLine();

        String [] ansArr = ans.split("\\s");

        int h = Integer.parseInt(ansArr[0]);
        int m = Integer.parseInt(ansArr[1]);

        int calH = h - 1;
        int calM = m - 45;

        if (calM >= 0) {
            System.out.println(h+" "+calM);
        }
        else {
            if (calH >= 0) {
                System.out.println(calH+" "+(m+15));
            }
            else {
                System.out.println(23+" "+(m+15));
            }
        }
    }
}
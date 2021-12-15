package BaekJoon;

import java.util.Scanner;

public class Main10430 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String ans = s.nextLine();

        String [] ansArr = ans.split("\\s");

        int A = Integer.parseInt(ansArr[0]);
        int B = Integer.parseInt(ansArr[1]);
        int C = Integer.parseInt(ansArr[2]);

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
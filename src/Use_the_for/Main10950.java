package Use_the_for;

import java.util.Scanner;

public class Main10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tNum = s.nextInt();

        int[] ansArr = new int[tNum];
        s.nextLine();

        for (int i = 0; i < tNum; i++) {
            String ans = s.nextLine();
            String [] abArr = ans.split("\\s");
            ansArr[i] = Integer.parseInt(abArr[0]) + Integer.parseInt(abArr[1]);
        }

        for (int i = 0; i < tNum; i++) {
            System.out.println(ansArr[i]);
        }
    }
}

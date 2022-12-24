package BaekJoon.IO_and_Calculation;

import java.util.Scanner;
public class Main3003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] unitArr = {{1,1,2,2,2,8},
                           {0,0,0,0,0,0}};

        for(int i = 0; i < 6; i++){
            unitArr[1][i] = s.nextInt();
        }

        for(int i = 0; i < 6; i++){
            unitArr[0][i] -= unitArr[1][i];
            System.out.printf("%d", unitArr[0][i]);
            if (i != 5) System.out.print(" ");
            else break;
        }
    }
}

package BaekJoon.Use_the_1D_array;

import java.util.Scanner;

public class Main10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] intArr = new int[N+1];
        int count = 0;

        for (int i = 0; i < intArr.length; i++){
            intArr[i] = s.nextInt();
        }

        for (int val : intArr){
            if (val == intArr[N]) count++;
        }

        System.out.print(count-1);
    }
}

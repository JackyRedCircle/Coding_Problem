package BaekJoon.Use_the_if;

import java.util.Scanner;

public class Main2753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int year = s.nextInt();

        if (year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
            System.out.printf("1");
        }
        else {
            System.out.printf("0");
        }
    }
}
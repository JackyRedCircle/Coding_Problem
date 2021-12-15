package BaekJoon.Use_the_if;

import java.util.Scanner;

public class Main9498 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int score = s.nextInt();

        if(90 <= score) {
            System.out.printf("A");
        }
        else if(80 <= score) {
            System.out.printf("B");
        }
        else if(70 <= score) {
            System.out.printf("C");
        }
        else if(60 <= score) {
            System.out.printf("D");
        }
        else {
            System.out.printf("F");
        }
    }
}

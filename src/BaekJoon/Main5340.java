package BaekJoon;

import java.util.Scanner;

public class Main5340 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] valArr = new int[6];
        String[] inputArr = new String[6];

        for (int i = 0; i < 6; i++) {
            inputArr[i] = s.nextLine();
        }

        for (int i = 0; i < 6; i++) {
            valArr[i] = inputArr[i].length();

            for (int j = inputArr[i].length() - 1; j >= 0; j--) {
                if (inputArr[i].charAt(j) != ' ') {
                    valArr[i] -= inputArr[i].length() - j - 1;
                    break;
                }
            }
        }

        System.out.printf("Latitude %d:%d:%d\n" +
                          "Longitude %d:%d:%d", valArr[0], valArr[1], valArr[2], valArr[3], valArr[4], valArr[5]);
    }
}

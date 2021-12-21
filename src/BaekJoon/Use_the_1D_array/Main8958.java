package BaekJoon.Use_the_1D_array;

import java.util.Scanner;

public class Main8958 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        s.nextLine();
        int score;
        int totalScore;
        int[] resArr = new int[t];

        for (int i = 0; i < t; i++){
            totalScore = 0;
            score = 0;
            String oxArr = s.nextLine();
            String[] caseArr = oxArr.split("");
            for (int j = 0; j < caseArr.length; j++) {
                if (j < caseArr.length-1) {
                    if (caseArr[j].equals("O")) {
                        if (caseArr[j].equals(caseArr[j+1])) {
                            score++;
                            totalScore += score;
                        }
                        else {
                            score++;
//                            System.out.println("연속 스코어 : "+score);
                            totalScore += score;
                            score = 0;
                        }
                    }
                    else {
                        score = 0;
                    }
                }
                else {
                    if (caseArr[caseArr.length-1].equals("O")) {
                        score++;
//                        System.out.println("연속 스코어 : "+score);
                    }
                    totalScore += score;
                }
            }
            resArr[i] = totalScore;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(resArr[i]);
        }
    }
}
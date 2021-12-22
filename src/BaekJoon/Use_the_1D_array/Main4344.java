package BaekJoon.Use_the_1D_array;

import java.util.Scanner;

public class Main4344 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tmp;
        int overAverage;
        double average;
        String inputScore;
        String[] scoreArr;
        double[] resArr = new double[n];
        s.nextLine();
        double num;
        for (int i = 0; i < n; i++) {
            tmp = 0;
            overAverage = 0;
            inputScore = s.nextLine();
            scoreArr = inputScore.split(" ");
            for (int j = 1; j < scoreArr.length; j++) {
                tmp += Integer.parseInt(scoreArr[j]);
            }
            average = (double)(tmp)/Integer.parseInt(scoreArr[0]);
            for (int j = 1; j < scoreArr.length; j++) {
                if (Integer.parseInt(scoreArr[j]) > average) {
                    overAverage++;
                }
            }
            resArr[i] = (double)(overAverage)/Integer.parseInt(scoreArr[0]);
        }
        for (int i = 0; i < n; i++) {
            resArr[i] = Math.round(resArr[i]*100000);
            num = resArr[i]/1000;
            System.out.printf("%.3f",num);
            System.out.println("%");
        }
    }
}
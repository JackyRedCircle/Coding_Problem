package BaekJoon.Use_the_String;

import java.util.Scanner;
public class Main2941 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] croatiaCharArr = {"dz=", "c-", "c=", "d-", "lj", "nj", "s=", "z="};

        int croatiaCharCount = 0;
        int alphabetCount = 0;
        boolean isSame;
        int dzCount;

        String inputWord = s.nextLine();
        char[] inputWordArr = inputWord.toCharArray();

        for (int i = 0; i < croatiaCharArr.length; i++ ){
            for (int j = 0; j < inputWord.length() - croatiaCharArr[i].length() + 1; j++) {
                isSame = false;
                dzCount = 0;
                for (int k = 0; k < croatiaCharArr[i].length(); k++) {
                    if (inputWordArr[j + k] == croatiaCharArr[i].charAt(k)) dzCount++;
                }

                if (i == 0 && dzCount == 3 || i != 0 && dzCount == 2) isSame = true;

                if (isSame) {
                    croatiaCharCount++;
                    for (int k = 0; k < croatiaCharArr[i].length(); k++) {
                        inputWordArr[j + k] = '0';
                    }
                }
            }
        }

        for(char val : inputWordArr) {
            alphabetCount = (val != '0') ? alphabetCount + 1 : alphabetCount;
        }
//
//        for (int i = 0; i < inputWordArr.length; i++) {
//            System.out.print(inputWordArr[i]);
//        }
//
//        System.out.println();
        System.out.print(croatiaCharCount + alphabetCount);
    }
}

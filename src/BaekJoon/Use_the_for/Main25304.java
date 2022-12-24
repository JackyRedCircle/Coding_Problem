package BaekJoon.Use_the_for;

import java.util.Scanner;

public class Main25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int calculatedCost =0;
        int totalCost = s.nextInt();
        int listNum = s.nextInt();

        String res;

        int[] itemList = new int[listNum*2];

        for(int i = 0; i < itemList.length; i++){
            itemList[i] = s.nextInt();
        }

        for(int i = 0; i < itemList.length; i += 2){
            calculatedCost += itemList[i] * itemList[i+1];
        }

        res = (totalCost == calculatedCost) ? "Yes" : "No";

        System.out.print(res);
    }
}

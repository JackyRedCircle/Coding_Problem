package baekJoon.step_by_step.use_the_1d_array;

import java.util.Scanner;

public class Main5597 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] submit = new int[28];
        int[] nonSubmit = {0, 0};
        int[] checkListArr = new int [30];
        int tmp;

        for (int i = 0; i < 28; i++){
            submit[i] = s.nextInt();
        }

        for (int i = 1; i <= 30; i++){
            for (int j = 0; j < 28; j++){
                if (submit[j] == i) {
                    checkListArr[i-1] = 1;
                    break;
                }
            }
        }

        for (int i = 0; i < 30; i++){
            if (checkListArr[i] != 1){
                if(nonSubmit[0] == 0) nonSubmit[0] = i+1;
                else nonSubmit[1] = i+1;
            }
        }

        tmp = Math.max(nonSubmit[0], nonSubmit[1]);
        nonSubmit[0] = Math.min(nonSubmit[0], nonSubmit[1]);
        nonSubmit[1] = tmp;

        System.out.printf("%d\n%d", nonSubmit[0], nonSubmit[1]);
    }
}

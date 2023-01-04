package baekJoon.step_by_step.use_the_if;

import java.util.Scanner;

public class Main2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] diceArr = new int[3];
        int[] eyeNumberArr = new int[6];
        int money;
        int[] resArr;
        for (int i = 0; i < diceArr.length; i++){
            diceArr[i] = s.nextInt();
        }

        for (int eye : diceArr){
            eyeNumberArr[eye-1]++;
        }

        resArr = max(eyeNumberArr);

        if (resArr[1] == 3) money = 10000 + resArr[0]*1000;
        else if (resArr[1] == 2) money = 1000 + resArr[0]*100;
        else money = resArr[0] * 100;

        System.out.print(money);
    }

    static int[] max(int[] valArr){
        int num = 0, eyeNum = 0;
        int[] resArr = new int[2];

        for(int val : valArr) {
            num = Math.max(val, num);
        }

        if (num == 1){
            for (int i = 0; i < valArr.length; i++) {
                if (valArr[i] > 0) eyeNum = Math.max(eyeNum, i+1);
            }
        }

        else {
            for (int i = 0; i < valArr.length; i++){
                eyeNum = (valArr[i] == num) ? i+1 : eyeNum;
            }
        }

        resArr[0] = eyeNum;
        resArr[1] = num;

        return resArr;
    }
}

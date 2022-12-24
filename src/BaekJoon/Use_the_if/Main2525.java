package BaekJoon.Use_the_if;

import java.util.Scanner;

public class Main2525 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] timeArr = new int[3];
        int min, hour;

        for(int i = 0; i < timeArr.length; i++){
            timeArr[i] = s.nextInt();
            //timeArr[] = {입력 (시간), 입력 (분), 조리 (분)}
        }

        min = timeArr[1] + timeArr[2];
        hour = timeArr[0] + (min / 60);

        timeArr[0] = (hour > 24) ? (hour % 24) : hour;
        timeArr[0] = (timeArr[0] == 24) ? 0 : timeArr[0];
        timeArr[1] = min % 60;

        System.out.printf("%d %d", timeArr[0], timeArr[1]);
    }
}

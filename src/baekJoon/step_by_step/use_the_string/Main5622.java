package baekJoon.step_by_step.use_the_string;
import java.util.Scanner;

public class Main5622 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String inputWord = s.nextLine();
        int totalTime = 0;

        for (int i = 0; i < inputWord.length(); i++) {
            Dial dial = new Dial(inputWord.charAt(i));
            totalTime += dial.dialDelayTime;
        }

        System.out.print(totalTime);
    }
}

class Dial {
    int dialNum;
    int dialDelayTime;

    Dial (char dialChar){

        for (int i = 0; i < 5; i++){
            if ('A' + i*3 <= dialChar && dialChar <= 'A' + i*3 + 2) {
                this.dialNum = i + 2;
                this.dialDelayTime = i + 3;
                break;
            }

            else if ('P' <= dialChar && dialChar <= 'S'){
                this.dialNum = 7;
                this.dialDelayTime = dialNum + 1;
            }

            else if ('T' <= dialChar && dialChar <= 'V'){
                this.dialNum = 8;
                this.dialDelayTime = dialNum + 1;
            }

            else {
                this.dialNum = 9;
                this.dialDelayTime = dialNum + 1;
            }
        }
    }
}

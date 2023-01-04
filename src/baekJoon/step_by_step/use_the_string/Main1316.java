package baekJoon.step_by_step.use_the_string;

import java.util.Arrays;
import java.util.Scanner;

public class Main1316 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //그룹 단어를 세기 위한 카운터 선언
        int groupWordCount = 0;

        //해당 단어가 그룹단어인지 판단한 결과를 저장할 변수 선언
        boolean isGroupWord;
        boolean isSame;

        //몇 개의 단어가 나올 것인지 입력받고 wordNum 에 저장
        int wordNum = s.nextInt();
        s.nextLine(); //nextInt 메서드 실행 후 문자열 입력을 받아야 하기 때문에 개행문자 제거를 위한 nextLine 메서드 실행

        String[] wordArr = new String[wordNum]; //입력받은 단어들을 저장할 문자열 배열 선언
        char[] saveCharArr = new char[26]; //중복되는 글자가 나오는 지 확인하기 위한 저장공간 선언

        //wordNum 개의 단어를 입력받아 wordArr 에 저장
        for (int i = 0; i < wordNum; i++) {
            wordArr[i] = s.nextLine();
        }

        //저장한 단어들을 하나씩 꺼내어 그룹단어인지 확인하기 위한 for 문
        for (int i = 0; i < wordNum; i++) {
            isGroupWord = false; //기본 값은 false 로 설정

            //단어가 바뀔 때 마다 saveCharArr 초기화
            Arrays.fill(saveCharArr, (char) 0);

            saveCharArr[0] = wordArr[i].charAt(0); //입력받은 단어의 제일 처음 글자는 saveCharArr[0] 에 저장

            //만약 단어가 한 글자라면 무조건 그룹단어이므로 isGroupWord 를 true 로 저장
            if (wordArr[i].length() == 1) {
                isGroupWord = true;
            }

            //그게 아니라면 현재 글자와 뒷 글자를 비교하며 그룹단어인지 아닌지 확인
            else {
                isSame = false; //글자가 이미 있는지 확인한 값을 저장하는 변수로 초기값은 false.
                for (int j = 0; j < wordArr[i].length() - 1; j++) {//다음 글자까지 한 번에 확인하므로 (글자길이 -1)번 만큼 반복

                    if (wordArr[i].charAt(j) != wordArr[i].charAt(j + 1)) {//현재 글자와 다음 글자가 같지 않다면

                        int count = 0; //saveCharArr 의 채워져 있는 값만 보기 위하여 count 로 인덱스를 훑을 것이므로 count 선언 후 초기화

                        while(saveCharArr[count] != 0) { //채워져 있을 때 까지만 while 문 동작
                            if (saveCharArr[count] == wordArr[i].charAt((j + 1))) {//다음 글자가 이미 나왔던 글자라면
                                isSame = true; //글자가 이미 있다는 것이므로 isSame 을 true 로 저장
                                break; //while 문 탈출
                            }

                            count++;
                        }

                        if (!isSame) saveCharArr[count] = wordArr[i].charAt((j + 1));

                        else break;
                    }
                }

                if (!isSame) isGroupWord = true;
            }

            if (isGroupWord) {
                groupWordCount++;
//                System.out.println("그룹 단어 입니다.");
            }

//            else System.out.println("그룹 단어가 아닙니다.");
        }

        System.out.print(groupWordCount);
    }
}

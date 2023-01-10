package baekJoon.step_by_step.basic_math_step_2;

import java.io.*;
import java.util.ArrayList;

public class Main9020 {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<PrimeNumberSumData> saveList = new ArrayList<>();
        ArrayList<Integer> primeList = new ArrayList<>();

        int caseNum = Integer.parseInt(bfr.readLine());

        int[] caseArr = new int[caseNum];

        for (int i = 0; i < caseNum; i++) {
            caseArr[i] = Integer.parseInt(bfr.readLine());
        }

        int adjacentPrimeGap, pListSize, sListSize, firstPrime, secondPrime,secondPrimeIndex;

        for (int inputNum : caseArr) {
            saveList.clear();
            primeList.clear();

            boolean[] numArr = new boolean[inputNum + 1];
            for (int i = 0; i <= inputNum; i++){
                numArr[i] = true;
            }

            numArr[0] = false;
            numArr[1] = false;

            if (4 <= inputNum && numArr[2]) for (int i = 4; i <= inputNum; i += 2) numArr[i] = false;

            for (int i = 3; i*i <= inputNum; i+=2) if (numArr[i]) for (int j = i*i; j <= inputNum; j += i) numArr[j] = false;

            primeList.add(2);

            for (int i = 3; i <= inputNum; i+=2) if (numArr[i]) primeList.add(i);

            pListSize = primeList.size();

            for (int i = 0; i < pListSize; i++) {
                firstPrime = primeList.get(i);
                if (firstPrime + 2 == inputNum) {
                    PrimeNumberSumData data = new PrimeNumberSumData(2, firstPrime, 0, i);
                    saveList.add(data);
                    break;
                }
            }

            for (int i = 1; primeList.get(i) <= inputNum / 2; i++) {
                firstPrime = primeList.get(i);
                sListSize = saveList.size();

                if (sListSize != 0) {
                    secondPrimeIndex = saveList.get(sListSize - 1).sndPrimeIndex;
                    secondPrime = saveList.get(sListSize - 1).sndPrime;
                    adjacentPrimeGap = firstPrime - saveList.get(sListSize - 1).fstPrime;

                    for (int j = secondPrimeIndex; primeList.get(j) >= secondPrime - adjacentPrimeGap; j--) {

                        if (secondPrime - adjacentPrimeGap == primeList.get(j)) {
                            secondPrime = primeList.get(j);
                            PrimeNumberSumData data = new PrimeNumberSumData(firstPrime, secondPrime, i, j);
                            saveList.add(data);
                            break;
                        }
                    }
                }

                else {
                    for (int j = i; j < pListSize; j++) {
                        secondPrime = primeList.get(j);

                        if (firstPrime + secondPrime == inputNum) {
                            PrimeNumberSumData data = new PrimeNumberSumData(firstPrime, secondPrime, i, j);
                            saveList.add(data);
                            break;
                        }
                    }
                }
            }

            for (PrimeNumberSumData data : saveList) {
//                if (data.gap > resData.gap) {
//                    resData = data;
//                }
                bfw.write(Integer.toString(data.fstPrime));
                bfw.write(" ");
                bfw.write(Integer.toString(data.sndPrime));
                bfw.newLine();
            }

//            bfw.write(Integer.toString(resData.fstPrime));
//            bfw.write(" ");
//            bfw.write(Integer.toString(resData.sndPrime));
//            bfw.newLine();
        }

        bfw.flush();
        bfw.close();
    }
}

class PrimeNumberSumData {
    int fstPrime, sndPrime, gap, fstPrimeIndex, sndPrimeIndex;
    PrimeNumberSumData(int fstPrime, int sndPrime, int fstPrimeIndex, int sndPrimeIndex) {
        this.fstPrime = fstPrime;
        this.sndPrime = sndPrime;
        this.gap = fstPrime - sndPrime;
        this.fstPrimeIndex = fstPrimeIndex;
        this.sndPrimeIndex = sndPrimeIndex;
    }
}
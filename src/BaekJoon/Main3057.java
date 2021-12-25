package BaekJoon;

import java.io.*;
import java.util.Arrays;

public class Main3057 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        String initNum = bfr.readLine();
        String[] rcArr = initNum.split(" ");
        int r = Integer.parseInt(rcArr[0]);
        int c = Integer.parseInt(rcArr[1]);
        int[][] memoryArr = new int[r][c];
        int sideVal;
        boolean sameSign = false;

        for (int i = 0; i < r; i++) {
            String data = bfr.readLine();
            String[] dataArr = data.split("");
            for (int j = 0; j < c; j++) {
                memoryArr[i][j] = Integer.parseInt(dataArr[j]);
            }
        }

        sideVal = Math.min(r,c);

        int[][] square = new int[sideVal][sideVal];
        int[][] tmpSquare = new int[sideVal][sideVal];

        for (int i = sideVal; i > 1; i--) {
//            bfw.write("\ni = "+i+"일 때\n\n");
            for(int j = 0; j < r-i+1; j++) {
                for (int k = 0; k < c-i+1; k++) {
                    for (int a = 0; a < sideVal; a++) {
                        for (int b = 0; b < sideVal; b++) {
                            if (a < i && b < i) {
                                square[a][b] = memoryArr[a+j][b+k];
                            }
                            else {
                                square[a][b] = 0;
                            }
                        }
                    }
                    for (int y = 0; y < sideVal; y++) {
                        for (int x = 0; x < sideVal; x++) {
                            if (x < i && y < i) {
                                tmpSquare[y][x] = square[i-y-1][i-x-1];
                            }
                            else {
                                tmpSquare[y][x] = 0;
                            }
                        }
                    }

                    if (Arrays.deepEquals(square, tmpSquare)) {
                        bfw.write(i+"");
                        sameSign = true;
                        break;
                    }
//                    for (int y = 0; y < sideVal; y++) {
//                        for (int x = 0; x < sideVal; x++) {
//                            bfw.write(square[y][x]+"");
//                        }
//                        bfw.write("\n");
//                    }
//                    bfw.write("\n");
//                    for (int y = 0; y < sideVal; y++) {
//                        for (int x = 0; x < sideVal; x++) {
//                            bfw.write(tmpSquare[y][x]+"");
//                        }
//                        bfw.write("\n");
//                    }
//                    bfw.write("------------------\n");
                }
                if (sameSign) {
                    break;
                }
            }
            if (sameSign) {
                break;
            }
        }
        if (!sameSign) {
            bfw.write("-1");
        }

        bfw.flush();
        bfw.close();
    }
}

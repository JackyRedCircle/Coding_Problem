package Use_the_for;

import java.util.Scanner;

public class Main8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int ans = 0;

        for (int i = 1; i <= num; i++) {
            ans += i;
        }

        System.out.println(ans);
    }
}

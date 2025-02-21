package DIV2;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        solve();
    }    

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int y = 0;

        while (true) {
            a = a * 3;
            b = b * 2;

            y++;

            if (a > b) {
                break;
            }
        }

        System.out.println(y);

        sc.close();
    }
}

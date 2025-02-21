package DIV2;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        byte w = sc.nextByte();

        if (w == 2 || w % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

        sc.close();
    }
}

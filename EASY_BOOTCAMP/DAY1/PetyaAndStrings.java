package EASY_BOOTCAMP.DAY1;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        String w1 = sc.next().toLowerCase();
        String w2 = sc.next().toLowerCase();

        int res = 0;

        for (int i = 0; i < w1.length(); i++) {
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);

            if (c1 < c2) {
                res = -1;
                break;
            } else if (c2 < c1) {
                res = 1;
                break;
            }
        }

        System.out.println(res);

        sc.close();
    }
}

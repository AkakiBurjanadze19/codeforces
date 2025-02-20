package EASY_BOOTCAMP.DAY1;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        String w = sc.next();

        int c1 = 0;
        int maxC1 = 0;

        int c2 = 0;
        int maxC2 = 0;

        for (int i = 0; i < w.length() - 1; i++) {
            if (w.charAt(i) == '0' && w.charAt(i) == w.charAt(i + 1)) {
                c1++;
                maxC1 = Math.max(maxC1, c1);
            } else if (w.charAt(i) == '0' && w.charAt(i + 1) != '0') {
                // do nothing
            } else {
                c1 = 0;
            }

            if (w.charAt(i) == '1' && w.charAt(i) == w.charAt(i + 1)) {
                c2++;
                maxC2 = Math.max(maxC2, c2);
            } else if (w.charAt(i) == '1' && w.charAt(i + 1) != '1') {
                // do nothing
            } else {
                c2 = 0;
            }
        }

        if (maxC1 + 1 >= 7 || maxC2 + 1 >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
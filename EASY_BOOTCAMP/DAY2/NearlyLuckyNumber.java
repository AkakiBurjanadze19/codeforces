package EASY_BOOTCAMP.DAY2;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        String nStr = Long.toString(n);

        int lucky = 0;
        for (int i = 0; i < nStr.length(); i++) {
            char c = nStr.charAt(i);

            if (c == '4' || c == '7') {
                lucky++;
            }
        }

        if (lucky == 4 || lucky == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

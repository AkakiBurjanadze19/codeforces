package EASY_BOOTCAMP.DAY1;

import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String w = sc.next();

        int c8 = 0;
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == '8') {
                c8++;
            }
        }

        System.out.println(Math.min(c8, n / 11));

        sc.close();
    }
}
package DIV2;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        String w = sc.next();

        int l = 0;
        int u = 0;

        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            int cd = (int) c;

            if (cd >= 97 && cd <= 122) l++;
            else u++;
        }

        if (l > u) {
            System.out.println(w.toLowerCase());
        } else if (l < u) {
            System.out.println(w.toUpperCase());
        } else {
            System.out.println(w.toLowerCase());
        }

        sc.close();
    }
}

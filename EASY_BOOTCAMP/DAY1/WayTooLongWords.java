package EASY_BOOTCAMP.DAY1;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String w = sc.next();

            if (w.length() > 10) {
                char f = w.charAt(0);
                char l = w.charAt(w.length() - 1);
                String o = "";

                o += f;
                o += w.length() - 2;
                o += l;

                System.out.println(o);
            } else {
                System.out.println(w);
            }
        }

        sc.close();
    }
}

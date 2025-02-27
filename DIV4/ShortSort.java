package DIV4;

import java.util.Scanner;

public class ShortSort {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            // in total we have only 6 cases
            if (s.contains("abc")) {
                System.out.println("YES");
            } else if (s.contains("acb")) {
                System.out.println("YES");
            } else if (s.contains("bac")) {
                System.out.println("YES");
            } else if (s.contains("bca")) {
                System.out.println("NO");
            } else if (s.contains("cab")) {
                System.out.println("NO");
            } else if (s.contains("cba")) {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}

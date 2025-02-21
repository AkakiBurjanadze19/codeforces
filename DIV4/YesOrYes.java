package DIV4;

import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            String s = sc.next().toLowerCase();

            if (equals(s, "yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }

        sc.close();
    }

    public static boolean equals(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        boolean res = true;

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            if (c1 != c2) {
                res = false;
                break;
            }
        }

        return res;
    }
}
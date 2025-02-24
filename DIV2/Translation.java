package DIV2;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        if (reverseString(t).equals(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

    public static String reverseString(String s) {
        StringBuilder rv = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            rv.append(c);
        }

        return rv.toString();
    }
}

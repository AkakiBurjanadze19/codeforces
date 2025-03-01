package DIV4;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class IcpcBaloons {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Set<Character> set = new HashSet<>();

            int points = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (set.contains(c)) {
                    points += 1;
                } else {
                    set.add(c);
                    points += 2;
                }
            }

            System.out.println(points);
        }

        sc.close();
    }
}

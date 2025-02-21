package DIV2;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int x = 0;
        for (int i = 0; i < n - 1; i++) {
            char c = s.charAt(i);
            
            if (c == s.charAt(i + 1)) {
                x++;
            }
        }

        System.out.println(x);

        sc.close();
    }
}

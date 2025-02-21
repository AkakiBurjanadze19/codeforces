package DIV2;

import java.util.Scanner;

public class SystemOfEquations {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        short n = sc.nextShort();
        short m = sc.nextShort();
    
        int p = 0;
        for (int a = 0; a * a <= n; a++) {
            for (int b = 0; b * b <= m; b++) {
                if (a * a + b == n && a + b * b == m) {
                    p++;
                }
            }
        }

        System.out.println(p);

        sc.close();
    }
}
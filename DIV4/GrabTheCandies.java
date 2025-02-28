package DIV4;

import java.util.Scanner;

public class GrabTheCandies {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ms = 0;
            int bs = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    ms += a[i];
                } else {
                    bs += a[i];
                }
            }

            if (ms > bs) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

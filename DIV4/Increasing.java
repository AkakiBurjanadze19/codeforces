package DIV4;

import java.util.Scanner;
import java.util.Arrays;

public class Increasing {
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

            Arrays.sort(a);

            boolean valid = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] >= a[i + 1]) {
                    valid = false;
                }
            }

            System.out.println(valid ? "YES" : "NO");
        }

        sc.close();
    }
}

package DIV4;

import java.util.Scanner;

public class BlankSpace {
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

            int c = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    c++;
                    if (c > max) {
                        max = c;
                    }
                } else {
                    c = 0;
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}

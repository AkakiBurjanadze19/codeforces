package DIV2;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int w = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= h) {
                w++;
            } else {
                w += 2;
            }
        }

        System.out.println(w);

        sc.close();
    }
}

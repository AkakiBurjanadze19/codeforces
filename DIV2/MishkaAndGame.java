package DIV2;

import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] m = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = m[i][0];
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = m[i][1];
        }

        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                c1++;
            } else if (a[i] < b[i]) {
                c2++;
            } else {
                // do nothing
            }
        }

        if (c1 > c2) {
            System.out.println("Mishka");
        } else if (c1 < c2) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }

        sc.close();
    }
}
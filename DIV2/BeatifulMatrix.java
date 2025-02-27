package DIV2;

import java.util.Scanner;

public class BeatifulMatrix {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[5][5];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int r = 0;
        int c = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 1) {
                    r = i;
                    c = j;
                }
            }
        }

        int nr = Math.abs(2 - r);
        int nc = Math.abs(2 - c);

        System.out.println(nr + nc);

        sc.close();
    }
}

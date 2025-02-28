package DIV4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TenWordsOfWisdom {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] m = new int[n][2];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    m[i][j] = sc.nextInt();
                }
            }

            ArrayList<Integer> ns = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (m[i][0] <= 10) {
                    ns.add(m[i][1]);
                }
            }

            int max = Collections.max(ns);
            for(int i = 0; i < n; i++) {
                if (m[i][0] <= 10 && m[i][1] == max) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }


        sc.close();
    }
}

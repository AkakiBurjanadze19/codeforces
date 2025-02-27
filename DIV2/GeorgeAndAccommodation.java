package DIV2;

import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] r = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < r[0].length; j++) {
                r[i][j] = sc.nextInt();
            }
        }

        int c = 0;
        for (int i = 0; i < n; i++) {
            int p = r[i][0];
            int q = r[i][1];
            
            if (p + 2 <= q) {
                c++;
            }
        }

        System.out.println(c);

        sc.close();
    }
}

package DIV2;

import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        boolean blackWhite = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Character color = matrix[i][j];
                if (color == 'C' || color == 'M' || color == 'Y') {
                    blackWhite = false;
                }
            }
        }        

        System.out.println(blackWhite ? "#Black&White" : "#Color");

        sc.close();
    }
}

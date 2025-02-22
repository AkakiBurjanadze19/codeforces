package DIV2;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        short n = sc.nextShort();
        int[][] matrix = new int[n][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextShort();
            }
        }

        short v1Sum = 0;
        for (int i = 0; i < n; i++) {
            v1Sum += matrix[i][0];
        }

        short v2Sum = 0;
        for (int j = 0; j < n; j++) {
            v2Sum += matrix[j][1];
        }

        short v3Sum = 0;
        for (int k = 0; k < n; k++) {
            v3Sum += matrix[k][2];
        }

        if (v1Sum == 0 && v2Sum == 0 && v3Sum == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
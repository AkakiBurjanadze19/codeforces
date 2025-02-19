package OTHER;

import java.util.Scanner;

public class GoodMatrixElements {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int d1Sum = 0;
        int d2Sum = 0;
        int middleRowSum = 0;
        int middleColumnSum = 0;

        // sum of the main diagonal
        for (int i = 0; i < n; i++) {
            d1Sum += matrix[i][i];
        }

        int middleIndex = (n - 1) / 2;
        int middleElement = matrix[middleIndex][middleIndex];
        
        // sum of the secondary diagonal
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                d2Sum += matrix[i][j];
                i--;
            }
        }

        // sum of the middle row
        for (int i = 0; i < n; i++) {
            middleRowSum += matrix[middleIndex][i];
        }

        // sum of the middle column
        for (int i = 0; i < n; i++) {
            middleColumnSum += matrix[i][middleIndex];
        }

        int sum = d1Sum + (d2Sum - middleElement) + (middleRowSum - middleElement) + (middleColumnSum - middleElement);

        System.out.println(sum);

        sc.close();
    }
}

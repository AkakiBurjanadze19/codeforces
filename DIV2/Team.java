package DIV2;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cols = 3;
        
        int[][] matrix = new int[n][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int problems = 0;

        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0; 
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            
            if (onesCount == 2 || onesCount == 3) {
                problems++;
            }
        }

        System.out.println(problems);

        sc.close();
    }
}
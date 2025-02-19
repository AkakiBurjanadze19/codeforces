package DIV2;

import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] points = new int[n];
        
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }
        
        int best = points[0];
        int worst = points[0];
        int count = 0;

        for (int i = 1; i < points.length; i++) {
            if (points[i] > best) {
                count++;
                best = points[i];
            }

            if (points[i] < worst) {
                count++;
                worst = points[i];
            }
        }
        
        System.out.println(count);

        sc.close();
    }
}
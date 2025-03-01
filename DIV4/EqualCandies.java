package DIV4;

import java.util.Scanner;

public class EqualCandies {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int min = findMin(a);

            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = a[i] - min;
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += b[i];
            }

            System.out.println(sum);
        }

        sc.close();
    }

    public static int findMin(int[] a) {
        int min = a[0];
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        return min;
    }
}

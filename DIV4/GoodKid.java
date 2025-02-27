package DIV4;

import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            int mn = min(a);
            int mnIdx = -1;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == mn) {
                    mnIdx = i;
                    break;
                }
            }
            a[mnIdx]++;

            int p = 1;
            for (int i = 0; i < a.length; i++) {
                p *= a[i];
            }

            System.out.println(p);
        }
        
        sc.close();
    }


    public static int min(int[] a) {
        int smallest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        return smallest;
    }
}

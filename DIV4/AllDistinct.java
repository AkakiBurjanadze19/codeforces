package DIV4;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class AllDistinct {
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

            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(a[i]);
            }

            int x = set.size();
            if ((n - x) % 2 == 0) {
                System.out.println(x);
            } else {
                System.out.println(x - 1);
            }
        }
        

        sc.close();
    }
}

package DIV4;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Triple {
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

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            }

            int triplet = -1;
            for (int key : map.keySet()) {
                if (map.get(key) >= 3) {
                    triplet = key;
                    break;
                }
            }

            System.out.println(triplet);
        }

        sc.close();
    }
}

package OTHER;

import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        boolean h = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                h = true;
                break;
            }
        }

        System.out.println(h ? "HARD" : "EASY");

        sc.close();
    }
}

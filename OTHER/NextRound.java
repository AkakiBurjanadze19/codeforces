package OTHER;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        byte n = sc.nextByte();
        byte k = sc.nextByte();

        byte[] scores = new byte[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextByte();
        }

        int x = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 0 && scores[i] >= scores[k - 1]) x++;
        }

        System.out.println(x);

        sc.close();
    }
}

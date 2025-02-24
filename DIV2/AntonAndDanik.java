package DIV2;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String w = sc.next();

        int a = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            char c = w.charAt(i);

            if (c == 'A') a++;
            else d++;
        }

        if (a > d) {
            System.out.println("Anton");
        } else if (a < d) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

        sc.close();
    }
}

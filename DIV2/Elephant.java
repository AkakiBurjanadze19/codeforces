package DIV2;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int steps = x / 5;

        if (steps * 5 < x) {
            System.out.println(steps + 1);
        } else {
            System.out.println(steps);
        }

        sc.close();
    }
}
package DIV2;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long length = (n + a - 1) / a;
        long width = (m + a - 1) / a;

        System.out.println(length * width);

        sc.close();
    }
}

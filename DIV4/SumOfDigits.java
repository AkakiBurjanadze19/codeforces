package DIV4;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int s = 0;
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }

            System.out.println(s);
        }

        sc.close();
    }
}

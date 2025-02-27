package DIV2;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        
        int d = 0;
        while (n > 0) {
            if (n % 10 == 4 || n % 10 == 7) {
                d++;
            }
            n /= 10;
        }

        if (d == 4 || d == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

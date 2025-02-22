package DIV3;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        byte k = sc.nextByte();

        while (k-- > 0) {
            if (n % 10 == 0) n /= 10;
            else n--;
        }

        System.out.println(n);

        sc.close();
    }
}
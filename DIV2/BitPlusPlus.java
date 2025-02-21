package DIV2;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        short n = sc.nextShort();

        int x = 0;
        while (n-- > 0) {
            String s = sc.next();

            if (s.contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);

        sc.close();
    }
}

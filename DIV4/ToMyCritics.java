package DIV4;

import java.util.Scanner;

public class ToMyCritics {
    public static void main(String[] args) {
        solve();
    }  

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((a + b >= 10) || (a + c >= 10) || (b + c >= 10)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

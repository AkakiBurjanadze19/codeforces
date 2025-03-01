package DIV4;

import java.util.Scanner;

public class FollowingDirections {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int x = 0;
            int y = 0;
            boolean passed = false;

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                
                if (c == 'L') {
                    x--;
                } else if (c == 'R') {
                    x++;
                } else if (c == 'U') {
                    y++;
                } else if (c == 'D') {
                    y--;
                }

                if (x == 1 && y == 1) {
                    passed = true;
                    break;
                }
            }

            System.out.println(passed ? "YES" : "NO");
        }

        sc.close();
    }
}

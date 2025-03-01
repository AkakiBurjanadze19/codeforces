package DIV4;

import java.util.Scanner;

public class Colourblindness {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();

            String r1 = sc.nextLine();
            String r2 = sc.nextLine();

            boolean valid = true;
            for (int i = 0; i < n; i++) {
                char c1 = r1.charAt(i);
                char c2 = r2.charAt(i);

                if (c1 == 'G') c1 = 'B';
                if (c2 == 'G') c2 = 'B';

                if (c1 != c2) {
                    valid = false;
                    break;
                }
            }

            System.out.println(valid ? "YES" : "NO");
        }

        sc.close();
    }
}

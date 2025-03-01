package DIV4;

import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder str = new StringBuilder();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                str.append(c);
            }

            String string = str.toString();
            int Tidx = string.indexOf("T");
            int iidx = string.indexOf("i");
            int midx = string.indexOf("m");
            int uidx = string.indexOf("u");
            int ridx = string.indexOf("r");

            int slen = string.length();
            if (slen == 5 && Tidx != -1 && iidx != -1 && midx != -1 && uidx != -1 && ridx != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

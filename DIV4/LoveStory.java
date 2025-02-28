package DIV4;

import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        String o = "codeforces";
        char[] chars1 = o.toCharArray();

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            
            int c = 0;
            char[] chars2 = s.toCharArray();
            for (int i = 0; i < chars2.length; i++) {
                if (chars2[i] != chars1[i]) {
                    c++;
                }
            }

            System.out.println(c);
        }

        sc.close();
    }
}

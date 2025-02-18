package DIV4;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            String str = sc.next();
            int n = str.length();

            int s1 = 0;
            int s2 = 0;

            for (int i = 0; i < n / 2; i++) {
                char c = str.charAt(i);
                int num = c - '0';
                s1 += num;
            }

            for (int i = n / 2; i < n; i++) {
                char c = str.charAt(i);
                int num = c - '0';
                s2 += num;
            }

            if (s1 == s2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }

        sc.close();
    }
}
package DIV4;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((a + b == c) || (b + c == a) || (a + c == b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }

        sc.close();
    }
}

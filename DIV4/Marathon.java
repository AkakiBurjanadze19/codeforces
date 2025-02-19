package DIV4;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            // distance run by timur
            int a = sc.nextInt();

            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            // number of people in front of timur
            int x = 0;

            if (b > a) {
                x++;
            }

            if (c > a) {
                x++;
            }

            if (d > a) {
                x++;
            }

            System.out.println(x);

            t--;
        }

        sc.close();
    }
}

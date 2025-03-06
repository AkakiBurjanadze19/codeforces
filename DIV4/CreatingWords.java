package DIV4;

import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            char[] charA = a.toCharArray();
            char[] charB = b.toCharArray();

            char temp = charA[0];
            charA[0] = charB[0];
            charB[0] = temp;

            System.out.print(String.valueOf(charA));
            System.out.print(" ");
            System.out.print(String.valueOf(charB));
            System.out.println();
        }

        sc.close();
    }
}

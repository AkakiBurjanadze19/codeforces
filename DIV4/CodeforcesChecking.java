package DIV4;

import java.util.Scanner;
import java.util.ArrayList;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = "codeforces";
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            chars.add(c);
        }

        int t = sc.nextInt();

        while (t > 0) {
            char c = sc.next(".").charAt(0);

            if (chars.contains(c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }

        sc.close();
    }
}

package DIV2;

import java.util.Scanner;

public class HqNine {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'H' || c == 'Q' || c == '9') {
                result = "YES";
                break;
            } else {
                result = "NO";
            }
        }

        System.out.println(result);

        sc.close();
    }
}

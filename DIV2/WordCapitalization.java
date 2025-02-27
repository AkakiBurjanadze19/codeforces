package DIV2;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        String w = sc.next();
        String uw = w.toUpperCase();

        StringBuilder nw = new StringBuilder();
        nw.append(uw.charAt(0));

        for (int i = 1; i < w.length(); i++) {
            nw.append(w.charAt(i));
        }

        System.out.println(nw.toString());

        sc.close();
    }
}

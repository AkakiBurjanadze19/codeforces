package EASY_BOOTCAMP.DAY1;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        solve();
    }   

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        String w = sc.next().toLowerCase();

        String t = "";
        String o = "";

        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                continue;
            }

            t += w.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            
            o += ".";
            o += c;
        }

        System.out.println(o);

        sc.close();
    }
}
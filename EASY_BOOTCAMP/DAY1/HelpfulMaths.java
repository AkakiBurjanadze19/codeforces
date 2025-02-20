package EASY_BOOTCAMP.DAY1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class HelpfulMaths {
    public static void main(String[] args) {
        solve1();
    }

    public static void solve1() {
        Scanner sc = new Scanner(System.in);

        String w = sc.next();

        ArrayList<Integer> t = new ArrayList<>();

        for (int i = 0; i < w.length(); i += 2) {
            char c = w.charAt(i);
            t.add(c - '0');
        }

        int[] a = new int[t.size()];

        for (int i = 0; i < t.size(); i++) {
            a[i] = t.get(i);
        }

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if (i > 0 && i < a.length) {
                System.out.print("+");
            }

            System.out.print(a[i]);
        }
        
        sc.close();
    }
}
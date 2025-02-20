package EASY_BOOTCAMP.DAY1;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        int s = 0;
        for (int i = a; i <= b; i++) {
            s += c[i];
        }

        System.out.println(s);

        sc.close();
    }
}

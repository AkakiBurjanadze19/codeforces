package DIV2;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        // solve1();
        solve2();
    }

    public static void solve1() {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int tp = 0;
        for (int i = 1; i <= w; i++) tp += i * k;
        
        if (tp <= n) System.out.println(0);
        else System.out.println(tp - n);

        sc.close();
    }

    public static void solve2() {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int tm = w * (w + 1) / 2;
        int tp = k * tm;

        if (tp <= n) System.out.println(0);
        else System.out.println(tp - n);
        
        sc.close();
    }
}

package EASY_BOOTCAMP.DAY1;

import java.util.Scanner;
import java.util.ArrayList;

public class ReverseAnArray {
    public static void main(String[] args) {
        // solve1();
        // solve2();
        // solve3();
        solve4();
    }

    public static void solve1() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {
            b[i] = a[i];
        }

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }

        sc.close();
    }

    public static void solve2() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = a.length - 1; i >= 0; i--) {
            reversed.add(a[i]);
        }

        for (int i = 0; i < reversed.size(); i++) {
            System.out.print(reversed.get(i) + " ");
        }

        sc.close();
    }

    public static void solve3() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }

    public static void solve4() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}

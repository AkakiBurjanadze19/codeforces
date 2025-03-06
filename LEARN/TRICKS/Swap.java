package LEARN.TRICKS;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println();

        // We can use XOR operator to swap two variables
        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("After swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        sc.close();
    }
}

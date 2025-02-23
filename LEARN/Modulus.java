package LEARN;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        /*
            An important property of the remainder is that in addition, subtraction and multiplication remainder can be taken before the operation:
            
            1) (a + b)mod m = (amod m + bmod m)mod m
            2) (a - b)mod m = (amod m - bmod m)mod m
            3) (a * b)mod m = (amod m * bmod m)mod m
        */

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long m = sc.nextLong();

        long x = (a % m + b % m) % m;
        // ensure that the result stays non-negative
        if (x < 0) {
            x += m;
        }
        System.out.println("addition (mod): " + x);

        x = (a % m - b % m) % m;
        // ensure that the result stays non-negative
        if (x < 0) {
            x += m;
        }
        System.out.println("subtraction (mod): " + x);

        x = (a % m * b % m) % m;
        // ensure that the result stays non-negative
        if (x < 0) {
            x += m;
        }
        System.out.println("multiplcation (mod): " + x);

        sc.close();
    }
}
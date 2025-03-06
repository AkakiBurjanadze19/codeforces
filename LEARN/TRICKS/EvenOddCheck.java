package LEARN.TRICKS;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // We can use & operator to check if a number is even or odd
        System.out.println((n & 1) == 0 ? "EVEN" : "ODD");

        sc.close();
    }
}

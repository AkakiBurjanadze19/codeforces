package LEARN;

import java.util.Scanner;

public class Floats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        /*
            It is risky to compare floating point numbers with the == operator, because it is possible that the values should be equal but they are not because of precision errors. 
            A better way to compare floating point numbers is to assume that two numbers are equal if the difference between them is less than ε, where ε is a small number.
        */
        final double EPSILON = 1E-9;
        if (Math.abs(a - b) < EPSILON) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("a and b are not equal");
        }

        sc.close();
    }
}
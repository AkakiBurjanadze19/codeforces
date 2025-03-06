package LEARN.TRICKS;

import java.util.Scanner;

public class MulDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // shift all bits to the left to multiply number by 2
        int res1 = n << 1;
        System.out.println("multiplication by 2: " + res1);

        // shift all bits to the right to divide number by 2
        int res2 = n >> 1;
        System.out.println("division by 2: " + res2);

        sc.close();
    }
}

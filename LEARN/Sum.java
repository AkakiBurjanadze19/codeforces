package LEARN;

import java.util.Scanner;
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Sum of numbers raised to 2'th power: " + sumOfKthpowers(numbers, 2));
        System.out.println("Sum of squares: " + sumOfSquares(numbers));
        System.out.println("Sum of cubes: " + sumOfCubes(numbers));

        System.out.println();

        System.out.println("Sum of first " + n + " natural numbers raised to 2'th power: " + sumOfKthpowers(5, 2));

        System.out.println("Sum of first " + n + " natural numbers raised to 4'th power: " + sumOfKthpowers(5, 4));
        System.out.println("Sum of first " + n + " natural numbers: " + sum(n));
        System.out.println("Sum of squares of first " + n + " natural numbers: " + sumOfSquares(n));
        System.out.println("Sum of cubes of first " + n + " natural numbers: " + sumOfCubes(n));

        System.out.println();

        int[] test1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(test1));
        System.out.println("Arithmetic sequence? " + arithemticSequence(new int[]{1, 2, 3, 4, 5}));

        int[] test2 = {2, 5, 8, 11, 14};
        System.out.println(Arrays.toString(test2));
        System.out.println("Arithmetic sequence? " + arithemticSequence(new int[]{2, 5, 8, 11, 14}));

        int[] test3 = {1, 2, 4, 6, 8};
        System.out.println(Arrays.toString(test3));
        System.out.println("Arithmetic sequence? " + arithemticSequence(new int[]{1, 2, 4, 6, 8}));

        System.out.println();

        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum(numbers));

        System.out.println();

        System.out.println(Arrays.toString(new int[]{3, 6, 12, 24}));
        System.out.println("Geometric sequence? " + geometricSequence(new int[]{3, 6, 12, 24}));
        System.out.println("Sum: " + sum(new int[]{3, 6, 12, 24}));
        
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Geometric sequence? " + geometricSequence(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Sum: " + sum(new int[]{1, 2, 3, 4, 5}));

        sc.close();
    }

    public static long sumOfKthpowers(int n, int k) {
        long sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += pow(i, k);
        }

        return sum;
    }

    public static long sumOfKthpowers(int[] nums, int k) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += pow(nums[i], k);
        }

        return sum;
    }

    public static long sum(int n) {
        /* formula: n * (n + 1) / 2 */
        return n * (n + 1) / 2;
    }

    public static long sum(int[] nums) {
        /* formula: n * ((a + b) / 2) */
        if (!arithemticSequence(nums) || !geometricSequence(nums)) {
            long sum = 0;
            
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }

            return sum;
        } else if (arithemticSequence(nums)) {
            int n = nums.length;
            int a = nums[0];
            int b = nums[nums.length - 1];
            
            return n * ((a + b) / 2);
        } else if (geometricSequence(nums)) {
            int k = nums[1] / nums[0];
            int a = nums[0];
            int b = nums[nums.length - 1];

            return (b * k - a) / k - 1;
        }

        return 0;
    }

    public static long sumOfSquares(int n) {
        /* formula: n * (n + 1) * (2 * n + 1) / 6 */
        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }

    public static long sumOfSquares(int[] nums) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += pow(nums[i], 2);
        }

        return sum;
    }

    public static long sumOfCubes(int n) {
        /* formula: (n * (n + 1) / 2)^2 */
        long s = n * (n + 1) / 2;
        return s * s;
    }

    public static long sumOfCubes(int[] nums) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += pow(nums[i], 3);
        }

        return sum;
    }

    public static long pow(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public static boolean arithemticSequence(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return true;
        }

        int d = nums[1] - nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != d) {
                return false;
            }
        }

        return true;
    }

    public static boolean geometricSequence(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return true;
        }

        int k = nums[1] / nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] / nums[i - 1] != k) {
                return false;
            }
        }

        return true;
    }
}
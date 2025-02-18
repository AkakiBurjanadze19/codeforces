package DIV4;

import java.util.Arrays;
import java.util.Scanner;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            System.out.println(medium(a, b, c));

            t--;
        }

        scanner.close();
    }

    public static int medium(int x, int y, int z) {
        int[] nums = {x, y, z};

        Arrays.sort(nums);

        return nums[1];
    }
}
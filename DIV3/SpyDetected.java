package DIV3;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];

            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int num = nums[i];
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }

            for (int i = 0; i < n; i++) {
                int num = nums[i];
                if (map.get(num) == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }

            t--;
        }

        sc.close();
    }
}

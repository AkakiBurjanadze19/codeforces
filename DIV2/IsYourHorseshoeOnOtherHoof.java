package DIV2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class IsYourHorseshoeOnOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long s1 = sc.nextLong();
        long s2 = sc.nextLong();
        long s3 = sc.nextLong();
        long s4 = sc.nextLong();

        long[] colors = {s1, s2, s3, s4};
        Map<Long, Integer> map = new HashMap<>();

        for (long color : colors) {
            if (map.containsKey(color)) {
                map.put(color, map.get(color) + 1);
            } else {
                map.put(color, 1);
            }
        }

        ArrayList<Integer> frequencies = new ArrayList<>();

        // int max = 0;
        for (long key : map.keySet()) {
            frequencies.add(map.get(key));
        }

        int maxFrequency = frequencies.get(0);
        for (int freq : frequencies) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }

        if (frequencies.size() == 1) {
            System.out.println(frequencies.get(0) - 1);
        } else if (frequencies.size() == 4) {
            System.out.println(0);
        } else if (frequencies.size() == 3) {
            System.out.println(maxFrequency - 1);
        } else if (frequencies.size() == 2) {
            if (frequencies.get(0) != frequencies.get(1)) {
                System.out.println(maxFrequency - 1);
            }

            if (frequencies.get(0) == frequencies.get(1)) {
                System.out.println(frequencies.get(0));
            }
        }
        
        sc.close();
    }
}
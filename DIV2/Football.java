package DIV2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Football {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int maxCount = 0;
        String winner = "";
        for (String key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                winner = key;
            }
        }

        System.out.println(winner);

        sc.close();
    }
}

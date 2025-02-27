package DIV2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class ImportantExam {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] answers = new char[n][m];
        for (int i = 0; i < n; i++) {
            answers[i] = sc.nextLine().toCharArray();
        }

        int[] points = new int[m];
        for (int i = 0; i < m; i++) {
            points[i] = sc.nextInt();
        }

        int maxScore = 0;
        for (int j = 0; j < m; j++) {
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                map.put(answers[i][j], map.getOrDefault(answers[i][j], 0) + 1);
            }

            int maxFreq = Collections.max(map.values());
            maxScore += maxFreq * points[j];
        }

        System.out.println(maxScore);

        sc.close();
    }
}

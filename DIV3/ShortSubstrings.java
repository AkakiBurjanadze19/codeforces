package DIV3;

import java.util.Scanner;
import java.util.ArrayList;

public class ShortSubstrings {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String b = sc.next();

            ArrayList<String> strs = new ArrayList<>();
            for (int i = 0; i < b.length() - 1; i++) {
                StringBuilder str = new StringBuilder();
                str.append(b.charAt(i));
                str.append(b.charAt(i + 1));

                i++;
                strs.add(str.toString());
            }

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < strs.size() - 1; i++) {
                output.append(strs.get(i).charAt(0));
            }

            output.append(strs.get(strs.size() - 1));
            
            System.out.println(output.toString());
        }

        sc.close();
    }
}

package DIV4;

import java.util.Scanner;
import java.util.Arrays;

public class AtilasFavoriteProblem {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
    
        StringBuilder alpha = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            alpha.append((char)('a' + i));
        }
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
        
            char[] chars = new char[n];
            for (int i = 0; i < n; i++) {
                chars[i] = s.charAt(i);
            }

            Arrays.sort(chars);
            
            char l = chars[chars.length - 1];
            int pos = alpha.toString().indexOf(l);

            System.out.println(pos + 1);
        }

        sc.close();
    }
}
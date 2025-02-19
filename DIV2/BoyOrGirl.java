package DIV2;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.next();

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            set.add(c);
        }

        if (set.size() % 2 != 0) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }

        sc.close();
    }
}
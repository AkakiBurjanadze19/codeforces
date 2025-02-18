package DIV2;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                output += "0";
            } else if (str.charAt(i) == '-' && str.charAt(i + 1) == '.') {
                output += "1";
                i++;
            } else if (str.charAt(i) == '-' && str.charAt(i) == '-') {
                output += "2";
                i++;
            }
        }

        System.out.println(output);

        sc.close();
    }
}

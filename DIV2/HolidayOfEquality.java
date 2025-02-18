package DIV2;

import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // number of citizens
        int n = Integer.parseInt(scanner.nextLine());

        // will contain the welfare of i'th citizen
        int[] welfare = new int[n];

        for (int i = 0; i < n; i++) {
            welfare[i] = scanner.nextInt();
        }

        int maxWelfare = max(welfare);

        int[] burles = new int[n];

        for (int i = 0; i < welfare.length; i++) {
            if (welfare[i] == maxWelfare) {
                continue;
            }
            
            burles[i] = maxWelfare - welfare[i];
        }

        System.out.println(sum(burles));

        scanner.close();
    }

    public static int max(int[] arr) {
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }

    public static int sum(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }
}
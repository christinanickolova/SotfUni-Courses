import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int value = 0;
        int sum = 0;
        int maxDiff= 0;
        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            sum = num1 + num2;
            if (sum != value) {
                maxDiff = Math.abs(sum - value);
            } else {
                maxDiff = sum;
            }
            value = sum;
        }
        if (maxDiff != sum) {
            System.out.printf("No, maxdiff=%d", maxDiff);
        } else {
            System.out.printf("Yes, value=%d", value);
        }
    }
}
import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (num > max) {
                max = num;
            }
        }
        boolean isValue = sum * 1.0 / 2 == max;
        int diff = Math.abs(max - (sum - max));
        if (isValue) {
            System.out.printf("Yes%nSum = %d", max);
        } else {
            System.out.printf("No%nDiff = %d", diff);
        }
    }
}
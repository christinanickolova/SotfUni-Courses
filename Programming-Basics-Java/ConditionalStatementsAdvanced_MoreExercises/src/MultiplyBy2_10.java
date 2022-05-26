import java.util.Scanner;

public class MultiplyBy2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        double result = 0;
        while (i >= 1) {
            double num = Double.parseDouble(scanner.nextLine());
            if (num < 0) {
                System.out.println("Negative number!");
                break;
            }
            result = num * 2;
            System.out.printf("Result: %.2f%n", result);
        }
    }
}
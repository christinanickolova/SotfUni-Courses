import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int sum = 0;
            double firstNumber = Double.parseDouble(scanner.next());
            double secondNumber = Double.parseDouble(scanner.next());
            if (firstNumber >= secondNumber) {
                double first = Math.abs(firstNumber);
                while (first > 0) {
                    sum += (first % 10);
                    first /= 10;
                }
            } else {
                double second = Math.abs(secondNumber);
                while (second > 0) {
                    sum += (second % 10);
                    second /= 10;
                }
            }
            System.out.println(sum);
        }
    }
}

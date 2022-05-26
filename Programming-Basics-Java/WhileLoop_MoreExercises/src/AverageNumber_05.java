import java.util.Scanner;

public class AverageNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int n = 1;
        double average = 0;
        while (n <= number) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            average += currentNumber;
            n++;
        }
        System.out.printf("%.2f", average / number);
    }
}
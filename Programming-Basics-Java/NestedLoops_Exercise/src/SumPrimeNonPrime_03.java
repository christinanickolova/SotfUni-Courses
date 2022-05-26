import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeSum = 0;
        int nonPrimeSum = 0;
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeSum += number;
            } else {
                nonPrimeSum += number;
            }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);
    }
}
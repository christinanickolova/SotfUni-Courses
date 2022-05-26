import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());
        double accruedInterest = depositSum * annualInterestRate / 100;
        double interestPerMonth = accruedInterest / 12;
        double totalSum = depositSum + (months * interestPerMonth);
        System.out.println(totalSum);
    }
}
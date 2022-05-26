import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededMoney = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;
        int cashMoney = 0;
        int cardMoney = 0;
        int cashCount = 0;
        int cardCount = 0;
        int totalMoney = 0;
        while (!input.equals("End")) {
            int objectPrice = Integer.parseInt(input);
            count++;
            if (count % 2 != 0) {
                if (objectPrice > 100) {
                    System.out.println("Error in transaction!");
                    input = scanner.nextLine();
                    continue;
                } else {
                    System.out.println("Product sold!");
                    cashMoney += objectPrice;
                    totalMoney += objectPrice;
                    cashCount++;
                }
            } else {
                if (objectPrice < 10) {
                    System.out.println("Error in transaction!");
                    input = scanner.nextLine();
                    continue;
                } else {
                    System.out.println("Product sold!");
                    cardMoney += objectPrice;
                    totalMoney += objectPrice;
                    cardCount++;
                }
            }
            if (totalMoney >= neededMoney) {
                double averageCashPayments = cashMoney * 1.0 / cashCount;
                double averageCardPayments = cardMoney * 1.0 / cardCount;
                System.out.printf("Average CS: %.2f%n", averageCashPayments);
                System.out.printf("Average CC: %.2f", averageCardPayments);
                return;
            }
            input = scanner.nextLine();
        }
        if (totalMoney < neededMoney) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
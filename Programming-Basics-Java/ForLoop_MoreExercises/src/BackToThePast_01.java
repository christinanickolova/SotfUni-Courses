import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int moneyForSpending = 0;
        int years = 18;
        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                moneyForSpending += 12000;
            } else {
                moneyForSpending += 12000 + (50 * years);
            }
            years++;
        }
        if (moneyForSpending <= money) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money - moneyForSpending);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", moneyForSpending - money);
        }
    }
}
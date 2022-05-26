import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyForVacation = Double.parseDouble(scanner.nextLine());
        double moneyInStock = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int spendDays = 0;
        int days = 1;
        while (true) {
            double money = Double.parseDouble(scanner.nextLine());
            if (input.equals("spend")) {
                spendDays++;
                moneyInStock -= money;
                if (moneyInStock < 0) {
                    moneyInStock = 0;
                }
            }
            if (spendDays == 5) {
                System.out.println("You can't save the money.");
                System.out.println(days);
                break;
            }
            if (input.equals("save")) {
                spendDays = 0;
                moneyInStock += money;
                if (moneyInStock >= moneyForVacation) {
                    System.out.printf("You saved the money for %d days.", days);
                    break;
                }
            }
            days++;
            input = scanner.nextLine();
        }
    }
}
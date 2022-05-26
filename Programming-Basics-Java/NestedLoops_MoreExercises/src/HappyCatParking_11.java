import java.util.Scanner;

public class HappyCatParking_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());
        double tax = 0;
        double amountPerDay = 0;
        double totalAmount = 0;
        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= hoursPerDay; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    tax = 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    tax = 1.25;
                } else {
                    tax = 1;
                }
                amountPerDay += tax;
            }
            System.out.printf("Day: %d - %.2f leva%n", i, amountPerDay);
            totalAmount += amountPerDay;
            amountPerDay = 0;
        }
        System.out.printf("Total: %.2f leva", totalAmount);
    }
}
import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        double finalPrice = 0;
        for (int i = 1; i <= orders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            totalPrice = pricePerCapsule * daysInMonth * capsulesCount;
            System.out.printf("The price for the coffee is: $%.2f%n", totalPrice);
            finalPrice += totalPrice;
        }
        System.out.printf("Total: $%.2f%n", finalPrice);
    }
}

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        double totalSpent = 0;
        while (!input.equals("Game Time")) {
            if (input.equals("CS: OG")) {
                price = 15.99;
            } else if (input.equals("Zplinter Zell")) {
                price = 19.99;
            } else if (input.equals("OutFall 4")) {
                price = 39.99;
            } else if (input.equals("Honored 2")) {
                price = 59.99;
            } else if (input.equals("RoverWatch")) {
                price = 29.99;
            } else if (input.equals("RoverWatch Origins Edition")) {
                price = 39.99;
            } else {
                System.out.println("Not Found");
                input = scanner.nextLine();
                continue;
            }
            if (balance - price < 0) {
                System.out.println("Too Expensive");
                input = scanner.nextLine();
                continue;
            }
            balance -= price;
            totalSpent += price;
            System.out.println("Bought " + input);
            if (balance == 0) {
                System.out.println("Out of money!");
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. ", totalSpent);
        System.out.printf("Remaining: $%.2f", balance);
    }
}

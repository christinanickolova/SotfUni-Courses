import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        boolean isNotEnough = false;
        boolean isValid = false;
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sum - 2 < 0) {
                        isNotEnough = true;
                        break;
                    }
                    sum -= 2;
                    break;
                case "Water":
                    if (sum - 0.7 < 0) {
                        isNotEnough = true;
                        break;
                    }
                    sum -= 0.7;
                    break;
                case "Crisps":
                    if (sum - 1.5 < 0) {
                        isNotEnough = true;
                        break;
                    }
                    sum -= 1.5;
                    break;
                case "Soda":
                    if (sum - 0.8 < 0) {
                        isNotEnough = true;
                        break;
                    }
                    sum -= 0.8;
                    break;
                case "Coke":
                    if (sum - 1 < 0) {
                        isNotEnough = true;
                        break;
                    }
                    sum -= 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    isValid = true;
                    break;
            }
            if (isNotEnough) {
                System.out.println("Sorry, not enough money");
                isNotEnough = false;
            } else {
                if (!isValid) {
                    System.out.println("Purchased " + product);
                }
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}

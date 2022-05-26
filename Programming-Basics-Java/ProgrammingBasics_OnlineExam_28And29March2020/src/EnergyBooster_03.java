import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int setOrders = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = 2 * 56;
                } else if (size.equals("big")) {
                    price = 5 * 28.7;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = 2 * 36.66;
                } else if (size.equals("big")) {
                    price = 5 * 19.6;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = 2 * 42.1;
                } else if (size.equals("big")) {
                    price = 5 * 24.8;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = 2 * 20;
                } else if (size.equals("big")) {
                    price = 5 * 15.2;
                }
                break;
            default:
                break;
        }
        double totalPrice = setOrders * price;
        double discount = 0;
        double finalPrice = 0;
        if (totalPrice >= 400 && totalPrice <= 1000) {
            discount = 0.15;
            finalPrice = totalPrice - (discount * totalPrice);
        } else if (totalPrice > 1000) {
            finalPrice = totalPrice / 2;
        } else {
            finalPrice = totalPrice;
        }
        System.out.printf("%.2f lv.", finalPrice);
    }
}

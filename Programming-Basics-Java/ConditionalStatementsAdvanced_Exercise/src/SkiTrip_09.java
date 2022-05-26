import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysToStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();
        double discount = 0;
        double totalPrice = 0;
        double nights = daysToStay - 1;
        switch (roomType) {
            case "room for one person":
                totalPrice = nights * 18;
                break;
            case "apartment":
                if (daysToStay < 10) {
                    totalPrice = nights * 25;
                    discount = totalPrice * 0.3;
                    totalPrice -= discount;
                } else if (daysToStay <= 15) {
                    totalPrice = nights * 25;
                    discount = totalPrice * 0.35;
                    totalPrice -= discount;
                } else {
                    totalPrice = nights * 25;
                    discount = totalPrice * 0.5;
                    totalPrice -= discount;
                }
                break;
            case "president apartment":
                if (daysToStay < 10) {
                    totalPrice = nights * 35;
                    discount = totalPrice * 0.1;
                    totalPrice -= discount;
                } else if (daysToStay <= 15) {
                    totalPrice = nights * 35;
                    discount = totalPrice * 0.15;
                    totalPrice -= discount;
                } else {
                    totalPrice = nights * 35;
                    discount = totalPrice * 0.2;
                    totalPrice -= discount;
                }
                break;
            default:
                break;
        }
        if (rating.equals("positive")) {
            discount = totalPrice * 0.25;
            totalPrice += discount;
        } else {
            discount = totalPrice * 0.1;
            totalPrice -= discount;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
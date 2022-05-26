import java.util.Scanner;

public class ExcursionCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        double discount = 0;
        switch (season) {
            case "spring":
                if (peopleCount <= 5) {
                    price = 50;
                } else {
                    price = 48;
                }
                break;
            case "summer":
                if (peopleCount <= 5) {
                    price = 48.5;
                } else {
                    price = 45;
                }
                break;
            case "autumn":
                if (peopleCount <= 5) {
                    price = 60;
                } else {
                    price = 49.5;
                }
                break;
            case "winter":
                if (peopleCount <= 5) {
                    price = 86;
                } else {
                    price = 85;
                }
                break;
            default:
                break;
        }
        double totalPrice = price * peopleCount;
        if (season.equals("summer")) {
            totalPrice -= (totalPrice * 0.15);
        } else if (season.equals("winter")) {
            totalPrice += (totalPrice * 0.08);
        }
        System.out.printf("%.2f leva.", totalPrice);
    }
}
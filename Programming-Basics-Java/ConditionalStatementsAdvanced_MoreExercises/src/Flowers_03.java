import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isHoliday = scanner.nextLine();
        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;
        double discount = 0;
        double total = 0;
        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumsPrice = 2;
                rosesPrice = 4.1;
                tulipsPrice = 2.5;
                break;
            case "Autumn":
            case "Winter":
                chrysanthemumsPrice = 3.75;
                rosesPrice = 4.5;
                tulipsPrice = 4.15;
                break;
            default:
                break;
        }
        if (isHoliday.equals("Y")) {
            discount = chrysanthemumsPrice * 0.15;
            chrysanthemumsPrice += discount;
            discount = rosesPrice * 0.15;
            rosesPrice += discount;
            discount = tulipsPrice * 0.15;
            tulipsPrice += discount;
        }
        total = (chrysanthemums * chrysanthemumsPrice) + (roses * rosesPrice) + (tulips * tulipsPrice);
        if (tulips > 7 && season.equals("Spring")) {
            discount = total * 0.05;
            total -= discount;
        }
        if (roses >= 10 && season.equals("Winter")) {
            discount = total * 0.1;
            total -= discount;
        }
        if (chrysanthemums + roses + tulips > 20) {
            discount = total * 0.2;
            total -= discount;
        }
        System.out.printf("%.2f", total + 2);
    }
}
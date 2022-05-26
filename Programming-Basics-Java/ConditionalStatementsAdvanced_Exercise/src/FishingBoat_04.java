import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());
        double shipPrice = 0;
        boolean isAutumn = season.equals("Autumn");
        switch (season) {
            case "Spring":
            shipPrice = 3000;
            if (fishermenCount <= 6) {
                shipPrice -= 3000 * 0.1;
            } else if (fishermenCount <= 11) {
                shipPrice -= 3000 * 0.15;
            } else {
                shipPrice -= 3000 * 0.25;
            }
                break;
            case "Summer":
            case "Autumn":
                shipPrice = 4200;
                if (fishermenCount <= 6) {
                    shipPrice -= 4200 * 0.1;
                } else if (fishermenCount <= 11) {
                    shipPrice -= 4200 * 0.15;
                } else {
                    shipPrice -= 4200 * 0.25;
                }
                break;
            case "Winter":
                shipPrice = 2600;
                if (fishermenCount <= 6) {
                    shipPrice -= 2600 * 0.1;
                } else if (fishermenCount <= 11) {
                    shipPrice -= 2600 * 0.15;
                } else {
                    shipPrice -= 2600 * 0.25;
                }
                break;
            default:
                break;
        }
        if (fishermenCount % 2 == 0 && !isAutumn) {
            shipPrice -= shipPrice * 0.05;
        }
        if (shipPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - shipPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", shipPrice - budget);
        }
    }
}
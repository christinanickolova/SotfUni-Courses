import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int cpusCount = Integer.parseInt(scanner.nextLine());
        int ramMemoriesCount = Integer.parseInt(scanner.nextLine());
        int videoCardPrice = 250;
        double cpuPrice = videoCardsCount * videoCardPrice * 0.35;
        double ramMemoryPrice = videoCardsCount * videoCardPrice * 0.1;
        double total = videoCardsCount * videoCardPrice + cpusCount * cpuPrice + ramMemoriesCount * ramMemoryPrice;
        double discount = 0;
        if (videoCardsCount >= cpusCount) {
            discount = total * 0.15;
            total -= discount;
        }
        if (budget >= total) {
            System.out.printf("You have %.2f leva left!", budget - total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", total - budget);
        }
    }
}
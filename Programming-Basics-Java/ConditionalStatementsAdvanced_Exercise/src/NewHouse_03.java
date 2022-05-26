import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double discount = 0;
        double totalPrice = 0;
        switch (flowerType) {
            case "Roses":
                totalPrice = flowersCount * 5;
            if (flowersCount > 80) {
                discount = totalPrice * 0.1;
                totalPrice -= discount;
                }
                break;
            case "Dahlias":
                totalPrice = flowersCount * 3.8;
                if (flowersCount > 90) {
                    discount = totalPrice * 0.15;
                    totalPrice -= discount;
                }
                break;
            case "Tulips":
                totalPrice = flowersCount * 2.8;
                if (flowersCount > 80) {
                    discount = totalPrice * 0.15;
                    totalPrice -= discount;
                }
                break;
            case "Narcissus":
                totalPrice = flowersCount * 3;
                if (flowersCount < 120) {
                    discount = 3 * 0.15;
                    discount += 3;
                    totalPrice = discount * flowersCount;
                }
                break;
            case "Gladiolus":
                totalPrice = flowersCount * 2.5;
                if (flowersCount < 80) {
                    discount = 2.5 * 0.2;
                    discount += 2.5;
                    totalPrice = discount * flowersCount;
                }
                break;
            default:
                break;
        }
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount,
                    flowerType, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}
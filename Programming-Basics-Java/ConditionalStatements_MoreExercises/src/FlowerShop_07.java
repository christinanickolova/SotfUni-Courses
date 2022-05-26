import java.util.Scanner;

public class FlowerShop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double magnoliasTotalCost = magnolias * 3.25;
        int hyacinthsTotalCost = hyacinths * 4;
        double rosesTotalCost = roses * 3.5;
        int cactusTotalCost = cactus * 8;
        double total = magnoliasTotalCost + hyacinthsTotalCost + rosesTotalCost + cactusTotalCost;
        double taxes = total * 0.05;
        double moneyLeft = total - taxes;
        if (moneyLeft >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyLeft - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - moneyLeft));
        }
    }
}
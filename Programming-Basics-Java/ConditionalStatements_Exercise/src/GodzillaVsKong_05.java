import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double movieBudget = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double clotheCost = Double.parseDouble(scanner.nextLine());
        double decor = movieBudget * 0.1;
        double discount = statistsCount * clotheCost * 0.1;
        double clothesPrice = statistsCount * clotheCost;
        double moviePrice = 0;
        if (statistsCount < 150) {
            moviePrice = decor + clothesPrice;
        } else {
            moviePrice = clothesPrice - discount + decor;
        }
        if (movieBudget >= moviePrice) {
            System.out.printf("Action! %nWingard starts filming with %.2f leva left.", movieBudget - moviePrice);
        } else {
            System.out.printf("Not enough money! %nWingard needs %.2f leva more.", moviePrice - movieBudget);
        }
    }
}
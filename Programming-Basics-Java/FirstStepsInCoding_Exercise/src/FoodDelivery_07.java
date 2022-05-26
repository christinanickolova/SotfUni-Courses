import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());
        double chickenMenusPrice = chickenMenus * 10.35;
        double fishMenusPrice = fishMenus * 12.4;
        double vegetarianMenusPrice = vegetarianMenus * 8.15;
        double totalPriceMenus = chickenMenusPrice + fishMenusPrice + vegetarianMenusPrice;
        double desertPrice = totalPriceMenus * 0.2;
        double total = totalPriceMenus + desertPrice + 2.5;
        System.out.println(total);
    }
}
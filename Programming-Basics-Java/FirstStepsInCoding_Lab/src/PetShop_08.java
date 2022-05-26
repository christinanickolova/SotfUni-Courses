import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int dogPacks = Integer.parseInt(scanner.nextLine());
          int catPacks = Integer.parseInt(scanner.nextLine());
          double dogFoodPrice = 2.5;
          int catFoodPrice = 4;
          double dogFoodPriceTotal = dogPacks * dogFoodPrice;
          int catFoodPriceTotal = catPacks * catFoodPrice;
          double total = dogFoodPriceTotal + catFoodPriceTotal;
        System.out.println(total + " lv.");
    }
}

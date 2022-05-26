import java.util.Scanner;

public class Pets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodLeftInKg = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDayInKg = Double.parseDouble(scanner.nextLine());
        double catFoodPerDayInKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDayInGrams = Double.parseDouble(scanner.nextLine());
        double totalDogFood = days * dogFoodPerDayInKg;
        double totalCatFood = days * catFoodPerDayInKg;
        double totalTurtleFood = days * (turtleFoodPerDayInGrams / 1000);
        double totalFood = totalCatFood + totalTurtleFood + totalDogFood;
        if (totalFood <= foodLeftInKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeftInKg - totalFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood - foodLeftInKg));
        }
    }
}
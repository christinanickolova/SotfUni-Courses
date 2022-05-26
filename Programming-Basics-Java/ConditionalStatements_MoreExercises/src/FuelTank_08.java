import java.util.Scanner;

public class FuelTank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();;
        double litersInTank = Double.parseDouble(scanner.nextLine());
        if (fuelType.equals("Diesel")) {
            if (litersInTank >= 25) {
                System.out.printf("You have enough diesel.");
            } else {
                System.out.printf("Fill your tank with diesel!");
            }
        } else if (fuelType.equals("Gasoline")) {
            if (litersInTank >= 25) {
                System.out.printf("You have enough gasoline.");
            } else {
                System.out.printf("Fill your tank with gasoline!");
            }
        } else if (fuelType.equals("Gas")) {
            if (litersInTank >= 25) {
                System.out.printf("You have enough gas.");
            } else {
                System.out.printf("Fill your tank with gas!");
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
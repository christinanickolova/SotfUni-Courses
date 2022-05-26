import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass = "";
        String carType = "";
        double carPrice = 0;
        double total = 0;
        switch (season) {
            case "Summer":
                if (budget <= 100) {
                    carClass = "Economy class";
                    carType = "Cabrio";
                    carPrice = budget * 0.35;
                    total = budget - carPrice;
                } else if (budget > 100 && budget <= 500) {
                    carClass = "Compact class";
                    carType = "Cabrio";
                    carPrice = budget * 0.45;
                    total = budget - carPrice;
                } else {
                    carClass = "Luxury class";
                    carType = "Jeep";
                    carPrice = budget * 0.9;
                    total = budget - carPrice;
                }
                break;
            case "Winter":
                carType = "Jeep";
                if (budget <= 100) {
                    carClass = "Economy class";
                    carPrice = budget * 0.65;
                    total = budget - carPrice;
                } else if (budget > 100 && budget <= 500) {
                    carClass = "Compact class";
                    carPrice = budget * 0.8;
                    total = budget - carPrice;
                } else {
                    carClass = "Luxury class";
                    carPrice = budget * 0.9;
                    total = budget - carPrice;
                }
                break;
            default:
                break;
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
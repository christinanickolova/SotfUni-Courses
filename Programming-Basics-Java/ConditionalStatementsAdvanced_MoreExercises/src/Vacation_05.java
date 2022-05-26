import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String place = "";
        double cost = 0;
        switch (season) {
            case "Summer":
                location = "Alaska";
                if (budget <= 1000) {
                    place = "Camp";
                    cost = budget * 0.65;
                } else if (budget > 1000 && budget <= 3000) {
                    place = "Hut";
                    cost = budget * 0.8;
                } else {
                    place = "Hotel";
                    cost = budget * 0.9;
                }
                break;
            case "Winter":
                location = "Morocco";
                if (budget <= 1000) {
                    place = "Camp";
                    cost = budget * 0.45;
                } else if (budget > 1000 && budget <= 3000) {
                    place = "Hut";
                    cost = budget * 0.6;
                } else {
                    place = "Hotel";
                    cost = budget * 0.9;
                }
                break;
            default:
                break;
        }
        System.out.printf("%s - %s - %.2f", location, place, cost);
    }
}
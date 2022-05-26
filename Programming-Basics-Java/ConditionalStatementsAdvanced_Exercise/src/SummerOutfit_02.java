import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        switch (timeOfDay) {
            case "Morning":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degrees >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                break;
            default:
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
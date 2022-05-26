import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String campOrHotel = "";
        double spendMoney = 0;
        switch (season) {
            case "summer":
                campOrHotel = "Camp";
                if (budget <= 100) {
                    destination = "Bulgaria";
                    spendMoney = budget * 0.3;
                } else if (budget <= 1000) {
                    spendMoney = budget * 0.4;
                    destination = "Balkans";
                } else if (budget > 1000) {
                    destination = "Europe";
                    spendMoney = budget * 0.9;
                    campOrHotel = "Hotel";
                }
                break;
            case "winter":
                campOrHotel = "Hotel";
                if (budget <= 100) {
                    destination = "Bulgaria";
                    spendMoney = budget * 0.7;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    spendMoney = budget * 0.8;
                } else if (budget > 1000) {
                    destination = "Europe";
                    spendMoney = budget * 0.9;
                }
                break;
            default:
                break;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", campOrHotel, spendMoney);
    }
}
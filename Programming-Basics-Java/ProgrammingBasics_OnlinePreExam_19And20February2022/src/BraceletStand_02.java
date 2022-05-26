import java.util.Scanner;

public class BraceletStand_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        double costs = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double totalMoney = (moneyPerDay * 5) + (profitPerDay * 5);
        double finalMoney = totalMoney - costs;
        if (finalMoney >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", finalMoney);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - finalMoney);
        }
    }
}
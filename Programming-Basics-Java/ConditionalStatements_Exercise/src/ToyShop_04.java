import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int talkingDollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trunksCount = Integer.parseInt(scanner.nextLine());
        double totalMoney = (puzzleCount * 2.6) + (talkingDollsCount * 3) + (teddyBearsCount * 4.1) +
                (minionsCount * 8.2) + (trunksCount * 2);
        int totalToys = puzzleCount + talkingDollsCount + teddyBearsCount + minionsCount + trunksCount;
        double discount = 0;
        double rent = 0;
        if (totalToys >= 50) {
            discount = totalMoney * 0.25;
            totalMoney -= discount;
            rent = totalMoney * 0.1;
            totalMoney -= rent;
        } else {
            rent = totalMoney * 0.1;
            totalMoney -= rent;
        }
        if (totalMoney >= vacationPrice) {
            System.out.printf("Yes! %.2f lv left.", totalMoney - vacationPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", vacationPrice - totalMoney);
        }
    }
}
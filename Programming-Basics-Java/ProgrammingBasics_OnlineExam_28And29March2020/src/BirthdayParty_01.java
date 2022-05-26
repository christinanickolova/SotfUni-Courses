import java.util.Scanner;

public class BirthdayParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rent = Double.parseDouble(scanner.nextLine());
        double cakePrice = rent * 0.2;
        double drinksPrice = cakePrice - (cakePrice * 0.45);
        double animatorPrice = rent / 3;
        System.out.println(rent + cakePrice + drinksPrice + animatorPrice);
    }
}
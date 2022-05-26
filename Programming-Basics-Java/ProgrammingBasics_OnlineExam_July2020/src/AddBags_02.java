import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForBagsOver20Kilos = Double.parseDouble(scanner.nextLine());
        double bagsWeight = Double.parseDouble(scanner.nextLine());
        int daysLeft = Integer.parseInt(scanner.nextLine());
        int bagsCount = Integer.parseInt(scanner.nextLine());
        double tax = 0;
        double price = 0;
        if (bagsWeight < 10) {
            price = priceForBagsOver20Kilos * 0.2;
        } else if (bagsWeight <= 20) {
            price = priceForBagsOver20Kilos / 2;
        } else {
            price = priceForBagsOver20Kilos;
        }
        if (daysLeft > 30) {
            tax = price * 0.1;
            price += tax;
        } else if (daysLeft >= 7 && daysLeft <= 30) {
            tax = price * 0.15;
            price += tax;
        } else if (daysLeft < 7) {
            tax = price * 0.4;
            price += tax;
        }
        double total = price * bagsCount;
        System.out.printf("The total price of bags is: %.2f lv.", total);
    }
}
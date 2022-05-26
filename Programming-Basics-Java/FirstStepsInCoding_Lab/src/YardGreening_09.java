import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double priceForMeter = 7.61;
        double discount = 0.18;
        double price = squareMeters * priceForMeter;
        double discountPrice = discount * price;
        double total = price - discountPrice;
        System.out.println("The final price is: " + total + " lv.");
        System.out.println("The discount is: " + discountPrice + " lv.");
    }
}
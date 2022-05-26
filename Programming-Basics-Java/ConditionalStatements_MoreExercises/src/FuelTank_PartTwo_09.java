import java.util.Scanner;

public class FuelTank_PartTwo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuelAmount = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double discount = 0;
        double fuelPrice = 0;
        double finalPrice = 0;
        if (fuelType.equals("Gas") && clubCard.equals("Yes")) {
            fuelPrice = 0.93 - 0.08;
            finalPrice = fuelAmount * fuelPrice;
            if (fuelAmount >= 20 && fuelAmount <= 25) {
                discount = finalPrice * 0.08;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else if (fuelAmount > 25) {
                discount = finalPrice * 0.1;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else {
                System.out.printf("%.2f lv.", finalPrice);
            }
        } else if (fuelType.equals("Gas") && clubCard.equals("No")) {
            fuelPrice = 0.93;
            finalPrice = fuelAmount * fuelPrice;
            if (fuelAmount >= 20 && fuelAmount <= 25) {
                discount = finalPrice * 0.08;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else if (fuelAmount > 25) {
                discount = finalPrice * 0.1;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else {
                System.out.printf("%.2f lv.", finalPrice);
            }
        } else if (fuelType.equals("Gasoline") && clubCard.equals("Yes")) {
            fuelPrice = 2.22 - 0.18;
            finalPrice = fuelAmount * fuelPrice;
            if (fuelAmount >= 20 && fuelAmount <= 25) {
                discount = finalPrice * 0.08;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else if (fuelAmount > 25) {
                discount = finalPrice * 0.1;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else {
                System.out.printf("%.2f lv.", finalPrice);
            }
        } else if (fuelType.equals("Gasoline") && clubCard.equals("No")) {
            fuelPrice = 2.22;
            finalPrice = fuelAmount * fuelPrice;
            if (fuelAmount >= 20 && fuelAmount <= 25) {
                discount = finalPrice * 0.08;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else if (fuelAmount > 25) {
                discount = finalPrice * 0.1;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else {
                System.out.printf("%.2f lv.", finalPrice);
            }
        } else if (fuelType.equals("Diesel") && clubCard.equals("Yes")) {
            fuelPrice = 2.33 - 0.12;
            finalPrice = fuelAmount * fuelPrice;
            if (fuelAmount >= 20 && fuelAmount <= 25) {
                discount = finalPrice * 0.08;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else if (fuelAmount > 25) {
                discount = finalPrice * 0.1;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else {
                System.out.printf("%.2f lv.", finalPrice);
            }
        } else if (fuelType.equals("Diesel") && clubCard.equals("No")) {
            fuelPrice = 2.33;
            finalPrice = fuelAmount * fuelPrice;
            if (fuelAmount >= 20 && fuelAmount <= 25) {
                discount = finalPrice * 0.08;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else if (fuelAmount > 25) {
                discount = finalPrice * 0.1;
                finalPrice -= discount;
                System.out.printf("%.2f lv.", finalPrice);
            } else {
                System.out.printf("%.2f lv.", finalPrice);
            }
        }
    }
}
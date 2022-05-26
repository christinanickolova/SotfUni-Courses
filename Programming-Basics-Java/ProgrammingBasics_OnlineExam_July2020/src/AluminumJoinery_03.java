import javax.print.attribute.standard.JobImpressions;
import java.util.Scanner;

public class AluminumJoinery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int joinery = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;
        double discount = 0;
        switch (type) {
            case "90X130":
                if (joinery < 10) {
                    System.out.println("Invalid order");
                    break;
                }
                price = joinery * 110;
                if (joinery > 30 && joinery < 60) {
                    discount = price * 0.05;
                    price -= discount;
                } else if (joinery >= 60) {
                    discount = price * 0.08;
                    price -= discount;
                }
                break;
            case "100X150":
                if (joinery < 10) {
                    System.out.println("Invalid order");
                    break;
                }
                price = joinery * 140;
                if (joinery > 40 && joinery < 80) {
                    discount = price * 0.06;
                    price -= discount;
                } else if (joinery >= 80) {
                    discount = price * 0.1;
                    price -= discount;
                }
                break;
            case "130X180":
                if (joinery < 10) {
                    System.out.println("Invalid order");
                    break;
                }
                price = joinery * 190;
                if (joinery > 20 && joinery < 50) {
                    discount = price * 0.07;
                    price -= discount;
                } else if (joinery >= 50) {
                    discount = price * 0.12;
                    price -= discount;
                }
                break;
            case "200X300":
                if (joinery < 10) {
                    System.out.println("Invalid order");
                    break;
                }
                price = joinery * 250;
                if (joinery > 25 && joinery < 50) {
                    discount = price * 0.09;
                    price -= discount;
                } else if (joinery >= 50) {
                    discount = price * 0.14;
                    price -= discount;
                }
                break;
        }
        if (delivery.equals("With delivery")) {
            if (joinery > 99) {
                price += 60;
                discount = price * 0.04;
                price -= discount;
                System.out.printf("%.2f BGN", price);
            } else if (joinery >= 10) {
                price += 60;
                System.out.printf("%.2f BGN", price);
            }
        } else if (delivery.equals("Without delivery") && joinery > 99) {
            discount = price * 0.04;
            price -= discount;
            System.out.printf("%.2f BGN", price);
        } else if (joinery >= 10) {
            System.out.printf("%.2f BGN", price);
        }
    }
}
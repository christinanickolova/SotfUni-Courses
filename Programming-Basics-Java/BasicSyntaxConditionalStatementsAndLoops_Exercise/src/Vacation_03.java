import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double discount = 0;
        double totalPrice = 0;

        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.8;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = 10.9;
                        break;
                    case "Saturday":
                        price = 15.6;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.5;
                        break;
                }
                break;
        }
        totalPrice = group * price;
        if (type.equals("Students") && group >= 30) {
            discount = 0.15;
            totalPrice -= (totalPrice * discount);
        } else if (type.equals("Business") && group >= 100) {
            totalPrice = (group - 10) * price;
        } else if (type.equals("Regular") && group >= 10 && group <= 20) {
            discount = 0.05;
            totalPrice -= (totalPrice * discount);
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}

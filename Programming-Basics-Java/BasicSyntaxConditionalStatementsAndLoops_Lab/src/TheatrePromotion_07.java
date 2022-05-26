import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        boolean isNotValid = false;

        if (age >= 0 && age <= 18) {
            if (dayType.equals("Weekday")) {
                price = 12;
            } else if (dayType.equals("Weekend")) {
                price = 15;
            } else if (dayType.equals("Holiday")) {
                price = 5;
            }
        } else if (age > 18 && age <= 64) {
            if (dayType.equals("Weekday")) {
                price = 18;
            } else if (dayType.equals("Weekend")) {
                price = 20;
            } else if (dayType.equals("Holiday")) {
                price = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (dayType.equals("Weekday")) {
                price = 12;
            } else if (dayType.equals("Weekend")) {
                price = 15;
            } else if (dayType.equals("Holiday")) {
                price = 10;
            }
        } else {
            isNotValid = true;
        }

        if (isNotValid) {
            System.out.println("Error!");
        } else {
            System.out.println(price + "$");
        }
    }
}

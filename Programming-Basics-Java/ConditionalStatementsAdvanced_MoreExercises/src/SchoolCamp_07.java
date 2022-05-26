import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int overnights = Integer.parseInt(scanner.nextLine());
        double overnightPrice = 0;
        String sport = "";
        switch (season) {
            case "Winter":
                if (group.equals("boys")) {
                    overnightPrice = 9.6;
                    sport = "Judo";
                } else if (group.equals("girls")) {
                    overnightPrice = 9.6;
                    sport = "Gymnastics";
                } else if (group.equals("mixed")) {
                    overnightPrice = 10;
                    sport = "Ski";
                }
                break;
            case "Spring":
                if (group.equals("boys")) {
                    overnightPrice = 7.2;
                    sport = "Tennis";
                } else if (group.equals("girls")) {
                    overnightPrice = 7.2;
                    sport = "Athletics";
                } else if (group.equals("mixed")) {
                    overnightPrice = 9.5;
                    sport = "Cycling";
                }
                break;
            case "Summer":
                if (group.equals("boys")) {
                    overnightPrice = 15;
                    sport = "Football";
                } else if (group.equals("girls")) {
                    overnightPrice = 15;
                    sport = "Volleyball";
                } else if (group.equals("mixed")) {
                    overnightPrice = 20;
                    sport = "Swimming";
                }
                break;
            default:
                break;
        }
        double totalPrice = overnights * overnightPrice * students;
        double discount = 0;
        if (students >= 50) {
            totalPrice /= 2;
        } else if (students < 50 && students >= 20) {
            discount = totalPrice * 0.15;
            totalPrice -= discount;
        } else if (students < 20 && students >= 10) {
            discount = totalPrice * 0.05;
            totalPrice -= discount;
        }
        System.out.printf("%s ", sport);
        System.out.printf("%.2f lv.", totalPrice);
    }
}
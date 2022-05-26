import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int overnights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartment = 0;
        double discount = 0;
        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                if (overnights > 7 && overnights <= 14) {
                    discount = studio * 0.05;
                    studio -= discount;
                } else if (overnights > 14) {
                    discount = studio * 0.3;
                    studio -= discount;
                    discount = apartment * 0.1;
                    apartment -= discount;
                }
                break;
            case "June":
            case "September":
                studio = 75.2;
                apartment = 68.7;
                if (overnights > 14) {
                    discount = studio * 0.2;
                    studio -= discount;
                    discount = apartment * 0.1;
                    apartment -= discount;
                }
                break;
            case "August":
            case "July":
                studio = 76;
                apartment = 77;
                if (overnights > 14) {
                    discount = apartment * 0.1;
                    apartment -= discount;
                }
            break;
            default:
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartment * overnights);
        System.out.printf("Studio: %.2f lv.", studio * overnights);
    }
}
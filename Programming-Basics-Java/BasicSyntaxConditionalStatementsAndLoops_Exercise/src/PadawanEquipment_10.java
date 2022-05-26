import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double bonusLightsaubers = Math.ceil(students + (students * 0.1));
        int freeBelts = students / 6;
        double totalPrice = (bonusLightsaubers * lightsaberPrice) + (students * robePrice) +
                ((students - freeBelts) * beltPrice);
        if (money >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.%n", totalPrice - money);
        }
    }
}

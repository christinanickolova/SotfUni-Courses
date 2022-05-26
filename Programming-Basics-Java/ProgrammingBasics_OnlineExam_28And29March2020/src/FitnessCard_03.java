import java.util.Scanner;

public class FitnessCard_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0;
        switch (sport) {
            case "Gym":
                if (gender == 'm') {

                }
                break;
            case "Boxing":
                break;
            case "Yoga":
                break;
            case "Zumba":
                break;
            case "Dances":
                break;
            case "Pilates":
                break;
            default:
                break;
        }
    }
}

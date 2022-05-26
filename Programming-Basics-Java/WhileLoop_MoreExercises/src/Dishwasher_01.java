import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int detergentBottlesCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;
        int usedDetergent = 0;
        int dishes = 0;
        int pots = 0;
        int detergent = detergentBottlesCount * 750;
        while (!input.equals("End")) {
            int dishesCount = Integer.parseInt(input);
            count++;
            if (count == 3) {
                usedDetergent += (dishesCount * 15);
                pots += dishesCount;
                count = 0;
            } else {
                usedDetergent += (dishesCount * 5);
                dishes += dishesCount;
            }
            if (usedDetergent > detergent) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", usedDetergent - detergent);
                return;
            }
            input = scanner.nextLine();
        }
        if (usedDetergent <= detergent) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", detergent - usedDetergent);
        }
    }
}
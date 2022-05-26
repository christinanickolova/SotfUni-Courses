import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int trashesHeadsets = 0;
        int trashesMouses = 0;
        int trashedKeyboards = 0;
        int trashesDisplays = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                trashesHeadsets++;
            }
            if (i % 3 == 0) {
                trashesMouses++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                trashedKeyboards++;
            }
            if (trashedKeyboards % 2 == 0 && trashedKeyboards != 0 && i % 2 == 0 && i % 3 == 0) {
                trashesDisplays++;
            }
        }
        double totalCosts = (trashedKeyboards * keyboardPrice) + (trashesDisplays * displayPrice) +
                (trashesHeadsets * headsetPrice) + (trashesMouses * mousePrice);
        System.out.printf("Rage expenses: %.2f lv.", totalCosts);
    }
}

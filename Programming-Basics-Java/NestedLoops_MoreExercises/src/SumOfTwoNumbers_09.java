import java.util.Scanner;

public class SumOfTwoNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combination = 0;
        boolean isFound = false;
        for (int i = startInterval; i <= endInterval; i++) {
            for (int j = startInterval; j <= endInterval; j++) {
                combination++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNumber);
                    return;
                } else {
                    isFound = true;
                }
            }
        }
        if (isFound) {
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }
    }
}
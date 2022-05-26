import java.util.Scanner;

public class UniquePinCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumberBorder = Integer.parseInt(scanner.nextLine());
        int secondNumberBorder = Integer.parseInt(scanner.nextLine());
        int thirdNumberBorder = Integer.parseInt(scanner.nextLine());
        for (int firstNumber = 2; firstNumber <= firstNumberBorder; firstNumber++) {
            if (firstNumber % 2 != 0) {
                continue;
            }
            for (int secondNumber = 2; secondNumber <= secondNumberBorder; secondNumber++) {
                if (secondNumber > 2 && secondNumber % 2 == 0 && secondNumber < 9 || secondNumber == 9) {
                    continue;
                }
                for (int thirdNumber = 2; thirdNumber <= thirdNumberBorder; thirdNumber++) {
                    if (thirdNumber % 2 == 0) {
                        System.out.printf("%d %d %d%n", firstNumber, secondNumber, thirdNumber);
                    }
                }
            }
        }
    }
}
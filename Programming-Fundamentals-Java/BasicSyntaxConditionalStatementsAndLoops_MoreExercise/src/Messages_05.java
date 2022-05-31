import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String message = "";
        for (int i = 0; i < n; i++) {
            int numberOfDigits = 0;
            int mainDigit = 0;
            int offset = 0;
            int letterIndex = 0;
            char letter = 97;
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum == 0) {
                message += " ";
                continue;
            }
            int num = currentNum;
            while (num > 0) {
                numberOfDigits++;
                num /= 10;
            }
            mainDigit = currentNum % 10;
            if (mainDigit == 8 || mainDigit == 9) {
                offset = ((mainDigit - 2) * 3) + 1;
            } else {
                offset = (mainDigit - 2) * 3;
            }
            letterIndex = offset + numberOfDigits - 1;
            char result = (char)(letter + letterIndex);
            message += result;
        }
        System.out.println(message);
    }
}

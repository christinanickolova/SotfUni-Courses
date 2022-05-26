import java.util.Scanner;

public class StringNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int digitFactorial = 1;
        int factorial = 0;
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            int currentDigit = Character.getNumericValue(digit);
            for (int j = 1; j <= currentDigit; j++) {
                digitFactorial *= j;
            }
            factorial += digitFactorial;
            digitFactorial = 1;
        }
        int num = Integer.parseInt(number);
        if (num == factorial) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

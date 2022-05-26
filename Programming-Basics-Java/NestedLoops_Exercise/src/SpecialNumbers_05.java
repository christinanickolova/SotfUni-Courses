import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            int count = 0;
            String currentNumber = "" + i;
            for (int j = 0; j < currentNumber.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNumber.charAt(j));
                if (currentDigit > 0) {
                    if (n % currentDigit == 0) {
                        count++;
                    }
                }
            }
            if (count == 4) {
                System.out.print(i + " ");
            }
        }
    }
}
import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine()); //2345
        int end = Integer.parseInt(scanner.nextLine()); //6789
        String firstNumber = "" + start;
        String lastNumber = "" + end;
        int firstDigitStart = Integer.parseInt("" + firstNumber.charAt(0));
        int secondDigitStart = Integer.parseInt("" + firstNumber.charAt(1));
        int thirdDigitStart = Integer.parseInt("" + firstNumber.charAt(2));
        int fourDigitStart = Integer.parseInt("" + firstNumber.charAt(3));
        int firstDigitEnd = Integer.parseInt("" + lastNumber.charAt(0));
        int secondDigitEnd = Integer.parseInt("" + lastNumber.charAt(1));
        int thirdDigitEnd = Integer.parseInt("" + lastNumber.charAt(2));
        int fourDigitEnd = Integer.parseInt("" + lastNumber.charAt(3));
        for (int i = firstDigitStart; i <= firstDigitEnd; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = secondDigitStart; j <= secondDigitEnd; j++) {
                if (j % 2 == 0) {
                    continue;
                }
                for (int k = thirdDigitStart; k <= thirdDigitEnd; k++) {
                    if (k % 2 == 0) {
                        continue;
                    }
                    for (int l = fourDigitStart; l <= fourDigitEnd; l++) {
                        if (l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
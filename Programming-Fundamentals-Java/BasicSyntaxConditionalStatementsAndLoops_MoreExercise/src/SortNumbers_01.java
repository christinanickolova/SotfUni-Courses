import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double thirdNumber = Double.parseDouble(scanner.nextLine());

        double firstCheck = Math.max(firstNumber, secondNumber);
        double secondCheck = Math.max(firstNumber, thirdNumber);
        double thirdCheck = Math.max(secondNumber, thirdNumber);

        boolean isBiggerFirst = firstCheck == secondCheck;
        boolean isBiggerThird = secondCheck == thirdCheck;

        if (isBiggerFirst) {
            System.out.printf("%.0f%n", firstNumber);
            System.out.printf("%.0f%n", Math.max(secondNumber, thirdNumber));
            System.out.printf("%.0f%n", Math.min(secondNumber, thirdNumber));
        } else if (isBiggerThird) {
            System.out.printf("%.0f%n", thirdNumber);
            System.out.printf("%.0f%n", Math.max(secondNumber, firstNumber));
            System.out.printf("%.0f%n", Math.min(secondNumber, firstNumber));
        } else {
            System.out.printf("%.0f%n", secondNumber);
            System.out.printf("%.0f%n", Math.max(firstNumber, thirdNumber));
            System.out.printf("%.0f%n", Math.min(firstNumber, thirdNumber));
        }
    }
}

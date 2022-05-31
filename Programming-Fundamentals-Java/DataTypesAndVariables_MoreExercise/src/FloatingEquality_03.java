import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double biggerNumber = Math.max(firstNumber, secondNumber);
        double smallerNumber = Math.min(firstNumber, secondNumber);
        double difference = 0.000001;
        if (biggerNumber - smallerNumber >= difference) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}

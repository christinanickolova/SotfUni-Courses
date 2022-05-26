import java.util.Scanner;

public class InchesToCentimeters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        double result = num * 2.54;
        System.out.println(result);
    }
}
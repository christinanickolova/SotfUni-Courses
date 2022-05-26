import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        if (operator.equals("+")) {
            if ((n1 + n2) % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", n1, operator, n2, n1 + n2);
            } else {
                System.out.printf("%d %s %d = %d - odd", n1, operator, n2, n1 + n2);
            }
        } else if (operator.equals("-")) {
            if ((n1 - n2) % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", n1, operator, n2, n1 - n2);
            } else {
                System.out.printf("%d %s %d = %d - odd", n1, operator, n2, n1 - n2);
            }
        } else if (operator.equals("*")) {
            if ((n1 * n2) % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", n1, operator, n2, n1 * n2);
            } else {
                System.out.printf("%d %s %d = %d - odd", n1, operator, n2, n1 * n2);
            }
        } else if (operator.equals("/")) {
            if (n2 != 0) {
                System.out.printf("%d %s %d = %.2f", n1, operator, n2, (n1 * 1.0) / (n2 * 1.0));
            } else {
                System.out.printf("Cannot divide %d by zero", n1);
            }
        } else {
            if (n2 != 0) {
                System.out.printf("%d %s %d = %d", n1, operator, n2, n1 % n2);
            } else {
                System.out.printf("Cannot divide %d by zero", n1);
            }
        }
    }
}
import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isFirst = false;
        boolean isPair = false;
        int count = 0;
        int countOpen = 0;
        int countClose = 0;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                countOpen++;
                count++;
                isFirst = true;
                if (isPair) {
                    isPair = false;
                }
            } else if (input.equals(")")) {
                countClose++;
                if (count == 1) {
                    isPair = true;
                    count = 0;
                }
            }
        }
        if (isFirst && isPair && (countOpen == countClose)) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}

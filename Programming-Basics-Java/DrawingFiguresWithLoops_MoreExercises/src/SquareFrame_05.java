import java.util.Scanner;

public class SquareFrame_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("+ ");
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("- ");
        }
        System.out.println("+");
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("| ");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print("- ");
            }
            System.out.println("|");
        }
        System.out.print("+ ");
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("- ");
        }
        System.out.println("+");
    }
}
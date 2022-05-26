import java.util.Scanner;

public class House_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 2 != 0) {
            for (int i = 1; i <= (n + 1) / 2; i++) {
                for (int j = 1; j <= (n / 2) - i + 1; j++) {
                    System.out.print("-");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= (n / 2) - i + 1; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= (n + 1) / 2; i++) {
                for (int j = 1; j <= (n / 2) - i; j++) {
                    System.out.print("-");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= (n / 2) - i; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
        for (int i = 1; i <= n / 2; i++) {
            System.out.print("|");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print("*");
            }
            System.out.println("|");
        }
    }
}
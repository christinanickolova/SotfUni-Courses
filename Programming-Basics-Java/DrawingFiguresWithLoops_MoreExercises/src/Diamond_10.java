import java.util.Scanner;

public class Diamond_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 2 != 0 && n != 1) {
            for (int i = 1; i <= n / 2; i++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int i = 1; i <= n / 2; i++) {
                System.out.print("-");
            }
            System.out.println();
            for (int i = 1; i <= n / 2; i++) {
                for (int j = 1; j <= (n / 2) - i; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 1; j <= i; j++) {
                    System.out.print("-");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = (n / 2) - 1; j >= i; j--) {
                    System.out.print("-");
                }
                System.out.println();
            }
            for (int i = 1; i <= (n / 2) - 1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 1; j <= (n / 2) - i; j++) {
                    System.out.print("-");
                }
                for (int j = i; j <= (n / 2) - 2; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 1; j <= i; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            for (int i = 1; i <= n / 2; i++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int i = 1; i <= n / 2; i++) {
                System.out.print("-");
            }
            System.out.println();
        } else if (n % 2 == 0 && n != 2 ) {
            for (int i = 1; i <= (n / 2) - 1; i++) {
                System.out.print("-");
            }
            System.out.print("**");
            for (int i = 1; i <= (n / 2) - 1; i++) {
                System.out.print("-");
            }
            System.out.println();
            for (int i = 1; i <= (n / 2) - 1; i++) {
                for (int j = 1; j < (n / 2) - i; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 1; j <= i; j++) {
                    System.out.print("--");
                }
                System.out.print("*");
                for (int j = (n / 2) - 1; j > i; j--) {
                    System.out.print("-");
                }
                System.out.println();
            }
            for (int i = 1; i <= (n / 2) - 2; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = i; j <= (n / 2) - 2; j++) {
                    System.out.print("--");
                }
                System.out.print("*");
                for (int j = 1; j <= i; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            for (int i = 1; i <= (n / 2) - 1; i++) {
                System.out.print("-");
            }
            System.out.print("**");
            for (int i = 1; i <= (n / 2) - 1; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
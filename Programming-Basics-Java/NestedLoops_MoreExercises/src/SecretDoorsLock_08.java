import java.util.Scanner;

public class SecretDoorsLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hundreds = Integer.parseInt(scanner.nextLine());
        int tens = Integer.parseInt(scanner.nextLine());
        int units = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= hundreds; i++) {
            for (int j = 1; j <= tens; j++) {
                for (int k = 1; k <= units; k++) {
                    if (k % 2 == 0 && i % 2 == 0 && (j == 2 || j % 2 != 0) && j <= 7 && j > 1) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
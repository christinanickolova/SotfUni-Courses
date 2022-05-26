import java.util.Scanner;

public class PasswordGenerator_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        char firstChar = 'a';
        char secondChar = 'a';
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k <= l; k++) {
                    for (int m = 1; m <= l; m++) {
                        for (int o = 2; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%d%d%s%s%d ", i, j, firstChar, secondChar, o);
                            }
                        }
                        secondChar++;
                    }
                    firstChar++;
                    secondChar = 'a';
                }
                firstChar = 'a';
            }
        }
    }
}
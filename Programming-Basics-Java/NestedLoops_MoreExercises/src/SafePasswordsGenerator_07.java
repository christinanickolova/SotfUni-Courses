import java.util.Scanner;

public class SafePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxGeneratedPasswords = Integer.parseInt(scanner.nextLine());
        int first = 35;
        int second = 64;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                char firstChar = (char)first;
                char secondChar = (char)second;
                System.out.printf("%s%s%d%d%s%s|", firstChar, secondChar, i, j, secondChar, firstChar);
                count++;
                first++;
                second++;
                if (count == maxGeneratedPasswords) {
                    return;
                }
                if (first > 55) {
                    first = 35;
                }
                if (second > 96) {
                    second = 64;
                }
            }
        }
    }
}
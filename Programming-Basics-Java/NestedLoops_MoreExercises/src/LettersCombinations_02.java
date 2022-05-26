import java.util.Scanner;

public class LettersCombinations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startInterval = scanner.nextLine().charAt(0);
        char endInterval = scanner.nextLine().charAt(0);
        char skipLetter = scanner.nextLine().charAt(0);
        int count = 0;
        for (char i = startInterval; i <= endInterval; i++) {
            if (i == skipLetter) {
                continue;
            }
            for (char j = startInterval; j <= endInterval; j++) {
                if (j == skipLetter) {
                    continue;
                }
                for (char k = startInterval; k <= endInterval; k++) {
                    if (k != skipLetter) {
                        count++;
                        System.out.print(i + "" + j + "" + k + " ");
                    }
                }
            }
        }
        System.out.print(count);
    }
}
import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int c = 0;
        int o = 0;
        int n = 0;
        String word = "";
        while (!input.equals("End")) {
            char letter = input.charAt(0);
            switch (letter) {
                case 'c':
                    c++;
                    if (c >= 2) {
                        word += 'c';
                    }
                    break;
                case 'o':
                    o++;
                    if (o >= 2) {
                        word += 'o';
                    }
                    break;
                case 'n':
                    n++;
                    if (n >= 2) {
                        word += 'n';
                    }
                    break;
                default:
                    if (letter >= 'A' && letter <= 'Z' || letter >= 'a' && letter <= 'z') {
                        word += input;
                    }
                    break;
            }
            if (c != 0 && o != 0 && n != 0) {
                System.out.print(word + " ");
                c = 0;
                o = 0;
                n = 0;
                word = "";
            }
            input = scanner.nextLine();
        }
    }
}
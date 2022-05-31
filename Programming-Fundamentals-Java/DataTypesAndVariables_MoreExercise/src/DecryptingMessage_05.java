import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String message = "";
        for (int i = 0; i < n; i++) {
            char letter = scanner.nextLine().charAt(0);
            char decryption = (char)(key + letter);
            message += "" + decryption;
        }
        System.out.println(message);
    }
}

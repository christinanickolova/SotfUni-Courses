import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String password = "";
        char ch;
        for (int i = 0; i < user.length(); i++) {
            ch = user.charAt(i);
            password = ch + password;
        }
        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals(password)) {
            count++;
            if (count == 4) {
                System.out.println("User " + user + " blocked!");
                return;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        System.out.println("User " + user + " logged in.");
    }
}

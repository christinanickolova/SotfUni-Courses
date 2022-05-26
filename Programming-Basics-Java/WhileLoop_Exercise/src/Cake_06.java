import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int area = width * length;
        int count = 0;
        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
            count += pieces;
            if (count >= area) {
                System.out.printf("No more cake left! You need %d pieces more.", count - area);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", area - count);
        }
    }
}
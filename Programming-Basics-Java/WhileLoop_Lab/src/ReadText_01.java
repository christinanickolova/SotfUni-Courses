import java.util.Scanner;

public class ReadText_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine();
        }
    }
}
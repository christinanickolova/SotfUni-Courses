import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            reversed = symbol + reversed;
        }
        System.out.println(reversed);
    }
}

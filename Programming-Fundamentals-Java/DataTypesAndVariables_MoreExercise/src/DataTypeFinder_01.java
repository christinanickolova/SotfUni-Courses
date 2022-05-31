import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String dataType = null;
        while (!input.equals("END")) {
            if (input.matches("^[-+]?\\d*$")) {
                dataType = input + " is integer type";
            } else if (input.matches("^[-+]?\\d*[.]\\d+")) {
                dataType = input + " is floating point type";
            } else if (input.matches(".")) {
                dataType = input + " is character type";
            } else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                dataType = input + " is boolean type";
            } else {
                dataType = input + " is string type";
            }
            System.out.println(dataType);
            input = scanner.nextLine();

        }
    }
}

import java.util.Scanner;

public class RadiansToDegrees_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 57.295779513;
        System.out.println(Math.round(degrees));
    }
}
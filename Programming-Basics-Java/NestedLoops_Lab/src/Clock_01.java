import java.util.Scanner;

public class Clock_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int hour = 0; hour <= 23; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + ":" + minute);
            }
        }
    }
}
import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (int)Math.ceil((double) people / capacity);

        System.out.println(courses);

    }
}

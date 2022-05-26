import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        int number = 0;
        for (int i = floors; i >= 1; i--) {
            number = 0;
            for (int j = rooms; j >= 1; j--) {
                if (i == floors) {
                    System.out.printf("L%d%d ", i, number);
                    number++;
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, number);
                    number++;
                } else {
                    System.out.printf("A%d%d ", i, number);
                    number++;
                }
            }
            System.out.println();
        }
    }
}
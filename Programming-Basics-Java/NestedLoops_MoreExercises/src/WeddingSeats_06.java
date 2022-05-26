import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lastSector = scanner.nextLine().charAt(0);
        int firstSectorRows = Integer.parseInt(scanner.nextLine());
        int oddRowSeats = Integer.parseInt(scanner.nextLine());
        int evenRowSeats = oddRowSeats + 2;
        char seat = 'a';
        int count = 0;
        for (char i = 'A'; i <= lastSector; i++) {
            for (int j = 1; j <= firstSectorRows ; j++) {
                if (j % 2 != 0) {
                    for (int k = 1; k <= oddRowSeats; k++) {
                        System.out.printf("%s%d%s%n", i, j, seat);
                        seat++;
                        count++;
                    }
                } else {
                    for (int k = 1; k <= evenRowSeats; k++) {
                        System.out.printf("%s%d%s%n", i, j, seat);
                        seat++;
                        count++;
                    }
                }
                seat = 'a';
            }
            firstSectorRows++;
        }
        System.out.println(count);
    }
}
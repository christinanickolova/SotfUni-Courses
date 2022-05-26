import java.util.Scanner;

public class ChallengeTheWedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                if (count == maxTables) {
                    return;
                }
                System.out.printf("(%d <-> %d) ", i, j);
                count++;
            }
        }
    }
}
import java.util.Scanner;

public class TheSongOfTheWheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int controlAmount = Integer.parseInt(scanner.nextLine());
        int count = 0;
        String password = "";
        boolean isFound = false;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((i < j) && (k > l) && ((i * j) + (k * l) == controlAmount)) {
                            System.out.printf("%d%d%d%d ", i, j, k ,l);
                            count++;
                            if (count == 4) {
                                password = i + "" + j + "" + k + "" + l;
                                isFound = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if (isFound) {
            System.out.println("Password: " + password);
        } else {
            System.out.println("No!");
        }
    }
}
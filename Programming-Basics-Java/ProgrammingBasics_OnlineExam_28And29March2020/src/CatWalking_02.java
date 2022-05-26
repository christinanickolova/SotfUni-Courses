import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //За всяка минута от разходката, котката гори по 5 калории. Разходката е достатъчна,
        //ако котката изграря 50% от приетите калории.
        int minutesWalking = Integer.parseInt(scanner.nextLine());
        int walksCount = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());
        int burntCalories = minutesWalking * walksCount * 5;
        if (burntCalories >= caloriesPerDay || burntCalories >= caloriesPerDay / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burntCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burntCalories);
        }
    }
}
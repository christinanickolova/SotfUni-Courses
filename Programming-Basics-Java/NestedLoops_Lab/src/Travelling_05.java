import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        double totalMoney = 0;
        while (!destination.equals("End")) {
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            totalMoney = 0;
            while (totalMoney < neededMoney) {
                double sum = Double.parseDouble(scanner.nextLine());
                totalMoney += sum;
            }
            System.out.println("Going to " + destination + "!");
            destination = scanner.nextLine();
        }
    }
}
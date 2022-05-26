import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juriesPeopleCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;
        double averageGradeSum = 0;
        double totalAverageGradeSum = 0;
        while (!input.equals("Finish")) {
            averageGradeSum = 0;
            for (int i = 1; i <= juriesPeopleCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                averageGradeSum += grade;
                count++;
            }
            System.out.printf("%s - %.2f.%n", input, averageGradeSum / juriesPeopleCount);
            totalAverageGradeSum += averageGradeSum;
            input = scanner.nextLine();
        }
        if (input.equals("Finish")) {
            System.out.printf("Student's final assessment is %.2f.%n", totalAverageGradeSum / count);
        }
    }
}
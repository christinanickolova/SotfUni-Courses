import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badMarks = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int badMarksCount = 0;
        double averageScore = 0;
        int totalProblems = 0;
        String lastProblem = "";
        while (!input.equals("Enough")) {
            int mark = Integer.parseInt(scanner.nextLine());
            if (mark <= 4) {
                badMarksCount++;
            }
            if (badMarksCount == badMarks) {
                System.out.printf("You need a break, %d poor grades.", badMarks);
                break;
            }
            averageScore += mark;
            totalProblems++;
            lastProblem = input;
            input = scanner.nextLine();
        }
        averageScore /= totalProblems;
        if (input.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", totalProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
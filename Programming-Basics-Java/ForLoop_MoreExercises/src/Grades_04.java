import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        double excellent = 0;
        double veryGood = 0;
        double good = 0;
        double fail = 0;
        double average = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5) {
                excellent++;
            } else if (grade >= 4.00) {
                veryGood++;
            } else if (grade >= 3.00) {
                good++;
            } else {
                fail++;
            }
            average += grade;
        }
        p1 = excellent / students * 100;
        p2 = veryGood / students * 100;
        p3 = good / students * 100;
        p4 = fail / students * 100;
        average /= students;
        System.out.printf("Top students: %.2f%%%n", p1);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", p2);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", p3);
        System.out.printf("Fail: %.2f%%%n", p4);
        System.out.printf("Average: %.2f%n", average);
    }
}
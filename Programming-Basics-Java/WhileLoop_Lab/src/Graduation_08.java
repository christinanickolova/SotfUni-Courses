import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grades = 0;
        double badGrades = 0;
        double average = 0;
        while (grades != 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4.00) {
                badGrades++;
            }
            average += grade;
            if (badGrades == 2) {
                System.out.printf("%s has been excluded at %d grade",name, grades);
                break;
            }
           grades++;
        }
        if (grades == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, average / 12);
        }
    }
}
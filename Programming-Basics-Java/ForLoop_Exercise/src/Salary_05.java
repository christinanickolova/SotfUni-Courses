import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        double fine = 0;
        for (int i = 1; i <= tabs; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook":
                    fine = 150;
                    salary -= fine;
                    break;
                case "Instagram":
                    fine = 100;
                    salary -= fine;
                    break;
                case "Reddit":
                    fine = 50;
                    salary -= fine;
                    break;
                default:
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(Math.round(salary));
        }
    }
}
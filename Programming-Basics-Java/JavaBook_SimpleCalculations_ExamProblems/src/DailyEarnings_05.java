import java.util.Scanner;

public class DailyEarnings_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workDaysInMonth = Integer.parseInt(scanner.nextLine());
        double earnedMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double dollarLevCourse = Double.parseDouble(scanner.nextLine());
        double monthSalary = workDaysInMonth * earnedMoneyPerDay;
        double yearSalary = (monthSalary * 12) + (monthSalary * 2.5);
        double tax = yearSalary * 0.25;
        double netYearSalary = (yearSalary - tax) * dollarLevCourse;
        double averageSalaryPerDay = netYearSalary / 365;
        System.out.printf("%.2f", averageSalaryPerDay);
    }
}
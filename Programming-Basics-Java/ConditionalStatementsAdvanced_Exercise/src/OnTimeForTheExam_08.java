import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minuteArrival = Integer.parseInt(scanner.nextLine());
        int examTime = (hourExam * 60) + minuteExam;
        int arrivalTime = (hourArrival * 60) + minuteArrival;
        int diff = Math.abs(examTime - arrivalTime);
        int hours = diff / 60;
        int minutes = diff % 60;
        if (examTime < arrivalTime) {
            System.out.println("Late");
            if (diff > 59) {
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            } else {
                System.out.printf("%d minutes after the start", minutes);
            }
        } else if (examTime - arrivalTime <= 30) {
            System.out.println("On time");
            if (examTime != arrivalTime) {
                System.out.printf("%d minutes before the start", minutes);
            }
        } else {
            System.out.println("Early");
            if (diff <= 59) {
                System.out.printf("%d minutes before the start", minutes);
            } else {
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }
    }
}
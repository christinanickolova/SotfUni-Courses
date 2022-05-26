import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class ThousandDaysAfterBirth_13 {
    public static void main(String[] args) {
        SimpleDateFormat dateInput = new SimpleDateFormat("dd-MM-yyyy");
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(dateInput.parse(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        calendar.add(Calendar.DAY_OF_MONTH, 1000);
        String date = dateInput.format(calendar.getTime());
        System.out.println(date);
    }
}
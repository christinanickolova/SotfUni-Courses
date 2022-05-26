import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int booksCount = 0;
        while (!currentBook.equals("No More Books")) {
            if (currentBook.equals(wantedBook)) {
                System.out.printf("You checked %d books and found it.", booksCount);
                break;
            }
            booksCount++;
            currentBook = scanner.nextLine();
        }
        if (!currentBook.equals(wantedBook)) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", booksCount);
        }
    }
}
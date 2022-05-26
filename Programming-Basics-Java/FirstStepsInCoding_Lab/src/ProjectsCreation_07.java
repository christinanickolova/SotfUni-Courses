import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int time = 3;
        int totalTime = projects * time;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalTime, projects);
    }
}

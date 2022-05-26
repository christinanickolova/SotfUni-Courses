import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int mussala = 0;
        int montBlanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double totalPeople = 0;
        for (int i = 1; i <= groups; i++) {
            int groupsMembers = Integer.parseInt(scanner.nextLine());
            if (groupsMembers <= 5) {
                mussala += groupsMembers;
            } else if (groupsMembers <= 12) {
                montBlanc += groupsMembers;
            } else if (groupsMembers <= 25) {
                kilimanjaro += groupsMembers;
            } else if (groupsMembers <= 40) {
                k2 += groupsMembers;
            } else {
                everest += groupsMembers;
            }
            totalPeople += groupsMembers;
        }
        p1 = mussala / totalPeople * 100;
        p2 = montBlanc / totalPeople * 100;
        p3 = kilimanjaro / totalPeople * 100;
        p4 = k2 / totalPeople * 100;
        p5 = everest / totalPeople * 100;
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
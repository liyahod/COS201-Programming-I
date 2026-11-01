import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter score 1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score 2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score 3: ");
        double score3 = input.nextDouble();

        double total = score1 + score2 + score3;
        double average = total / 3.0;

        System.out.println("Student: " + studentName);
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);

        input.close();
    }
}

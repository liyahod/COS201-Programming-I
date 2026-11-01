import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        System.out.printf("Sum: %.2f%n", first + second);
        System.out.printf("Difference: %.2f%n", first - second);
        System.out.printf("Product: %.2f%n", first * second);

        if (second != 0) {
            System.out.printf("Quotient: %.2f%n", first / second);
        } else {
            System.out.println("Quotient: Cannot divide by zero.");
        }

        input.close();
    }
}

package dkte.com;
import java.util.Scanner;

public class Double {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number (double):");
        if (!sc.hasNextDouble() || sc.hasNextInt()) {
            System.out.println("Invalid input! Only double values are allowed.");
            sc.close();
            return;
        }
        double n1 = sc.nextDouble();

        System.out.println("Enter the second number (double):");
        if (!sc.hasNextDouble() || sc.hasNextInt()) {
            System.out.println("Invalid input! Only double values are allowed.");
            sc.close();
            return;
        }
        double n2 = sc.nextDouble();

        double average = (n1 + n2) / 2;
        System.out.println("Average: " + average);

        sc.close();
    }
}

import java.util.Scanner;

public class DebugTwo4 {
    public static void main(String[] args) {
        double cost;
        final double TAX = 0.06;
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the cost of purchase
        System.out.print("Enter cost of purchase >> ");
        cost = input.nextDouble();  // Correct method to read a double

        // Display results
        System.out.println("Cost is $" + cost);
        System.out.println("With " + (TAX * 100) + "% tax,");
        System.out.println("   the total is $" + (cost + cost * TAX));

        // Close the scanner
        input.close();
    }
}

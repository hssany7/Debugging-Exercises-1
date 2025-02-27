import java.util.Scanner;

public class DebugTwo3 {
    public static void main(String args[]) {
        int a, b;
        int result, remainder;
        Scanner input = new Scanner(System.in);

        // Read the first integer
        System.out.print("Enter an integer >> ");
        a = input.nextInt();

        // Read the second integer
        System.out.print("Enter another integer >> ");
        b = input.nextInt();

        // Calculate result and remainder
        result = a / b;            // Correct calculation for the quotient
        remainder = a % b;         // Correct calculation for the remainder

        // Display results
        System.out.println("Divide " + a + " by " + b);
        System.out.println("Result is " + result);
        System.out.println("Remainder is " + remainder);

        // Close the scanner
        input.close();
    }
}

import java.util.Scanner;

public class DebugTwo2 {
    public static void main(String args[]) {
        int a, b;
        Scanner input = new Scanner(System.in);

        // Read first integer
        System.out.print("Enter an integer >> ");
        a = input.nextInt();

        // Read second integer
        System.out.print("Enter another integer >> ");
        b = input.nextInt();

        // Display results
        System.out.println("The sum is " + (a + b));
        System.out.println("The difference is " + (a - b));
        System.out.println("The product is " + (a * b));

        // Close the scanner
        input.close();
    }
}

import java.util.Scanner;

public class DebugTwo1 {
    public static void main(String[] args) {
        int oneInt;
        double oneDouble;
        String oneString;
        
        Scanner input = new Scanner(System.in);

        // Read integer value
        System.out.print("Enter an integer >> ");
        oneInt = input.nextInt();

        // Read double value
        System.out.print("Enter a double >> ");
        oneDouble = input.nextDouble();

        // Clear the input buffer
        input.nextLine();

        // Read string value
        System.out.print("Enter a string >> ");
        oneString = input.nextLine();

        // Display values
        System.out.print("The int is ");
        System.out.println(oneInt);

        System.out.print("The double is ");
        System.out.println(oneDouble);

        System.out.print("The String is ");
        System.out.println(oneString);

        input.close();
    }
}

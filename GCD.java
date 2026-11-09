import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        // Scanner to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Take two numbers from the user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Keep the originals for printing, work on copies
        int x = Math.abs(a);
        int y = Math.abs(b);

        // Euclidean algorithm: GCD(x, y) = GCD(y, x % y)
        // Repeat until the remainder becomes 0
        while (y != 0) {
            int rem = x % y; // remainder of x divided by y
            x = y;           // old divisor becomes the new dividend
            y = rem;         // remainder becomes the new divisor
        }

        // When y reaches 0, x holds the GCD
        System.out.println("GCD of " + a + " and " + b + " = " + x);

        // LCM = (a * b) / GCD, using long to avoid overflow
        if (x != 0) {
            long lcm = Math.abs((long) a * b) / x;
            System.out.println("LCM of " + a + " and " + b + " = " + lcm);
        }

        // Close the scanner
        sc.close();
    }
}

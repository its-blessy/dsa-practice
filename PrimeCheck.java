import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        // Scanner to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Take the number from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Numbers less than 2 (0, 1, negatives) are not prime
        boolean isPrime = n >= 2;

        // Only check divisors up to sqrt(n):
        // if n has a factor larger than sqrt(n), the matching factor is smaller than sqrt(n)
        for (int i = 2; (long) i * i <= n && isPrime; i++) {
            // If i divides n evenly, n has a factor other than 1 and itself
            if (n % i == 0) {
                isPrime = false; // found a divisor, so not prime
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        // Close the scanner
        sc.close();
    }
}

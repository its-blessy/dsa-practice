import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            int fact = 1;
            for (int i = 2; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            n /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a strong number");
        } else {
            System.out.println(original + " is not a strong number");
        }

        sc.close();
    }
}

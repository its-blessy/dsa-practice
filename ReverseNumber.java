import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int temp = Math.abs(n); 
        long reversed = 0;
        while (temp > 0) {
            int digit = temp % 10;          
            reversed = reversed * 10 + digit; 
            temp /= 10;
        }

        if (original < 0) {
            reversed = -reversed;
        }

        System.out.println("Reverse of " + original + " = " + reversed);

        sc.close();
    }
}

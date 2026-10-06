/*
 Problem: Check whether a number is a palindrome (for example, 121)
 Approach: Reverse the number and compare it with the original
*/
public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int original = n;   // n will change inside the loop, so keep a copy
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;      // get the last digit
            rev = rev * 10 + digit;  // append that digit to the reversed number
            n = n / 10;              // remove the last digit
        }

        if (original == rev) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Scanner to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Take the input string from the user
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Remove everything except letters and digits, then convert to lowercase
        // so "A man, a plan" is compared as "amanaplan"
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Assume it's a palindrome until a mismatch proves otherwise
        boolean isPalindrome = true;

        // Two pointers: one at the start, one at the end
        int left = 0, right = clean.length() - 1;

        // Move both pointers toward the middle
        while (left < right) {
            // If the characters at both ends differ, it's not a palindrome
            if (clean.charAt(left) != clean.charAt(right)) {
                isPalindrome = false;
                break; // No need to check further
            }
            left++;   // move left pointer forward
            right--;  // move right pointer backward
        }

        // Print the result
        if (isPalindrome) {
            System.out.println("\"" + s + "\" is a palindrome");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome");
        }

        // Close the scanner to free the resource
        sc.close();
    }
}

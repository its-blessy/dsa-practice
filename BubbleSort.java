import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // Scanner to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Ask how many elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Read the elements into the array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Each pass pushes the largest remaining element to the end
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // tracks if any swap happened in this pass

            // The last i elements are already in place, so stop at n - i - 1
            for (int j = 0; j < n - i - 1; j++) {
                // If the pair is in the wrong order, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // No swaps means the array is already sorted, so stop early
            if (!swapped) {
                break;
            }
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Close the scanner
        sc.close();
    }
}

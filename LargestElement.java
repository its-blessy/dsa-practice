/*
 Problem: Find the largest number in an array and its index
 Approach: Assume the first element is the largest, then compare it with every other element
*/
public class LargestElement {
    public static void main(String[] args) {
        int[] a = {12, 45, 7, 89, 33};
        int max = a[0];   // assume the first element is the largest
        int index = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {   // found a bigger number, so update max and its index
                max = a[i];
                index = i;
            }
        }

        System.out.println("Largest = " + max);
        System.out.println("Index = " + index);
    }
}

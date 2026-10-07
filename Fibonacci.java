/*
 Problem: Print the first 10 numbers of the Fibonacci series
 Approach: Each number is the sum of the previous two, so keep track of the last two numbers
*/
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int first = 0;    // first number of the series
        int second = 1;   // second number of the series

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;   // next number is the sum of the previous two
            first = second;              // shift forward by one position
            second = next;
        }
    }
}

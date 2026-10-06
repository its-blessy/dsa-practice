/*
 Problem: Find the total and average of 5 marks
 Approach: Add all the marks in the array using a loop, then divide the total by the array length
*/
public class Hello {
    public static void main(String[] args) {
        int[] marks = {70, 85, 90, 65, 80};
        int sum = 0; // stores the running total

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i]; // add each mark to the total
        }

        // cast to double, otherwise integer division drops the decimal part
        double avg = (double) sum / marks.length;

        System.out.println("Total = " + sum);
        System.out.println("Average = " + avg);
    }
}

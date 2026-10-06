/*
 Problem: 5 marks oda total and average kandupidi
 Approach: array la irukkura ellaa marks um loop la serthu, length ah vechu divide pannanum
*/
public class Hello {
    public static void main(String[] args) {
        int[] marks = {70, 85, 90, 65, 80};
        int sum = 0; // total ah store panna

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i]; // ovvoru mark ayum sum la serkkum
        }

        // (double) podalana integer division aagi decimal pogum
        double avg = (double) sum / marks.length;

        System.out.println("Total = " + sum);
        System.out.println("Average = " + avg);
    }
}

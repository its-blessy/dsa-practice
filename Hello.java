public class Hello {
    public static void main(String[] args) {
        int[] marks = {70, 85, 90, 65, 80};
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        double avg = (double) sum / marks.length;
        System.out.println("Total = " + sum);
        System.out.println("Average = " + avg);
    }
}

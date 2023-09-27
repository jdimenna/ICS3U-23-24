package lesson4;

public class ExampleOne {
    public static void main(String[] args) {
        int mark1 = 80, mark2 = 83, mark3 = 96;
        int numTests = 3;

        double avg = (mark1 + mark2 + mark3) / (double)numTests;

        System.out.println(avg);
    }
}

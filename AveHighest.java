import java.util.*;

public class AveReverse {
    public static void reverseArray(int[] values) {
        for (int i = 0; i < values.length / 2; i++) {
            int temp = values[i];
            values[i] = values[values.length - 1 - i];
            values[values.length - 1 - i] = temp;
        }
    }

    public static void calculateAverage(int[] values) {
        int total = 0;

        for (int value : values) {
            total += value;
        }

        double average = (double) total / values.length;
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        int[] values = {24, -8, 53, 16, 72, 5};

        reverseArray(values);

        System.out.print("Reversed Array: ");
        for (int value : values) {
            System.out.print(value + " ");
        }

        System.out.println();
        calculateAverage(values);
    }
}

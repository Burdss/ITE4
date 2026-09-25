import java.util.Scanner;

public class AverageHighest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int count = input.nextInt();

        int[] values = new int[count];

        System.out.println("Enter the values:");
        for (int i = 0; i < count; i++) {
            values[i] = input.nextInt();
        }

        int highestValue = getHighest(values);
        double averageValue = getAverage(values);

        System.out.println("Highest Value: " + highestValue);
        System.out.println("Average Value: " + averageValue);
    }

    public static int getHighest(int[] values) {
        int highest = values[0];

        for (int value : values) {
            if (value > highest) {
                highest = value;
            }
        }

        return highest;
    }

    public static double getAverage(int[] values) {
        int total = 0;

        for (int value : values) {
            total += value;
        }

        return (double) total / values.length;
    }
}

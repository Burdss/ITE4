import java.util.Arrays;
import java.util.Scanner;

public class GradeAverageSearch {

    public static double getAverage(int[] scores) {
        int total = 0;

        for (int score : scores) {
            total += score;
        }

        return (double) total / scores.length;
    }

    public static void arrangeGrades(int[] scores) {
        Arrays.sort(scores);
    }

    public static int findGrade(int[] scores, int value) {
        return Arrays.binarySearch(scores, value);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many grades will you enter? ");
        int count = input.nextInt();

        int[] scores = new int[count];

        System.out.println("Enter the grades:");
        for (int i = 0; i < count; i++) {
            scores[i] = input.nextInt();
        }

        double average = getAverage(scores);
        System.out.println("Average Grade: " + average);

        arrangeGrades(scores);
        System.out.println("Grades in order: " + Arrays.toString(scores));

        System.out.print("Enter a grade to find: ");
        int searchValue = input.nextInt();

        int position = findGrade(scores, searchValue);

        if (position >= 0) {
            System.out.println("Grade " + searchValue + " was found at index " + position);
        } else {
            System.out.println("Grade " + searchValue + " was not found.");
        }

        input.close();
    }
}

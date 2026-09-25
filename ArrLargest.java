public class ArrLargest {
    public static void main(String[] args) {
        int[] values = {45, 12, 78, 23, 91, 34, 67, 56, 88, 19};
        int max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        System.out.println("The largest number is: " + max);
    }
}

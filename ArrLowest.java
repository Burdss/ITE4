public class ArrLowest {
    public static void main(String[] args) {
        int[] numbers = {41, 25, 73, 16, 89, 11, 68, 52, 94, 30};
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        System.out.println("The lowest value is: " + lowest);
    }
}

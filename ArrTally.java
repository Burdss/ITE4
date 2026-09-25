public class ArrTally {
    public static void main(String[] args) {
        int number = 58342558;
        int result = findMostCommonDigit(number);

        System.out.println("The most common digit in " + number + " is " + result);
    }

    public static int findMostCommonDigit(int number) {
        int[] tally = new int[10];

        while (number > 0) {
            int digit = number % 10;
            tally[digit]++;
            number = number / 10;
        }

        int highest = 0;

        for (int i = 1; i < tally.length; i++) {
            if (tally[i] > tally[highest]) {
                highest = i;
            } else if (tally[i] == tally[highest] && i < highest) {
                highest = i;
            }
        }

        return highest;
    }
}

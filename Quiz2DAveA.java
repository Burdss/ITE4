import java.util.Scanner;

public class Quiz2DAveA{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[][] scores = {
			{55, 86, 60},
			{60, 75, 75},
			{65, 83, 83},
			{70, 95, 95},
			{75, 94, 94},
			{80, 100, 100},
			{85, 88, 88},
			{90, 50, 65},
		};

		int numStudents = scores.length;
		double[] averages = new double[numStudents];

		for (int i = 0; i < numStudents; i++){
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++){
				sum += scores[i][j];
			}
			averages[i] = (double) sum / scores[i].length;
		}

		System.out.println("No.\tTest 1\tTest 2\tTest 3\t Average");
		for (int i = 0; i < numStudents; i++){
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < scores[i].length; j++){
				System.out.print(scores[i][j] + "\t");
			}
			System.out.printf("%.2f\n", averages[i]);
		}

		scanner.close();
	}
}

package InterviewQuestions;

import java.util.Scanner;

public class PrimeNumbers_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, i;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The prime number from 1 to" + n + "are");
		for (int j = 1; j <= n; j++) {
			count = 0;
			for (i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(j + " ");
			}

		}
	}

}

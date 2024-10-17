package InterviewQuestions;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the Number " + n);

		if (n % 2 == 0) {
			System.out.println("It is even");

		} else {
			System.out.println("It is Odd");
		}
		// Print all even numbers from 1 to 100

		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 0) {

				System.out.print(j + " ");
			}
		}
//Print all odd numbers from 1 to 100
		System.out.println();

		for (int k = 1; k <= 100; k++) {
			if (k % 2 != 0) {

				System.out.print(k + " ");
			}
		}

	}

}

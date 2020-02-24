package learningDevelopment;

import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int maxNumber = sc.nextInt();

		long sum = new PrimeNumberCheck().findSumofPrimes(maxNumber);

		System.out.println("Sum is " + sum);
		sc.close();

	}

}

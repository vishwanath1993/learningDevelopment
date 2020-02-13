package learningDevelopment;

public class PrimeNumberCheck {

	private static int maxNumber, startNumber, divisionNumber = 0;
	private static long sum = 0;

	public static long findSumofPrimes() {
		maxNumber = 100;
		sum = 0;
		for (startNumber = 2; startNumber < maxNumber; startNumber++) {
			boolean checkPrime = true;
			for (divisionNumber = 2; divisionNumber < startNumber; divisionNumber++) {
				if (startNumber % divisionNumber == 0) {
					checkPrime = false;
				}
			}

			if (checkPrime) {
				sum = sum + startNumber;
			}
		}

		return sum;
	}

}

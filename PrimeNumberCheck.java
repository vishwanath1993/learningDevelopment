package learningDevelopment;

public class PrimeNumberCheck {

	private long sum = 0;

	public long findSumofPrimes() {
		int startNumber, maxNumber = 100;
		sum = 0;
		for (startNumber = 2; startNumber < maxNumber; startNumber++) {
			boolean checkPrime = true;
			for (int divisionNumber = 2; divisionNumber < startNumber; divisionNumber++) {
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

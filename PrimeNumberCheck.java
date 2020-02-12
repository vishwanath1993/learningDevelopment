
public class PrimeNumberCheck {


	public static long findSumofPrimes() {
		int maxNumber = 100;
		long sum = 0;
		for (int startNumber = 2; startNumber < maxNumber; startNumber++) {
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

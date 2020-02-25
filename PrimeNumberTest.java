package learningDevelopment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberTest {
	private int inputNumber;
	private int expectedSum;
	private PrimeNumberCheck primeNumberCheck;

	@Before
	public void initialize() {
		primeNumberCheck = new PrimeNumberCheck();
	}

	public PrimeNumberTest(int inputNumber, int expectedSum) {
		this.inputNumber = inputNumber;
		this.expectedSum = expectedSum;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { {2,2},{3,5},{4,5},{5,10}, {6,12}});
	}

	@Test
	public void testFindSumOfprimes() {
		System.out.println("Input Number is : " + inputNumber);
		System.out.println("Sum is : " + primeNumberCheck.findSumofPrimes(inputNumber));
		assertEquals(expectedSum, primeNumberCheck.findSumofPrimes(inputNumber));
	}

}

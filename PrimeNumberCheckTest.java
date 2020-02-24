package learningDevelopment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PrimeNumberCheckTest {

	private PrimeNumberCheck check;

	@Before
	public void initialize() {
		check = new PrimeNumberCheck();
	}

	@Test
	public void testPrimeNumberChecker() {

		assertEquals(1060, check.findSumofPrimes());
	}
}

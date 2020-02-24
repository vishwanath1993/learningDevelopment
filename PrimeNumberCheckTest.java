package learningDevelopment;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

		assertNotNull(check);
		assertEquals(1060, check.findSumofPrimes(100));
		assertNotEquals(100, check.findSumofPrimes(10));

	}
}

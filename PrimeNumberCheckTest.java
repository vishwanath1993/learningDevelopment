package learningDevelopment;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class PrimeNumberCheckTest {

	private long sum = 0;

	@Test
	void test() {

		sum = new PrimeNumberCheck().findSumofPrimes();
		assertNotNull(sum);
		assertEquals(1060, sum);
		assertNotEquals(25, sum);
	}

}

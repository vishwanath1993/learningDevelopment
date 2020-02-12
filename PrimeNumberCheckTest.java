package learningDevelopment;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class PrimeNumberCheckTest {
	
	@Test
	void test() {
		
		long sum = PrimeNumberCheck.findSumofPrimes();
		assertNotNull(sum);
		assertEquals(1060, sum);
		assertNotEquals(25, sum);
	}

}

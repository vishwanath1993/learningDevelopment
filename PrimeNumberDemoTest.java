import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberDemoTest {

	@Test
	void test() {
		
		long sum = PrimeNumberCheck.findSumofPrimes();
		assertEquals(1060, sum);
		assertNotEquals(25, sum);
	}

}

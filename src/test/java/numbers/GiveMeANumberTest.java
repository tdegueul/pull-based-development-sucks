package numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GiveMeANumberTest {
	GiveMeANumber giver = new GiveMeANumber();

	@Test
	void should_be_less_than_5() {
		assertTrue(giver.get() < 5);
	}
}

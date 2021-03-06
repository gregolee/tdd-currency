package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	@DisplayName("$5 X 2 = $10")
	public void testMultiplication() {
		//Given
		Dollar five = new Dollar(5);

		//When

		//Then
		Assertions.assertEquals(new Dollar(10), five.times(2));
	}

	@Test
	@DisplayName("Dollar 부작용(side effect)?")
	public void testMultiplicationTwice() {
		//Given
		Dollar five = new Dollar(5);

		//When

		//Then
		Assertions.assertEquals(new Dollar(10), five.times(2));
		Assertions.assertEquals(new Dollar(15), five.times(3));
	}

	@Test
	@DisplayName("equals() : $5 == $5, $5 != $6, 5CHF == 5CHF, 5CHF != 6CHF, 5CHF != $5")
	public void testEquality() {
		//Given

		//When

		//Then
		Assertions.assertEquals(true, new Dollar(5).equals(new Dollar(5)));
		Assertions.assertEquals(false, new Dollar(5).equals(new Dollar(6)));
		Assertions.assertEquals(true, new Franc(5).equals(new Franc(5)));
		Assertions.assertEquals(false, new Franc(5).equals(new Franc(6)));
		Assertions.assertEquals(false, new Franc(5).equals(new Dollar(5)));
	}

	@Test
	@DisplayName("5CHF X 2 = 10CHF")
	public void testFrancMultiplication() {
		//Given
		Franc five = new Franc(5);

		//When

		//Then
		Assertions.assertEquals(new Franc(10), five.times(2));
		Assertions.assertEquals(new Franc(15), five.times(3));
	}
}

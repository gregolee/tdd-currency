package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	@DisplayName("$5 X 2 = $10")
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar ten = five.times(2);
		Assertions.assertEquals(10, ten.amount);
	}

	@Test
	@DisplayName("Dollar 부작용(side effect)?")
	public void testMultiplicationTwice() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		Assertions.assertEquals(10, product.amount);
		product = five.times(3);
		Assertions.assertEquals(15, product.amount);
	}

	@Test
	@DisplayName("equals() : $5 == $5, $5 != $6")
	public void testEquality() {
		//Given
		Dollar five = new Dollar(5);
		Dollar fiveAnother = new Dollar(5);
		Dollar six = new Dollar(6);

		//When
		boolean expectTrue = five.equals(fiveAnother);
		boolean expectFalse = five.equals(six);

		//Then
		Assertions.assertEquals(true, expectTrue);
		Assertions.assertEquals(false, expectFalse);
	}
}

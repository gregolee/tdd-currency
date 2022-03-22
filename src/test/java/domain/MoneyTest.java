package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar ten = five.times(2);
		Assertions.assertEquals(10, ten.amount);
	}

	@Test
	public void testMultiplicationTwice() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		Assertions.assertEquals(10, product.amount);
		product = five.times(3);
		Assertions.assertEquals(15, product.amount);
	}
}
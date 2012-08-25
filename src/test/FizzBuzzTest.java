package test;

import static org.junit.Assert.*;
import org.junit.*;

public class FizzBuzzTest {

	@Test
	public void test1Return0Fizz() {
		assertEquals(0, FizzBuzz.askForFizz(1));
	}
	
	@Test
	public void test1Return0Buzz() {
		assertEquals(0, FizzBuzz.askForBuzz(1));
	}

}

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
	
	@Test
	public void test3Return1Fizz() {
		assertEquals(1, FizzBuzz.askForFizz(3));
	}
	
	@Test
	public void test5Return1Buzz() {
		assertEquals(1, FizzBuzz.askForBuzz(5));
	}

}

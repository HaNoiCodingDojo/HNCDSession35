package test;

import static org.junit.Assert.*;
import org.junit.*;

public class FizzBuzzTest {

	@Test
	public void test1Return0Fizz() {
		
	
		assertEquals(0, FizzBuzz.askForFizz(1));
	}
}

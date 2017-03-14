package hello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreeterTest {
	@Test
	public void test() {		
		String actual = (new Greeter()).sayHello();
		String expected = "Hello world!";
		
		assertEquals(expected, actual);
	}
}

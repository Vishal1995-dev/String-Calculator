package Calculator;
import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
	@Test
	public void emptyString()
	{
		assertEquals(0,Calculator.Add(""));
	}
	
	@Test
	public void oneIntegerString()
	{
		assertEquals(1,Calculator.Add("1"));
	}
	
	@Test
	public void twoIntegerString()
	{
		assertEquals(2,Calculator.Add("1,1"));
	}
	
	@Test
	public void unknoumIntegerString()
	{
		assertEquals(4,Calculator.Add("1,1,1,1"));
	}
	
	@Test
	public void newlineDelimiterString()
	{
		assertEquals(6,Calculator.Add("1,2\n3"));
	}
	
	@Test
	public void customDelimiterString()
	{
		assertEquals(3,Calculator.Add("//*\n1*2"));
	}
	
	@Test
	public void negativeNumberString()
	{
		try
		{
			Calculator.Add("-1,-2,3");
			fail("Exception expected.");
		}
		catch(RuntimeException ex)
		{
			assertEquals("negatives not allowed: -1,-2",ex.getMessage());
		}
	}
	
	@Test
	public void valueIgnoreString()
	{
		assertEquals(2,Calculator.Add("1002,2"));
	}
	
	@Test
	public void anyLengthDelimiterString()
	{
		assertEquals(6,Calculator.Add("//[***]\n1***2***3"));
	}
}


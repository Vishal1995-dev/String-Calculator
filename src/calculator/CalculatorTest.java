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
	
	
}


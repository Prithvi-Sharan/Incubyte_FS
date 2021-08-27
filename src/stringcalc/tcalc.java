package stringcalc;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class tcalc {
	private Calculator calc;
	@BeforeTest
	public void init() {
		calc=new Calculator();
	}
	
	public void empty() {
		assertEquals(calc.Add(""),0);
	}
	
	public void singleval() {
		assertEquals(calc.Add("1"),1);
	}
	
	public void twonum() {
		assertEquals(calc.Add("1,2"),3);
	}
	
	public void unnum() {
		assertEquals(calc.Add("1,2,3,4"),10);
	}
	
	public void allowline() {
		assertEquals(calc.Add("1\n2,3"),6);
	}
	
	public void variablesep() {
		assertEquals(calc.Add("//;\n1;2"),3);
	}
	
	@Test(expectedExceptions=Exception.class)
	public void negativeexception() {
		calc.Add("-1");
	}
}

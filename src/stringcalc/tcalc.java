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
	
	public void empty() throws Exception {
		assertEquals(calc.Add(""),0);
	}
	
	public void singleval() throws Exception {
		assertEquals(calc.Add("1"),1);
	}
	
	public void twonum() throws Exception {
		assertEquals(calc.Add("1,2"),3);
	}
	
	public void unnum() throws Exception {
		assertEquals(calc.Add("1,2,3,4"),10);
	}
	
	public void allowline() throws Exception {
		assertEquals(calc.Add("1\n2,3"),6);
	}
	
	public void variablesep() throws Exception {
		assertEquals(calc.Add("//;\n1;2"),3);
	}
	
	@Test(expectedExceptions=Exception.class)
	public void negativeexception() throws Exception {
		calc.Add("-1");
	}
	
	public void ng1000() throws Exception {
		assertEquals(calc.Add("2,1001"),2);
	}
	
	public void varlen() throws Exception {
		assertEquals(calc.Add("//[---]\n1---2---3"),6);
	}
}

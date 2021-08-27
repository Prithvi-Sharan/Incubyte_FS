package stringcalc;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class tcalc {
	public void empty() {
		Calculator calc=new Calculator();
		assertEquals(calc.Add(""),0);
	}
}

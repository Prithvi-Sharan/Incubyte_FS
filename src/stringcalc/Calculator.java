package stringcalc;

public class Calculator {

	public int Add(String input) {
		String[] num=input.split(",");
		
		if(input.isEmpty()) {
			return 0;
		}
		else {
			return Integer.parseInt(num[0])+Integer.parseInt(num[1]);
		}
	}
}

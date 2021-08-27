package stringcalc;

public class Calculator {

	public int Add(String input) {
		String[] num=input.split(",");
		
		if(input.isEmpty()) {
			return 0;
		}
		else if(input.length() == 1) {
			return Integer.parseInt(input);
		}
		else {
			return Integer.parseInt(num[0])+Integer.parseInt(num[1]);
		}
	}
}

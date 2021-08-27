package stringcalc;

public class Calculator {

	public int Add(String input) {
		// TODO Auto-generated method stub
		if(input.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(input);
	}
}

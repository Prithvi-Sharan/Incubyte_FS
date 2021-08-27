package stringcalc;

public class Calculator {

	public int Add(String string) {
		// TODO Auto-generated method stub
		if(string.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(string);
	}

}

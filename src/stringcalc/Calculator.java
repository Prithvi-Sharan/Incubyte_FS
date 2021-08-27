package stringcalc;

public class Calculator {

	public int Add(String input) {
		String[] num=input.split(",");
		
		if(input.isEmpty()) {
			return 0;
		}
		else if(input.length() == 1) {
			return sti(input);
		}
		else {
			return sum(num[0],num[1]);
		}
	}
	
	private int sti(String a) {
		return Integer.parseInt(a);
	}
	
	private int sum(String a, String b) {
		return Integer.parseInt(a)+Integer.parseInt(b);
	}
}

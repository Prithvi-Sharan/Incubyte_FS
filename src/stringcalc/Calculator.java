package stringcalc;

public class Calculator {

	private String sep=",|\n";
	public int Add(String input) {
		String[] num=input.split(sep);
		
		
		if(input.isEmpty()) {
			return 0;
		}
		else if(input.length() == 1) {
			return sti(input);
		}
		else {
			return sum(num);
		}
	}
	
	private int sti(String a) {
		return Integer.parseInt(a);
	}
	
	private int sum(String[] num) {
		int sum=0;
		for (String n:num) {
			sum+=Integer.parseInt(n);
		}
		return sum;
	}
}

package stringcalc;

public class Calculator {

	private String sep=",|\n";
	public int Add(String input) throws Exception {
		if(input.contains("//")) {
			sep=getsep(input);
			input=input.split("\n")[1];
		}
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
	
	private int sum(String[] num) throws Exception {
		exception(num);
		
		int sum=0;
		for (String n:num) {
			if(sti(n)>1000) {
				continue;
			}
			sum+=sti(n);
		}
		return sum;
	}
	
	private String getsep(String input) {
		if(input.charAt(2)=='[') {
			String i=input;
			String a="";
			while(i.indexOf('[')!=-1) {
				a+=getsubs(i);
				i=i.substring(i.indexOf(']'));
			}
			return a;
		}
		return Character.toString(input.charAt(2));
	}
	
	private String getsubs(String input) {
		int start=input.indexOf('[')+1;
		int end=input.indexOf(']');
		return input.substring(start,end);
	}
	
	private void exception(String[] num) throws Exception {
		for (String n:num) {
			if(sti(n)<0) {
				throw new Exception("Negative input:"+n);
			}
		}
	}
}

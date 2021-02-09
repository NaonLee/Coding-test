package level1;

import java.util.ArrayList;

//Integer n is given. Convert n to ternary and flip. And then convert it to octal number again.
public class FilpTernary {

	public static void main(String[] args) {
		System.out.println("125 -> " + Ternary(125)); 
		System.out.println("45 -> " + Ternary(45)); 
		
		System.out.println("55 -> " + FilpTenary(55)); 
	}

	//didn't revers
	public static int Ternary(int n) {
		ArrayList<Integer> remainder = new ArrayList<Integer>();
		int result = 0;
		
		//convert to ternary
		while(n > 0) {
			remainder.add(n % 3);
			n /= 3;
		}
		
		//convert to octal
		for(int i=remainder.size()-1, t = 0; i > -1; i--, t++) {
			result += remainder.get(i) *  Math.pow(3, t);
		}
		
		return result;
	}
	
	//Do reverse, much simpler
	public static int FilpTenary(int n) {
		int result = 0;
		
		String tenary = Integer.toString(n, 3);		//convert to ternary
		StringBuffer sb = new StringBuffer(tenary);		//To flip
		String reverse = sb.reverse().toString();		//flip

		result = Integer.parseInt(reverse, 3);			//parse String to Integer (in ternary)
		
		return result;
	}
}

package level2;

import java.util.Arrays;

public class BiggestNum {

	public static void main(String[] args) {
		int[] e = {2,1,3,4,5};
		System.out.println(solution(e)); 
	}

	public static String solution(int[] numbers) {
		String[] temp = new String[numbers.length];
		String result = "";
		
		Arrays.sort(numbers);
		for(int i=numbers.length-1; i>-1; i--) {
			temp[numbers.length-1-i] = Integer.toString(numbers[i]);
		}
		
		for(String s: temp) {
			result += s;
		}
		
		return result;
	}
}

package level1;
/*
 return a middle character from a given string. If the string is even, than return 2 characters. 
 */
public class MiddleChar {

	public static void main(String[] args) {
		String st = "abcdeee";

		
		System.out.println(solution(st));
	}
	
	public static String solution(String s) {
		int len = s.length();
		String answer = "";
		
		if(len % 2 == 0) {
			answer = s.substring(len/2-1, len/2+1);
		} else {
			answer = s.substring(len/2, len/2+1);
		}
		
		return answer;
	}

}

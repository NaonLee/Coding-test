package level1;
/*
 * Check the given string if it contains character or numbers only
 * Return true if the string's length is 4 or 6 and doesn't contain an alphabet
 * Return false if the string's length is not  4 or 6 or contains an alphabet
 */
public class CheckChar {

	public static void main(String[] args) {
		String s1 = "a234";
		String s2 = "1234";
		String s3 = "22222";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
	}
	
	public static boolean solution(String s) {
		if(s.length() != 4 && s.length() != 6) return false;		//Check the length
		
		for(int i = 0; i < s.length(); i++) {
			System.out.println((int)s.charAt(i));
			if( ((int)s.charAt(i) >= 65) && ((int)s.charAt(i) <= 122) ) return false;		//Check if it contains alphabet
		}
		
		return true;
		
	}

}

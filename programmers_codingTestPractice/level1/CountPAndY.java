package level1;
/*
 * If a number of p and number of s are the same, return true 
 * If the numbers are different, return false
 * It is not a case sensitive
 * If there are no p and s, always return true
 */
class CountPAndY {

	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(solution(s));
		System.out.println(solution2(s));
	}
	
	public static boolean solution(String s) {
		boolean answer = true;
		int ycount = 0, pcount = 0;
		s = s.toLowerCase();					//not a case sensitive
		
		for(int i = 0; i < s.length(); i++) {	//count number of p and s
			if(s.charAt(i) == 'p') pcount++;
			else if(s.charAt(i) == 'y') ycount++; 
		}
		
		if(pcount != ycount) answer = false;	//check if the numbers are the same
		return answer;
	}
	
	public static boolean solution2(String s) {	//using one variable
		boolean answer = true;
		int count = 0;
		s = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++) {	
			if(s.charAt(i) == 'p') count++;
			else if(s.charAt(i) == 'y') count--; 
		}
		
		if(count != 0) answer = false;
		return answer;
	}
}

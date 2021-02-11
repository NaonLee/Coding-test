package level1;

import java.util.Arrays;

public class DescString {

/*
 * return sentence in descending order
 */
	
	public static void main(String[] args) {
		System.out.println(desc("ninaidlw"));
		System.out.println(desc2("ninaidlw"));
	}
	
	public static String desc(String s) {
		
		String[] sentence = s.split("");
		
		for(int i=0; i<sentence.length; i++) {
			for(int j=i+1; j<sentence.length; j++) {
				if(sentence[i].charAt(0) < sentence[j].charAt(0)) {			//Descending
					String temp = sentence[i];
					sentence[i] = sentence[j];
					sentence[j] = temp;
				}
			}
		}	
		String answer = "";
		
		for(String ss : sentence) {
			answer += ss;
		}
		
		return answer;
	}
	
	public static String desc2(String s) {
		char[] so = s.toCharArray();
		Arrays.sort(so);
		return new StringBuilder(new String(so)).reverse().toString();
	}
}

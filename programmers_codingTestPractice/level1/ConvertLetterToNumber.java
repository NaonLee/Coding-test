package codingtest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * convert letter to number
 */
public class ConvertLetterToNumber {
	public static void main(String[] args) {
		int i = solution("one4seveneight");
		int j = solution2("one4seveneight");
		System.out.println("i = "+ i + ", j = " + j);
	}
	
	static public int solution(String s) {
		
		List<String> list = Arrays.asList("zero","one","two","three", "four",  "five", "six", "seven", "eight", "nine");
			
		

		for(String i : list) {
			s = s.replaceAll(i, Integer.toString(list.indexOf(i)));
		}
		
		return Integer.parseInt(s);
	}
	
static public int solution2(String s) {
		

		Map<String, String> map = new HashMap<String,String>() {
			
			{
				put("0", "zero"); 
				put("1", "one");
				put("2", "two"); 
				put("3", "three");
				put("4", "four");
				put("5", "five"); 
				put("6", "six");
				put("7", "seven"); 
				put("8", "eight"); 
				put("9", "nine");
			}
		};

		for(String key: map.keySet()) {
			s = s.replaceAll(map.get(key), key);
		}
		
		return Integer.parseInt(s);
	}
}

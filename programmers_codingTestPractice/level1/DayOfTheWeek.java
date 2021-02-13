package level1;

import java.util.Date;

public class DayOfTheWeek {

	public static void main(String[] args) {
		System.out.println(solution(5,24));
	}

	public static String solution(int a, int b) {
		
		
		Date date = new Date(2016-1900, a-1, b);
		String answer = date.toString().split(" ")[0];
		answer = answer.toUpperCase();
		return answer;
	}
}

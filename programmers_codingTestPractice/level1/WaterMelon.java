package level1;

public class WaterMelon {

	public static void main(String[] args) {
		System.out.println("n=3: " + watermelon1(3));
		System.out.println("n=3: " + watermelon2(3));
		System.out.println("n=10: " + watermelon1(10));
		System.out.println("n=10: " + watermelon2(10));
	}
	
	public static String watermelon1(int n) {
		String answer = "";

		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) answer += "수";
			else answer += "박";
		}
		return answer;
	}
	
	public static String watermelon2(int n) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<1000; i++) sb.append("수박");
		return sb.substring(0, n);
	}
}

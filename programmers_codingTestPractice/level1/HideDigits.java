package level1;
/*
 * Hide phone numbers except the last 4 numbers
 */
public class HideDigits {

	public static void main(String[] args) {
		String phone_number = "01000000000";
		System.out.println(solution1(phone_number));
		System.out.println(solution2(phone_number));
	}

	public static String solution1(String phone_number) {
		char[] ch = phone_number.toCharArray();
		for(int i = 0; i < phone_number.length()-4; i++) {
			ch[i] = '*';
		}
		return String.valueOf(ch);
	}
	
	public static String solution2(String phone_number) {
		int length = phone_number.length();
		String answer = "*".repeat(length-4);
		answer += phone_number.substring(length-4, length);
		return answer;
	}
}

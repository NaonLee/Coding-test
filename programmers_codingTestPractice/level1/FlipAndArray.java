package level1;

/*
 * Flip given integer (Long type) and make it array
 */

public class FlipAndArray {
	public static void main(String arge[]) {
		MakeitArray(12345);
		MakeitArray2(12345);
	}
	
	public static int[] MakeitArray(long n) {
		StringBuffer sb = new StringBuffer(Long.toString(n));
		String reverse = sb.reverse().toString();
		String[] temp = reverse.split("");
		int[] answer = new int[temp.length];
		
		for(int i=0; i< temp.length; i++) {
			answer[i] = Integer.parseInt(temp[i]);
		}
		
		return answer;
	}
	
	public static int[] MakeitArray2(long n) {
		String temp = Long.toString(n);
		String[] tempArr = temp.split("");
		int[] answer = new int[tempArr.length];
		
		for(int i=0; i<tempArr.length; i++) {
			answer[i] = Integer.parseInt(tempArr[tempArr.length-i-1]);
		}
		
		return answer;
	}
}

package level1;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * Divide elements by divisor, and get divisible elements. Sort those elements ascending order.
 * if there is no element, return -1 
 */
public class DividedNums {

	public static void main(String[] args) {
		int[] arr = {3,2,6};
		int[] answer = solution(arr, 10);
		for(int i=0; i<answer.length; i++)
			System.out.println(answer[i]);
	}

	public static int[] solution(int[] arr, int divisor) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();

		for(int i=0; i<arr.length; i++) {	//get divisible elements
			if(arr[i] % divisor == 0) {
				arrList.add(arr[i]);
			}
		}
		if(arrList.isEmpty()==true) arrList.add(-1);	//if there is no element, return -1
		
		int[] answer = new int[arrList.size()];
		int size = 0;
		for(int temp: arrList) {
			answer[size++] = temp;
		}
		Arrays.sort(answer);							//sort in ascending
		return answer;
	}
}

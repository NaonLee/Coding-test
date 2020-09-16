package main;
import java.util.ArrayList;

import funtion.Solution;

public class MainClass {
	public static void main(String[] args) {
	
		ArrayList<Integer> result = new ArrayList<>();
		int[] arr = {2,1,3,4,1};
		Solution solution = new Solution();
		
		result = solution.solution(arr);
		System.out.print("배열 : [");
		
		for(int i = 0; i < arr.length; i++) {			//배열출력
			System.out.print(arr[i]);
			if (i<arr.length-1) System.out.print(", ");
		}
		System.out.println("]");
		
		System.out.print("결과값 : "+ result);				//결과값 출력
	}
}

package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

//Integer array arr is given. Remove continuously duplicate number until one left.

public class NoConDuplicateNum {

	public static void main(String[] args) {
		int[] arr = {1,2,4,4,3,3,1,2};
		
		int[] answer = removeDup1(arr);
		int[] answer2 = removeDup2(arr);
		
		for(int i=0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();
		for(int i=0; i < answer2.length; i++) {
			System.out.print(answer2[i] + " ");
		}
		
	}

	public static int[] removeDup1(int[] arr) {		
		//Check duplication
		ArrayList<Integer> list =  new ArrayList<Integer>();
		list.add(arr[0]);
		
		//Compare if list's last index is the same as the element of arr
		for(int i = 1; i<arr.length; i++) {
			if( list.get(list.size()-1) != arr[i] )
				list.add(arr[i]);
		}
		
		//create answer array, length will be same as list's size
		int[] answer = new int[list.size()];
		
		for(int i=0; i < list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}
		
		return answer;
		
	}
	
	//simpler
	public static int[] removeDup2(int[] arr) {
		ArrayList<Integer> list =  new ArrayList<Integer>();
		int preNum = 10;
		for(int num : arr) {
			if(preNum != num)
				list.add(num);
			preNum = num;
		}
		
		int[] answer = new int[list.size()];
		
		for(int i=0; i < list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}
		
		return answer;
	}
}

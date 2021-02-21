package level1;

import java.util.ArrayList;
import java.util.Collections;


/*
Integer array arr is given.
Get every number that can be created by adding two numbers from array
And put the numbers into the new array in ascending order
*/
public class CalAllNum {

	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<>();
		int[] arr = {2,1,3,4,1};			//Integer array
		
		result = solution(arr);
		
		//print an original array
		System.out.print("Array : [");
		for(int i = 0; i < arr.length; i++) {			
			System.out.print(arr[i]);
			if (i<arr.length-1) System.out.print(", ");
		}
		System.out.println("]");
		
		//print result
		System.out.print("Result(asc) : "+ result);				
	}

	
	public static ArrayList<Integer> solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){     
                int temp = numbers[i] + numbers[j];
                if(!list.contains(temp))
                    list.add(temp);
            }
        }
        
        Collections.sort(list);			//sort
        
        return list;
    }

}

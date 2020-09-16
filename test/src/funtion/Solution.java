package funtion;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
	/*
	두개 뽑아서 더하기.
	numbers = [2,1,3,4,1] -> answer = [2,3,4,5,6,7]
	*/
	
	    public ArrayList<Integer> solution(int[] numbers) {
	        
	        int[] answer = {};
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        for(int i = 0; i < numbers.length-1; i++){
	            for(int j = i+1; j < numbers.length; j++){     
	                int temp = numbers[i] + numbers[j];
	                if(!list.contains(temp))
	                    list.add(temp);
	            }
	        }
	        
	        Collections.sort(list);

	        return list;
	    }
}

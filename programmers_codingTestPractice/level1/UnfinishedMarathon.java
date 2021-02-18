package level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


/*
 * Two arrays participant and completion are given. The array participant contains all runners' names, 
 * and the array completion contains runners who finished the race.
 * Only one runner wasn't able to finish the race. Compare the arrays and return the runner who couldn't finish.
 */
public class UnfinishedMarathon {

	public static void main(String[] args) {
		String[] par = {"leo", "mislav", "stanko", "mislav"};
		String[] com = {"leo", "stanko", "mislav"};
		System.out.println("The runner who couldn't finished the race is " + solution(par, com));	
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> hash = new HashMap<String, Integer>();

		//put participants into the hash map
		for(String p : participant) {
			if(hash.get(p) != null) {			//if the key already exists in the hash map (duplicated name)
				hash.put(p, hash.get(p) + 1);	//increase count(value)
			} else {
				hash.put(p, 1);					//if the key doesn't exist, put the name as key and set value as 1 (count)
			}
		}
		
		//change count(value) -> if the name is in the completion list, the value will be value-1
		for(String c : completion) {
			if(hash.get(c) != 0) {
				hash.put(c, hash.get(c) -1);
			}
		}
		
		//Unfinished Marathon runners' name(s) have 0 count (value)
		List<String> unfinished = new ArrayList<>();			//save unfinished runner
		Iterator<String> keys = hash.keySet().iterator();		//get all keys
		
		while(keys.hasNext()) {
			String key = keys.next();
			if(hash.get(key) != 0)			//if value(count) is 0
				for(int i = 0; i < hash.get(key); i++)
					unfinished.add(key);
		}
		answer = unfinished.get(0);
		return answer;
	}
}

package level1;

/*
Two random numbers are given. Calculate the Sum of all the numbers between given numbers.
*/

public class SumBtwTwoNumbers {

	public static void main(String[] args) {
		
		int a = (int) (Math.random() * 1000000) + 1;
		int b = (int) (Math.random() * 1000000) + 1;
		System.out.println("Sum of numbers between " + a + " and " + b + " : " + solution(a, b));
		System.out.println("Sum of numbers between " + a + " and " + b + " : " + solution2(a, b));
	}

	 public static long solution(int a, int b) {
	        int min, max;
	        long answer = 0;
	        if(a > b){
	            min = b;
	            max = a;
	        } else{
	            min = a;
	            max = b;
	        }
	        for(int i = min; i<= max; i++){
	            answer += i;
	        }
	        return answer;
	    }
	 
	 
	 //Using Geometric sequence
	 public static long solution2(int a, int b) {
		 return  sumAtoB(Math.min(a, b), Math.max(a, b));
	 }
	 private static long sumAtoB(long a, long b) {
		 return (b - a + 1) * (a + b) / 2;
	 }
}

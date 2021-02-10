package code_dojang.level1;

public class FibonacciNumber {

	public static void main(String[] args) {
		fibo(10);
		fibo(20);
		fibo(30);
	}

	public static void fibo(int n) {
		int fir = 0;
		int sec = 1;
		int temp;
		
		while(sec < n) {
			System.out.print(sec + " ");
			temp = fir + sec;
			fir =sec;
			sec = temp;
		}
		System.out.println();
	}
}

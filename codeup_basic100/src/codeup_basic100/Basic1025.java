package codeup_basic100;
import java.util.*;

public class Basic1025 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("5자리 정수 입력: ");
	    int number = sc.nextInt();
	    funtion(number, 10000);

	    sc.close(); 
	}
	static public void funtion(int num, int size)
	 {
		  int temp = (num/size)*size;
		   System.out.println("["+temp+"]");
		   size/=10;
		   if (size<1) return;

		   funtion(num-temp, size);

	 }

}

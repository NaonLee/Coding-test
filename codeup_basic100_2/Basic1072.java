package test01;

import java.util.Scanner;

public class Basic1072 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a length: ");
	    int fr = sc.nextInt();

	    if(fr > 0) {
	      int s[] = new int[fr];
	      
	      System.out.print("Input values(valuse will be separated by space): ");
	      for(int i = 0; i < s.length; i++){
	        s[i] = sc.nextInt();
	        System.out.println(s[i]);
	      	}
	    }
	    else System.out.println("Lenth is not enough.");

	}

}

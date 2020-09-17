package codeup_basic100;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Basic1026 {

	public static void main(String[] args) {
		
		String input;
	    Scanner sc = new Scanner(System.in);
	    String pattern = "^[0-9]*:[0-9]*:[0-9]*$";
	    
	    System.out.print("시간 입력(hh:mm:ss형태): ");
	    input = sc.nextLine();
	    sc.close();
	
	    if(Pattern.matches(pattern, input)){
	
	      String[] temp = input.split(":");
	      
	        int h = Integer.valueOf(temp[0]);
	        int m = Integer.valueOf(temp[1]);
	        int s = Integer.valueOf(temp[2]);
	        System.out.println("현재 분: "+m);
	    }
	    
	}

	

}

package codeup_basic100;

import java.util.Scanner;

public class Basic1024 {
	
	
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("아무 문자나 입력하세요: ");
	    String a = sc.next();
	    String[] arr = a.split("");
			    
			for(int i = 0; i < arr.length; i++)
			  System.out.println("'"+arr[i]+"'");

	  sc.close();    
	  }
	
}

package codeup_basic100;
import java.util.*;

public class Basic1092 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		int day = 1;
		
		System.out.print("Insert 3 numbers: ");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();

	    while(day % a != 0 || day % b != 0 || day % c != 0) day++;
	    
	    System.out.println("Result:"+ day);

	}

}

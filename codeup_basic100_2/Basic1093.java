package codeup_basic100;
import java.util.*;

public class Basic1093 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		    int[] arr = new int[23] ;
		    
		    System.out.print("How many times you want to call?: ");
		    int times = sc.nextInt();
		    int temp;
		    System.out.print("Input the numbers: ");
		    for(int i = 0; i<times; i++){
		      temp = sc.nextInt();
		      arr[temp-1] += 1;
		    }

		    for(int j = 0; j < arr.length; j++)
		      System.out.print(arr[j]+" ");

	}

}

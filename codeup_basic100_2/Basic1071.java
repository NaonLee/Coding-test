package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Basic1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This system will print out values that you give. However, if 0 is given, printing will stop");
		System.out.print("Input the values (Integer Only, separated by space): ");
	    String input = sc.nextLine();

	    ArrayList<Integer> arr = new ArrayList<Integer>();

	    String[] so = input.split(" ");

	    for(int i =0; i<so.length;i++)
	      arr.add(Integer.parseInt(so[i]));
	  
	    for(int j = 0; j<arr.size(); j++){
	      if(arr.get(j)!=0)
	        System.out.println(arr.get(j));
	      else
	      break;

	}

}
}

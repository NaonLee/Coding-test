package codeup_basic100;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Basic1027 {
	public static void main(String[] args) {
	String input;
    Scanner sc = new Scanner(System.in);
    String pattern = "^[0-9]*.[0-9]*.[0-9]*$";
    
    System.out.print("yyyy.mm.dd 형태로 날짜 입력: ");
    input = sc.nextLine();
    sc.close();

    if(Pattern.matches(pattern, input)){
      
      String[] temp = input.split("\\.");
      
        int y = Integer.valueOf(temp[0]);
        int m = Integer.valueOf(temp[1]);
        int d = Integer.valueOf(temp[2]);
        System.out.printf("%02d-%02d-%04d", d, m, y);
    	}
	}
}


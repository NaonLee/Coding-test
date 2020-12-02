package test01;

import java.util.*;

class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    
    System.out.print("주민번호를 xxxxxx-xxxxxxx 형태로 입력하세요: ");
    String str = sc.nextLine();
    
    if(str.charAt(7) == '1' || str.charAt(7) == '2')
        System.out.print("19");
    else
        System.out.print("20");
        
    System.out.print(str.substring(0, 2) + '/' + str.substring(2,4) + '/' + str.substring(4,6) + ' ');
    if(str.charAt(7) == '2' || str.charAt(7) == '4')
        System.out.println("F");
    else
        System.out.println("M");
    
  } 
  
}
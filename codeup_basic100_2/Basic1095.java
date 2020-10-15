import java.util.*;
//print smallest number

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input times: ");
    int times = sc.nextInt();
    int[] arr= new int[times];

    for(int i = 0; i < times; i++){
       System.out.print("Input array: ");
       arr[i] = sc.nextInt(); 
    }

    int temp = arr[0];

    for(int j = 1; j < arr.length; j++){
      if(temp > arr[j]) temp = arr[j];
    }
    System.out.println("--Smallest number--");
    System.out.println(temp);
  }
}

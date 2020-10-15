import java.util.*;
//Print array backwards
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input times: ");
    int times = sc.nextInt();
    int[] arr= new int[times];

    for(int i = 0; i < times; i++){
      System.out.print("Input number"+(i+1)+": ");
       arr[i] = sc.nextInt(); 
    }
    System.out.println("--------------------------Result--------------------------");
    for(int j = arr.length-1; j >= 0; j--)
      System.out.print(arr[j]+" ");
  }
}

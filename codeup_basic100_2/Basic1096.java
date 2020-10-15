import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    int[][] arr = new int[19][19];
    System.out.print("Input times: ");
    int times = sc.nextInt();

    
    for(int i = 0; i < times; i++){
      System.out.print("Input coordinate: ");
      int x = sc.nextInt();
      int y = sc.nextInt();
      arr[x-1][y-1] = 1;
    }
    System.out.print("-----------------Result-----------------");
    for(int i = 0; i < 19; i++){
      for(int j = 0; j < 19; j++)
        System.out.print(arr[i][j]+" ");
      System.out.print("\n");
    }    
    sc.close();
  }
}

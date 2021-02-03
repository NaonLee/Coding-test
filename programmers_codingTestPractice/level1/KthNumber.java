package level1;

import java.util.Arrays;

/*Cut array from i-th number to j-th number, and sort the array.
	The answer will be the k-th number.
*/
public class KthNumber {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		int a[] = solution(array, commands);
		
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int n=0; n<commands.length; n++) {
			int i = commands[n][0]-1;
			int j = commands[n][1];
			int k = commands[n][2]-1;
			
			int temp[] = Arrays.copyOfRange(array, i, j);			//cut array from i-th number to j-th number
			
			Arrays.sort(temp);										//sort the array
			
			answer[n] = temp[k];									//pick k-th number
		}
		
		return answer;
	}
}

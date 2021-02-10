package code_dojang.level1;

/*
10 users, 2 team (A, B)
Get MVP by calculating score. score will be (K*2+A)/(D+1)
P-Pentakill, Q-Quadruple kill, T-Triple kill, D-Double kill
*/
public class FindMVP {

	public static void main(String[] args) {
		mvp("2/5/6 N, 3/0/4 D, 12/4/2 P, 1/2/8 N, 2/2/8 N, 5/5/2 T, 1/5/2 N, 1/3/1 N, 2/4/5 N, 4/3/5 Q".split(", "));
		
	}
	
	public static void mvp(String[] arr) {
		int score[] = new int[arr.length];			//store score
		int hScore = -1;							//highest score
		int index = 0;								//index for user with highest score
		
		for(int i=0; i<arr.length; i++) {
			String element = arr[i];
			int k = Integer.parseInt(element.split(" ")[0].split("/")[0]);		//get K
			int d = Integer.parseInt(element.split(" ")[0].split("/")[1]);		//get D
			int a = Integer.parseInt(element.split(" ")[0].split("/")[2]);		//get A
			String kill = element.split(" ")[1];								

			switch(kill) {
			case "P":
				k += 5;
				break;
			case "Q":
				k += 4;
				break;
			case "T":
				k += 3;
				break;
			case "D":
				k += 2;
				break;
			}
			
			score[i] = (k * 2 + a) / (d + 1);


			if(hScore < score[i]) {		//get heighst number
				hScore = score[i];
				index = i;
			}
			
		}
		System.out.println(index);
		System.out.println((index<5 ? "A" : "B") + (index%5+1));	//first 5 users are in A team, and others are in B team
	}

}

package code_dojang.level1;

//find every number including 8
public class CountEight {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1; i <= 10000; i++) {
			int temp = i;
			while(temp > 0) {
				if(temp % 10 == 8) count++;
				temp /= 10;
			}
		}
		System.out.println("Count of eight: "+ count);
	}

}

package level1;
/*
 * find Kim's index from an array
 */
public class FindKim {

	public static void main(String[] args) {
		String[] str = {"Jane", "Kim"};
		System.out.println(solution(str));
	}
	
	public static String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i < seoul.length; i++) {
        	if(seoul[i].toLowerCase().equals("kim"))
        		answer = "Kim is at " + i + ".";
        }
        return answer;
    }
	

}

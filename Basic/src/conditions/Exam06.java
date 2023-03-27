package conditions;

public class Exam06 {
	public static void main(String[] args) {
		/*
		 *다중if 문
		 *조건이 여러개면 else if 사용 
		 * 
		 * 
		 */
		int data = 60;
		
		if(data>100){
			System.out.println(data + " :100보다 크다.");
		}else if(data>50){
			System.out.println(data + " :50보다 크다.");
		}else {
			System.out.println(data + " : 50보다 작다");
		}
	}
}

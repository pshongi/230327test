package loopFor;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ,oddTotal=0, evenTotal = 0;
		
		for (i=0;i<=100;i++) {
			if(i%2==0) {
				evenTotal +=i;
			}else {
				oddTotal +=i;
			}
		}
		System.out.println("홀수 합 : " +oddTotal );
		System.out.println("짝수 합 : " +evenTotal);

	}

}

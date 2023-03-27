package loopFor;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~1000 사이의 자연수에 대해 자기 자신의 수를 제외한 모든 약수의 하비 자신과 같아지는 수를 구하여라.

		int i, j, k;
		int total = 0;
			
	for(j=2;j<1000;j++) {
		int number=j;
			for (i = 1; i < number; i++) {
				if (number % i == 0) {
					total += i;
				}
			}
			if (number == total) {
				System.out.println(number + "는 완전수");
			}	
			
			total=0;
	}	
///////////////////////////////////////////////////////////////////
		}
}

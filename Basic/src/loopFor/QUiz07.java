package loopFor;

public class QUiz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method 	stub
		//두 수의 최대 공약수를 구하는 프로그램을 작성하라
		// 최대 공약수 = 공약수 중에서 가장 큰 수
		// 1071과 1029의 최대공약수 21
		// 78696 과 19332의 최대공약수 36
		
		int a = 1071; //1 3 5 15
		int b = 1029; // 1 3 6 12 36
		int i=1;
		int k=0; //최대공약수
		for(i=1; i<50;i++) {
			if(a%i==0) {
				if(b%i==0) {
					System.out.println(i+"는 공약수 이다.");
					k=i;
				}
			}
		}
		System.out.println("최대공약수는"+k+"이다.");
	}

}

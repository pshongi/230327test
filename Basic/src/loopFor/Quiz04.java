package loopFor;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("여기에 수 입력 : ");
		int num = sc.nextInt();
		for(int i=2;;i++) {
			if(num%i==0) {
				System.out.println("이 수는 소수가 아님");
				break;
			}else {
				System.out.println("이 수는 소수");
				break;
			}
			
		
		}
		
		
	}

}

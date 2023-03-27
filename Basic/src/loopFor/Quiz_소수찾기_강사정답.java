package loopFor;

import java.util.Scanner;

public class Quiz_소수찾기_강사정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력");
		int end =sc.nextInt();
		
		for(int i =2;i<=end;i++) {
			boolean result =true;
			
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					result=false;
				}
			}
			if(result) {
				System.out.print(i+"  ");
			}
			
			
		}

	}

}

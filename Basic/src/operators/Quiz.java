package operators;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 수를 입력받아 짝, 홀수를 구분하여 출력
		 * 
		 * 2. 수를 입력받아 3의 배수이다/ 아니다 구분
		 * 
		 * 두 수를 입력받아 큰 수를출력하시오.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String result , result1, result2;
		
		System.out.print("수 입력 : ");
		int num1=sc.nextInt();
		
		result = (num1 % 2 ==0) ? "짝수" : "홀수";
		System.out.println("입력 받은 수는 : " + result);
		result1 = (num1 % 3==0) ? "입력 받은 수는 3의 배수" : "입력받은 수는 3의 배수가 아니다";
		System.out.println(result1);
		System.out.println("===================================================================");
	
		System.out.println("두 수 입력 : ");
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		
		result2 = (num2>num3) ? num2+"가"+num3+"보다 크다" : num2+"가"+num3+"보다 작다";
		System.out.println(result2);

		
		
		
		
		
		
		
		
	}

}

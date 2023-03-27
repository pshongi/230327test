package conditions;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		/*
		 
		 *
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int data = sc.nextInt();
		
		if(data%3==0) {
			System.out.println(data+"는 3의 배수");
		}else if(data%3!=0){

			System.out.println(data+"는 3의 배수가아님");
	
			
		}

		sc.close();
		
	}
}

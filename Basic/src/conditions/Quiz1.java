package conditions;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 수 입력 : ");
		int data = sc.nextInt();
		
		if(data==0) {
			System.out.println("다시 입력해주세요");
		}
		else if(data%3==0 && data%4==0) {
			System.out.println(data+ "는 3의 배수이면서 4의 배수이다.");
		}else if(data%3==0 && data%4!=0) {
			System.out.println(data+ "는 3의 배수이지만 4의 배수는아니다.");
		}else if(data%3!=0 && data%4==0) {
			System.out.println(data+ "는 3의 배수는 아니지만 4의 배수이다.");
		}else if(data%3!=0 && data%4!=0) {
			System.out.println(data+ "는 3의 배수도, 4의 배수도 아니다.");
		}
	}

}

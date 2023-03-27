package conditions;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력해주세요 : ");
		int data =sc.nextInt();
		
		
		if(data%5==0) {
			System.out.println(data+"는 5의 배수이다.");
			
		}else if(data%5 != 0){
			System.out.println(data+"는 5의 배수가 아니다.");
			
		}
		
		if(data>0 && data<100) {
			System.out.println(data+"는 적중범위입니다.");
		}else {
			System.out.println(data+"는 적중범위가 아닙니다.");
		}
		if(data%2==0 && data%3==0) {
			System.out.println("데이터는 짝수이며 3의 배수이다." );
		}else if(data%2==0 && data%3!=0) {
			System.out.println("데이터는 짝수이지만 3의 배수가 아니다.");
		}else if(data%2!=0 && data%3==0){
			System.out.println("데이터는 짝수가 아니지만 3의 배수이다.");
		}else {
			System.out.println("데이터는 짝수가 아니고 3의 배수가아니다.");
		}
		
		
	}
}

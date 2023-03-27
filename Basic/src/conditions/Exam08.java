package conditions;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 수 입력 : ");
		int data = sc.nextInt();
		
		if(data>0) {
			if(data%2==0) {
				System.out.println(data +" 는 양의 짝수");
			}else if(data%2 !=0) {
				System.out.println(data +" 는 양의 홀수");
			}
		}else if(data<0) {
			if(data%2==0) {
				System.out.println(data +" 는 음의 짝수");
			}else if(data%2 !=0) {
				System.out.println(data +" 는 음의 홀수");
			}
			
		}else {
			System.out.println(data+"는 0이다.");
		}
		
	}
}

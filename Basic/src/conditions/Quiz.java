package conditions;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.숫자 입력 :");
		int data= sc.nextInt() ;
		
		if(data%3==0)
			System.out.println("데이터"+data+"는 3의 배수입니다.");
		if(data%3!=0)
			System.out.println("데이터"+data+"는 3의 배수가 아닙니다.");
		
		if(data>0)
			System.out.println("데이터의 절대값은"+data+"입니다");
		if(data<0) {
			data=data*=-1;
			System.out.println("데이터의 절대값은"+data+"입니다.");
		}
		System.out.println("============================================");
		System.out.println("숫자를 두개 입력하세요");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		
		if(data1>data2)
			System.out.println(data1+"이 더 큰 수입니다.");
		if(data2>data1)
			System.out.println(data2+"이 더 큰 수입니다.");

		sc.close();
		
		
	}
}

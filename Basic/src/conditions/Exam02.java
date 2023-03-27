package conditions;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data ;
		System.out.println("입력 : ");
		data = sc.nextInt();
		
		if(data>10)
			System.out.println("종속 문장 실행");
		System.out.println("다음 문장");
		
	}
}

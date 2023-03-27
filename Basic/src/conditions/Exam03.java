package conditions;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data;
		System.out.println("1.쉬운게임");
		System.out.println("2.어려운 게임");
		System.out.println("3.나가기");
		System.out.println(" >>> ");
		
		data = sc.nextInt();
		
		if(data==1)System.out.println("쉬운게임 선택");
		else if(data==2)System.out.println("어려운 게임 선택");
		else if(data==3)System.out.println("나가기");
	}
}

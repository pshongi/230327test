package inputs;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("문자입력 : ");
	String tmp = sc.next();
	char data = tmp.charAt(0); //문자열을 입력받아서 문자 변수의 첫번째를 사용한다. 
	
	//char data = sc.next().charAt(0); 으로도 사용 가능.
	
	System.out.println("문자 출력:"+ data);
	
	
	
	sc.close();
	}
}

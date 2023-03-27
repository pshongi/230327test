package conditions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 수 입력 : ");
		int data=0;
		
		try {
		data = sc.nextInt();
		//예외가 발생할 코드.
		}
		catch(InputMismatchException e){ //inputmismatch exception인가 ?	
			//예외가 발생했을때 동작할 코드
			System.out.println("문제 발생");
			System.exit(0);
		}catch(NumberFormatException e){	//NumberFormatException exception인가 ?
			//예외가 발생했을때 동작할 코드
			System.out.println("문제 발생");
			System.exit(0);
		
		}catch(Exception e){	//위에 exception을 제외한 모든 exception
			
			//예외가 발생했을때 동작할 코드
			System.out.println("문제 발생");
			System.exit(0);
		
		}
		if(data%2==0) {
			if(data%3==0) {
				System.out.println(data + "는 짝수이며 3의 배수이다.");
			}else {
				System.out.println(data + "는 짝수이지만 3의 배수는 아니다.");
			}
		}else if(data%3==0) {
			System.out.println(data +"는 홀수고 3의 배수이다.");
		}else {
			System.out.println(data +"는 홀수고 3의 배수가 아니다.");
		}
		
		sc.close();
	}
}

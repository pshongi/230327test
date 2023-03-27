package conditions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 문자 입력 : ");
		int data;
		String tmp= "";
		tmp =sc.next();//문자열
	    
	    try {
	    	data = Integer.parseInt(tmp);
		} catch (Exception e) {
			//e 에 오류코드가 저장되어 있음. (예외의 이유)
		}
		
		sc.close();
	}
}

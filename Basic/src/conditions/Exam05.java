package conditions;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 받을 두 수 입력" );
		int data1,data2,max,min;
		data1= sc.nextInt();
		data2= sc.nextInt();
		
		if(data1>data2) {
			max=data1;
			min=data2;
		}else {
			max=data2;
			min=data1;
		}
		
		System.out.println("max 값은 "+max+ "이고 min 값은"+  min +"이다");
	}
}

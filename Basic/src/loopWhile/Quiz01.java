package loopWhile;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		 	영문자 ‘q’가 입력될 때 까지 반복을 수행하세요.

			입력된 수의 각 자리수의 합을 구하는 프로그램을 작성하라.

			입력된 수를 거꾸로 정수형 변수에 담아 출력하시오.(예 123 -> 321)
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자 입력 : ");
			char data = sc.next().toLowerCase().charAt(0);
			System.out.println("출력 : " + data);
			if(data == 'q')
				break;
		}
		
		int total = 0;
		System.out.print("정수 입력 : ");
		int data = sc.nextInt();
		System.out.print(data);
		
		while(true) {
			/*
			123 % 10 = 3, 12 % 10 = 2, 1 % 10 = 1
			 */
			total = total + data % 10;
			data /= 10;
			if(data == 0)
				break;
		}
		System.out.println("의 각 자리수 합계 : " + total);
		
		total = 0;
		System.out.print("정수 입력 : ");
		data = sc.nextInt();
		System.out.print(data);
		while(true) {
			/*
			123 % 10 = 3, 12 % 10 = 2, 1 % 10 = 1
			 */
			total = total + data % 10;
			data /= 10;
			if(data == 0)
				break;
			// 3 x 10 = 30, 32 x 10 = 320,
			total *= 10;
		}
		System.out.println("의 거꾸로 된 정수 : " + total);
	}

}

package conditions;

import java.util.Scanner;

public class Exam12_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 식에 맞는 부분을 찾아서 실행
		Scanner sc = new Scanner(System.in);
		System.out.println("수입력");
		// int select = sc.nextInt();
		char select = sc.next().charAt(0);

		switch (select) {
		case 1:
			System.out.println("case1 : " + select);
			break;
		case 2:
			System.out.println("case2 : " + select);
			break;
		case 3:
			System.out.println("case3 : " + select);
			break;
		case 'a':
			System.out.println("case 'a' ");
			break;
		case 'A':
			System.out.println("case : 'A'");
			break;
		case '0':
			System.out.println("case: '0'");
			break;
		default:
			System.out.println("case가 아닌 수");

		}

	}

}

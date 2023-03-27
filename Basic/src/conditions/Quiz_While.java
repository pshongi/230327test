package conditions;

import java.util.Scanner;

public class Quiz_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("주소 등록");
		String ref1 = "";
		String ref2 = "";
		boolean flag = true;
		
		while (flag) {
			System.out.println("===========================================");
			System.out.println("1.우리집 등록");
			System.out.println("2.회사등록");
			System.out.println("3.등록 보기");
			System.out.println("4.종료");
			System.out.println("===========================================");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("우리집 주소는");
				ref1 = sc.next();
				System.out.println("????");
				break;
			case 2:
				System.out.print("회사 주소는");
				ref2 = sc.next();
				break;
			case 3:
				System.out.println("우리집 주소 :" + ref1 + "\n" + "회사주소 : " + ref2);
				break;
			case 4:
				System.out.println("종료하기 ");
				flag = false; break;
			default:
				System.out.println("잘못된 입력입니다 다시 입력해주세요");
				 break;
			}

		}
	}

}

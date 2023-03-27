package conditions;

import java.util.Scanner;

public class Exam15_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name ="";
		
		boolean stop = true;
		
		while(stop) {
			System.out.println("1.이름입력");
			System.out.println("2.이름출력");
			System.out.println("3.종료");
			System.out.println("=====>");
			
			int select = sc.nextInt();
			
			switch (select) {
			case 1 :System.out.println("이름입력");
				name= sc.next(); break;
			case 2 :System.out.println("이름출력 : "+ name);
				break;
			case 3 :System.out.println("프로그램을 종료합니다.");
				stop = false ; break;
			
	
		}
			
		}
	}

}

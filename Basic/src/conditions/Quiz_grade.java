package conditions;

import java.util.Scanner;

public class Quiz_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = sc.nextInt();
		
		String message = "";
		if(year%4==0) {
			message = "윤년";
			if(year%100==0) {
				message="평년";
				if(year%400==0) {
					message="윤년";
				}
			}
		}
		System.out.println("올해는"+message+"입니다.");
		
		/*
		if(year%4==0 && year%100==0 && year%400==0) {
			System.out.println(year +"이번 해는 윤년");
		}else if(year%4==0 && year%100==0 && year%400!=0)
			System.out.println(year + "이번 해는 평년");
		else if(year%4==0 && year%100!=0 && year%400!=0)
			System.out.println(year + "이번 해는 윤년");
		*/
		
		System.out.println("학점을 입력하세요");
		String grade = sc.next();
		System.out.println(grade);
		
		int a = grade.toUpperCase().charAt(0);
		System.out.println(a +"chartAT 한 변수a");
		
		
		if(a=='A' || a==('B'))
			System.out.println("참 잘했어요");
		else if(a=='C'|| a=='D')
			System.out.println("분발");
		else if(a=='F')
			System.out.println("F 이하입니다.");
		
		
		
		
		
	}
	
	

}

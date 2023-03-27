package arrays;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int addM = 0; //a값이 들어왔을때 더해지는 월
		int addD = 0; //b값이 들어왔을때 더해지는 월
		int targetDay=0;
		int oddM =0;
		int evenM =0;
		String day = "";
		String[] dayList= {"일","월","화","수","목","금","토"};
		
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("====요일찾기 프로그램 ===");
		System.out.println("==오늘은 2023년 1월1일 월요일입니다==");
		System.out.print("월을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
		int b = sc.nextInt();
		
		if(a<8) {//
			addM= a-1;
			if(a>2) {
					if(addM%2==0) {
						oddM =addM/2;
						evenM =addM/2;
						System.out.println("oddM : " + oddM + "  evenM ; " + evenM);
					}else {
						oddM =addM/2+1;
						evenM =addM/2;
						System.out.println("oddM : " + oddM + "  evenM ; " + evenM);
					}
				addD= oddM*31+evenM*30; //이전 달까지의 합
				addD=addD-4;//2이 28일이기 때문에 계산
				addD+=b;
				
				//요일구하기
				targetDay=addD%7+1;
				
				System.out.println("addD : " + addD);
				System.out.println("target day : " + targetDay);
				
				//System.out.print("목표 월의 1일은 : "+ );
				day=dayList[targetDay];
				System.out.println("요일은 : " + day);
				
			}else if(a<2) {
				addD= addM*30; //이전 달까지의 합
				addD+=b;
				
				//요일구하기
				targetDay=addD%7-1;
				
				//System.out.print("목표 월의 1일은 : "+ );
				day=dayList[targetDay];
				
			}else if(a==2){
				addD=31+b;
				targetDay=addD%7-1;
				System.out.println("addD ; " + addD);
				System.out.println("targetDay"+ targetDay);
				day=dayList[targetDay];
				System.out.println("요일은 : " + day);
			}
			System.out.println("2023년 "+a+"월"+b+"일은 " + day +"입니다.");
			
		}else if(a>7) {
			addD=124+88; //상반기 일수 
			addM = a-7;
			
			
			
			
			
			
		}
		
		
		
		// 토 일 월 화 수 목 금 
		// 토 일 월 화 수 목 금 
		// 토 일 월 화 수 목 금 
		
		
		
	
		
		

	}

}

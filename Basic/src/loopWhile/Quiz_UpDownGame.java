package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz_UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		//변수
		int count = 0; // Score 횟수
		int comp = 0;
		int inputC=0;
		int countRank=0;
		int user; // User가 찍은 숫자
		
		
		while(true) {//while 시작
			System.out.println("==Up&Down==");
			System.out.println("1.Game Start");
			System.out.println("2.Game Scroe");
			System.out.println("3.Game Exit");
			System.out.print(">>>>>");
			//게임 메뉴 선택
			int input = sc.nextInt();
			inputC++;
			//랜덤 숫자 생성
			comp = 3;
					//r.nextInt(100)+1;
			System.out.println("랜덤 수  : " + comp);
		
		
		
		switch(input) {
			case 1 : 
				System.out.println("1.Game Start");
				count=0;
				while(true) {
					
					System.out.print("InputNumber : ");
					user = sc.nextInt();
					
					if(user>comp) {
						System.out.println("DOWN !!!");
						count++;
					}else if(user==comp) {
						System.out.println("플레이어가 정답을 맞췄습니다!!!");
						count++;
						System.out.println("정답을 맞췄을떄 count : "+ count);
						if(countRank>count) {
							countRank=count;
						}else {
						
						}
						break;
					}else {
						System.out.println("UP !!!");
						count++;
					}
				}//case1 while 끝
				
				break;
				//4
			case 2 : 
				//System.out.println("case 2 의 input 값은 ? " + input);
				
				//1등 횟수 3번
				//다음판 내가 2번
				
				if(countRank==0) {
					System.out.println("아직 랭킹이 없습니다.");
					break;
				}else {
					System.out.println("랭킹1위는 : "+countRank);
				}
				break;
			
			case 3 : 
				System.out.println("게임 종료");
				break;				
			}//switch문
		
		
		
		
		
		}//while 끝

	}

}

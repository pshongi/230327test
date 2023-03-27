package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz_UpDownGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		//변수
		int count = 0; // Score 횟수
		int comp = 0; //목표 값
		int inputC=0;
		int countRank=0;
		int compRandom=0;//컴퓨터가 찍을 수
		int usertmp=0;
		int comptmp=1;
		int user; // User가 찍은 숫자
		int turn= 1;
		int min=1;
		int undertmp=0;
		int range=100;
		int max=100;
		boolean end=true;
		
		
		while(true) {//while 시작
			System.out.println("==Up&Down==");
			System.out.println("1.Game Start");
			System.out.println("2.Game Scroe");
			System.out.println("3.Game Exit");
			System.out.print(">>>>>");
			//게임 메뉴 선택
			int input = sc.nextInt();
			//랜덤 숫자 생성
			comptmp =compRandom=comp=usertmp=user=0;
			end=true;
			max=100;
			min = 1;
			count=0;
			turn= 1;
		
		
		
		switch(input) {
			case 1 : 
				System.out.println("1.Game Start");
				comp = 15;
				//r.nextInt(100)+1;
				System.out.println("랜덤 수  : " + comp);
				
			while(true) {//전체 게임 반복 while
				while(turn==1) {//user 턴일때
					System.out.print("User InputNumber : ");
					user = sc.nextInt();
					
					usertmp =user ;
					
					
					if(user>comp) {
						System.out.println("DOWN !!!");
						count++;
						turn*=-1;
						
					}else if(user==comp) {
						System.out.println("플레이어가 정답을 맞췄습니다!!!");
						count++;
						System.out.println("정답을 맞췄을떄 count : "+ count);
						if(countRank>count) {
							countRank=count;
						}else {
						
						}
						end=false;
						break;
					}else {
						System.out.println("UP !!!");
						count++;
						turn*=-1;
						
					}
				}//user 턴일때
				
				while(turn==-1) {//컴퓨터 턴일때
					if(usertmp<comp) {
						if(min<usertmp) {
							min=usertmp;
						}
						compRandom=r.nextInt(max-min)+min;
						
					}else if(usertmp>comp) {
						if(max>usertmp) {
							max=usertmp;
						}
						compRandom=r.nextInt(max-min)+min;
					}
					
					
					System.out.println("usertmp 는 : ?"+usertmp+"/ max 값은 ? : "+max+"/ min 값은 ? :"+min);
					System.out.print("컴퓨터가 찍은 수 : "+compRandom);
					
					if(compRandom>comp) {
						System.out.println("  DOWN !!!");
						count++;
						turn*=-1;
						
					}else if(compRandom==comp) {
						count++;
						System.out.println("컴퓨터가 정답을 맞췄습니다!!!");
						System.out.println("정답을 맞췄을떄 count : "+ count);
					if(countRank==0 && countRank>count) {
							countRank=count;
					}else if(countRank==0){
						countRank=count;
						
					}
						end=false;
						break;
					}else {
						System.out.println("  UP !!!");
						count++;
						turn*=-1;
			
						min=compRandom;
						
						
					}
				}//컴퓨터 턴일때
				if(end==false) {
					break;
				}
				
			}//전체 게임 반복 while
			
			break;
			
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

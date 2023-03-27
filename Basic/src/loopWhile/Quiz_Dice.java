package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz_Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		// 변수
		int comp;
		int seedMoney = 10000;
		int betMoney;
		int a, b, c;
		int userDice = 0;
		int compDice = 0;
		int winCount = 0;
		int loseCount = 0;
		int drawCount = 0;
		String yn="";
		boolean flag = true;
		while (flag) {
			System.out.println("======DiceGame======");
			System.out.println("1.Game Start");
			System.out.println("2.Game Scroe");
			System.out.println("3.Game Exit");
			System.out.print(">>>>>");
			// 게임 메뉴 선택
			int input = sc.nextInt();

			switch (input) {
			case 1:
				while(true) {
					System.out.println("★베팅부터하자★");
					System.out.print("베팅금액 입력 : ");
					betMoney = sc.nextInt();
					
					if(seedMoney<betMoney) {
						System.out.println("배팅금액이 너무 커");
						System.out.println("니가 가진돈은" + seedMoney);
						continue;
					}else {//게임 시작
						System.out.println("==게임을 시작합니다.==");
						System.out.println("주사위를 돌립니다.");
						a = r.nextInt(6) + 1;
						System.out.println("첫번째 주사위 : " + a);
						b = r.nextInt(6) + 1;
						System.out.println("두번째 주사위 : " + b);
						c = r.nextInt(6) + 1;
						System.out.println("세번째 주사위 : " + c);
						userDice = a + b + c;
						System.out.println("당신의 주사위의 합 : " + userDice);
						compDice = r.nextInt(18) + 3;
						System.out.println("상대의 주사위 합  :" + compDice);	
						
						if (userDice > compDice) {
							System.out.println("당신이 이겼습니다!");
							winCount++;
							seedMoney += betMoney;
							System.out.println("보유한 seed : " + seedMoney);

						} else if (compDice > userDice) {
							System.out.println("당신이 졌습니다!");
							seedMoney-=betMoney;
							loseCount++;
							System.out.println("보유한 seed : " + seedMoney);
						} else { // 비겼을때
							System.out.println("비겼습니다.");
							drawCount++;
							System.out.println("보유한 seed : " + seedMoney);
						}	
					}//게임끝
					
					System.out.println("게임을 계속 하시겠습니까 ? y/n ");
					yn = sc.next();
					
					
					if (yn.equals("y")) {
						System.out.println("게임을 이어합니다.");
						continue;
					} else if (yn.equals("n")) {
						System.out.println("게임을 종료합니다.");
						break;
					}
					
				}
				break;
		
			case 2:
				System.out.println("당신의 전적 win :" + winCount + "/ lose :" + loseCount + "/ draw : " + drawCount);
				System.out.println("seedMoney는 ? "+  seedMoney);
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				seedMoney=10000;
				
				break;

			}

		}

	}

}

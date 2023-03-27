package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz_Dice_강사정답 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int record, win, draw, lose, seed = 10000;
		record = win = draw = lose = 0;

		while (true) {
			System.out.println("=== Dice Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print(">> ");
			String select = sc.next();

			switch (select) {
			case "1":
				System.out.println("게임을 시작합니다.");
				while(true) {
					if(seed <= 0) {
						System.out.println("배팅금액을 모두 잃었습니다. 종료합니다.");
						break;
					}
					record++;
					System.out.println("시드금액 : " + seed);
					System.out.println("주사위를 돌리겠습니다.");
					Random r = new Random();
					int userTotal = 0;
					for (int i = 1; i <= 3; i++) {
						int tmp = r.nextInt(6) + 1;
						System.out.println(i + "번째 주사위 : " + tmp);
						userTotal += tmp;
					}
					System.out.println("당신의 주사위 총 합 : " + userTotal);
					int comTotal = r.nextInt(18 - 3 + 1) + 3; // 3 ~ 18
	
					int bet = 0;
					while (true) {
						System.out.print("배팅 금액을 정해주세요 : ");
						try {
							bet = sc.nextInt();
						} catch (Exception e) {
							sc.nextLine();
							System.out.println("숫자로 입력하세요.");
							continue;
						}
	
						if (bet >= 1 && bet <= seed)
							break;
					}
	
					System.out.println(" === 결과 === ");
					System.out.println("당신의 주사위 총 합 : " + userTotal);
					System.out.println("상대의 주사위 총 합 : " + comTotal);
	
					if (userTotal > comTotal) {
						System.out.println("이겼습니다. " + bet + "원을 얻었습니다.");
						win++;
						seed += bet;
					} else if (userTotal < comTotal) {
						System.out.println("졌습니다. " + bet + "원을 잃습니다.");
						lose++;
						seed -= bet;
					} else {
						System.out.println("무승부 입니다.");
						draw++;
					}
					
					char yn = 0;
					while(true) {
						System.out.print("게임을 계속하시겠습니까? (y/n) : ");
						yn = sc.next().toUpperCase().charAt(0);
						if(yn == 'Y' || yn == 'N')
							break;
						System.out.println("y 또는 n 으로 입력하세요.");
					}
					
					if(yn == 'N') {
						System.out.println("게임을 종료합니다.");
						break;
					}
					System.out.println();
				}
				break;
			case "2":
				System.out.printf("현재 %d전 %d승 %d무 %d패 입니다.\n", record, win, draw, lose);
				break;
			case "3":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
		}
		
	}

}

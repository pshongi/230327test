package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz05_동전맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int coin = 0;
		String coinN = "";
		int tmp = 0;
		int result=0;

		while (true) {
			coin = r.nextInt(2) + 1;
			if (coin == 1) {
				coinN = "앞면";
			} else {
				coinN = "뒷면";
			}

			System.out.println("==동전 앞/뒤 맞추기==");
			System.out.println("앞/뒤를 선택해주세요");
			System.out.println("1.앞 / 2.뒤 / 3.종료");
			int user = sc.nextInt();
			if(user==coin)
				result = 1;
			else
				result = 2;
			

			switch (result) {

			case 1:
				System.out.println("코인은 ? : " + coinN);
				System.out.println("정답");
				break;
			case 2:
				System.out.println("코인은 ? : " + coinN);
				System.out.println("틀렸음 다시해");
				break;
			case 3:
				System.out.println("시스템 종료");
				break;
			}

		}

	}

}

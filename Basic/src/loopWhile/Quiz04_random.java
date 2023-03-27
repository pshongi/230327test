package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz04_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc= new Scanner(System.in);
		int input = 0;
		String msg = "";
		
		while(true) {
			System.out.println("===========================");
			System.out.println("가위바위보 게임입니다");
			System.out.println("1.가위 2.바위 3.보 4.종료");
			System.out.println(">>>>");
			input = sc.nextInt();
			
			int computer = (int)(r.nextInt(3)+1);
			if(input==1) {
				msg="가위";
			}else if(input==2){
				msg="바위";
			}else {
				msg="보";
			}
			
			switch (input) {///
				case 1:
					System.out.println("컴퓨터는 ? : " +computer);
					if(computer ==1)
						System.out.println(" 비겼");
					else if(computer==2)
						System.out.println(" 졌");
					else
						System.out.println("이겼");
					break;
				case 2:
					System.out.println("컴퓨터는 ? : " +computer);
					if(computer ==1)
						System.out.println("이겼");
					else if(computer==2)
						System.out.println("비겼");
					else
						System.out.println("졌");
					break;
				case 3:
					System.out.println("컴퓨터는 ? : " +computer);
					if(computer ==1)
						System.out.println("졌");
					else if(computer==2)
						System.out.println("이겼");
					else
						System.out.println("비겼");
					break;
				case 4:
					System.out.println("시스템 종료 ");
				break;
			}///
			
		}

	}

}

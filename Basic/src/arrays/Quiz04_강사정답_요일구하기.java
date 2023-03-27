package arrays;

import java.util.Scanner;

public class Quiz04_강사정답_요일구하기 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		int month[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int mm = 0, dd = 0, total = 0;

		while(true) {
			System.out.print("월 일 입력 : ");
			try {
				mm = Integer.parseInt(input.next());
				dd = Integer.parseInt(input.next());
			} catch (Exception e) {
				continue;
			}
			
			if (mm >= 1 && mm <= 12 && dd >= 1 && dd <= month[mm-1]) //합리적인 숫자가 아닐때 
				break;
		}

		for (int i = 0; i < mm - 1; i++) {
			total += month[i];
		}
		total += dd;
		total += 5;
		System.out.printf("2023년 %02d월 %02d일은 %s입니다.\n", mm, dd, week[total % 7]);

	}

}






package aligns;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz_Lotto {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num = 0;
		int[] lottoList = new int[6];
		int i = 0;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		while (true) {

			num = r.nextInt(10) + 1;
			boolean check = true;
			for (int j = 0; j < lottoList.length; j++) {
				if (lottoList[j] == num) {
					check = false;
					break;
				}
			}
			if(check == false)
				continue;
			lottoList[i] = num;
			System.out.println(num);
			i++;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if (i == 6) {
				System.out.println("추첨이 끝났습니다.");
				for (int k = 0; k < lottoList.length - 1; k++) {
					for (int p = k+1; p < lottoList.length; p++) {
						int tmp = 0;
						if (lottoList[k] < lottoList[p]) {
							tmp = lottoList[k];
							lottoList[k] = lottoList[p];
							lottoList[p] = tmp;

						}
					}
				}

				break;
			}

		} // while 끝
		System.out.println("로또번호  : " + Arrays.toString(lottoList));

	}

}

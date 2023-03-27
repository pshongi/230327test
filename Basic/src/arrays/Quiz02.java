package arrays;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String[] name = {"국어","영어","수학"};
		int[] st = new int[name.length];
		
		int kor = 0;
		int eng = 0;
		int math= 0;
		int total=0;
		double avg =0;
		

		for(int i = 0; i<st.length;i++) {
			
		while(true) {	
			try {
				System.out.print(name[i] + "점수를 입력하세요 : ");
				st[i] = sc.nextInt();
				
				if(st[i]>100 ||st[i]<0) {
					System.out.println("잘못된 숫자입력입니다.");
					continue;
				}
				System.out.println(st[i]);
				total+=st[i];
			}catch (Exception e) {
				System.out.println("잘못입력 하셨습니다.");
				sc.nextLine(); //sc 버퍼안에 enter값을 없애기위해
				continue;
			}
			break;
		}//while 끝
		
		}//for문 끝


	
		avg =(double)(total/3);
		System.out.println("total : " + total);
		System.out.println("avrage : " + avg);
			
	}

}

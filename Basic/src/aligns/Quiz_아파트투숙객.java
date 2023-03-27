package aligns;

import java.util.Scanner;

public class Quiz_아파트투숙객 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		/*
		 * 
		 * 
		 * 
		 * out of bound    = >  범위가 아닐때 나는 버그
		 */
		Scanner sc = new Scanner(System.in);
		int floor=2,room=3;
		boolean flag = true;
		String[][] pension = new String[2][3];
		int[][] pensionRoom = new int[floor][room];
		for(int i =0; i<pension.length;i++) {
			for(int j=0; j<pension[i].length;j++) {
				pension[i][j]="빈방";
			}
		}
		
		
		System.out.println("숙박관리 프로그램");
		while(flag) {
			System.out.println("1.입실");
			System.out.println("2.퇴실");
			System.out.println("3.전체보기");
			System.out.println("4.종료");
			System.out.print(">>>>");
			int input= sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("1.입실");
				System.out.print("입실할 층 입력 : ");
				int a= sc.nextInt();
				System.out.print("입실할 호수 입력 : ");
				int b= sc.nextInt();
				System.out.print("투숙객 이름 입력 : ");
				pension[a][b]=sc.next();
				
				break;
			case 2:
				System.out.println("2.입실");
				System.out.print("입실할 층 입력 : ");
				a= sc.nextInt();
				System.out.print("입실할 호수 입력 : ");
				b= sc.nextInt();
				System.out.print(pension[a][b]+"퇴실합니다.");
				pension[a][b]="빈방";
				
				break;
			case 3 : 
				for(int i =0 ; i<pension.length; i++) {
					for(int j=0 ; j<pension[i].length;j++) {
						System.out.println(i+"층"+j+"호 사람은 :"+ pension[i][j]);
					}
				}
				break;
			case 4 : 
				System.out.println("종료합니다.");
				flag=false;
				break;
			default:
			}
			
		}//while문 시작
			

	}

}

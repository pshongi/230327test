package aligns;

import java.util.Scanner;

public class Quiz_아파트입주자정보 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aptRoom; //호실
		String name ;

		
		//아파트 층수 만들기
		System.out.print("아파트 층수 입력 : ");
		int aptlength = input.nextInt();
		String[][] who = new String[aptlength][];
		
		
		System.out.println("아파트 층수는 : "+aptlength+"입니다.");
		int[][] arr= new int[aptlength][];//총 층수 만큼 배열 생성하고
		
		//아파트 층 당 호수 입력
		for(int i =0;i<arr.length;i++) {
			System.out.println((i+1)+"층의 총호수갯수 입력 : ");
			aptRoom = input.nextInt();//층의 호수 갯수 입력 받았음
			arr[i]= new int[aptRoom];
			who[i]= new String[aptRoom];
			}	
		 //호수만큼 층의 거주자를 받을 배열 생성
		
		
		//받을 사람을 입력
		for(int i=0;i<arr.length;i++) { //i 가 층
				for(int j=0;j<arr[i].length;j++) {//j가 호수
					System.out.println((i+1)+"층 "+(j+1) +" 호수의 사람은 : ");
					
					name=input.next();//
					who[i][j]=name;
				}
			System.out.println();
		}
		
		//다 끝나고 사람들 출력해보기
		for(int i=0;i<arr.length;i++) { //i 가 층
			for(int j=0;j<arr[i].length;j++) {//j가 호수
				name=who[i][j];
				
			System.out.println(i+"층 "+j +" 호수의 사람은 : " + name);
			}
		}
		
		
			
		
		//
		
		
		

	}

}

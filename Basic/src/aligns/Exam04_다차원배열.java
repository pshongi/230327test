package aligns;

import java.util.Scanner;

public class Exam04_다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int length = input.nextInt();
		int[][] arr= new int[length][];
		/////////////////////////////////////////////////////배열 만들기
		System.out.println("각행에 배열을 만들기 !");
		for(int i = 0 ; i < arr.length; i ++) {
			System.out.print(i+1+"번째 행의 배열 : ");
			int n = input.nextInt();
			arr[i]= new int[n];
			
		}
		///////////////////////////////////////////////////값 집어넣기
		for(int i = 0 ; i < arr.length;i++) {
			for(int j = 0 ; j < arr[i].length; j++){
				arr[i][j]=j;
				}
		}
		////////////////////////////////////////////////////출력하기
		for(int i = 0 ; i < arr.length;i++) {
			for(int j = 0 ; j < arr[i].length; j++){
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		
				

	}

}

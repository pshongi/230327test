package aligns;

import java.util.Random;

public class Quiz_다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5x5배열의 2차원 배열을 만들고 난수 입력
		//0-9
		//a-z
		int num=0;
		Random r = new Random();
		int[][] arr = new int[5][9];
		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=r.nextInt(9);
			}
			
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=================================");
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				char k = (char)(r.nextInt(26)+97);
				arr[i][j]=k;
			}
			
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print((char)arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}

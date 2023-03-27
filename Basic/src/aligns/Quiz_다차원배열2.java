package aligns;

import java.util.Random;

public class Quiz_다차원배열2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[][] arr = new int[5][6];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=r.nextInt(9)+1; //난수생성
				
					for(int k =0;k<j;k++) {//복수 체크
						if(arr[i][k]==arr[i][j]) {
							j--;
							break; 
							}
					}//복수 체크
			}
			
		}
		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}//main
}//class
		
	



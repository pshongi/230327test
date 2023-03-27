package aligns;

public class Exam02_다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 다차원 배열의 정의
		 * 2차원 이상의 배열을 의미
		 * 배열을 입체적으로 표현한 모양
		 * 
		 * 형식
		 * type배열명[][] =new type[][];
		 * type[][]배열명 = new type[][];
		 * 
		 * 
		 */
		int i,j;
		
		int arr[][]= new int[][] {
			{10,20,30},
			{40,50,60},
			{70,80,90}
		};
	for(i=0;i<arr.length;i++) {
		for(j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+ "  ");
		}
	System.out.println();
	}

		
		

	}

}

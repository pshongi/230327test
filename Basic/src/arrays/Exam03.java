package arrays;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr= new int[200];
			System.out.println("arr.length : "+ arr.length);
			
			for(int i=0;i<arr.length; i++) {
				arr[i]=(i+1)*100;
				
			}
			for(int i = 0 ; i <arr.length; i++) {
				System.out.println("arr["+i+"]:"+arr[i]);
			}
			
			/*
			 향상 for문
			 for ( : 배열( 두 개 이상 데이터 저장소) )
			 */
			for(int data : arr) { //arr[i] 번째 데이터를 int data에 집어넣고 거기 아래에다가 연산 작업을 시작함.
				
				System.out.println(data);
			}
			
			

	}

}

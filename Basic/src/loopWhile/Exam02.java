package loopWhile;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=0,sum=0;
		
		while(true) {
			System.out.println("수입력(1~100) :");
			i=sc.nextInt();
			
			if(i>=1&&i<=100) {
				break;
			}else {
				System.out.println("잘못 입력, 다시");
			}
		}
			for(int j=1; j<=i;j++) {
				sum+=j;	
			}
		
			System.out.println("입력받은 수의 합 :"+sum);
		
	}

}

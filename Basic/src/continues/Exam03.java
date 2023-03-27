package continues;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i =0, sum=0;
		while(true) {
			System.out.println("수입력 : " );
			try {
				i=input.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("입력이 잘못됐음..");
				input.nextLine();//입력 버퍼에 이쓴 데이터를 입력받아 버퍼청소.
				continue;
			}
			if(i>=i && i<=100)
				break;
			else
				System.out.println(" 잘못 입력, 다시");
		}
		for(int j =1; j<=i;j++)
			sum+=j;
		System.out.println("입력 받은 수의 합 " + sum);
		
	}
}

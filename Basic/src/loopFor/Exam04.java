package loopFor;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수 입력");
		int repeat = sc.nextInt();
	
		for(int i=0; i<=repeat ;i++) {
			System.out.println("i를" +repeat+"횟수만큼 반복 중 i 값은"+ i);
			
		}
	}

}

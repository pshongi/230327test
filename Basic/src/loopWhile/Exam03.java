package loopWhile;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int i = input.nextInt();
		
		while(true) {
			int tmp = i%10; //10으로 나눴을때의 나머니진까 1의 자리를 반환함.   123 ->3, 12->2, 1->1 
			i=i/10;
			System.out.print(tmp+ " ");
			if(i==0)
				break;
		}
		

	}

}

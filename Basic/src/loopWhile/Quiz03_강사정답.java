package loopWhile;

import java.util.Scanner;

public class Quiz03_강사정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("입력");
		int end = in.nextInt();
		int count = 0;
		for(int i =1; i<=end; i++) {
			int j =i;
			while(true) {
				int tmp=j%10;
				if(tmp==3||tmp==6||tmp==9) {
					count++;
					System.out.println(i+ " ");
				}
				j/=10;
				if(j==0)
					break;
			}
		}
		
		System.out.println("\n3, 6 , 9의개수 : " + count);
		//36->18개 /  14-> 4개
	}

}

package loopFor;

import java.util.Scanner;

public class Quiz_별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i =0;
		int j =0;
		int k =0;
		int f=0;
		int t=0;
		int p=0;
		System.out.println("별 수를 입력하세요 : ");
		int number=sc.nextInt(); //별 수
		
		int line=(number-1)/2+1;
		int star=1;
		int space =(number-1)/2;
		
		for (i=0;i<line;i++) {
			for(j=0; j<space;j++) {
				System.out.print(" ");				
			}
			for(j=0; j<star;j++) {
			System.out.print("*");
			}
			space--;
			star+=2;
			
			System.out.println();
			
		} //여기까지가 피라미드
		
		line-=1;
		space=1;
		star=number-2;
		//System.out.println("space : " +space +" / star: "+star+" / line: "+ line);
		
		for(f=0;f<line;f++) {
			for(t=0;t<space;t++) { //공백
				System.out.print(" ");
			}
			for(p=0;p<star;p++) {
				System.out.print("*");
			}
			System.out.println();
			
		space+=1;
		star-=2;
		}
	}

}

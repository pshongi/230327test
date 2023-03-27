package loopFor;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력 :");
		System.out.print("첫번째 수");
		int num1 = sc.nextInt();
		System.out.print("두번째 수");
		int num2 = sc.nextInt();
		System.out.println();
		int total = 0;
		int count =0;
		System.out.println("num1: " +num1 +" / num2: "+num2 +"로 시작");
		
		/*
		 * if(small>big){
				int tmp = small
				big=small
				small=big
		*/
		
		
		
		
		if(num1>num2) {
			count = num1-num2+1;
			for(int i =0; i<count ;i++) {
				total +=num2;
				System.out.println("num1,num2,total : "+num1+","+num2+","+total);
				num2+=1;
			}	
		}else if(num1<num2) {
			count = num2-num1+1;
			for(int i =0; i<count ;i++) {
				total +=num1;
				System.out.println("num1,num2,total : "+num1+","+num2+","+total);
				num1+=1;
			}
			
		}else if(num1==num2)
			total=num1;
			System.out.println(total);
		System.out.println("계산 후 total : " + total);

	}

}

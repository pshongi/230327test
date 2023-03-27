package inputs;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	//체중
	float weight ;
	//키
	float height ;
	
	System.out.println("체중 입력 : " );
	weight = sc.nextFloat();
	System.out.println("키 입력 : " );
	height = sc.nextFloat();
	System.out.println();
	
	System.out.println("당신의 키는" + height);
	System.out.println("당신의 몸무게는" + weight);
	
	sc.close();
	}

}

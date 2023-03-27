package inputs;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까?\t : ");
		String name = sc.next();
		System.out.print("당신의 국어점수는\t:");
		int rnr = sc.nextInt();
		System.out.print("당신의 국어점수는\t:");
		int tnt = sc.nextInt();
		System.out.print("당신의 국어점수는\t:");
		int dud = sc.nextInt();
		int total = rnr + tnt +dud;
		
		System.out.println("=============================");
		System.out.println("이름:\t" + name);
		System.out.println("=============================");
		System.out.println(name+"의 국어점수 :" + rnr);
		System.out.println(name+"의 영어점수 :" + tnt);
		System.out.println(name+"의 수학점수 :" + dud);
		System.out.println("=============================");
		System.out.println("합계\t:"+total );
		System.out.println("=============================");
		
		sc.close();
		
	}

}

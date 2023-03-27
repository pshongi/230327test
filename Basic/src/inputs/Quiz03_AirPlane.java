package inputs;

import java.util.Scanner;

public class Quiz03_AirPlane {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int CTime= 0;
		int Charge=30000;
		int ExtraCharge=5000;
		int totalCharge;
		System.out.println("비행시간 입력");
		int runTime = sc.nextInt();
		
		if(runTime>30) {
			int tmp2 = ((int)((runTime-30)/10))+1;
			System.out.println(tmp2 + "  : tmp2의 값");
			
			totalCharge=(ExtraCharge*tmp2)+Charge;
			System.out.println("요금은 "+totalCharge +"입니다.");

		}else {
			System.out.println("요금은 "+Charge +"입니다.");
		}
		
		
		
	}
}

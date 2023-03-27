package inputs;

import java.util.Scanner;

public class Quiz03_SnackPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.println("과재 갯수 입력:");
		
		int snackCount = sc.nextInt();
		int snackPrice =1000;
		int totalPrice;
		
		if(snackCount>=10 &&100>snackCount) {
			totalPrice = (int)(snackCount*snackPrice*0.9);
		}else if(snackCount>=100) {
			totalPrice = (int)(snackCount*snackPrice*0.88);
		}
		
		
	}

}

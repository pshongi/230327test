package inputs;

import java.util.Scanner;

public class Quiz03_CoffeePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int coffeeCount = sc.nextInt();
		int coffeePrice = 2000;
		int totalPrice;
		
		if(coffeeCount>11) {
			totalPrice = (coffeeCount*coffeePrice)-20000;
		}else {
			totalPrice=(coffeeCount*coffeePrice);
		}
		System.out.println("커피값은" + totalPrice);
		
	}

}

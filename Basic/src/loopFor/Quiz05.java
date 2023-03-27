package loopFor;

import java.math.BigInteger;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total =0;
		for(int i=1; i<=1000;i++) {
			if(i%4==1 && i%6==1) {
				total+=i;
			}
		}
		System.out.println("총합"+ total);
		System.out.println("------------------------------------------------");
		
		total=1;
		int amount=2;
		
		
		for(int i=1;i<5;i++) {
			total+=amount;
			amount*=2;
		}
		
		System.out.println(total +" => total 금액");
		System.out.println("------------------------------------------------");
		
		total=0;
		//int seed=1;
		/*
		 * for(int i = 1; i<=64;i++) { total +=seed; seed*=2;
		 * System.out.println(i+"번째 사각형 :"+total); }
		 * System.out.println("밀알 총 개수 : "+total);
		 */
		BigInteger milTotal = new BigInteger("0");
		BigInteger milSeed = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger multi= BigInteger.ONE;
		
		for(int i =1; i<=65; i++) {
			milTotal = milTotal.add(milSeed);
			milSeed = milSeed.multiply(two);
			System.out.println(i+"번째 사각형"+milTotal);
		}
		System.out.println("밀알 총 갯수 : " + milTotal);
	}

}

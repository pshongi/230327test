package loopWhile;

import java.util.Random;

public class Exam04_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math.random();//실수
		
		
		//자료형 선택
		Random r = new Random(); 
		r.nextInt(); //정수의 난수
		r.nextDouble();//실수의 난수
		
			for(int i = 1;i<=3;i++) {
				System.out.println(Math.random());
			}
		
			for(int i = 1;i<=3;i++) {
				System.out.println((int)(Math.random()*10)+5); //5~15
			}
			for(int i = 1; i<=3; i++)
				System.out.println("r.nextINt : "+ r.nextInt(10)+1); //1~10
			
			int begin =33;
			int end=89;
			
			for(int i =1; i<=3;i++)
				System.out.println(r.nextInt(end-begin+1)+begin);
			
			for(int i=1;i<=3;i++)
				System.out.println((int)(Math.random()*(end-begin+1))+begin);
			
			

	}

}

package loopWhile;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input =6;
		int clap =0;
		int data =1; //차례대로 증가하는 범위의 숫자들.
		int tmp1=1;
		int total=0;
		int tmp;
		//System.out.println(tmp);=>6
		//System.out.println("total "+ total+ "data :" + data );
		
		//조건 : data가 input보다 작을동안 계속 돈다.
		input+=1;
		while(data<input) {
			
			if(input<10) {//조건 : input이 10보다 작을때
				if(data%3==0)
					total+=(data/3);
			}else if(input>10) {//input이 10보다 클때////////////////////////////////////
				while(true) {//주어진 수의 3의 배수 구함
					tmp = (data%10);//오른쪽 끝 수 추출
					if(tmp%3==0) {
						total+=tmp/3;
						data/=10;
					}else {
						data/=10;
					}
					if(data<0) 
						break;
					
				}
			}//else if(input>100/////////////////////////////////////////////////	
			data++;
		}
		System.out.println("total "+ total+ "/ data :" + data );
	

	}

}

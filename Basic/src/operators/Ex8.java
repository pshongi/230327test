package operators;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data1 =55, data2 =22 , or = 0 , and = 0, xor  = 0;
		
		/*
		 * 55의 2진수 : 0011 0111
		 * 22의 2진수 : 0001 0110
		 * --------------------
		 * or연산		: 0011 0111    ---> 55가 나옴
		 * and연산	: 0001 0110    ---> 22가 나옴
		 * xor연산	: 0010 0001    ---> 33가 나옴
		 */
		or = data1 | data2;  // | 는 하나의 비트를 비교하더라도 1이 존재한다면 1이 된다.
		and = data1 & data2; //& 는 두 비트 모두가 1인 경우만 일이 된다.
		xor = data1 ^ data2; //xor 은 '같은 값'이면 0 서로 다른 값이면 1로 표기 
	
		System.out.println("data1 | data2 = "+ or);
		System.out.println("data1 & data2 = "+ and);
		System.out.println("data1 ^ data2 = "+ xor);
		
	}

}

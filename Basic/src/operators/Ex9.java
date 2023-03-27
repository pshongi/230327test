package operators;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//비트 연산자 , 쉬프트 연산자
		
		/*
		 * 0000 0001
		 * data = data << 1 ;
		 * 
		 * 000 0010 
		 * data <<=1;
		 * 0000 0100
		 * 0000 1000
		 * 0001 0000
		 * 0010 0000
		 * 
		 */
		// << 는 이진수에서 1의자리 숫자를 몇칸 움직일지를 나타낸다.
		
		int data = 1;
		data <<= 1;
		System.out.println("1. data <<=1 : "+ data);
		data <<=1;
		System.out.println("2. data <<=1 : "+ data);
		data <<=3;
		System.out.println("3. data <<=1 : "+ data);
		System.out.println();
		
		data>>=1;
		System.out.println("1.data >>=1 : "+ data);
		data>>=1;
		System.out.println("2.data >>=1 : "+ data);
		data>>=1;
		System.out.println("3.data >>=1 : "+ data);
		
		
	}

}

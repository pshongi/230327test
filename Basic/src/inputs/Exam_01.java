package inputs;

import java.io.IOException;
import java.util.Scanner;

public class Exam_01 {

	/*
	 자바와 자바가 아닌것들(other)과 데이터 교류를 할때 예외가 발생하는 경우가 있고 이런 경우 주로 예외처리된다. 
	 */
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		//throws IOException 예외 전가 매서드에 붙어서 나올때
		System.out.println("여기는 system.in.read / 입력 : ");
		int data = System.in.read();
		System.out.println("여기는 system.in.read로출력 : "+ data);
		
		//예외(Exception) 처리
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //이걸 통해서 입력을 받을 수 있다.
		
		/*
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		*/
	}

}

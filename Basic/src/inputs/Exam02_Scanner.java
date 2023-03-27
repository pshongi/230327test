package inputs;

import java.util.Scanner;

public class Exam02_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String data;
		System.out.print("여기에 입력 : ");
		data =sc.next();  //sc.nextInt();
		System.out.println("출력결과 : " + data);
		
		sc.nextLine(); //위에서 입력했던 데이터가 buffer 에 남아 있기에 buffer 청소용
		System.out.println("데이터입력: ");
		data = sc.nextLine(); //sc.next의 경우 띄어쓰기를 사용하면 띈 시점에서 입력이 끝났다고 생각한다. 그래서 띄어쓰기를 포함한 데이터를 받기 위해 Line 사용
		System.out.println("입력받은 데이터 : "+ data);
		System.out.println("끝");
		sc.close(); //자바이외의 파일을 주고받을 때 파일의 손상을 막기 위해.
		
		
		/*문자열을 입력 받을 때 사용하는 메서드.
		 input.next(), -->공백과 줄바꿈을 입력 문자열의 끝으로 사용
		 input.nextLine(); -->줄바꿈만 입력 문자열의 끝으로 사용
		 
		 */
		
		
	}

}

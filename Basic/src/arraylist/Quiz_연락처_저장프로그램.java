package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_연락처_저장프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> number = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("1.연락처등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.print(">>>>>>");
			int cases = input.nextInt();
			
			switch(cases) {
			case 1 : //연락처 등록
				System.out.print("이름을 입력하세요 : ");
				String nameTmp = input.next();
				name.add(nameTmp);
						
				System.out.print("연락처를 등록하세요 : ");
				String numTmp = input.next();
				number.add(numTmp);
				
				break;
			case 2 : //연락처 보기
				System.out.print("이름을 입력하세요 : ");
				nameTmp = input.next();
				int index = name.indexOf(nameTmp);
				numTmp = number.get(index);
				System.out.println(nameTmp+"의번호는 : " + numTmp );
				
				break;
			case 3 : //연락처 삭제
				System.out.println("삭제할 이름을 입력하세요 : ");
				nameTmp = input.next();
				index = name.indexOf(nameTmp);
				name.remove(index);
				number.remove(index);
				System.out.println("삭제되었습니다.");
				
				break;
			case 4 : 
				System.out.println("모든연락처 보기");
				
				
				
				break;
			case 5 : //종료
				System.out.println("시스템을 종료합니다.");
				flag = false ;
				break;
			}
			
			
			
		}
		
		
	}	

}

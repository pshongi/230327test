package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<String> nameL = new ArrayList<>();
		ArrayList<String> numL = new ArrayList<>();
		ArrayList<String> emailL = new ArrayList<>();
		
		
		String name ="";
		String num = "";
		String email ="";
		int index = 0;
		
		boolean flag=true ;
		boolean flag1=true;
		while(flag) {
		System.out.println("========================");
		System.out.println("1. 연락처 등록");
		System.out.println("2. 연락처 검색");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 모두 보기");
		System.out.println("5. 종료");
		System.out.print(">> ");
		String select = sc.next();
		
		switch(select) {
			case "1": 
				System.out.println("==회원등록==");
				System.out.println("1.이름입력 : ");
				name = sc.next();
				nameL.add(name);
				System.out.println("2.전화번호 : ");
				num = sc.next();
				numL.add(num);
				System.out.println("numL의 index : " + numL.indexOf(num));
				
				while(true) {
					System.out.println("3.email입력 : ");
					email = sc.next();
					
					if(emailL.contains(email)) {
						System.out.println("이미 등록된 번호 입니다. 다시 입력해주세요");
						continue;
					}else {
						
						emailL.add(email);
						System.out.println("이메일 인덱스 ? : "+emailL.indexOf(email)); 
						break;
					}
				}
				
				break;
		
			case "2":
				System.out.println("검색이메일 입력");
				email = sc.next();
				if(emailL.contains(email)) {
					index = emailL.indexOf(email);
					System.out.println("이름 : "+nameL.get(index)+" 연락처 :"+numL.get(index));
					
				}else {
					System.out.println("등록된 정보가 없습니다.");
				}
				
				break;
			case "3":
				System.out.println("검색이메일 입력");
				email = sc.next();
				if(emailL.contains(email)) {
					index = emailL.indexOf(email);
					nameL.remove(index);
					numL.remove(index);
					emailL.remove(index);
					System.out.println("삭제가 완료되었습니다.");
					
				}else {
					System.out.println("등록된 정보가 없습니다.");
				
				}
				break;
			case "4":
				
				
				break;
			case "5":
				
				
				break;
		}
		
		}
	}

}

package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> user1 = new HashMap<>(); //id ,name
		HashMap<String, String> user2 = new HashMap<>(); //id ,password.
		Scanner sc = new Scanner(System.in);
		
		
		//변수
		boolean flag = true ; 
		String id,pw,name,input1,key="";
		
		
		//임시데이터
		user1.put("kk123","김창식"); user2.put("kk123", "12123");
		user1.put("dd123","박공식"); user2.put("dd123","abc3232");
		user1.put("aa123","곽억두"); user2.put("aa123","ff1");
		user1.put("dd312","이덕춘"); user2.put("dd312", "ktkt");
		
		
		
		while(flag) {
		System.out.println("==회원관리프로그램==");
		System.out.println("1.회원등록");
		System.out.println("2.회원검색");
		System.out.println("3.회원삭제");
		System.out.println("4.회원 모두 보기 ");
		System.out.println("5.비밀번호 수정");
		System.out.println("6.프로그램 종료");
		System.out.print(">>>");
		String input = sc.next();
		
		switch (input) {
		
		case "1":
			System.out.print("id를 입력하세요 : ");
			id = sc.next();
			System.out.print("pw를 입력하세요 : ");
			pw = sc.next();
			System.out.print("이름을 입력하세요");
			name = sc.next();
			
			user1.put(id, name);//user1에 데이터 입력
			user2.put(id, pw); //user2에 데이터 입력
			
			System.out.println("입력 완료");
			
			break;
		case "2":
			System.out.println("검색할 회원 ID 검색");
			input1 = sc.next(); //key 값
			name = user1.get(input1);
			pw = user2.get(input1);
			System.out.println(input1 + " 의 이름은 : "+name + " 비밀번호는 : "+ pw);
			
			break;
		case "3":
			System.out.println("삭제할 회원 ID 검색");
			System.out.print(">>>");
			input1 = sc.next();
			user1.remove(input1);
			user2.remove(input1);
			System.out.println("삭제완료");
			
			break;
		case "4":
			System.out.println("회원 모두 보기 ");
			
			Iterator<String> arr1  = user1.keySet().iterator();
			Iterator<String> arr2  = user2.keySet().iterator();
			
			while(arr1.hasNext()) {
				key= arr1.next();
				System.out.println("이름 : " +user1.get(key)+" / ID: "+key+" / pw : "+user2.get(key));
			}
			break;
		case "5":
			System.out.print("수정할 ID 입력 : ");
			key = sc.next();
			arr1  = user1.keySet().iterator();
			arr2  = user2.keySet().iterator();
			
			System.out.println("이름 : " +user1.get(key)+" / ID: "+key+" / pw : "+user2.get(key));
			System.out.print("수정 비밀번호 입력 : ");
			pw = sc.next();
			user2.put(key, pw);
			System.out.println("수정된 내용? 이름 : " +user1.get(key)+" / ID: "+key+" / pw : "+user2.get(key));
			
			break;
		case "6":
			System.out.println("프로그램 종료");
			
			flag =false ;
			break;
		}
		
		
		
		
		
		}//기본 시스템 while
		

	}

}

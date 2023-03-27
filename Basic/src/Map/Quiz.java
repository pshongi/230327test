package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * HashMap을 이용하여 간단한 메뉴판 만들기.
		 * 1.메뉴등록 : 존재하는 메뉴면 존재하는 메뉴입니다.
		 * 
		 * 
		 * 1.메뉴등록
		 * 2.메뉴별 가격보기
		 * 3.종료
		 */
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> menu = new HashMap<>();
		
		String input ="";
		
		menu.put("김밥","1000원");
		menu.put("충무김밥","2000원");
		menu.put("라면","3000원");
		menu.put("우동","4000원");
		
		
		boolean flag = true;
		while(flag) {
			System.out.println("==주문프로그램==");
			System.out.println("1.메뉴등록");
			System.out.println("2.메뉴별 가격보기");
			System.out.println("3.종료");
			System.out.print(">>>>");
			input = sc.next();
			
			switch(input) {
			case "1":
				System.out.println("등록할 메뉴를 입력해주세요");
				String name = sc.next();
				if(menu.containsKey(name)) {
					System.out.println("이미 있는 메뉴 입니다.");
					break;
				}
				
				System.out.println("메뉴의 가격을 입력해주세요");
				String price = sc.next();

				menu.put(name, price);
				System.out.println("입력완료");
				break;
				
			case "2":
				System.out.println("현재 등록되어 있는 메뉴는 ? ");
				Iterator<String> itk = menu.keySet().iterator();
				
				while(itk.hasNext()) {
					String key=itk.next();
					System.out.println(key+"\t : "+ menu.get(key));
					}
				
				
				break;
			case "3":
				System.out.println("종료합니다.");
				
				flag=false;
				break;
				
			
			}
		}
		

	}

}

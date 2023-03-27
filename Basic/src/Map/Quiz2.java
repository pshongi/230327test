package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> menu = new HashMap<>();
		
		String input ="";
		
		menu.put("김밥","1000원");
		menu.put("충무김밥","2000원");
		menu.put("라면","3000원");
		menu.put("우동","4000원");
		boolean flag = true;
		boolean flag2 = true;
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
					
				
				while(flag2) {
					System.out.println("1.수정 / 2.삭제 /3.나가기");
					System.out.print(">>>");
					input = sc.next();
					
					switch(input){
					
					case "1" :
						System.out.println("수정할 상품명을 입력해주세요");
						String nm = sc.next();
						System.out.println("수정할 가격을 입력해주세요");
						String tmprice =sc.next();
						menu.put(nm,tmprice);
						break;
					case "2":
						System.out.println("삭제할 항목을 입력해주세요");
						nm = sc.next();
						menu.remove(nm);
						System.out.println("삭제되었습니다.");
						
						break;
						
					case "3":
						System.out.println("메뉴로 돌아갑니다 ==>");
						flag2=false;
						break;
					
					}
					
				}//flag2 while//////////////////
				
				
				
				break;
			case "3":
				System.out.println("종료합니다.");
				
				flag=false;
				break;
				
			
			}
		}
		

	}

}

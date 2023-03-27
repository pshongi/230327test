package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		
		list.add("김상수");
		list.add("이변수");
		list.add("박참조");
		list.add("조클래스");
		list.add("지컬렉션");
		
		System.out.println("변경할 위치");
		int index = sc.nextInt();
		
		System.out.println("변경 데이터 : ");
		String element = sc.next();
		list.add(index,element);
	//	list.set(index,element);
		
		System.out.println(list);
		System.out.println("====결과====");
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}
}

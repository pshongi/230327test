package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		String data1 = "김변수";
		String data2 = "이변수";
		String data3 = "박변수";
		String data4 = "최변수";
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add("최변수");
		
		System.out.println("현재 입력된 데이터의 수 : "+ list.size());
		System.out.println("담겨있는 모든 데이터" + list);
		String tmp = sc.next();
		
		if(list.contains(tmp)) {
			System.out.println(tmp+"는 존재합니다.");
			
		}else
			System.out.println(tmp+"는 존재하지않습니다..");
		
		if(list.indexOf(tmp) != -1)
			System.out.println(list.get(0)+ "는 존재합니다.");
		else
			System.out.println(tmp + "는 존재하지 않습니다.");
		
		
		
		
	}	

}

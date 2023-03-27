package arraylist;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		String data1 = "김변수";
		String data2 = "이변수";
		String data3 = "박변수";
		String data4 = "최변수";
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add(data4);
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("size() : "+ list.size());
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

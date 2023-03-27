package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		//Object 자료형
		Object data1 = 123;
		Object data2 = 1.23;
		Object data3= "123";
	
		
		list.add(123);
		list.add(1.23);
		list.add("문자열");
		System.out.println(" 저장된 데이터 : "+ list);
		
		int data4 = (int)list.get(0);
		double data5 = (double)list.get(1);
		String data6 = (String)list.get(2);
	}

}

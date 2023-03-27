package arraylist;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		//<> 안에 들어가는 변수의 타입, 자료형 : 제너릭이라고 부른다.
		// 넣을 수 있는 자료형 : Wrapper Class의 자료형
		/*
		 Wrapper Class 종류
		 - Byte  : 
		 - Character
		 - Short
		 - Integer
		 - Long
		 - Float
		 - Double
		 - Boolean
		Array List 의 저장 값들은 모두 레퍼런스 (ref ) 참조값으로 저장한다.
		
		 
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Integer data1 = 123;
		Integer data2 = 345;
		Integer data3 = 1234556;
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		System.out.println(list);
		
		int data4 = list.get(0);
		Integer data5 = list.get(1);
		Integer data6 = list.get(2);
	
		for(Integer i : list) {
			System.out.println(i);
		}
		System.out.println("//////////////////////////////");
		for(int i = 0 ; i < list.size(); i++){	
			System.out.println(list.get(i));
			
		}
		
		
		
		
	//	list.add(123);
	//	list.add(123.3); -> x
	//	list.add("afs"); -> x
		
		
		
	}
}

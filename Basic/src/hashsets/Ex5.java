package hashsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Ex5 {
	//https://wakestand.tistory.com/247
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet();
		
		hs.add("1.대부");
		hs.add("2.반지의 제왕 ");
		hs.add("3.겨울왕국");
		hs.add("4.여인의향기");
		hs.add("5.해리포터");
		hs.add("6.공공의적");
		
		for(String data : hs) {
			System.out.println(data);
		}
		
		System.out.println();
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			String data2=it.next();
			System.out.println(data2);
		}
		
		System.out.println();
		ArrayList<String> list = new ArrayList<>(hs);
		System.out.println(list);
	
		list.sort(null);
		System.out.println(list); //오름차순 정렬
		
		Collections.sort(list); //오름차순 정렬
		System.out.println("오름차순 : " + list);
		Collections.reverse(list);//내림차순  ( 오름차순 이후에 ) 
		System.out.println("내림차순 : "+list );
	}

}

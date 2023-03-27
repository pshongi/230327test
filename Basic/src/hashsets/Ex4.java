package hashsets;

import java.util.HashSet;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		
		System.out.println("is.Empty() : "+ hs.isEmpty());
		boolean bool;
		bool=hs.add("라면"); System.out.println(bool);
		bool=hs.add("고길동"); System.out.println(bool);
		bool=hs.add("현대인"); System.out.println(bool);
		bool=hs.add("고길동"); System.out.println(bool);
		
		
		System.out.println("is.Empty() : "+ hs.isEmpty());
		
		if(hs.contains("고길동")) {
			System.out.println("데이터가 존재합니다.");
		}else {
			System.out.println("데이터가 존재하지않습니다.");
		}
	}

}

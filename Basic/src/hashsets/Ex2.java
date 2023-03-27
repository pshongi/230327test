package hashsets;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		//Hashset은 중복된 데이터를 저장하지 않음.
			hs.add(123);
			System.out.println("HashSet1  ?: "+hs);
			hs.add(1.23);
			System.out.println("HashSet2  ?: "+hs);
			hs.add("순대");
			System.out.println("HashSet3  ?: "+hs);
			hs.add(1.23);
			System.out.println("HashSet4  ?: "+hs);
			hs.add("낌빱");
			System.out.println("HashSet4.5  ?: "+hs);
			hs.add(1234);
			System.out.println("HashSet5  ?: "+hs);
			
	}

}

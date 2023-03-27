package Map;

import java.util.HashMap;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap<>();
		
		
		hm.put(0, 1000);
		hm.put(1, "hello");
		hm.put("naver", "naver.com");
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(1));
		System.out.println(hm.get("naver"));
	}

}

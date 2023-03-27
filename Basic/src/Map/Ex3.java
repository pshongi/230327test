package Map;

import java.util.HashMap;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("선풍기", 10);
		map.put("에어컨", 100);
		map.put("건조기", 100);
		
		System.out.println("선풍기 : "+map.get("선풍기"));
		System.out.println("에어컨 : "+map.get("에어컨"));
		System.out.println("건조기 : "+map.get("건조기"));
		System.out.println("게임기 : "+map.get("게임기"));

	}

}

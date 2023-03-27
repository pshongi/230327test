package Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		map.put("선풍기", 10);
		map.put("에어컨", 100);
		map.put("건조기", 100);
		
		System.out.println("ㅋㅣ입력 : ");
		String key =sc.next();
		System.out.println("값입력 : ");
		int value = sc.nextInt();
		
		System.out.println(map);
		System.out.println(key+" 키 검색 결과"+ map.containsKey(key));
		System.out.println(value+" 값 검색 결과"+ map.containsValue(key));
		
		
		
	}
}

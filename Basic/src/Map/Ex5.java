package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		map.put("선풍기", "10");
		map.put("에어컨", "100");
		map.put("건조기", "100");
		map.put("선풍기", "1000");
		
		Iterator<String> itk = map.keySet().iterator();
		
		while(itk.hasNext()) {
			String key=itk.next();
			System.out.println(key+" : "+ map.get(key)+"ㅇㅇㅇ");
			}
		Iterator<String> itv = map.values().iterator();
		while(itv.hasNext()) {
			String value = itv.next();
			System.out.println(value);
		}
		
		
		
	}

}

package hashsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * 로또번호 찾기
		 */
		Random r = new Random();
		int num=0;
		HashSet<Integer> arr = new HashSet<>();
		
		while(true) {
			num =r.nextInt(10)+1;
			if(!arr.contains(num)) {
				arr.add(num);
				
			}
			
			if(arr.size()==6) {
				break;
			}
		}
		System.out.println("로또 번호는 :" + arr);
		
		
	}
}

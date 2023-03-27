package strings;

import java.util.Arrays;

public class Quiz3_정규표현식 {
	public static void main(String[] args) {
		//FF590-2DX83-M81LZ-XDM7E-MKUT4  => 965
		String Q = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		String[] array = Q.split("-");
		int a = 0;
		System.out.println(Arrays.toString(array));
		
		for(int i = 0 ; i <array.length ;i ++) {
			array[i] = array[i].replaceAll("[^0-9]","");
		}
		
		for(int i = 0 ; i < array.length ; i ++) {
			a += Integer.parseInt(array[i]);
		}
		System.out.println("a는 ?  : " + a);
		
		
		
	}
}

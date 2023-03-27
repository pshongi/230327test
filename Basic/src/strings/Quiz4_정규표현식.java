package strings;

import java.util.Arrays;

public class Quiz4_정규표현식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년";
		System.out.println("====변경전 ====");
		System.out.println(str);
		
		str=str.replace("-", ":");
		str=str.replaceAll("[0-9][0-9][0-9][0-9]", "1999"); //4자리의 숫자를 찾아서 1999로 바꾸겠다.
		System.out.println("변경 후 ");
		System.out.println(str);
		

	}

}

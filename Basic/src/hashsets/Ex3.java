package hashsets;

import java.util.HashSet;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		
		boolean bool;
		
		bool=hs.add("라면"); System.out.println(bool); //true
		bool=hs.add("고길동"); System.out.println(bool); //true
		bool=hs.add("현대인");  System.out.println(bool); //treu
		bool=hs.add("고길동");  System.out.println(bool); //false	
		
		System.out.println("HashSet : " + hs);
		System.out.println(hs.remove("라면"));
		System.out.println(hs.remove("김밥"));
		System.out.println("HashSet : "+hs);
	
	
	}

}

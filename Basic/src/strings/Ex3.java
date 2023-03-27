package strings;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc defg";
		
		System.out.println(str.length()); //8
		System.out.println(str.charAt(str.length()-1)); //g
		System.out.println(str.charAt(0)=='a'); //true
		System.out.println(str.charAt(0)=='c'); //false
		System.out.println(str.charAt(0)-32); //65
		System.out.println((char)(str.charAt(0)-32)); //A
		
		String addStr;
		addStr = "";
		System.out.println(addStr); // (공백)    
		addStr +="b";
		System.out.println(addStr); //b
		
	}

}

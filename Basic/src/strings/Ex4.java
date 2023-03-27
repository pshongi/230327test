package strings;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Have a nice day   ");
		
		String result = str.trim(); //왼쪽 오른쪽 끝에 공백제거
		System.out.println(" --"+str+"--");
		System.out.println(" --"+result+"--");
		
		String[] split = result.split(" ");
		//for(int i = 0 ; i < split.length; i++
			System.out.println();
		
		//향상 for문
			for(String p : split) {
				System.out.println(p);
			}
			
		String replace = result.replace(" ", "^");
		System.out.println("result : "+ result);
		System.out.println("replace : "+ replace);
		
	}

}

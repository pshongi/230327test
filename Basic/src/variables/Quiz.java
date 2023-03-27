package variables;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "김말이";
		int age=20;
		float height=173.323f;
		short iq = 120;
		char grade =66;
		
		System.out.println("이름\t:\t"+name);
		System.out.println("나이\t:\t"+age);
		System.out.println("키\t:\t"+String.format("%.1f", height));
		System.out.println("아이큐\t:\t"+iq);
		System.out.println("등급\t:\t"+grade);
		
	}

}

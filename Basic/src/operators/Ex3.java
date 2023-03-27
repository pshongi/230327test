package operators;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("false || false : "+ (false || false)); //or 는 하나라도 참이 있으면 TRUE
		System.out.println("false || true : "+ (false || true));
		System.out.println("true || false : "+ (true || false));
		System.out.println("true || true : "+ (true || true));
		System.out.println();
		System.out.println("false && false : "+ (false && false)); // and 는 하나라도 거짓이 있으면 false
		System.out.println("false && true : "+ (false && true));
		System.out.println("true && false : "+ (true && false));
		System.out.println("true && true : "+ (true && true));
		System.out.println();
		System.out.println("!true : " + !true); //무조건 반대의 결과를 뱉는다
		System.out.println("!false : " + !false);
	}
}

package operators;

public class Ex6 {
	public static void main(String[] args) {
		int data1, data2, data3, data4;

		data1 = 10;  
		data2 = ++data1; // data2는 ++가 적용되고 data1값이 변동 된 후 data2에 값이 들어감
		
		data1 = 10;  
		data3 = data1++; // data3는 data1이 들어가고 data1의 값이 증가함  ★즉 data3의 증가값은 아무런 변화가 없음.

		
		
		System.out.println("data1 = "+data1);
		System.out.println("data2 = "+data2);
		System.out.println("data3 = "+data3);
		//System.out.println("data4 = "+data4);
		
		
	}
}

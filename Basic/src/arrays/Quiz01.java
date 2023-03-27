package arrays;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{10,54,13,17,25,30};
		int odd[]=new int[5];
		int even[]=new int[5];
		
	for(int i =0; i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println("arr["+i+"]는"+i+"이다=> 짝수");
		}else {
			System.out.println("arr["+i+"]는"+i+"이다=> 홀수");
		}
		
	
	
	}
	}
}

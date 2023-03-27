package aligns;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,8,2,7,6};
		
		for(int i = 0 ; i<arr.length -1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]> arr[j]){
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] +  " ");
			
		}
		System.out.println( );
		

	}

}

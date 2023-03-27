package strings;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = new String("Have a nice day Have a nice day Have a nice day");
		
		int[] indexs = new int[data.length()];
		int index = 0;
		
		for(int i =0 ; i<data.length(); i++) {
			if(data.charAt(i)=='a')
				indexs[index++]=i;
		}

			System.out.print("결과 : ");
			for(int i = 0 ; i <index; i++) {
				System.out.println(indexs[i]+ " ");
			}
			System.out.println();
	}

}

package loopFor;

public class Quiz10_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		int i, j , k,f;
		f=0;
		
		for(i=0;i<5;i++) {
			for(j=1;j<6;j++) {
				k=f+j;
				System.out.print(k+"\t");
				
			}
			f+=5;
			System.out.println();
		}

	}

}

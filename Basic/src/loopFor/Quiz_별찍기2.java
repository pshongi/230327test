package loopFor;

public class Quiz_별찍기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,f;
		
		
		int line = 39; //줄 수
		int star = (line-1)/2;
		int space = 1;
		int line1 =(line-1)/2;
		
		for(i=0;i<line1;i++) {
			for(j=0;j<star;j++) {
				System.out.print("*");
			}
			
			for(f=0;f<space;f++) {
				System.out.print(" ");
			}			
			for(k=0;k<star;k++) {
				System.out.print("*");
			}
			star-=1;
			space+=2;
			System.out.println();
		}
		
		for(i=0;i<line1+1;i++) {
			for(j=0;j<star;j++) {
				System.out.print("*");
			}
			for(j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(j=0;j<star;j++) {
				System.out.print("*");
			}
			star+=1;
			space-=2;
			System.out.println("");
			
			
		}
	
		
		
		


	}

}

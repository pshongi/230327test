package loopFor;

public class 별찍기퀴즈_강사정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,space,line,star;
		line=7;
		space =line/2;
		star=1;
		for(i=0;i<line; i++) {
			for(j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(j=0;j<star;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			if(i<line/2) {
				star+=2;
				space--;
			}else {
				star -=2;
				space++;
			}
		}
	}

}

package loopFor;

public class Quiz_방정식해구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =0;
		int y =0;
		
		for(x=0;x<100;x++) {
			for(y=0;y<=10;y++) {
				if(3*x+2*y==10) {
					System.out.println("x값은 :"+x +" / y값은 : "+y);
				}
			}
		}

	}

}

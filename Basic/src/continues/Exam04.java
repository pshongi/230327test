package continues;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=11;j<=15;j++) {
				System.out.println("i :"+i +", j: "+j);
				if(j==14)
					break;
			}
			if(j==14)
				break;
			System.out.println();
		}
	}

}

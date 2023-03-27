package loopFor;

public class dotdotdot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ★☆
		System.out.println("★☆☆☆☆ 찍기~");

		int i = 0;
		int j = 0;
		int count = 0;

		for (i = 1; i < 6; i++) {
			
			for (j = 1; j < 6; j++) {
				if ((i + j) == 6) {
					System.out.print("★");
				}else {
					System.out.print("☆");
				}
				

			}System.out.println("|");
		}
		for(i=1; i<6;i++) {
			
		}
		
		
	}

}

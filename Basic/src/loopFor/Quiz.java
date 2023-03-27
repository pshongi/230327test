package loopFor;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		int total =0;
		int k=0;
		int j=0;
		
		System.out.println("예제1번");
		
		for(i=0 ;i<4; i++) {
			System.out.println((i+1)+".hello");
		}
		System.out.println("예제2번");
		for(i=0;i<=10000;i++) {
			total+=i;
			if(total==528) {
				System.out.println("i값은 ? :"+i);
			}
		}
		
		
		System.out.println("============================================");
		System.out.println("예제3번");
		
		for(i=0;i<5;i++) {
			for(j=1;j<6;j++) {
				System.out.print((k+j)+"\t");
			}
			k+=(j-1);
			
			System.out.println();
		}
			
		}
	}



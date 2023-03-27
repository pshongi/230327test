package loopFor;

public class Exam02 {
	public static void main(String[] args) {
		
		int i , total = 0;
		
		for (i=1 ;i<=100;i++) {
			total +=i;
			System.out.println(i);
		}
		System.out.println("for 문이 종료된 뒤 i 의값은 ? "+total);
		
		total =0;
		for(i=0;i<=100;i+=2) {
			System.out.println(i +" : i 값");
			total +=i;
			
		}
		System.out.println("total 값은 / " + total);
		
		total=0;
		for(i=0;i<=100;i++) {
			if(i%2==1) {
				total+=i;
				
			}
		}
		System.out.println("total 값 : " + total );
	}
}

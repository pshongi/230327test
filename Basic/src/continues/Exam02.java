package continues;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ,sum=0;
		
		for(i=1;i<=100;i++) {
			if(i%2 ==0)
				continue;
			sum+=i;
		}
		System.out.println("홀수 합계" + sum);
	}

}

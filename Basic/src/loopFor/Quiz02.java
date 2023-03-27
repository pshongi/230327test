package loopFor;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int totalTmp = 0;
		int i = 0;
		int j = 0;

		for (i = 0; i < 16; i++) {
			total += i;

			if (i % 3 == 0) {
				if (i % 5 != 0) {
					System.out.println(" 조건에 걸리는 i는 : " + i);
					totalTmp += i;
				}
			}

		}
		System.out.println("totalTmp : " + totalTmp);
		System.out.println("total : " + total);
		total -= totalTmp;
		System.out.println(total + " 전체 수");
System.out.println("================================================================");
		total = 0;
		for (i = 1; i < 1000; i++) {
			if ((i+1) % 2 ==0) {
				if (total < 10000) {
					total += i;
					System.out.println( "total 값은 ? :" + total );
					System.out.println("i값은 ? for문 안의" + i);
				}else if(total>=10000){
					System.out.println("여기서 10000이나 10000보다 커짐: " +total);
					break;
				}
			}
		}
		System.out.println("i값은 ? : " + i +"//i-2 값은 : " +(i-2));
		

	}

}

package loopWhile;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day =0;
		int mouse = 2;
		int ssal=102000;
		
		while(true) {
			ssal = ssal-(20*mouse);
			day++;
			if(day%10==0) {
				mouse*=2;
				System.out.println("오늘의 날짜 : " +day);
				System.out.println("쥐새끼의 숫자 : " + mouse);
			}
			
			if(ssal<=0)
				break;
		}
		System.out.println("쌀이 다 사라진 오늘의 날짜는 ? : "+day);
		System.out.println("다 처먹은 쥐새끼의 숫자 : " + mouse);
		int total =0;
		int a =1;
		int b =2;
		int tmp=0;
		int flag= 0;
		while(true) {
			if(b%2==0) {
				total = total + a*b;
				System.out.println("aaaaa" + a);
				System.out.println("aaaaa" + b);
				
			}else {
				total = total - a*b;
				System.out.println("bbbbbbbbbbbbbbb" + a);
				System.out.println("bbbbbbbbbbbbbbb" + b);
				
			}
			if(total>100) {
				System.out.println(total);
				System.out.println("두 수는 ?" + a +"와"+b);
				break;
			}
			a++;
			b++;
		}
		
		
		
	}

}

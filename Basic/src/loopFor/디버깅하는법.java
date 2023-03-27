package loopFor;

public class 디버깅하는법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//디버깅 : 버그를 잡는 용도, 문법 x
		/*
		 * 디버깅 순서
		 * 1. 브레이크 포인트 설정(Ctrl+shift+b)
		 * 2. 디버깅 시작*F11
		 * 한줄씩 시작 (F6)
		 * 디버깅 종료(Ctrl + F2)
		 * 
		 * 3.실행하면 라인에 하이라이트가 켜지는데 실행을 할 ★예정 이라는 뜻
		 * 
		 * 
		 * 
		 */
		
		int i, j , k,f;
		f=0;
		
		for(i=0;i<5;i++) {
			for(j=1;j<6;j++) {
				k=f+j;
				System.out.print(k+"\t");
				
			}
			f+=5;
			System.out.println();
		}

	}

}

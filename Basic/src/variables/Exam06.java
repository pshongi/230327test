package variables;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=97; //-128~127
		short s =20;
		char c ='A';
		float f = 1.23f;
		
		
		//저장하기 위해선 왼쪽의 변수의 맞는 자료형으로 변환해줘야함
		s=b;
		c=(char)b; 
		s=(short)c;
		c=(char)s;
		f=(float)5.11;
		
	}

}

package doWhile;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data =1, total =0;
		do {
			total +=data;
			data++;
		}
		while(data<=10);
		System.out.println("합계 : "+ total);
	}

}

package conditions;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,data1,data2;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 수 입력 : ");
		data = sc.nextInt();
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		//System.out.println("큰 순서는" +data+","+data+","+data);

		if(data>data1 && data1>data2) {
			System.out.println("큰 순서는" + data+","+ data1+","+ data2);
		}else if(data>data1 && data>data2 && data1>data2) {
			System.out.println("큰 순서는" + data+","+ data1+","+ data2);
		}else if(data>data1 && data>data2 && data1<data2) {
			System.out.println("큰 순서는" + data+","+ data2+","+ data1);
		}else if(data<data1 && data1<data2) {
			System.out.println("큰 순서는" +data2+","+data1+","+data);
		}else if(data<data1 && data1>data2 && data>data2) {
			System.out.println("큰 순서는" +data1+","+data+","+data2);
		}else if(data<data1 && data1>data2 && data<data2) {
			System.out.println("큰 순서는" +data1+","+data2+","+data);
		}
		
	}
}

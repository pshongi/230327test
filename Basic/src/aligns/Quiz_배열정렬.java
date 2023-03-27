package aligns;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_배열정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력받은 수만큼 배열을 하라하고 배열에 값 입력 및 출력하기.
		//변수
		int arraylength;
		int i =0;
		///
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 값을 입력하세요 : ");
		arraylength = sc.nextInt();
		int[] array = new int[arraylength];
		System.out.println("배열이 생성되었습니다. 배열의 길이 : " + arraylength);
		System.out.println("데이터를 입력하세요");
		
		for(i=0;i<arraylength;i++) {
			System.out.print(i+"번쨰 데이터 입력 : ");
			int tmp = sc.nextInt();
			System.out.println();
			array[i]=tmp;
		}
		for(int k=0;k<array.length;k++) {
			for(int p =0 ; p<array.length;p++) {
				int tmp =0;
				if(array[k]<array[p]) {
					tmp = array[k];
					array[k]=array[p];
					array[p]=tmp;
					
				}
			}
		}
		
		
		System.out.println("배열데이터는 : " + Arrays.toString(array)+"입니다.");
		
		
		
		
		
	}

}

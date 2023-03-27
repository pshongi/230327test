package aligns;

import java.util.Scanner;

public class Quiz_나이순정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] age = new int[5];
		String[] name = new String[5];
		int i =0;

		
		System.out.println("===정보입력 프로그램===");
		for(i=0;i<5;i++) {
			System.out.println("=="+(i+1) + "번째 정보 입력==");
			System.out.print("이름입력 : ");
			name[i]=sc.next();
			System.out.print("나이 입력 : ");
			age[i]=sc.nextInt();
		}
		
		for(int k=0;k<name.length;k++) {
			for(int t=0;t<name.length;t++) {
				if(age[k]<age[t]) {
					String tmp1=name[k];
					int tmp2= age[k];
					
					name[k]=name[t];
					age[k]=age[t];
					
					name[t]=tmp1;
					age[t]=tmp2;
					
				}
				
			}
			
		}
		System.out.println("====출력=====");
		
		for(i=0;i<name.length;i++) {
			System.out.println(i+"정보");
			System.out.println("이름 : "+ name[i]+" / 나이 : "+age[i]);
			
		}
		
		
		
		
		
		
		
	}

}

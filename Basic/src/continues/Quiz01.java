package continues;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=0;
		String id="";
		String pw="";
		String chid="";
		String chpw="";
		
		boolean flag= true;
		while(flag) {
			System.out.println("=========================================================");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.나가기");
			System.out.println("=========================================================");
			System.out.print(">>>");
			i = sc.nextInt();
		
			
			switch(i) {
				case 1:
					System.out.println("1.회원가입");
					System.out.print("저장할 아이디 입력 : "); //admin admin
					id = sc.next();
					System.out.print("저장할 비밀번호 입력 : ");
					pw = sc.next();
					System.out.println("입력 완료 ");
					
					break;
					
				case 2:
					System.out.println("2.로그인");
					System.out.print("아이디를 입력해주세요 : ");
					chid = sc.next();
					System.out.print("비밀번호를 입력해주세요 : ");
					chpw = sc.next();
					
					System.out.println("id는"+id);
					System.out.println("pw는"+pw);
					System.out.println("chid는"+chid);
					System.out.println("chpw는"+chpw);
					
					if(id.equals(chid)) {
						if(pw.equals(chpw)) {
							System.out.println("로그인 성공 !!");
							break;
						}else {
							System.out.println("로그인 실패, id가 pw가 다름");
							break;
						}
						
					}else {
						System.out.println("로그인 실패,id가 다름");
						break;
					}
					
					
				case 3:
					System.out.println("프로그램을 종료합니다.");
					flag=false;
					break;
					
			}
		}
		
	}

}

package strings;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "It is a fun java programming";
		String result="";
		int gcount=0 ,acount = 0;
		
		for(int i = 0 ; i <str.length(); i ++) {
			if(str.charAt(i)=='a')
				acount++;
			else if(str.charAt(i)=='g')
				gcount++;
		}
		System.out.println("a의 갯수 : "+acount + " / g의 갯수  : " + gcount );
		
		
		//
		System.out.println("str 의 갯수 : " + str.length());
		String[] split = str.split(" ");
		
		for(int i = 0 ; i <split.length ;i++) {
		result  += split[i];
		}
		// 이거나 str.replace(" ","") 도 가능
		
		
		System.out.println("replcae 갯수 : "+result.length());
	}

}

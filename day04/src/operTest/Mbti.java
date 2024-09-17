package operTest;

import java.util.Scanner;

public class Mbti {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String msg ="당신의 mbti는??\n"
			+ "1.isfj\n"
			+ "2. infj\n"
			+ "3.esfp\n"
			+ "4.entp\n"
			+ "선택";
	String isfj ="차분하고 인내심이 강하다",
			infj ="통찰력이 높고 사람들에게 영감을 준다",
			esfp="그냥이상하다",
			entp="최고의 유형 짱이다",
			errMsg="잘못입력했습니다";
	String result=null;
	int  choice=0;
	
	
	System.out.println(msg);
	choice=sc.nextInt();
	
	result=choice==1?isfj:
		choice==2?infj:
			choice==3?esfp:
				choice==4?entp:errMsg;
	System.out.println(result);
		
}
}

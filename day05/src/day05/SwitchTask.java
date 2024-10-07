package day05;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice=0;
		String result=null;
		String msg="1부터 4까지 정수 입력";
		
		System.out.println(msg);
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:case 3:
			result="홀수 입니다";
			break;
		case 2: case 4:
			result="짝수 입니다";			
		break;
		default:
			result="문제를 다시 한 번 잘 읽으세용";
		}
		System.out.println(result);

	}

}

package ifTest;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String result;
		String ms1 = " 첫 번째 정수를 입력하세요";
		String ms2 = "두 번째 정수를 입력하세요";
		
		System.out.println(ms1);
		num1 = sc.nextInt();
		System.out.println(ms2);
		num2= sc.nextInt();
		
		if (num1>num2) {
			result="큰값"+num1;
		}else if (num2>num1) {
			result="큰값"+num1;
			
		}else {
			result="두 수는 같습니다.";
		}
		
		System.out.println(result);
	}
}

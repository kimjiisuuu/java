package operTest;

import java.util.Scanner;

/*
 * 정수 2개를 입력받아서 큰 수 출력하기
 */
public class OperTask1 {
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
		
		result = num1>num2?"큰 수는" +num1+"입니다":
			num1 ==num2?"두 수는 같습니다.":"큰 수는"+num2+"입니다";
		System.out.println(result);
	}

}

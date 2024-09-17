package operTest;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		String quizMsg = " 다음 중 음식이 아닌 것은?\n"
				+ "1.피자\n"
				+ "2.케이크\n"
				+ "3.불고기\n"
				+ "4.자바\n"
				+ "선택 >>";
		String resultMsg=null;
		int choice =0;
		Scanner sc = new Scanner(System.in);
		final int ANSWER =4;
		
		System.out.println(quizMsg);
		choice = sc.nextInt();
		
		resultMsg=choice==ANSWER?"정답":"오답";
		System.out.println(resultMsg);
		
	}
}

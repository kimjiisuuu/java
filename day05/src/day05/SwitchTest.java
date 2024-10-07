package day05;

public class SwitchTest {
	private static final int case1 = 0;

	public static void main(String[] args) {
		int number=3;
		boolean isTrue = true;
		double num =0.0;
		//단순값비교만 가능함, 실수나 boolean값은 비교 불가
		
		switch(number) {
		case 1:
			System.out.println("1이다");
			break;
		case 2:
			System.out.println("2이다");
			break;
		case 3:
			System.out.println("3이다");
			break;
		default : //if문의 else같은 개념임
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}

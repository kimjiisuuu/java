package whileTest;

public class DoWhileTest {

	public static void main(String[] args) {
		boolean isTrue = true;
		
//		while(isTrue) { //while 뒤에 변수 말고 false (변하지 않는 값)를 주면 데드코드
//						//false값은 항상 실행이 안 될 텐데 코드를 쓰는 의미가 없어서 오류남
//			System.out.println("while 문 이다");
//		}
//		
		do {  //while은 처음 조건을 검사하고 실행할 지 말지 검사한다면, 
			//do-while 은 처음에 조건검사 없이 무조건 한 번은 실행시킨다.
			System.out.println("do-while문 이다.");
		}while(isTrue);
	}
}

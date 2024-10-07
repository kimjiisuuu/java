package forTest;

import java.util.Iterator;

public class ForTest2 {

	public static void main(String[] args) {
		//이름을 10번 출력
		for (int i = 0; i < 10; i++) {
			System.out.println("김지수");
		}
		
		//이름을 10번 출력
		//0. 홍길동
		//1. 홍길동
		//2. 홍길동
		//...
		//9. 홍길동
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i +"홍길동");
		}
		
		
	}
}

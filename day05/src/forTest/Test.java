package forTest;

public class Test {

	public static void main(String[] args) {
		for(int i =0; i<10; i++) {
			if(i==3) {
		//	break; //break는 반복문을 탈출한다.
			continue; // continue는 바로 다음 반복으로 넘어간다. 밑에 출력문까지 안 감. 
						//밑에 있는 코드를 실행시키고 싶지 않고 다음 반복으로 넘어가고 싶을 때 사용
			}
			System.out.println(i);
		}
	}
}

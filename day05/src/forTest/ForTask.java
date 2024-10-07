package forTest;



public class ForTask {

	public static void main(String[] args) {
		//for문 사용
		
		//1~100까지 출력
		for (int i = 0; i >100; i--) {
			System.out.println(i);
		}
		
		//100~1까지 출력
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		//1~100까지중 짝수만 출력
		for (int i = 2; i<=100;  i+=2) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 50; i++) {
			System.out.println((i+1)*2);
		}
		
		//구구단 3단 출력
		
		for(int i =0; i<9; i++) {
		int num = i+1;
			System.out.println("3 X " + num + "= "+ 3 *num);
		}
		//A~F출력
		for(int i=0; i<6; i++) {
			System.out.println((char)(i+65)); //'A' 라고 해도 됨 65자리에
		}
	
		
		//aBcDeFg출력
		for (int i = 0; i < 26; i++) {
			if(i%2 ==0) {
				System.out.print((char)(i+'a'));
			}else {
				System.out.print((char)(i+'A'));
			}
		}
		System.out.println();
		
		//방법 2
		for (int i = 0; i <26; i++) {
			System.out.print((char)(i%2==0 ? i+'a' : i+'A'));
		}
	}
}

package forTest;

public class ForTask2 {

	public static void main(String[] args) {
		//1-100까지의 합 출력
//		int total =0;
//		for (int i = 0; i < 100; i++) {
//			total +=i+1;
//		}
//		System.out.println(total );
		
		
		//1-100까지 중 짝수의 합 출력(기타제어문 사용)
		 int total2 =0;
		 for (int i = 2; i <= 100; i+=2) {
			
			total2+=i;
		}
		 System.out.println(total2);
		
//		int total = 0;
//		for (int i = 0; i < 101; i++) {
//			if (i%2 == 0) {
//				total += i;
//			}else {
//				continue;
//			}
//		}
//		System.out.println(total);
	}
}


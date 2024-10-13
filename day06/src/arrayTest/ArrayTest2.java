package arrayTest;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] arData = new int[10];
//		
//		arData[0] =1;
//		arData[1] =2;
		
		for (int i = 0; i < arData.length; i++) { //for문을 돌면서
//			arData[i] = i+1;			//배열의 i번째 방에다가 i를 할당해줘
			arData[i] = i;
			System.out.println(arData[i]);//배열의 i번째 방에 있는 값을 뽑아줘
		}
		
		//변수명.length를 쓰면 배열의 길이를 변경했을 때 
		//for문 안에서 길이를 일일이 수정할 필요 없이 자동으로 길이가 변경됨.
		//arData라는 배열의 길이를 나타내주기 때문
		
//		for (int i = 0; i < 10; i++) {
//			
//			System.out.println(arData[i]);
//		}
	}
}

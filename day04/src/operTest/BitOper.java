package operTest;

public class BitOper {

	public static void main(String[] args) {
		System.out.println(10&11);
		System.out.println(10|11);
		System.out.println(10^11);
		System.out.println(~10);
		System.out.println(~11);
		System.out.println(~32);
		
		System.out.println(10>>1);
		System.out.println(10>>2); //2칸 밀면 소숫점 자리는 버림
		System.out.println(10<<1); //빈칸은 양수일 때는 0으로 음수일 때는 1로 채워진다.
	}
}

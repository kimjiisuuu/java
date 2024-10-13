package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		

	
	
	//1-100까지 배열에 넣고 출력
	int[] ar1 = new int[100];
	for (int i = 0; i < ar1.length; i++) {
		ar1[i]=i+1;
		System.out.println(ar1[i]);
	}
	
	//100부터1까지 출력
	int[]ar3=new int[100];
	for (int i = 0; i < ar3.length; i++) {
		
		ar3[i] = ar3.length-i;	//길이 -1이 마지막 인덱스 번호임
		System.out.println(ar3[i]);
	}

	//1-10까지 값을 배열에 넣고 합 구하기
	int []ar2 = new int[10];
	int total =0;
	for (int i = 0; i < ar2.length; i++) {
		 ar2[i] = i+1; //1부터 10까지의 수를 ar2[i]에 담고
		total += ar2[i]; //total이라는 변수에 ar2[i]값들을 누적시켜서 저장해줘
	
	}
	System.out.println(total);
	
	//3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수 출력
	int []arMath = new int[3];
	Scanner sc = new Scanner(System.in);
	int total2 =0;
	String msg = " 번 학생의 수학점수 >>";
	
	for (int i = 0; i < arMath.length; i++) {
		
	}
	
	
	
	
	
	
	
	
	
	}// main

}// class

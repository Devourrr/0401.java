package Week2.day4;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열
				// 문제 : 국어성적 5개를 입력받아서 => 평균 출력 , 배열 필요 x
				// 문제2: 국어성적 5개를 입력받아서 => 평균과 함께 성적 다 출력
				
				//자료명세, 출력, 입력, 처리
				//처리과정
				//반복
				// 성적을 입력
				// 성적을 누적
				// 평균을 구한다
				// 평균을 출력한다
		double avg;
		int sum=0;
		int[] scores = new int[5];	// 동일한 자료형 , 연속적으로 여러개 사용하는 것, 변수의 집합
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {	//5번 반복, 배열의 첨자로 사용할 예정
			scores[i] = sc.nextInt();
			sum = sum + scores[i];
		}
		avg = (double)sum / scores.length;	//정수 / 정수 => 정수만 가짐
		System.out.println(avg);
		for( int i=0; i< scores.length; i++) {
			System.out.println(scores[i]);
		}
//		for( int score : scores) {
//			System.out.println(score);
	}

}

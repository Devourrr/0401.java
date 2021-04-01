package Week2.day4;

import java.util.Scanner;

public class Ex_01 {

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
		int score, sum=0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5; i++) {
			score = sc.nextInt();
			sum += score; // sum+=score;
			
		}
		avg = sum / 5;
		System.out.println(avg);
		
	}

}

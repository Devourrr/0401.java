package Week2.day3;

import java.util.Scanner;

public class Ex_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~10까지
//		int sum=0;
//		for ( int i=1; i<=10; i++) {
//			
//			sum +=i; // sum= sum+1
//		}
//		
//		System.out.println(sum); f11이 출력단축키
	
		// 수 입력 => 그대로 출력 ( 입력받은 수가 0이 아닐때 까지 )
		/*
		int num;
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		while(num !=0) {
			System.out.println(num);
			num = sc.nextInt();
		}
		
		System.out.println("0을 입력하셨군요. 종료합니다");
	*/
		int num;
		Scanner sc = new Scanner(System.in);
		while(true) {
			num = sc.nextInt();
			if(num == 0) break;	// 탈출코드 break
			System.out.println(num);
		}
			System.out.println("0을 입력하셨군요. 종료합니다");
			
			
			
			
			
	}
	

}

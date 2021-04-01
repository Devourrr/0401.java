package Week2.day3;

public class Ex_for_star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 왼쪽 직삼각형
		for(int i=1; i<6; i++) { //1~5 증감반복 변수 i 생성 
			for(int j=1; j<=6-i; j++) //(6-1)5,(6-2)4,(6-3)3,(6-4)2,(6-5)1순서대로 6-i만큼 감소반복 변수 j 생성 
			{
				System.out.print("*");	 //i행*j열 * 출력
			}
			System.out.println(); //줄바꿈
			}
		}
	}



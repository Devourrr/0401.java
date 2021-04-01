
public class Ex_money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int P[] = new int[9]; //단위 화폐의 매수
		int T[] = new int[9]; //단위 화폐의 합계
		int C = 532560; //홍길동의 532560
		int R = C;
		int M = 10000;
		int SW = 1;
				
		for(int K=0; K<9; K++){
			P[K] = R/M;
			T[K] = T[K]+P[K];
			R = R-(P[K]*M);
			if (SW == 1) { // 1이면 10000원, 1000원,100원, 10원
				M = M/2;
				SW = 0;
				
		}
			else { 	//0이면 5000원, 500원, 50원
				M = M/5;
				SW = 1;
					}
			}
		for(int i=0; i<9; i++) {
		System.out.print(P[i]+"\t");
	System.out.println();


		System.out.println("오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원");
		}
	}
}
		

	
	





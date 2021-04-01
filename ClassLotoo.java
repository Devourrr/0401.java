package Week2.day4;

public class ClassLotoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[46];
		
		for(int i=0; i<46; i++)
		{
			ball[i] =+ i;
		}
		
		int temp;
		int j;
		
		for(int i=0; i<1000000000;i++) // 배열의 값이 잘 섞이도록 큰 반복횟수를 준다
		{
			j = (int)(Math.random()*45); // 0~44까지의 난수 발생
										// Math.random() 0.0~1보다 작은 실수형 난수 발생
										// ball[0]와 ball[j]의 값을 서로 바꾼다
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		for(int i=0; i<6; i++)
		{
			System.out.println(ball[i]);
		}
	}

}

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
		
		for(int i=0; i<1000000000;i++) // �迭�� ���� �� ���̵��� ū �ݺ�Ƚ���� �ش�
		{
			j = (int)(Math.random()*45); // 0~44������ ���� �߻�
										// Math.random() 0.0~1���� ���� �Ǽ��� ���� �߻�
										// ball[0]�� ball[j]�� ���� ���� �ٲ۴�
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

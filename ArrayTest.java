package Week2.day4;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] kor = {95,80,75,65,30}; // int kor = new int[5];
		int sum =0;
		double avg;
		for(int i = 0; i<kor.length;i++)
{
			sum = sum + kor[i];
			System.out.println(kor[i]);
}
			avg = sum / (double)kor.length; // ���� / ���� => �������� ������
											// ���� / (double) => ��� ������ ���
			System.out.println(avg);
			for(int i1=0; i1<kor.length; i1++)
			{
				System.out.println(kor[i1]);
			}
}
}



package Week2.day4;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭
				// ���� : ����� 5���� �Է¹޾Ƽ� => ��� ��� , �迭 �ʿ� x
				// ����2: ����� 5���� �Է¹޾Ƽ� => ��հ� �Բ� ���� �� ���
				
				//�ڷ��, ���, �Է�, ó��
				//ó������
				//�ݺ�
				// ������ �Է�
				// ������ ����
				// ����� ���Ѵ�
				// ����� ����Ѵ�
		double avg;
		int sum=0;
		int[] scores = new int[5];	// ������ �ڷ��� , ���������� ������ ����ϴ� ��, ������ ����
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {	//5�� �ݺ�, �迭�� ÷�ڷ� ����� ����
			scores[i] = sc.nextInt();
			sum = sum + scores[i];
		}
		avg = (double)sum / scores.length;	//���� / ���� => ������ ����
		System.out.println(avg);
		for( int i=0; i< scores.length; i++) {
			System.out.println(scores[i]);
		}
//		for( int score : scores) {
//			System.out.println(score);
	}

}

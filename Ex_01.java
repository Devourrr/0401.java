package Week2.day4;

import java.util.Scanner;

public class Ex_01 {

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

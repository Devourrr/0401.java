package Week2.day4;

import java.util.Scanner;

public class Memori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� �޸� ���� ��� (�����Ͻ����� �޸𸮸� ���� ���� ������)
		int a1,b1,c1,d1,f1;
		int a2,b2,c2,d2,f2;
		int a3,b3,c3,d3,f3;
		int a4,b4,c4,d4,f4;
		int a5,b5,c5,d5,f5;
		int a6,b6,c6,d6,f6;
		int a7,b7,c7,d7,f7;
		
		// int arr[100]; // �̷� ǥ���� ���ؾȵȴ�. �ڹٴ�
		
		//�������� �޸𸮸� ���� ���: ����ÿ� �迭�� ũ�Ⱑ ����
		// new �����ڸ� ���ؼ� �޸� ��û�Ѵ�
		//int arr[] = new int[cnt];
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���:");
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int arr[];	//int[]arr, int arr[]
		arr = new int[cnt];
		System.out.println( arr.length);
		
		for(int i=0; i< arr.length; i++)
		{
			System.out.print( i+1 + "��° �Է�:");
			arr[i]= sc.nextInt();
		}
		for(int i=0; i< arr.length; i++)
			System.out.println( arr[i]);
	}

}

package day01_basic;


import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		/*
		 * ���׿�����
		 * �׸��� 3��
		 * (���ǽ�) ? ���϶� : �����϶�
		 * ���ǽ��� �ݵ�� true or false
		 * �񱳿�����, �������� �ַ� ���
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
		String resultStr = num % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(num + "��/�� " + resultStr + "�Դϴ�.");
	}
}

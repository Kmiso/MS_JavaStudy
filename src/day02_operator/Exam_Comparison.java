package day02_operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		// �񱳿����� : �� ���� ���ϴ� ������, ���迬����
		// �񱳿����ڴ� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ��
		
		System.out.println("�񱳿����� ����");
		int a = 50;
		int b = 30;
		
		boolean result = a < b;
		System.out.println("(a < b)�� ��� : " + result);
		
		result = a > b;
		System.out.println("(a > b)�� ��� : " + result);
		
		result = a == b;
		System.out.println("(a == b)�� ��� : " + result);
		
		result = a != b;
		System.out.println("(a != b)�� ��� : " + result);
		
		// ¦�� Ȧ�� �Ǻ� ���α׷� ���� �� ���
		System.out.println();
		
		int num = 66;
		result = (num % 2 == 0);
		System.out.println("¦���ΰ���? : " + result);
	}
}

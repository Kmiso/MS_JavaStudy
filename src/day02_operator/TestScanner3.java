package day02_operator;

import java.util.Scanner;

public class TestScanner3 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ���.");
		String name = sc.next();
		
		System.out.println("�¾ ���� �Է����ּ���.");
		int month = sc.nextInt();
		
		System.out.println("Ű�� �Է����ּ���.");
		double height = sc.nextDouble();
		
		System.out.println("������ �Է����ּ���.");
		char gender = sc.next().charAt(0);
		
		System.out.println("�ּҸ� �Է����ּ���.");
		sc.nextLine(); // �ԷµǾ��� ���Ͱ��� ���� �� �ۼ��ϱ� ���� ��� (���� �� ����)
		String adress = sc.nextLine();
		// next(), nextLine() �Ѵ� ���ڿ� �Է¹޴µ�
		// nextLine()�� ������ �Է¹���.
		
		System.out.println();
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("�¾ ���� " + month + "�Դϴ�.");
		System.out.println("Ű�� " + height + "�Դϴ�.");
		System.out.println("������ " + gender + "�Դϴ�.");
		System.out.println("�ּҴ� " + adress + "�Դϴ�.");
	}
}

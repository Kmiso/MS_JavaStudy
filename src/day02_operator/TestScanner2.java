package day02_operator;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		// ���� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int iNum = sc.nextInt();
		// �Ǽ� �Է�
		System.out.print("�Ǽ��� �Է����ּ��� : ");
		double dNum = sc.nextDouble();
		// ���ڿ� �Է�
		System.out.print("���ڿ��� �Է����ּ��� : ");
		String inputStr = sc.next(); // nextLine() ���ڿ��� �޴µ� ���̰� �ִ�. (���� ����)
		// ���� �Է�
		System.out.print("���ڸ� �Է����ּ��� : ");
		char inputChar = sc.next().charAt(0); // nextChar() ����. 0 = ù��°
		
		System.out.println();
		System.out.println("�Է��� ������ : " + iNum);
		System.out.println("�Է��� �Ǽ��� : " + dNum);
		System.out.println("�Է��� ���ڿ��� : " + inputStr);
		System.out.println("�Է��� ���ڴ� : " + inputChar);
		
		sc.close();
	}
}
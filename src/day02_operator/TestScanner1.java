package day02_operator;

import java.util.Scanner;

public class TestScanner1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); // Scanner Ŭ������ �ִµ�, TestScanner���� ����Ұž�, ctrl + Space = import
		
		System.out.print("int ù��° ���� �Է����ּ��� : "); // Scanner �տ� ���̵� �޼���
		int input1 = sc.nextInt(); // �Է¹��� �ڵ� ���� 
		System.out.print("int �ι�° ���� �Է����ּ��� : ");
		int input2 = sc.nextInt();
		
		System.out.println("ù��° �Է��� ���� : " + input1);
		System.out.println("�ι�° �Է��� ���� : " + input2);
		
		int result = input1 + input2;
		System.out.println("�� ���� ���� " + result + "�Դϴ�.");
		
		sc.close(); // 7��° �ٿ��� ����� : ���� �ڿ��� ������� ���.
	}
}
package day02_operator;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �ϳ� �Է����ּ��� : ");
		char stringChar = sc.next().charAt(0);
		// boolean ��� - �ƽ�Ű�ڵ� ���
		boolean isTrue = (stringChar >= 65) && (stringChar <= 90);
		System.out.println("���� �빮�� Ȯ�� : " + isTrue);
		// boolean ��� - ���� ���
		boolean aTrue = (stringChar >= 'A') && (stringChar <= 'Z');
		System.out.println("���� �빮�� Ȯ�� : " + aTrue);
		// ���׿����� ��� - �ƽ�Ű�ڵ� ���
		String aString = (stringChar >= 65) && (stringChar <= 90) ? "true" : "false";
		System.out.println("���� �빮�� Ȯ�� : " + aString);
		// ���׿����� ��� - ���� ���
		String aChar = (stringChar >= 'A') && (stringChar <= 'Z') ? "true" : "false";
		System.out.println("���� �빮�� Ȯ�� : " + aChar);
	}
}

package day02_operator;

import java.util.Scanner;

public class Exercise_Triple1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int value = sc.nextInt();
		// boolean result = value > 0;
		// String resultStr = value > 0 ? "���" : "����";
		// ���׿����� ��ø
		String resultStr = value == 0 ? "0�Դϴ�." : value > 0 ? "����Դϴ�." : "�����Դϴ�.";
		System.out.println(value + "��/��" + " ��� Ȯ�� : " + resultStr);
	}
}

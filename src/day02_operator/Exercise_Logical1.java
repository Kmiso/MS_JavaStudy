package day02_operator;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է����ּ��� : ");
		int num = sc.nextInt();
		// boolean ���
		boolean isTrue = (num >= 1) && (num <= 100);
		System.out.println("1���� 100������ �����ΰ�? : " + isTrue);
		// ���׿����� ���
		String isResult = (num >= 1) && (num <= 100) ? "true" : "false";
		System.out.println("1���� 100������ �����ΰ�? : " + isResult);
		
		int a = 3;
		int b = 4;
		b = (++b) + (a--);
		System.out.println(a);
		System.out.print(b);
	}
}
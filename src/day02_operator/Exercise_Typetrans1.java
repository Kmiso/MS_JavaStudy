package day02_operator;

import java.util.Scanner;

public class Exercise_Typetrans1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է����ּ��� : ");
		// ���� ����ȯ
		int input = sc.nextInt();
		System.out.println("���ڷ� ��ȯ : " + (char)input);
	}
}
package day02_operator;

import java.util.Scanner;

public class Exercise_Triple2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int iNum1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int iNum2 = sc.nextInt();
		System.out.print("�����ڸ� �Է����ּ���. (+, -) : "); // �����ڴ� +, -, *, / �� �ѱ��ڴϱ� char ���
		char operator = sc.next().charAt(0);
		
		// �ڷ��� ��ȯ �ʿ� - int �ڷ����� String �ڷ������� ����Ϸ���, int + int + " " = int �ڷ���(����) �ڿ� ���ڿ� �ڷ���(Stirng)�� ���� ���ڷ� ����. �׷��� " " �ڿ� ���  
		String result1 = (operator == '+') ? iNum1 + iNum2 + "" : (operator == '-') ? iNum1 - iNum2 + "" : "�߸��Է��Ͽ����ϴ�."; 
		// �ڷ��� ��ȯ �ʿ� - int �ڷ����� String �ڷ������� ����Ϸ���, String.valueOf(int + int) = String.valueOf - int�� String �ڷ������� ��ȯ�����ִ� ��ɾ�
		String result2 = (operator == '+') ? String.valueOf(iNum1 + iNum2) : (operator == '-') ? String.valueOf(iNum1 - iNum2) : "�߸��Է��Ͽ����ϴ�.";
		System.out.println("��� : " + result1);
		System.out.println("��� : " + result2);
	}
}

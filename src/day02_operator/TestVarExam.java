package day02_operator;

public class TestVarExam {
	public static void main(String [] args) {

		System.out.println(1+1); // 2
		System.out.println(1.1+1.1);  // 2.2
		System.out.println('1'+'1'); // 98 - '1'�� ���ڷ� 49
		System.out.println("1"+"1"); // 11
		
		System.out.println(" "); // 
		System.out.println("Hello" + 'q'); // Helloq
		System.out.println("Hello" + 3.14); // Hello3.14
		System.out.println(10 + 20 + "Hello"); // 30Hello
		System.out.println(10 + "Hello" + 20); // 10Hello20
		System.out.println("Hello" + 10); // Hello10
		System.out.println(10 + " Hello"); // 10 Hello
		System.out.println(10 + (20 + "Hello")); // 1020Hello
		// �ڷ����� ������ �����, �ʱ�ȭ �� �� ���� ���
		System.out.println(" "); // 
		int iNum = 100;
		long lNum = 999900000000l;
		float fNum = 486.520f;
		double dNum = 567.890123;
		char fChar = 'A';
		String fStre = "Hello world";
		boolean result = true;
		
		System.out.println("������ �� : "+iNum);
		System.out.println("������ ��(9999��) : " + lNum);
		System.out.println("�Ǽ��� �� : " + fNum);
		System.out.println("�Ǽ��� �� : " + dNum);
		System.out.println("������ �� : " + fChar);
		System.out.println("���ڿ��� �� : " + fStre);
		System.out.println("���� �� : " + result);
		
	}
}

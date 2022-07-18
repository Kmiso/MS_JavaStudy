package day02_operator;

public class TestVarExam {
	public static void main(String [] args) {

		System.out.println(1+1); // 2
		System.out.println(1.1+1.1);  // 2.2
		System.out.println('1'+'1'); // 98 - '1'은 문자로 49
		System.out.println("1"+"1"); // 11
		
		System.out.println(" "); // 
		System.out.println("Hello" + 'q'); // Helloq
		System.out.println("Hello" + 3.14); // Hello3.14
		System.out.println(10 + 20 + "Hello"); // 30Hello
		System.out.println(10 + "Hello" + 20); // 10Hello20
		System.out.println("Hello" + 10); // Hello10
		System.out.println(10 + " Hello"); // 10 Hello
		System.out.println(10 + (20 + "Hello")); // 1020Hello
		// 자료형별 변수를 만들고, 초기화 한 후 값을 출력
		System.out.println(" "); // 
		int iNum = 100;
		long lNum = 999900000000l;
		float fNum = 486.520f;
		double dNum = 567.890123;
		char fChar = 'A';
		String fStre = "Hello world";
		boolean result = true;
		
		System.out.println("정수의 값 : "+iNum);
		System.out.println("정수의 값(9999억) : " + lNum);
		System.out.println("실수의 값 : " + fNum);
		System.out.println("실수의 값 : " + dNum);
		System.out.println("문자의 값 : " + fChar);
		System.out.println("문자열의 값 : " + fStre);
		System.out.println("논리의 값 : " + result);
		
	}
}

package day02_operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		// 비교연산자 : 두 값을 비교하는 연산자, 관계연산자
		// 비교연산자는 조건을 만족하면 true, 아니면 false를 반환함
		
		System.out.println("비교연산자 예제");
		int a = 50;
		int b = 30;
		
		boolean result = a < b;
		System.out.println("(a < b)의 결과 : " + result);
		
		result = a > b;
		System.out.println("(a > b)의 결과 : " + result);
		
		result = a == b;
		System.out.println("(a == b)의 결과 : " + result);
		
		result = a != b;
		System.out.println("(a != b)의 결과 : " + result);
		
		// 짝수 홀수 판별 프로그램 만들 때 사용
		System.out.println();
		
		int num = 66;
		result = (num % 2 == 0);
		System.out.println("짝수인가요? : " + result);
	}
}

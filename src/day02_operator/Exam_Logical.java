package day02_operator;

public class Exam_Logical {
	public static void main(String [] args) {
		System.out.println("논리연산자 예제 1");
		
		int a = 50;
		int b = 30;
		boolean result1, result2, result3, result4;
		
		result1 = (a != b) && (a < b);
		result2 = (a < b) || (a == b);
		result3 = (a > b) && (a != b);
		result4 = (a > b) || (a == b);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		
		System.out.println();
		System.out.println("논리연산자 예제 2");
		
		a = 70;
		b = 55;
		
		result1 = a == b || a++ < 100; // a = 71, b = 55
		result2 = a < b && --b < 55; // false && x, a = 71, b = 55
		result3 = a != b && b-- < a++; // a = 72, b = 54
		result4 = a ++ != b || b++ >= 85; // true || x, a = 73, b = 54
		
		System.out.println("result1 : " + result1); 
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("a = " + a);
		System.out.println("b = " + b);	
	}
}
package day02_operator;

public class Exercise_Typetrans2 {
	public static void main(String [] args) {
		int iNum1 = 3;
		double iNum2 = 2.2;
		// 자동 형변환
		double result = iNum1 + iNum2;
		System.out.println(result);
		// 강제 형변환
		System.out.println((int)result);
	}
}

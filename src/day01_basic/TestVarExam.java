package day01_basic;

public class TestVarExam {
	public static void main(String [] args) {
		// 자료형에 따라 변수에 들어가는 자료의 형태나 크기가 달라짐
		int iNum = 1000000000;
		long lNum = 999900000000l; // long은 제일 뒤에 'l' 꼭 붙여야함
		double dNum = 12.1;
		float fNum = 12.1f; // float은 제일 뒤에 'f' 꼭 붙여야함
		char firstNum = 'A';
		String firstStr = "abc";
		boolean result = false;
		
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(dNum);
		System.out.println(fNum);
		System.out.println(firstNum);
		System.out.println(firstStr);
		System.out.println(result);
	}
}

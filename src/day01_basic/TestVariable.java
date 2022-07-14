package day01_basic;

public class TestVariable {
	public static void main(String [] args) {
		// 1
		int kh; // 변수의 선언
		kh = 1; // 변수의 초기화(대입연산자를 통해서 값을 대입함)
		System.out.println(kh+1);
		kh = 2; // 변수는 변하는 수이기 때문에 2로 초기화
		System.out.println(kh+1);
		// 2
		int num1 = 1;
		int num2 = 2;
		
		System.out.println(num1+1); 
		System.out.println(num2+1);
	}
}
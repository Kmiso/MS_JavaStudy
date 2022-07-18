package day02_operator;

import java.util.Scanner;

public class Exercise_Triple2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int iNum1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int iNum2 = sc.nextInt();
		System.out.print("연산자를 입력해주세요. (+, -) : "); // 연산자는 +, -, *, / 등 한글자니까 char 사용
		char operator = sc.next().charAt(0);
		
		// 자료형 변환 필요 - int 자료형을 String 자료형으로 사용하려면, int + int + " " = int 자료형(숫자) 뒤에 문자열 자료형(Stirng)이 오면 문자로 변함. 그래서 " " 뒤에 사용  
		String result1 = (operator == '+') ? iNum1 + iNum2 + "" : (operator == '-') ? iNum1 - iNum2 + "" : "잘못입력하였습니다."; 
		// 자료형 변환 필요 - int 자료형을 String 자료형으로 사용하려면, String.valueOf(int + int) = String.valueOf - int를 String 자료형으로 변환시켜주는 명령어
		String result2 = (operator == '+') ? String.valueOf(iNum1 + iNum2) : (operator == '-') ? String.valueOf(iNum1 - iNum2) : "잘못입력하였습니다.";
		System.out.println("결과 : " + result1);
		System.out.println("결과 : " + result2);
	}
}

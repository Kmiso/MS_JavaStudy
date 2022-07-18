package day02_operator;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 하나 입력해주세요 : ");
		char stringChar = sc.next().charAt(0);
		// boolean 사용 - 아스키코드 사용
		boolean isTrue = (stringChar >= 65) && (stringChar <= 90);
		System.out.println("영어 대문자 확인 : " + isTrue);
		// boolean 사용 - 문자 사용
		boolean aTrue = (stringChar >= 'A') && (stringChar <= 'Z');
		System.out.println("영어 대문자 확인 : " + aTrue);
		// 삼항연산자 사용 - 아스키코드 사용
		String aString = (stringChar >= 65) && (stringChar <= 90) ? "true" : "false";
		System.out.println("영어 대문자 확인 : " + aString);
		// 삼항연산자 사용 - 문자 사용
		String aChar = (stringChar >= 'A') && (stringChar <= 'Z') ? "true" : "false";
		System.out.println("영어 대문자 확인 : " + aChar);
	}
}

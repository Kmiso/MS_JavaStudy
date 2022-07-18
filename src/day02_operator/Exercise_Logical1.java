package day02_operator;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력해주세요 : ");
		int num = sc.nextInt();
		// boolean 사용
		boolean isTrue = (num >= 1) && (num <= 100);
		System.out.println("1부터 100사이의 숫자인가? : " + isTrue);
		// 삼항연산자 사용
		String isResult = (num >= 1) && (num <= 100) ? "true" : "false";
		System.out.println("1부터 100사이의 숫자인가? : " + isResult);
		
		int a = 3;
		int b = 4;
		b = (++b) + (a--);
		System.out.println(a);
		System.out.print(b);
	}
}
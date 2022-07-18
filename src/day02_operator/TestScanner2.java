package day02_operator;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		// 정수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int iNum = sc.nextInt();
		// 실수 입력
		System.out.print("실수를 입력해주세요 : ");
		double dNum = sc.nextDouble();
		// 문자열 입력
		System.out.print("문자열을 입력해주세요 : ");
		String inputStr = sc.next(); // nextLine() 문자열을 받는데 차이가 있다. (공백 차이)
		// 문자 입력
		System.out.print("문자를 입력해주세요 : ");
		char inputChar = sc.next().charAt(0); // nextChar() 없다. 0 = 첫번째
		
		System.out.println();
		System.out.println("입력한 정수는 : " + iNum);
		System.out.println("입력한 실수는 : " + dNum);
		System.out.println("입력한 문자열은 : " + inputStr);
		System.out.println("입력한 문자는 : " + inputChar);
		
		sc.close();
	}
}
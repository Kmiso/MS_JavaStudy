package day02_operator;

import java.util.Scanner;

public class Exercise_Triple1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int value = sc.nextInt();
		// boolean result = value > 0;
		// String resultStr = value > 0 ? "양수" : "음수";
		// 삼항연산자 중첩
		String resultStr = value == 0 ? "0입니다." : value > 0 ? "양수입니다." : "음수입니다.";
		System.out.println(value + "은/는" + " 양수 확인 : " + resultStr);
	}
}

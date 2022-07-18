package day02_operator;

import java.util.Scanner;

public class Exercise_Typetrans1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해주세요 : ");
		// 강제 형변환
		int input = sc.nextInt();
		System.out.println("문자로 변환 : " + (char)input);
	}
}
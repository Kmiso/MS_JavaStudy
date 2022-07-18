package day02_operator;

import java.util.Scanner;

public class TestScanner1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); // Scanner 클래스가 있는데, TestScanner에서 사용할거야, ctrl + Space = import
		
		System.out.print("int 첫번째 값을 입력해주세요 : "); // Scanner 앞에 가이드 메세지
		int input1 = sc.nextInt(); // 입력받을 코드 수령 
		System.out.print("int 두번째 값을 입력해주세요 : ");
		int input2 = sc.nextInt();
		
		System.out.println("첫번째 입력한 값은 : " + input1);
		System.out.println("두번째 입력한 값은 : " + input2);
		
		int result = input1 + input2;
		System.out.println("두 값의 합은 " + result + "입니다.");
		
		sc.close(); // 7번째 줄에서 경고문구 : 썻던 자원을 닫으라는 경고문.
	}
}
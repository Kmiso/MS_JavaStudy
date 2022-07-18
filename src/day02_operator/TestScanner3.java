package day02_operator;

import java.util.Scanner;

public class TestScanner3 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		String name = sc.next();
		
		System.out.println("태어난 월을 입력해주세요.");
		int month = sc.nextInt();
		
		System.out.println("키를 입력해주세요.");
		double height = sc.nextDouble();
		
		System.out.println("성별을 입력해주세요.");
		char gender = sc.next().charAt(0);
		
		System.out.println("주소를 입력해주세요.");
		sc.nextLine(); // 입력되었던 엔터값을 받은 후 작성하기 위해 사용 (엔터 값 생략)
		String adress = sc.nextLine();
		// next(), nextLine() 둘다 문자열 입력받는데
		// nextLine()은 공백을 입력받음.
		
		System.out.println();
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("태어난 월은 " + month + "입니다.");
		System.out.println("키는 " + height + "입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println("주소는 " + adress + "입니다.");
	}
}

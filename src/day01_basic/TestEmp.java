package day01_basic;

public class TestEmp {
	public static void main(String [] args) { // 메인 틀
		Employee employee = new Employee(); // (참조형) Employee쓰고 Control+Space 누름, Employee 클래스 위치를 알려주고 관계를 맺었으며, Employee 클래스를 사용할 수 있는 상태가 되었다.(틀을 불러 올 수 있다. 명령어를 실행 시킬 수 있다. 명령어를 실행시킬 수 있다.)
		employee.printEmployee(); // Employee 클래스에 있는 printEmployee 틀
		
		/* employee만 쓰고 .누름, 틀을 불러옴, 
		 * Employee 클래스에 있는 printEmployee 틀을 불러옴
		 * 오류 찾을때 // 주석 사용하면 편리함 */
	}
}
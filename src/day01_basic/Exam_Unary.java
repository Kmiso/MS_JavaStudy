package day01_basic;


public class Exam_Unary {
	public static void main(String [] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("1�� ����");
		System.out.println("a++;"); 
		System.out.println("b = (--a) + b");
		System.out.println("c = (a++) + (--b)");

		a++; // a = 11, b = 20, c = 30
		b = (--a) + b; // 10 + 20, a = 10, b = 30, c = 30
		c = (a++) + (--b); // 10 + 29, a = 11, b = 29, c = 39
		
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b);
		System.out.println("c�� �� : " + c);
		
		System.out.println();
		
		System.out.println("2�� ����");
		
		boolean flag = true;
		
		System.out.println("����� : " + !flag);
		
		System.out.println();
		
		System.out.println("3�� ����");
		
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--; // x = 99, y = 33, z = 0
		z = x-- + --y; // z = 131, x = 98, y = 32
		x = 99 + x++ + x; // x = 296, y = 32, z = 131
		y = (y--) + y + (++y); // x = 296, y = 95, z = 131
		
		System.out.println("x�� �� : " + x);
		System.out.println("y�� �� : " + y);
		System.out.println("z�� �� : " + z);
	}
}
